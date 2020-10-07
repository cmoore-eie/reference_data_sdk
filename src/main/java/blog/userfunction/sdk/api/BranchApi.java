package blog.userfunction.sdk.api;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.EncodingUtils;

import blog.userfunction.sdk.model.Branch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface BranchApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param data  (required)
   * @return Branch
   */
  @RequestLine("POST /branch/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Branch branchCreate(Branch data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this branch. (required)
   */
  @RequestLine("DELETE /branch/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  void branchDelete(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @return List&lt;Branch&gt;
   */
  @RequestLine("GET /branch/")
  @Headers({
    "Accept: application/json",
  })
  List<Branch> branchList();

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this branch. (required)
   * @param data  (required)
   * @return Branch
   */
  @RequestLine("PATCH /branch/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Branch branchPartialUpdate(@Param("itemUuid") String itemUuid, Branch data);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this branch. (required)
   * @return Branch
   */
  @RequestLine("GET /branch/{itemUuid}/")
  @Headers({
    "Accept: application/json",
  })
  Branch branchRead(@Param("itemUuid") String itemUuid);

  /**
   * 
   * 
   * @param itemUuid A unique value identifying this branch. (required)
   * @param data  (required)
   * @return Branch
   */
  @RequestLine("PUT /branch/{itemUuid}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Branch branchUpdate(@Param("itemUuid") String itemUuid, Branch data);
}
