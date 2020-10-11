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
   * @param itemIdentifier A unique value identifying this gender. (required)
   */
  @RequestLine("DELETE /gender/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  void genderDelete(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param withUuid  (optional)
   * @param withCode  (optional)
   * @param withName  (optional)
   * @param withEffectiveDate  (optional)
   * @param withExpirationDate  (optional)
   * @return List&lt;Gender&gt;
   */
  @RequestLine("GET /gender/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
    "Accept: application/json",
  })
  List<Gender> genderList(@Param("withUuid") String withUuid, @Param("withCode") String withCode, @Param("withName") String withName, @Param("withEffectiveDate") String withEffectiveDate, @Param("withExpirationDate") String withExpirationDate);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>genderList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenderListQueryParams} class that allows for
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
   * @return List&lt;Gender&gt;
   */
  @RequestLine("GET /gender/?with_uuid={withUuid}&with_code={withCode}&with_name={withName}&with_effectiveDate={withEffectiveDate}&with_expirationDate={withExpirationDate}")
  @Headers({
  "Accept: application/json",
  })
  List<Gender> genderList(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>genderList</code> method in a fluent style.
   */
  public static class GenderListQueryParams extends HashMap<String, Object> {
    public GenderListQueryParams withUuid(final String value) {
      put("with_uuid", EncodingUtils.encode(value));
      return this;
    }
    public GenderListQueryParams withCode(final String value) {
      put("with_code", EncodingUtils.encode(value));
      return this;
    }
    public GenderListQueryParams withName(final String value) {
      put("with_name", EncodingUtils.encode(value));
      return this;
    }
    public GenderListQueryParams withEffectiveDate(final String value) {
      put("with_effectiveDate", EncodingUtils.encode(value));
      return this;
    }
    public GenderListQueryParams withExpirationDate(final String value) {
      put("with_expirationDate", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this gender. (required)
   * @param data  (required)
   * @return Gender
   */
  @RequestLine("PATCH /gender/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Gender genderPartialUpdate(@Param("itemIdentifier") String itemIdentifier, Gender data);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this gender. (required)
   * @return Gender
   */
  @RequestLine("GET /gender/{itemIdentifier}/")
  @Headers({
    "Accept: application/json",
  })
  Gender genderRead(@Param("itemIdentifier") String itemIdentifier);

  /**
   * 
   * 
   * @param itemIdentifier A unique value identifying this gender. (required)
   * @param data  (required)
   * @return Gender
   */
  @RequestLine("PUT /gender/{itemIdentifier}/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Gender genderUpdate(@Param("itemIdentifier") String itemIdentifier, Gender data);
}
