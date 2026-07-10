package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.TimePeriodVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * specification of a value (number or text or an object) that can be assigned to a Characteristic.
 **/
@ApiModel(description = "specification of a value (number or text or an object) that can be assigned to a Characteristic.")
@JsonTypeName("CharacteristicValueSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CharacteristicValueSpecificationVO   {
  private Boolean isDefault;
  private String rangeInterval;
  private String regex;
  private String unitOfMeasure;
  private Integer valueFrom;
  private Integer valueTo;
  private String valueType;
  private TimePeriodVO validFor;
  private Object value;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   **/
  public CharacteristicValueSpecificationVO isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "If true, the Boolean Indicates if the value is the default value for a characteristic")
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("isDefault")
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \&quot;open\&quot;, \&quot;closed\&quot;, \&quot;closedBottom\&quot; and \&quot;closedTop\&quot;.
   **/
  public CharacteristicValueSpecificationVO rangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  
  @ApiModelProperty(value = "An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".")
  @JsonProperty("rangeInterval")
  public String getRangeInterval() {
    return rangeInterval;
  }

  @JsonProperty("rangeInterval")
  public void setRangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  /**
   * A regular expression constraint for given value
   **/
  public CharacteristicValueSpecificationVO regex(String regex) {
    this.regex = regex;
    return this;
  }

  
  @ApiModelProperty(value = "A regular expression constraint for given value")
  @JsonProperty("regex")
  public String getRegex() {
    return regex;
  }

  @JsonProperty("regex")
  public void setRegex(String regex) {
    this.regex = regex;
  }

  /**
   * A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.
   **/
  public CharacteristicValueSpecificationVO unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  
  @ApiModelProperty(value = "A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.")
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  @JsonProperty("unitOfMeasure")
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   * The low range value that a characteristic can take on
   **/
  public CharacteristicValueSpecificationVO valueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  
  @ApiModelProperty(value = "The low range value that a characteristic can take on")
  @JsonProperty("valueFrom")
  public Integer getValueFrom() {
    return valueFrom;
  }

  @JsonProperty("valueFrom")
  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  /**
   * The upper range value that a characteristic can take on
   **/
  public CharacteristicValueSpecificationVO valueTo(Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  
  @ApiModelProperty(value = "The upper range value that a characteristic can take on")
  @JsonProperty("valueTo")
  public Integer getValueTo() {
    return valueTo;
  }

  @JsonProperty("valueTo")
  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   **/
  public CharacteristicValueSpecificationVO valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(value = "A kind of value that the characteristic value can take on, such as numeric, text and so forth")
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }

  @JsonProperty("valueType")
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   **/
  public CharacteristicValueSpecificationVO validFor(TimePeriodVO validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("validFor")
  @Valid public TimePeriodVO getValidFor() {
    return validFor;
  }

  @JsonProperty("validFor")
  public void setValidFor(TimePeriodVO validFor) {
    this.validFor = validFor;
  }

  /**
   **/
  public CharacteristicValueSpecificationVO value(Object value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public CharacteristicValueSpecificationVO atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  @JsonProperty("@baseType")
  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   **/
  public CharacteristicValueSpecificationVO atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  @JsonProperty("@schemaLocation")
  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   **/
  public CharacteristicValueSpecificationVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  @JsonProperty("@type")
  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicValueSpecificationVO characteristicValueSpecification = (CharacteristicValueSpecificationVO) o;
    return Objects.equals(this.isDefault, characteristicValueSpecification.isDefault) &&
        Objects.equals(this.rangeInterval, characteristicValueSpecification.rangeInterval) &&
        Objects.equals(this.regex, characteristicValueSpecification.regex) &&
        Objects.equals(this.unitOfMeasure, characteristicValueSpecification.unitOfMeasure) &&
        Objects.equals(this.valueFrom, characteristicValueSpecification.valueFrom) &&
        Objects.equals(this.valueTo, characteristicValueSpecification.valueTo) &&
        Objects.equals(this.valueType, characteristicValueSpecification.valueType) &&
        Objects.equals(this.validFor, characteristicValueSpecification.validFor) &&
        Objects.equals(this.value, characteristicValueSpecification.value) &&
        Objects.equals(this.atBaseType, characteristicValueSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicValueSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, characteristicValueSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rangeInterval, regex, unitOfMeasure, valueFrom, valueTo, valueType, validFor, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicValueSpecificationVO {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

