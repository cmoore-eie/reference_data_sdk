package blog.userfunction.sdk.util;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.DealerApi;

public class ClientUtil {

    public static DealerApi DealerClient(){
        return new ApiClient().buildClient(DealerApi.class);
    }
}
