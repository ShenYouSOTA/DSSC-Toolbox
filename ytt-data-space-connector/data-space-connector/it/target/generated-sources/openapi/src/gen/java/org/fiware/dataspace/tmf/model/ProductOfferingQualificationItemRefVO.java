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
 * It&#39;s a productOfferingQualification item that has been executed previously.
 **/
@ApiModel(description = "It's a productOfferingQualification item that has been executed previously.")
@JsonTypeName("ProductOfferingQualificationItemRef")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOfferingQualificationItemRefVO   {
  private String id;
  private String href;
  private String name;
  private String productOfferingQualificationHref;
  private String productOfferingQualificationId;
  private String productOfferingQualificationName;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atReferredType;

  /**
   * Id of an item of a product offering qualification
   **/
  public ProductOfferingQualificationItemRefVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Id of an item of a product offering qualification")
  @JsonProperty("id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the related entity.
   **/
  public ProductOfferingQualificationItemRefVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the related entity.")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the related entity.
   **/
  public ProductOfferingQualificationItemRefVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the related entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Reference of the related entity.
   **/
  public ProductOfferingQualificationItemRefVO productOfferingQualificationHref(String productOfferingQualificationHref) {
    this.productOfferingQualificationHref = productOfferingQualificationHref;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the related entity.")
  @JsonProperty("productOfferingQualificationHref")
  public String getProductOfferingQualificationHref() {
    return productOfferingQualificationHref;
  }

  @JsonProperty("productOfferingQualificationHref")
  public void setProductOfferingQualificationHref(String productOfferingQualificationHref) {
    this.productOfferingQualificationHref = productOfferingQualificationHref;
  }

  /**
   * Unique identifier of a related entity.
   **/
  public ProductOfferingQualificationItemRefVO productOfferingQualificationId(String productOfferingQualificationId) {
    this.productOfferingQualificationId = productOfferingQualificationId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @JsonProperty("productOfferingQualificationId")
  @NotNull public String getProductOfferingQualificationId() {
    return productOfferingQualificationId;
  }

  @JsonProperty("productOfferingQualificationId")
  public void setProductOfferingQualificationId(String productOfferingQualificationId) {
    this.productOfferingQualificationId = productOfferingQualificationId;
  }

  /**
   * Name of the related entity.
   **/
  public ProductOfferingQualificationItemRefVO productOfferingQualificationName(String productOfferingQualificationName) {
    this.productOfferingQualificationName = productOfferingQualificationName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the related entity.")
  @JsonProperty("productOfferingQualificationName")
  public String getProductOfferingQualificationName() {
    return productOfferingQualificationName;
  }

  @JsonProperty("productOfferingQualificationName")
  public void setProductOfferingQualificationName(String productOfferingQualificationName) {
    this.productOfferingQualificationName = productOfferingQualificationName;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductOfferingQualificationItemRefVO atBaseType(String atBaseType) {
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
  public ProductOfferingQualificationItemRefVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductOfferingQualificationItemRefVO atType(String atType) {
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

  /**
   * The actual type of the target instance when needed for disambiguation.
   **/
  public ProductOfferingQualificationItemRefVO atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  @JsonProperty("@referredType")
  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationItemRefVO productOfferingQualificationItemRef = (ProductOfferingQualificationItemRefVO) o;
    return Objects.equals(this.id, productOfferingQualificationItemRef.id) &&
        Objects.equals(this.href, productOfferingQualificationItemRef.href) &&
        Objects.equals(this.name, productOfferingQualificationItemRef.name) &&
        Objects.equals(this.productOfferingQualificationHref, productOfferingQualificationItemRef.productOfferingQualificationHref) &&
        Objects.equals(this.productOfferingQualificationId, productOfferingQualificationItemRef.productOfferingQualificationId) &&
        Objects.equals(this.productOfferingQualificationName, productOfferingQualificationItemRef.productOfferingQualificationName) &&
        Objects.equals(this.atBaseType, productOfferingQualificationItemRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingQualificationItemRef.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingQualificationItemRef.atType) &&
        Objects.equals(this.atReferredType, productOfferingQualificationItemRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, productOfferingQualificationHref, productOfferingQualificationId, productOfferingQualificationName, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationItemRefVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productOfferingQualificationHref: ").append(toIndentedString(productOfferingQualificationHref)).append("\n");
    sb.append("    productOfferingQualificationId: ").append(toIndentedString(productOfferingQualificationId)).append("\n");
    sb.append("    productOfferingQualificationName: ").append(toIndentedString(productOfferingQualificationName)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

