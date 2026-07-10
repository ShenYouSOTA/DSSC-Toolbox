package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded
 **/
@ApiModel(description = "A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded")
@JsonTypeName("BundledProductOfferingOption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class BundledProductOfferingOptionVO   {
  private Integer numberRelOfferDefault;
  private Integer numberRelOfferLowerLimit;
  private Integer numberRelOfferUpperLimit;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Default number of produc offereings that should be procured as part of the related BundledProductOffering
   **/
  public BundledProductOfferingOptionVO numberRelOfferDefault(Integer numberRelOfferDefault) {
    this.numberRelOfferDefault = numberRelOfferDefault;
    return this;
  }

  
  @ApiModelProperty(value = "Default number of produc offereings that should be procured as part of the related BundledProductOffering")
  @JsonProperty("numberRelOfferDefault")
  public Integer getNumberRelOfferDefault() {
    return numberRelOfferDefault;
  }

  @JsonProperty("numberRelOfferDefault")
  public void setNumberRelOfferDefault(Integer numberRelOfferDefault) {
    this.numberRelOfferDefault = numberRelOfferDefault;
  }

  /**
   * lower limit for a product offering that can be procured as part of the related BundledProductOffering
   **/
  public BundledProductOfferingOptionVO numberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
    return this;
  }

  
  @ApiModelProperty(value = "lower limit for a product offering that can be procured as part of the related BundledProductOffering")
  @JsonProperty("numberRelOfferLowerLimit")
  public Integer getNumberRelOfferLowerLimit() {
    return numberRelOfferLowerLimit;
  }

  @JsonProperty("numberRelOfferLowerLimit")
  public void setNumberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
  }

  /**
   * upper limit for a product offering that can be procured as part of the related BundledProductOffering
   **/
  public BundledProductOfferingOptionVO numberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
    return this;
  }

  
  @ApiModelProperty(value = "upper limit for a product offering that can be procured as part of the related BundledProductOffering")
  @JsonProperty("numberRelOfferUpperLimit")
  public Integer getNumberRelOfferUpperLimit() {
    return numberRelOfferUpperLimit;
  }

  @JsonProperty("numberRelOfferUpperLimit")
  public void setNumberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public BundledProductOfferingOptionVO atBaseType(String atBaseType) {
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
  public BundledProductOfferingOptionVO atSchemaLocation(URI atSchemaLocation) {
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
  public BundledProductOfferingOptionVO atType(String atType) {
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
    BundledProductOfferingOptionVO bundledProductOfferingOption = (BundledProductOfferingOptionVO) o;
    return Objects.equals(this.numberRelOfferDefault, bundledProductOfferingOption.numberRelOfferDefault) &&
        Objects.equals(this.numberRelOfferLowerLimit, bundledProductOfferingOption.numberRelOfferLowerLimit) &&
        Objects.equals(this.numberRelOfferUpperLimit, bundledProductOfferingOption.numberRelOfferUpperLimit) &&
        Objects.equals(this.atBaseType, bundledProductOfferingOption.atBaseType) &&
        Objects.equals(this.atSchemaLocation, bundledProductOfferingOption.atSchemaLocation) &&
        Objects.equals(this.atType, bundledProductOfferingOption.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberRelOfferDefault, numberRelOfferLowerLimit, numberRelOfferUpperLimit, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOfferingOptionVO {\n");
    
    sb.append("    numberRelOfferDefault: ").append(toIndentedString(numberRelOfferDefault)).append("\n");
    sb.append("    numberRelOfferLowerLimit: ").append(toIndentedString(numberRelOfferLowerLimit)).append("\n");
    sb.append("    numberRelOfferUpperLimit: ").append(toIndentedString(numberRelOfferUpperLimit)).append("\n");
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

