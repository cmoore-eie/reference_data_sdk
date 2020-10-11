package blog.userfunction.sdk.util;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.DealerApi;
import blog.userfunction.sdk.model.Dealer;

import java.util.HashMap;
import java.util.List;

public class DealerUtil {
    public static DealerApi getApi() {
        return new ApiClient().buildClient(DealerApi.class);
    }

    public DealerUtil(){
    }

    public static List<Dealer> dealerList(HashMap<String, Object> queryParams){
        DealerApi api = new ApiClient().buildClient(DealerApi.class);
        return dealerList(api, queryParams);
    }

    public static List<Dealer> dealerList(DealerApi api, HashMap<String, Object> queryParams){
        return api.dealerList(queryParams);
    }

}
