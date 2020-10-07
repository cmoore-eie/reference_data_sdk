package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.model.Gender;
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

    private GenderApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GenderApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderCreateTest() {
        Gender data = null;
        // Gender response = api.genderCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderDeleteTest() {
        String itemUuid = null;
        // api.genderDelete(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderListTest() {
        // List<Gender> response = api.genderList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderPartialUpdateTest() {
        String itemUuid = null;
        Gender data = null;
        // Gender response = api.genderPartialUpdate(itemUuid, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderReadTest() {
        String itemUuid = null;
        // Gender response = api.genderRead(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderUpdateTest() {
        String itemUuid = null;
        Gender data = null;
        // Gender response = api.genderUpdate(itemUuid, data);

        // TODO: test validations
    }

    
}
