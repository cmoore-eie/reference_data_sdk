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
   * @param withUuid  (optional)
   * @param withCode  (optional)
   * @param withName  (optional)
   * @param withEffectiveDate  (optional)
   * @param withExpirationDate  (optional)
   * @return List&lt;Branch&gt;
   */
  @RequestLine("GET /branch/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
    "Accept: application/json",
  })
  List<Branch> branchList(@Param("withUuid") String withUuid, @Param("withCode") String withCode, @Param("withName") String withName, @Param("withEffectiveDate") String withEffectiveDate, @Param("withExpirationDate") String withExpirationDate);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>branchList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BranchListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>withUuid -  (optional)</li>
   *   <li>withCode -  (optional)</li>
   *   <li>withName -  (optional)</li>
   *   <li>withEffectiveDate -  (optional)</li>
   *   <li>withExpirationDate -  (optional)</li>
   *   </ul>
   * @return List&lt;Branch&gt;
   */
  @RequestLine("GET /branch/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
  "Accept: application/json",
  })
  List<Branch> branchList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>branchList</code> method in a fluent style.
   */
  public static class BranchListQueryParams extends HashMap<String, Object> {
    public BranchListQueryParams withUuid(final String value) {
      put("with_uuid", EncodingUtils.encode(value));
      return this;
    }
    public BranchListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public BranchListQueryParams withName(final String value) {
      put("with_name", EncodingUtils.encode(value));
      return this;
    }
    public BranchListQueryParams withEffectiveDate(final String value) {
      put("with_effectiveDate", EncodingUtils.encode(value));
      return this;
    }
    public BranchListQueryParams withExpirationDate(final String value) {
      put("with_expirationDate", EncodingUtils.encode(value));
      return this;
    }
  }

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
