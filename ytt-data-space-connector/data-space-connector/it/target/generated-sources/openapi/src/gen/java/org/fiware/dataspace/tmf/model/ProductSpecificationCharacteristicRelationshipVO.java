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
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.
 **/
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.")
@JsonTypeName("ProductSpecificationCharacteristicRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductSpecificationCharacteristicRelationshipVO   {
  private String id;
  private String href;
  private Integer charSpecSeq;
  private String name;
  private String relationshipType;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * the identifier of the associated product specification
   **/
  public ProductSpecificationCharacteristicRelationshipVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "the identifier of the associated product specification")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hyperlink reference to the target product specification
   **/
  public ProductSpecificationCharacteristicRelationshipVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink reference to the target product specification")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.
   **/
  public ProductSpecificationCharacteristicRelationshipVO charSpecSeq(Integer charSpecSeq) {
    this.charSpecSeq = charSpecSeq;
    return this;
  }

  
  @ApiModelProperty(value = "The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.")
  @JsonProperty("charSpecSeq")
  public Integer getCharSpecSeq() {
    return charSpecSeq;
  }

  @JsonProperty("charSpecSeq")
  public void setCharSpecSeq(Integer charSpecSeq) {
    this.charSpecSeq = charSpecSeq;
  }

  /**
   * Name of the target product specification characteristic
   **/
  public ProductSpecificationCharacteristicRelationshipVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the target product specification characteristic")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   **/
  public ProductSpecificationCharacteristicRelationshipVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity")
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  @JsonProperty("relationshipType")
  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  /**
   **/
  public ProductSpecificationCharacteristicRelationshipVO validFor(TimePeriodVO validFor) {
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
  public ProductSpecificationCharacteristicRelationshipVO atBaseType(String atBaseType) {
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
  public ProductSpecificationCharacteristicRelationshipVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductSpecificationCharacteristicRelationshipVO atType(String atType) {
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
    ProductSpecificationCharacteristicRelationshipVO productSpecificationCharacteristicRelationship = (ProductSpecificationCharacteristicRelationshipVO) o;
    return Objects.equals(this.id, productSpecificationCharacteristicRelationship.id) &&
        Objects.equals(this.href, productSpecificationCharacteristicRelationship.href) &&
        Objects.equals(this.charSpecSeq, productSpecificationCharacteristicRelationship.charSpecSeq) &&
        Objects.equals(this.name, productSpecificationCharacteristicRelationship.name) &&
        Objects.equals(this.relationshipType, productSpecificationCharacteristicRelationship.relationshipType) &&
        Objects.equals(this.validFor, productSpecificationCharacteristicRelationship.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationCharacteristicRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationCharacteristicRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationCharacteristicRelationship.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, charSpecSeq, name, relationshipType, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristicRelationshipVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    charSpecSeq: ").append(toIndentedString(charSpecSeq)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

