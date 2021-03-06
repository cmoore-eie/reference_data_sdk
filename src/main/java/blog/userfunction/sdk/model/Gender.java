/*
 * Snippets API
 * Test description
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@snippets.local
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package blog.userfunction.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Gender
 */
@JsonPropertyOrder({
  Gender.JSON_PROPERTY_CODE,
  Gender.JSON_PROPERTY_NAME,
  Gender.JSON_PROPERTY_LOCKED,
  Gender.JSON_PROPERTY_CREATE_TIME,
  Gender.JSON_PROPERTY_UPDATE_TIME,
  Gender.JSON_PROPERTY_ITEM_IDENTIFIER,
  Gender.JSON_PROPERTY_EFFECTIVE_DATE,
  Gender.JSON_PROPERTY_EXPIRATION_DATE
})

public class Gender {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private JsonNullable<Boolean> locked = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private JsonNullable<Date> createTime = JsonNullable.<Date>undefined();

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private JsonNullable<Date> updateTime = JsonNullable.<Date>undefined();

  public static final String JSON_PROPERTY_ITEM_IDENTIFIER = "itemIdentifier";
  private String itemIdentifier;

  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effectiveDate";
  private Date effectiveDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private JsonNullable<Date> expirationDate = JsonNullable.<Date>undefined();


  public Gender code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Gender name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Gender locked(Boolean locked) {
    this.locked = JsonNullable.<Boolean>of(locked);
    
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getLocked() {
        return locked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getLocked_JsonNullable() {
    return locked;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED)
  public void setLocked_JsonNullable(JsonNullable<Boolean> locked) {
    this.locked = locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = JsonNullable.<Boolean>of(locked);
  }


  public Gender createTime(Date createTime) {
    this.createTime = JsonNullable.<Date>of(createTime);
    
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Date getCreateTime() {
        return createTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Date> getCreateTime_JsonNullable() {
    return createTime;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  public void setCreateTime_JsonNullable(JsonNullable<Date> createTime) {
    this.createTime = createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = JsonNullable.<Date>of(createTime);
  }


  public Gender updateTime(Date updateTime) {
    this.updateTime = JsonNullable.<Date>of(updateTime);
    
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Date getUpdateTime() {
        return updateTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Date> getUpdateTime_JsonNullable() {
    return updateTime;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  public void setUpdateTime_JsonNullable(JsonNullable<Date> updateTime) {
    this.updateTime = updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = JsonNullable.<Date>of(updateTime);
  }


  public Gender itemIdentifier(String itemIdentifier) {
    
    this.itemIdentifier = itemIdentifier;
    return this;
  }

   /**
   * Get itemIdentifier
   * @return itemIdentifier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemIdentifier() {
    return itemIdentifier;
  }


  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }


  public Gender effectiveDate(Date effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Date getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(Date effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public Gender expirationDate(Date expirationDate) {
    this.expirationDate = JsonNullable.<Date>of(expirationDate);
    
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Date getExpirationDate() {
        return expirationDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Date> getExpirationDate_JsonNullable() {
    return expirationDate;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  public void setExpirationDate_JsonNullable(JsonNullable<Date> expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = JsonNullable.<Date>of(expirationDate);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gender gender = (Gender) o;
    return Objects.equals(this.code, gender.code) &&
        Objects.equals(this.name, gender.name) &&
        Objects.equals(this.locked, gender.locked) &&
        Objects.equals(this.createTime, gender.createTime) &&
        Objects.equals(this.updateTime, gender.updateTime) &&
        Objects.equals(this.itemIdentifier, gender.itemIdentifier) &&
        Objects.equals(this.effectiveDate, gender.effectiveDate) &&
        Objects.equals(this.expirationDate, gender.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, locked, createTime, updateTime, itemIdentifier, effectiveDate, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gender {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

