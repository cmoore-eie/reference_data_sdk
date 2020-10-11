package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.builders.GenderBuilder;
import blog.userfunction.sdk.model.Gender;
import blog.userfunction.sdk.util.ConversionUtil;
import blog.userfunction.sdk.util.GenderUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenderApi
 */
public class GenderApiTest {

    private Gender gender_data;
    private List<String> cleanupItems;
    private GenderApi api;

    @Before
    public void setup() {
        api = GenderUtil.getApi();
        cleanupItems = new ArrayList<String>();
        gender_data = setupGender();
    }

    @Test
    public void genderCleanUpTest() {
        maybeCreate();
        cleanUp();
        GenderApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
        List<Gender> itemList = GenderUtil.genderList(api, query_params);
        boolean found = false;
        for(Gender item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }

    @Test
    public void genderCreateTest() {
        Gender response = GenderUtil.getApi().genderCreate(gender_data);
        Assert.assertEquals(response.getItemIdentifier(), gender_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void genderDeleteTest() {
        Gender response = GenderUtil.getApi().genderCreate(gender_data);
        String itemIdentifier = gender_data.getItemIdentifier();
        GenderUtil.getApi().genderDelete(itemIdentifier);
        List<Gender> check_list = findGender(gender_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    @Test
    public void genderListTest() {
        maybeCreate();
        GenderApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
        List<Gender> response = GenderUtil.genderList(query_params);
        Assert.assertTrue(response.size() > 0);
        //
        // Extract Gender using the identifier of one of the versions
        //
        GenderApi.GenderListQueryParams query_view_params = new GenderApi.GenderListQueryParams();
        query_view_params.withUuid(response.get(0).getItemIdentifier());
        List<Gender> version_response = GenderUtil.genderList(api, query_view_params);
        Assert.assertEquals(version_response.size(), 1);
        cleanUp();
    }

    @Test
    public void genderPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Gender data = null;
        // Gender response = api.genderPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    @Test
    public void genderReadTest() {
        maybeCreate();
        String itemIdentifier = gender_data.getItemIdentifier();
        Gender response = GenderUtil.getApi().genderRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), gender_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void genderUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = gender_data.getItemIdentifier();
        Gender data = GenderUtil.getApi().genderRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);

        Gender response = GenderUtil.getApi().genderUpdate(itemIdentifier, data);
        Gender changed = GenderUtil.getApi().genderRead(itemIdentifier);
        Assert.assertNotNull(changed);
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertNotNull(changed.getLocked());
        Assert.assertTrue(changed.getLocked());
        cleanUp();
    }

    private Gender setupGender(){

        GenderBuilder genderBuilder = new GenderBuilder()
                .withDefaults()
                .withCode("testcode")
                .withName("Test Code")
                .withEffectiveDate(ConversionUtil.dateValue(2020, 1,1));

        Gender data = genderBuilder.getGender();

        cleanupItems.add(data.getItemIdentifier());

        return data;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
        for(String identifier: cleanupItems) {
            GenderApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
            query_params.withUuid(identifier);
            List<Gender> itemList = GenderUtil.getApi().genderList(query_params);
            for (Gender itemLoop : itemList) {
                GenderUtil.getApi().genderDelete(itemLoop.getItemIdentifier());
            }
        }
    }

    private void maybeCreate(){
        List<Gender> check_list = findGender(gender_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Gender create_response = GenderUtil.getApi().genderCreate(gender_data);
        }
    }

    private List<Gender> findGender(String inIdentifier){
        GenderApi.GenderListQueryParams check_query = new GenderApi.GenderListQueryParams();
        check_query.withUuid(gender_data.getItemIdentifier());
        return GenderUtil.genderList(api, check_query);
    }
}
