package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.model.Dealer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DealerApi
 */
public class DealerApiTest {

    private DealerApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DealerApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerCreateTest() {
        Dealer data = null;
        // Dealer response = api.dealerCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerDeleteTest() {
        String itemUuid = null;
        // api.dealerDelete(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerListTest() {
        // List<Dealer> response = api.dealerList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerPartialUpdateTest() {
        String itemUuid = null;
        Dealer data = null;
        // Dealer response = api.dealerPartialUpdate(itemUuid, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerReadTest() {
        String itemUuid = null;
        // Dealer response = api.dealerRead(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerUpdateTest() {
        String itemUuid = null;
        Dealer data = null;
        // Dealer response = api.dealerUpdate(itemUuid, data);

        // TODO: test validations
    }

    
}
