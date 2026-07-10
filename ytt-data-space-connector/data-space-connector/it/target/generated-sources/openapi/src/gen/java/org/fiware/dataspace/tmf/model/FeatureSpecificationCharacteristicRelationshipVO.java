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
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among FeatureSpecificationCharacteristics.
 **/
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among FeatureSpecificationCharacteristics.")
@JsonTypeName("FeatureSpecificationCharacteristicRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class FeatureSpecificationCharacteristicRelationshipVO   {
  private String characteristicId;
  private String featureId;
  private String name;
  private String relationshipType;
  private URI resourceSpecificationHref;
  private String resourceSpecificationId;
  private TimePeriodVO validFor;

  /**
   * Unique identifier of the characteristic within the the target feature specification
   **/
  public FeatureSpecificationCharacteristicRelationshipVO characteristicId(String characteristicId) {
    this.characteristicId = characteristicId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the characteristic within the the target feature specification")
  @JsonProperty("characteristicId")
  public String getCharacteristicId() {
    return characteristicId;
  }

  @JsonProperty("characteristicId")
  public void setCharacteristicId(String characteristicId) {
    this.characteristicId = characteristicId;
  }

  /**
   * Unique identifier of the target feature specification within the resource specification.
   **/
  public FeatureSpecificationCharacteristicRelationshipVO featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the target feature specification within the resource specification.")
  @JsonProperty("featureId")
  public String getFeatureId() {
    return featureId;
  }

  @JsonProperty("featureId")
  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  /**
   * Name of the target characteristic
   **/
  public FeatureSpecificationCharacteristicRelationshipVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the target characteristic")
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
  public FeatureSpecificationCharacteristicRelationshipVO relationshipType(String relationshipType) {
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
   * Hyperlink reference to the resource specification containing the target feature and feature characteristic
   **/
  public FeatureSpecificationCharacteristicRelationshipVO resourceSpecificationHref(URI resourceSpecificationHref) {
    this.resourceSpecificationHref = resourceSpecificationHref;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink reference to the resource specification containing the target feature and feature characteristic")
  @JsonProperty("resourceSpecificationHref")
  public URI getResourceSpecificationHref() {
    return resourceSpecificationHref;
  }

  @JsonProperty("resourceSpecificationHref")
  public void setResourceSpecificationHref(URI resourceSpecificationHref) {
    this.resourceSpecificationHref = resourceSpecificationHref;
  }

  /**
   * Unique identifier of the resource specification containing the target feature and feature characteristic
   **/
  public FeatureSpecificationCharacteristicRelationshipVO resourceSpecificationId(String resourceSpecificationId) {
    this.resourceSpecificationId = resourceSpecificationId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the resource specification containing the target feature and feature characteristic")
  @JsonProperty("resourceSpecificationId")
  public String getResourceSpecificationId() {
    return resourceSpecificationId;
  }

  @JsonProperty("resourceSpecificationId")
  public void setResourceSpecificationId(String resourceSpecificationId) {
    this.resourceSpecificationId = resourceSpecificationId;
  }

  /**
   **/
  public FeatureSpecificationCharacteristicRelationshipVO validFor(TimePeriodVO validFor) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSpecificationCharacteristicRelationshipVO featureSpecificationCharacteristicRelationship = (FeatureSpecificationCharacteristicRelationshipVO) o;
    return Objects.equals(this.characteristicId, featureSpecificationCharacteristicRelationship.characteristicId) &&
        Objects.equals(this.featureId, featureSpecificationCharacteristicRelationship.featureId) &&
        Objects.equals(this.name, featureSpecificationCharacteristicRelationship.name) &&
        Objects.equals(this.relationshipType, featureSpecificationCharacteristicRelationship.relationshipType) &&
        Objects.equals(this.resourceSpecificationHref, featureSpecificationCharacteristicRelationship.resourceSpecificationHref) &&
        Objects.equals(this.resourceSpecificationId, featureSpecificationCharacteristicRelationship.resourceSpecificationId) &&
        Objects.equals(this.validFor, featureSpecificationCharacteristicRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristicId, featureId, name, relationshipType, resourceSpecificationHref, resourceSpecificationId, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationCharacteristicRelationshipVO {\n");
    
    sb.append("    characteristicId: ").append(toIndentedString(characteristicId)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    resourceSpecificationHref: ").append(toIndentedString(resourceSpecificationHref)).append("\n");
    sb.append("    resourceSpecificationId: ").append(toIndentedString(resourceSpecificationId)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

