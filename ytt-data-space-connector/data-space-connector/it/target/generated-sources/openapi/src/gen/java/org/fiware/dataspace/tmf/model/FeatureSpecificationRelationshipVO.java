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
 * Relationship between feature specifications
 **/
@ApiModel(description = "Relationship between feature specifications")
@JsonTypeName("FeatureSpecificationRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class FeatureSpecificationRelationshipVO   {
  private String featureId;
  private String name;
  private URI parentSpecificationHref;
  private String parentSpecificationId;
  private String relationshipType;
  private TimePeriodVO validFor;

  /**
   * Unique identifier of the target feature specification.
   **/
  public FeatureSpecificationRelationshipVO featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the target feature specification.")
  @JsonProperty("featureId")
  public String getFeatureId() {
    return featureId;
  }

  @JsonProperty("featureId")
  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  /**
   * This is the name of the target feature specification.
   **/
  public FeatureSpecificationRelationshipVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This is the name of the target feature specification.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Hyperlink reference to the parent specification containing the target feature
   **/
  public FeatureSpecificationRelationshipVO parentSpecificationHref(URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink reference to the parent specification containing the target feature")
  @JsonProperty("parentSpecificationHref")
  public URI getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  @JsonProperty("parentSpecificationHref")
  public void setParentSpecificationHref(URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  /**
   * Unique identifier of the parent specification containing the target feature
   **/
  public FeatureSpecificationRelationshipVO parentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the parent specification containing the target feature")
  @JsonProperty("parentSpecificationId")
  public String getParentSpecificationId() {
    return parentSpecificationId;
  }

  @JsonProperty("parentSpecificationId")
  public void setParentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  /**
   * This is the type of the feature specification relationship.
   **/
  public FeatureSpecificationRelationshipVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This is the type of the feature specification relationship.")
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
  public FeatureSpecificationRelationshipVO validFor(TimePeriodVO validFor) {
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
    FeatureSpecificationRelationshipVO featureSpecificationRelationship = (FeatureSpecificationRelationshipVO) o;
    return Objects.equals(this.featureId, featureSpecificationRelationship.featureId) &&
        Objects.equals(this.name, featureSpecificationRelationship.name) &&
        Objects.equals(this.parentSpecificationHref, featureSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.parentSpecificationId, featureSpecificationRelationship.parentSpecificationId) &&
        Objects.equals(this.relationshipType, featureSpecificationRelationship.relationshipType) &&
        Objects.equals(this.validFor, featureSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, name, parentSpecificationHref, parentSpecificationId, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationRelationshipVO {\n");
    
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentSpecificationHref: ").append(toIndentedString(parentSpecificationHref)).append("\n");
    sb.append("    parentSpecificationId: ").append(toIndentedString(parentSpecificationId)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

