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
    public void branchCleanUpTest() {
        maybeCreate();
        cleanUp();
        BranchApi.BranchListQueryParams query_params = new BranchApi.BranchListQueryParams();
        List<Branch> itemList = BranchUtil.branchList(api, query_params);
        boolean found = false;
        for(Branch item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }

    @Test
    public void branchCreateTest() {
        Branch response = BranchUtil.getApi().branchCreate(branch_data);
        Assert.assertEquals(response.getItemIdentifier(), branch_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void branchDeleteTest() {
        Branch response = BranchUtil.getApi().branchCreate(branch_data);
        String itemIdentifier = branch_data.getItemIdentifier();
        BranchUtil.getApi().branchDelete(itemIdentifier);
        List<Branch> check_list = findBranch(branch_data.getItemIdentifier());
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
        query_view_params.withUuid(response.get(0).getItemIdentifier());
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
        String itemIdentifier = branch_data.getItemIdentifier();
        Branch response = BranchUtil.getApi().branchRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), branch_data.getItemIdentifier());
        cleanUp();
    }

    @Test
    public void branchUpdateTest() {
        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = branch_data.getItemIdentifier();
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

        BranchBuilder branchBuilder = new BranchBuilder()
                .withDefaults()
                .withCode("testcode")
                .withName("Test Code")
                .withEffectiveDate(ConversionUtil.dateValue(2020, 1,1))
                .withBranchType(Branch.BranchTypeEnum.LOCAL);

        Branch data = branchBuilder.getBranch();

        cleanupItems.add(data.getItemIdentifier());

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
                BranchUtil.getApi().branchDelete(itemLoop.getItemIdentifier());
            }
        }
    }

    private void maybeCreate(){
        List<Branch> check_list = findBranch(branch_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Branch create_response = BranchUtil.getApi().branchCreate(branch_data);
        }
    }

    private List<Branch> findBranch(String inIdentifier){
        BranchApi.BranchListQueryParams check_query = new BranchApi.BranchListQueryParams();
        check_query.withUuid(branch_data.getItemIdentifier());
        return BranchUtil.branchList(api, check_query);
    }

}
