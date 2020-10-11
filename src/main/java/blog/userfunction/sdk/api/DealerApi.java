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
   * @param itemIdentifier A unique value identifying this dealer. (required)
   */
  @RequestLine("DELETE /dealer/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void dealerDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param withUuid  (optional)
   * @param withCode  (optional)
   * @param withName  (optional)
   * @param withEffectiveDate  (optional)
   * @param withExpirationDate  (optional)
   * @return List&lt;Dealer&gt;
   */
  @RequestLine("GET /dealer/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
    "Accept: application/json",
  })
  List<Dealer> dealerList(@Param("withUuid") String withUuid, @Param("withCode") String withCode, @Param("withName") String withName, @Param("withEffectiveDate") String withEffectiveDate, @Param("withExpirationDate") String withExpirationDate);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>dealerList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DealerListQueryParams} class that allows for
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
   * @return List&lt;Dealer&gt;
   */
  @RequestLine("GET /dealer/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
  "Accept: application/json",
  })
  List<Dealer> dealerList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>dealerList</code> method in a fluent style.
   */
  public static class DealerListQueryParams extends HashMap<String, Object> {
    public DealerListQueryParams withUuid(final String value) {
      put("with_uuid", EncodingUtils.encode(value));
      return this;
    }
    public DealerListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public DealerListQueryParams withName(final String value) {
      put("with_name", EncodingUtils.encode(value));
      return this;
    }
    public DealerListQueryParams withEffectiveDate(final String value) {
      put("with_effectiveDate", EncodingUtils.encode(value));
      return this;
    }
    public DealerListQueryParams withExpirationDate(final String value) {
      put("with_expirationDate", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this dealer. (required)
   * @param data  (required)
   * @return Dealer
   */
  @RequestLine("PATCH /dealer/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dealer dealerPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Dealer data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this dealer. (required)
   * @return Dealer
   */
  @RequestLine("GET /dealer/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Dealer dealerRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this dealer. (required)
   * @param data  (required)
   * @return Dealer
   */
  @RequestLine("PUT /dealer/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dealer dealerUpdate(@Param("itemIdentifier") String itemIdentifier, Dealer data);
}
