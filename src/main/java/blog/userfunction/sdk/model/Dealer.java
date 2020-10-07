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
 * Dealer
 */
@JsonPropertyOrder({
  Dealer.JSON_PROPERTY_CODE,
  Dealer.JSON_PROPERTY_NAME,
  Dealer.JSON_PROPERTY_LOCKED,
  Dealer.JSON_PROPERTY_CREATE_TIME,
  Dealer.JSON_PROPERTY_UPDATE_TIME,
  Dealer.JSON_PROPERTY_ITEM_UUID,
  Dealer.JSON_PROPERTY_EFFECTIVE_DATE,
  Dealer.JSON_PROPERTY_EXPIRATION_DATE
})

public class Dealer {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private JsonNullable<Boolean> locked = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CREATE_TIME = "create_time";
  private JsonNullable<Date> createTime = JsonNullable.<Date>undefined();

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private JsonNullable<Date> updateTime = JsonNullable.<Date>undefined();

  public static final String JSON_PROPERTY_ITEM_UUID = "item_uuid";
  private String itemUuid;

  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effective_date";
  private Date effectiveDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private JsonNullable<Date> expirationDate = JsonNullable.<Date>undefined();


  public Dealer code(String code) {
    
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


  public Dealer name(String name) {
    
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


  public Dealer locked(Boolean locked) {
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


  public Dealer createTime(Date createTime) {
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


  public Dealer updateTime(Date updateTime) {
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


  public Dealer itemUuid(String itemUuid) {
    
    this.itemUuid = itemUuid;
    return this;
  }

   /**
   * Get itemUuid
   * @return itemUuid
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemUuid() {
    return itemUuid;
  }


  public void setItemUuid(String itemUuid) {
    this.itemUuid = itemUuid;
  }


  public Dealer effectiveDate(Date effectiveDate) {
    
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


  public Dealer expirationDate(Date expirationDate) {
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
    Dealer dealer = (Dealer) o;
    return Objects.equals(this.code, dealer.code) &&
        Objects.equals(this.name, dealer.name) &&
        Objects.equals(this.locked, dealer.locked) &&
        Objects.equals(this.createTime, dealer.createTime) &&
        Objects.equals(this.updateTime, dealer.updateTime) &&
        Objects.equals(this.itemUuid, dealer.itemUuid) &&
        Objects.equals(this.effectiveDate, dealer.effectiveDate) &&
        Objects.equals(this.expirationDate, dealer.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, locked, createTime, updateTime, itemUuid, effectiveDate, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealer {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    itemUuid: ").append(toIndentedString(itemUuid)).append("\n");
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

