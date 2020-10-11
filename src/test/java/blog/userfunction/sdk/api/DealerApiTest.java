package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.builders.DealerBuilder;
import blog.userfunction.sdk.builders.DealerLocationBuilder;
import blog.userfunction.sdk.model.Dealer;
import blog.userfunction.sdk.model.DealerLocation;
import blog.userfunction.sdk.util.ClientUtil;
import blog.userfunction.sdk.util.ConversionUtil;
import blog.userfunction.sdk.util.DealerUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * API tests for DealerApi
 */
public class DealerApiTest {

    private DealerApi api;
    private Dealer dealer_data;
    private List<String> cleanupItems;

    @Before
    public void setup() {
        api = ClientUtil.DealerClient();
        cleanupItems = new ArrayList<String>();
        dealer_data = setupDealer();
    }
    
    @Test
    public void dealerCreateTest() {
        Dealer response = api.dealerCreate(dealer_data);
        Assert.assertEquals(response.getItemIdentifier(), dealer_data.getItemIdentifier());
        cleanUp();
    }
    
    @Test
    public void dealerDeleteTest() {
        Dealer response = api.dealerCreate(dealer_data);
        String itemIdentifier = dealer_data.getItemIdentifier();
        api.dealerDelete(itemIdentifier);
        List<Dealer> check_list = findDealer(dealer_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    @Test
    public void dealerListTest() {
        maybeCreate();
        DealerApi.DealerListQueryParams query_params = new DealerApi.DealerListQueryParams();
        List<Dealer> response = api.dealerList(query_params);
        Assert.assertTrue(response.size() > 0);
        cleanUp();
    }

    @Test
    public void dealerPartialUpdateTest() {
        String itemIdentifier = null;
        Dealer data = null;
        // Dealer response = api.dealerPartialUpdate(itemIdentifier, data);

        // TODO: test validations
    }

    @Test
    public void dealerReadTest() {
        maybeCreate();
        String itemIdentifier = dealer_data.getItemIdentifier();
        Dealer response = api.dealerRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), dealer_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void dealerCleanUpTest() {
        maybeCreate();
        cleanUp();
        DealerApi.DealerListQueryParams query_params = new DealerApi.DealerListQueryParams();
        List<Dealer> itemList = api.dealerList(query_params);
        boolean found = false;
        for(Dealer item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }


    /**
     * Tests for changes, deletions of child elements, addition of child elements
     * and change to child elements
     */
    @Test
    public void dealerUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = dealer_data.getItemIdentifier();
        Dealer data = api.dealerRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);

        DealerLocation location = findLocationForName(data, "firstlocation");
        if (location != null) {
            location.setLocationName("Changed Location Name");
        }

        //
        // Add a New Location to the Dealer
        //
        DealerLocation new_location = new DealerLocationBuilder()
                .withItemIdentifier(UUID.randomUUID().toString())
                .withLocationName("newlocation")
                .withAddressLine1("Address 1")
                .withAddressLine2("Address 2")
                .withCity("City")
                .withPostCode("0000")
                .getDealerLocation();

        data.addLocationsItem(new_location);
        //
        // Delete existing location, we mark the location for purge and let the server take care of the deletion from the
        // database
        //
        DealerLocation deleteLocation = findLocationForName(data, "secondlocation");
        if (deleteLocation != null) {
            deleteLocation.setPurge(true);
        }

        Dealer response = api.dealerUpdate(itemIdentifier, data);
        Dealer changed = api.dealerRead(itemIdentifier);
        DealerLocation changedLocation = findLocationForName(changed, "Changed Location Name");
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertTrue(changed.getLocked());
        Assert.assertNotNull(changedLocation);
        Assert.assertEquals(changed.getLocations().size(), 2);
        Assert.assertFalse(changed.getLocations().contains(deleteLocation));
        cleanUp();
    }

    private Dealer setupDealer(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( new Date()   );

        DealerBuilder builder = new DealerBuilder()
                .withDefaults()
                .withCode("1")
                .withName("Dealer 1")
                .withEffectiveDate(ConversionUtil.dateValue(2020, 1,1))
                .withDealerLocations(new DealerLocationBuilder()
                        .withItemIdentifier(UUID.randomUUID().toString())
                        .withLocationName("firstlocation")
                        .withAddressLine1("Address 1")
                        .withAddressLine2("Address 2")
                        .withCity("City")
                        .withPostCode("0000")
                        .getDealerLocation())
                .withDealerLocations(new DealerLocationBuilder()
                        .withItemIdentifier(UUID.randomUUID().toString())
                        .withLocationName("secondlocation")
                        .withAddressLine1("Address 1")
                        .withAddressLine2("Address 2")
                        .withCity("City")
                        .withPostCode("0001")
                        .getDealerLocation());

        Dealer data = builder.getDealer();

        cleanupItems.add(data.getItemIdentifier());

        return data;
    }

    private void maybeCreate(){
        List<Dealer> check_list = findDealer(dealer_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Dealer create_response = api.dealerCreate(dealer_data);
        }
    }

    private List<Dealer> findDealer(String inIdentifier){
        DealerApi.DealerListQueryParams check_query = new DealerApi.DealerListQueryParams();
        check_query.withUuid(dealer_data.getItemIdentifier());
        return api.dealerList(check_query);
    }

    private DealerLocation findLocationForName(Dealer inDealer, String inCheckItem){
        for(DealerLocation itemloop : inDealer.getLocations()){
            if (itemloop.getLocationName() != null && itemloop.getLocationName().equalsIgnoreCase(inCheckItem)) {
                return itemloop;
            }
        }
        return null;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
        for(String identifier: cleanupItems) {
            DealerApi.DealerListQueryParams query_params = new DealerApi.DealerListQueryParams();
            query_params.withUuid(identifier);
            List<Dealer> itemList = api.dealerList(query_params);
            for (Dealer itemLoop : itemList) {
                api.dealerDelete(itemLoop.getItemIdentifier());
            }
        }
    }
}
