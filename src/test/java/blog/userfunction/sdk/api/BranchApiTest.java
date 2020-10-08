package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.builders.BranchBuilder;
import blog.userfunction.sdk.model.Branch;
import blog.userfunction.sdk.util.BranchUtil;
import blog.userfunction.sdk.util.ConversionUtil;
import org.junit.Assert;
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

    private Branch branch_data;
    private List<String> cleanupItems;
    private BranchApi api;

    @Before
    public void setup() {
        api = BranchUtil.getApi();
        cleanupItems = new ArrayList<String>();
        branch_data = setupBranch();
    }

    @Test
    public void contractCleanUpTest() {
        maybeCreate();
        cleanUp();
        BranchApi.BranchListQueryParams query_params = new BranchApi.BranchListQueryParams();
        List<Branch> itemList = BranchUtil.branchList(api, query_params);
        boolean found = false;
        for(Branch item: itemList){
            if(cleanupItems.contains(item.getItemUuid())){
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }

    @Test
    public void branchCreateTest() {
        Branch response = BranchUtil.getApi().branchCreate(branch_data);
        Assert.assertEquals(response.getItemUuid(), branch_data.getItemUuid());
        cleanUp();
    }

    @Test
    public void branchDeleteTest() {
        Branch response = BranchUtil.getApi().branchCreate(branch_data);
        String itemIdentifier = branch_data.getItemUuid();
        BranchUtil.getApi().branchDelete(itemIdentifier);
        List<Branch> check_list = findBranch(branch_data.getItemUuid());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();
    }

    @Test
    public void branchListTest() {
        maybeCreate();
        BranchApi.BranchListQueryParams query_params = new BranchApi.BranchListQueryParams();
        List<Branch> response = BranchUtil.branchList(query_params);
        Assert.assertTrue(response.size() > 0);
        //
        // Extract Branch using the identifier of one of the versions
        //
        BranchApi.BranchListQueryParams query_view_params = new BranchApi.BranchListQueryParams();
        query_view_params.withUuid(response.get(0).getItemUuid());
        List<Branch> version_response = BranchUtil.branchList(api, query_view_params);
        Assert.assertEquals(version_response.size(), 1);
        cleanUp();
    }

    @Test
    public void branchPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Branch data = null;
        // Branch response = api.branchPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    @Test
    public void branchReadTest() {
        maybeCreate();
        String itemIdentifier = branch_data.getItemUuid();
        Branch response = BranchUtil.getApi().branchRead(itemIdentifier);
        Assert.assertEquals(response.getItemUuid(), branch_data.getItemUuid());
        cleanUp();
    }
    
    @Test
    public void branchUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = branch_data.getItemUuid();
        Branch data = BranchUtil.getApi().branchRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);

        Branch response = BranchUtil.getApi().branchUpdate(itemIdentifier, data);
        Branch changed = BranchUtil.getApi().branchRead(itemIdentifier);
        Assert.assertNotNull(changed);
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertNotNull(changed.getLocked());
        Assert.assertTrue(changed.getLocked());
        cleanUp();
    }

    private Branch setupBranch(){

        BranchBuilder contractBuilder = new BranchBuilder()
                .withDefaults()
                .withCode("testcode")
                .withName("Test Code")
                .withEffectiveDate(ConversionUtil.dateValue(2020, 1,1))
                .withBranchType(Branch.BranchTypeEnum.LOCAL);

        Branch data = contractBuilder.getBranch();

        cleanupItems.add(data.getItemUuid());

        return data;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
        for(String identifier: cleanupItems) {
            BranchApi.BranchListQueryParams query_params = new BranchApi.BranchListQueryParams();
            query_params.withUuid(identifier);
            List<Branch> itemList = BranchUtil.getApi().branchList(query_params);
            for (Branch itemLoop : itemList) {
                BranchUtil.getApi().branchDelete(itemLoop.getItemUuid());
            }
        }
    }

    private void maybeCreate(){
        List<Branch> check_list = findBranch(branch_data.getItemUuid());
        if(check_list.isEmpty()){
            Branch create_response = BranchUtil.getApi().branchCreate(branch_data);
        }
    }

    private List<Branch> findBranch(String inIdentifier){
        BranchApi.BranchListQueryParams check_query = new BranchApi.BranchListQueryParams();
        check_query.withUuid(branch_data.getItemUuid());
        return BranchUtil.branchList(api, check_query);
    }

}
