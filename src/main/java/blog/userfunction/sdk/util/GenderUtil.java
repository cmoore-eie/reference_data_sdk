package blog.userfunction.sdk.util;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.GenderApi;
import blog.userfunction.sdk.model.Gender;

import java.util.HashMap;
import java.util.List;

public class GenderUtil {
    public static GenderApi getApi() {
        return new ApiClient().buildClient(GenderApi.class);
    }

    public GenderUtil(){
    }

    public static List<Gender> genderList(HashMap<String, Object> queryParams){
        GenderApi api = new ApiClient().buildClient(GenderApi.class);
        return genderList(api, queryParams);
    }

    public static List<Gender> genderList(GenderApi api, HashMap<String, Object> queryParams){
        return api.genderList(queryParams);
    }

}
