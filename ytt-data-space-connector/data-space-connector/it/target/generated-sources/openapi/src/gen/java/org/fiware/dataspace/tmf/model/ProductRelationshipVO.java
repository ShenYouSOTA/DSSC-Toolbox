package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.ProductRefOrValueVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Linked products to the one instantiate, such as [bundled] if the product is a bundle and you want to describe the bundled products inside this bundle; [reliesOn] if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful
 **/
@ApiModel(description = "Linked products to the one instantiate, such as [bundled] if the product is a bundle and you want to describe the bundled products inside this bundle; [reliesOn] if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful")
@JsonTypeName("ProductRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductRelationshipVO   {
  private String relationshipType;
  private ProductRefOrValueVO product;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Type of the product relationship, such as [bundled] if the product is a bundle and you want to describe the bundled products inside this bundle; [reliesOn] if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful
   **/
  public ProductRelationshipVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type of the product relationship, such as [bundled] if the product is a bundle and you want to describe the bundled products inside this bundle; [reliesOn] if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful")
  @JsonProperty("relationshipType")
  @NotNull public String getRelationshipType() {
    return relationshipType;
  }

  @JsonProperty("relationshipType")
  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  /**
   **/
  public ProductRelationshipVO product(ProductRefOrValueVO product) {
    this.product = product;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("product")
  @NotNull @Valid public ProductRefOrValueVO getProduct() {
    return product;
  }

  @JsonProperty("product")
  public void setProduct(ProductRefOrValueVO product) {
    this.product = product;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductRelationshipVO atBaseType(String atBaseType) {
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
  public ProductRelationshipVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductRelationshipVO atType(String atType) {
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
    ProductRelationshipVO productRelationship = (ProductRelationshipVO) o;
    return Objects.equals(this.relationshipType, productRelationship.relationshipType) &&
        Objects.equals(this.product, productRelationship.product) &&
        Objects.equals(this.atBaseType, productRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, productRelationship.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipType, product, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRelationshipVO {\n");
    
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

