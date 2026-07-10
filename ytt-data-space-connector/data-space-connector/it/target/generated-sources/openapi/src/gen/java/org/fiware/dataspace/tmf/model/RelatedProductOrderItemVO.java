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
 * RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.
 **/
@ApiModel(description = "RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.")
@JsonTypeName("RelatedProductOrderItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class RelatedProductOrderItemVO   {
  private String orderItemAction;
  private String orderItemId;
  private String productOrderHref;
  private String productOrderId;
  private String role;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atReferredType;

  /**
   * Action of the order item for this product
   **/
  public RelatedProductOrderItemVO orderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
    return this;
  }

  
  @ApiModelProperty(value = "Action of the order item for this product")
  @JsonProperty("orderItemAction")
  public String getOrderItemAction() {
    return orderItemAction;
  }

  @JsonProperty("orderItemAction")
  public void setOrderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
  }

  /**
   * Identifier of the order item where the product was managed
   **/
  public RelatedProductOrderItemVO orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the order item where the product was managed")
  @JsonProperty("orderItemId")
  @NotNull public String getOrderItemId() {
    return orderItemId;
  }

  @JsonProperty("orderItemId")
  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  /**
   * Reference of the related entity.
   **/
  public RelatedProductOrderItemVO productOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the related entity.")
  @JsonProperty("productOrderHref")
  public String getProductOrderHref() {
    return productOrderHref;
  }

  @JsonProperty("productOrderHref")
  public void setProductOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
  }

  /**
   * Unique identifier of a related entity.
   **/
  public RelatedProductOrderItemVO productOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @JsonProperty("productOrderId")
  @NotNull public String getProductOrderId() {
    return productOrderId;
  }

  @JsonProperty("productOrderId")
  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }

  /**
   * role of the product order item for this product
   **/
  public RelatedProductOrderItemVO role(String role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "role of the product order item for this product")
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  @JsonProperty("role")
  public void setRole(String role) {
    this.role = role;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public RelatedProductOrderItemVO atBaseType(String atBaseType) {
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
  public RelatedProductOrderItemVO atSchemaLocation(URI atSchemaLocation) {
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
  public RelatedProductOrderItemVO atType(String atType) {
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
  public RelatedProductOrderItemVO atReferredType(String atReferredType) {
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
    RelatedProductOrderItemVO relatedProductOrderItem = (RelatedProductOrderItemVO) o;
    return Objects.equals(this.orderItemAction, relatedProductOrderItem.orderItemAction) &&
        Objects.equals(this.orderItemId, relatedProductOrderItem.orderItemId) &&
        Objects.equals(this.productOrderHref, relatedProductOrderItem.productOrderHref) &&
        Objects.equals(this.productOrderId, relatedProductOrderItem.productOrderId) &&
        Objects.equals(this.role, relatedProductOrderItem.role) &&
        Objects.equals(this.atBaseType, relatedProductOrderItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedProductOrderItem.atSchemaLocation) &&
        Objects.equals(this.atType, relatedProductOrderItem.atType) &&
        Objects.equals(this.atReferredType, relatedProductOrderItem.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemAction, orderItemId, productOrderHref, productOrderId, role, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProductOrderItemVO {\n");
    
    sb.append("    orderItemAction: ").append(toIndentedString(orderItemAction)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    productOrderHref: ").append(toIndentedString(productOrderHref)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

