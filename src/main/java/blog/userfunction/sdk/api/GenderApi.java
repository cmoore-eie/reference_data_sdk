package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.EncodingUtils;

import blog.userfunction.sdk.model.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface GenderApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Gender
   */
  @RequestLine("POST /gender/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Gender genderCreate(Gender data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this gender. (required)
   */
  @RequestLine("DELETE /gender/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  void genderDelete(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @return List&lt;Gender&gt;
   */
  @RequestLine("GET /gender/")
  @Headers({
    "Accept: application/json",
  })
  List<Gender> genderList();

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this gender. (required)
   * @param data  (required)
   * @return Gender
   */
  @RequestLine("PATCH /gender/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Gender genderPartialUpdate(@Param("itemUuid") String itemUuid, Gender data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this gender. (required)
   * @return Gender
   */
  @RequestLine("GET /gender/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  Gender genderRead(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this gender. (required)
   * @param data  (required)
   * @return Gender
   */
  @RequestLine("PUT /gender/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Gender genderUpdate(@Param("itemUuid") String itemUuid, Gender data);
}
