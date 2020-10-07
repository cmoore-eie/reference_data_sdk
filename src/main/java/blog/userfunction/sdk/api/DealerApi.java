package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.EncodingUtils;

import blog.userfunction.sdk.model.Dealer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface DealerApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Dealer
   */
  @RequestLine("POST /dealer/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dealer dealerCreate(Dealer data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this dealer. (required)
   */
  @RequestLine("DELETE /dealer/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  void dealerDelete(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @return List&lt;Dealer&gt;
   */
  @RequestLine("GET /dealer/")
  @Headers({
    "Accept: application/json",
  })
  List<Dealer> dealerList();

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this dealer. (required)
   * @param data  (required)
   * @return Dealer
   */
  @RequestLine("PATCH /dealer/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dealer dealerPartialUpdate(@Param("itemUuid") String itemUuid, Dealer data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this dealer. (required)
   * @return Dealer
   */
  @RequestLine("GET /dealer/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  Dealer dealerRead(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this dealer. (required)
   * @param data  (required)
   * @return Dealer
   */
  @RequestLine("PUT /dealer/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dealer dealerUpdate(@Param("itemUuid") String itemUuid, Dealer data);
}
