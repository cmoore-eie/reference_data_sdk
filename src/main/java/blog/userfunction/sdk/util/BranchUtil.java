package blog.userfunction.sdk.util;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.BranchApi;
import blog.userfunction.sdk.model.Branch;

import java.util.HashMap;
import java.util.List;

public class BranchUtil {
    public static BranchApi getApi() {
        return new ApiClient().buildClient(BranchApi.class);
    }

    public BranchUtil(){
    }

    public static List<Branch> branchList(HashMap<String, Object> queryParams){
        BranchApi api = new ApiClient().buildClient(BranchApi.class);
        return branchList(api, queryParams);
    }

    public static List<Branch> branchList(BranchApi api, HashMap<String, Object> queryParams){
        return api.branchList(queryParams);
    }

}
