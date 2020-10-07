package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.model.Branch;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BranchApi
 */
public class BranchApiTest {

    private BranchApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(BranchApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchCreateTest() {
        Branch data = null;
        // Branch response = api.branchCreate(data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchDeleteTest() {
        String itemUuid = null;
        // api.branchDelete(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchListTest() {
        // List<Branch> response = api.branchList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchPartialUpdateTest() {
        String itemUuid = null;
        Branch data = null;
        // Branch response = api.branchPartialUpdate(itemUuid, data);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchReadTest() {
        String itemUuid = null;
        // Branch response = api.branchRead(itemUuid);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchUpdateTest() {
        String itemUuid = null;
        Branch data = null;
        // Branch response = api.branchUpdate(itemUuid, data);

        // TODO: test validations
    }

    
}
