package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.QuantityVO;
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
 * Description of a productTerm linked to this product. This represent a commitment with a duration
 **/
@ApiModel(description = "Description of a productTerm linked to this product. This represent a commitment with a duration")
@JsonTypeName("ProductTerm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductTermVO   {
  private String description;
  private String name;
  private QuantityVO duration;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Description of the productTerm
   **/
  public ProductTermVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the productTerm")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Name of the productTerm
   **/
  public ProductTermVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the productTerm")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ProductTermVO duration(QuantityVO duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  @Valid public QuantityVO getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(QuantityVO duration) {
    this.duration = duration;
  }

  /**
   **/
  public ProductTermVO validFor(TimePeriodVO validFor) {
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
   * When sub-classing, this defines the super-class
   **/
  public ProductTermVO atBaseType(String atBaseType) {
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
  public ProductTermVO atSchemaLocation(URI atSchemaLocation) {
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
   * When sub-classing, this defines the sub-class entity name
   **/
  public ProductTermVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
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
    ProductTermVO productTerm = (ProductTermVO) o;
    return Objects.equals(this.description, productTerm.description) &&
        Objects.equals(this.name, productTerm.name) &&
        Objects.equals(this.duration, productTerm.duration) &&
        Objects.equals(this.validFor, productTerm.validFor) &&
        Objects.equals(this.atBaseType, productTerm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productTerm.atSchemaLocation) &&
        Objects.equals(this.atType, productTerm.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, duration, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTermVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

