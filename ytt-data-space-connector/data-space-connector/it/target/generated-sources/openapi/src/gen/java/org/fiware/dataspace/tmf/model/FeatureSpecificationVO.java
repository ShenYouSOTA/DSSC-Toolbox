package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.ConstraintRefVO;
import org.fiware.dataspace.tmf.model.FeatureSpecificationCharacteristicVO;
import org.fiware.dataspace.tmf.model.FeatureSpecificationRelationshipVO;
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
 * Specification for resource, service or product features
 **/
@ApiModel(description = "Specification for resource, service or product features")
@JsonTypeName("FeatureSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class FeatureSpecificationVO   {
  private String id;
  private Boolean isBundle;
  private Boolean isEnabled;
  private String name;
  private String version;
  private @Valid List<@Valid ConstraintRefVO> constraint = new ArrayList<>();
  private @Valid List<@Valid FeatureSpecificationCharacteristicVO> featureSpecCharacteristic = new ArrayList<>();
  private @Valid List<@Valid FeatureSpecificationRelationshipVO> featureSpecRelationship = new ArrayList<>();
  private TimePeriodVO validFor;

  /**
   * Identifier of the feature specification. Must be locally unique within the containing specification, thus allowing direct access to the feature spec.
   **/
  public FeatureSpecificationVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the feature specification. Must be locally unique within the containing specification, thus allowing direct access to the feature spec.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A flag indicating if this is a feature group (true) or not (false)
   **/
  public FeatureSpecificationVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "A flag indicating if this is a feature group (true) or not (false)")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * A flag indicating if the feature is enabled (true) or not (false)
   **/
  public FeatureSpecificationVO isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "A flag indicating if the feature is enabled (true) or not (false)")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @JsonProperty("isEnabled")
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  /**
   * Unique name given to the feature specification
   **/
  public FeatureSpecificationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Unique name given to the feature specification")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Version of the feature specification
   **/
  public FeatureSpecificationVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "Version of the feature specification")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * This is a list of feature constraints
   **/
  public FeatureSpecificationVO constraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
    return this;
  }

  
  @ApiModelProperty(value = "This is a list of feature constraints")
  @JsonProperty("constraint")
  @Valid public List<@Valid ConstraintRefVO> getConstraint() {
    return constraint;
  }

  @JsonProperty("constraint")
  public void setConstraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
  }

  public FeatureSpecificationVO addConstraintItem(ConstraintRefVO constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }

    this.constraint.add(constraintItem);
    return this;
  }

  public FeatureSpecificationVO removeConstraintItem(ConstraintRefVO constraintItem) {
    if (constraintItem != null && this.constraint != null) {
      this.constraint.remove(constraintItem);
    }

    return this;
  }
  /**
   * This is a list of characteristics for a particular feature
   **/
  public FeatureSpecificationVO featureSpecCharacteristic(List<@Valid FeatureSpecificationCharacteristicVO> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
    return this;
  }

  
  @ApiModelProperty(value = "This is a list of characteristics for a particular feature")
  @JsonProperty("featureSpecCharacteristic")
  @Valid public List<@Valid FeatureSpecificationCharacteristicVO> getFeatureSpecCharacteristic() {
    return featureSpecCharacteristic;
  }

  @JsonProperty("featureSpecCharacteristic")
  public void setFeatureSpecCharacteristic(List<@Valid FeatureSpecificationCharacteristicVO> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
  }

  public FeatureSpecificationVO addFeatureSpecCharacteristicItem(FeatureSpecificationCharacteristicVO featureSpecCharacteristicItem) {
    if (this.featureSpecCharacteristic == null) {
      this.featureSpecCharacteristic = new ArrayList<>();
    }

    this.featureSpecCharacteristic.add(featureSpecCharacteristicItem);
    return this;
  }

  public FeatureSpecificationVO removeFeatureSpecCharacteristicItem(FeatureSpecificationCharacteristicVO featureSpecCharacteristicItem) {
    if (featureSpecCharacteristicItem != null && this.featureSpecCharacteristic != null) {
      this.featureSpecCharacteristic.remove(featureSpecCharacteristicItem);
    }

    return this;
  }
  /**
   * A dependency, exclusivity or aggratation relationship between/among feature specifications.
   **/
  public FeatureSpecificationVO featureSpecRelationship(List<@Valid FeatureSpecificationRelationshipVO> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "A dependency, exclusivity or aggratation relationship between/among feature specifications.")
  @JsonProperty("featureSpecRelationship")
  @Valid public List<@Valid FeatureSpecificationRelationshipVO> getFeatureSpecRelationship() {
    return featureSpecRelationship;
  }

  @JsonProperty("featureSpecRelationship")
  public void setFeatureSpecRelationship(List<@Valid FeatureSpecificationRelationshipVO> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
  }

  public FeatureSpecificationVO addFeatureSpecRelationshipItem(FeatureSpecificationRelationshipVO featureSpecRelationshipItem) {
    if (this.featureSpecRelationship == null) {
      this.featureSpecRelationship = new ArrayList<>();
    }

    this.featureSpecRelationship.add(featureSpecRelationshipItem);
    return this;
  }

  public FeatureSpecificationVO removeFeatureSpecRelationshipItem(FeatureSpecificationRelationshipVO featureSpecRelationshipItem) {
    if (featureSpecRelationshipItem != null && this.featureSpecRelationship != null) {
      this.featureSpecRelationship.remove(featureSpecRelationshipItem);
    }

    return this;
  }
  /**
   **/
  public FeatureSpecificationVO validFor(TimePeriodVO validFor) {
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
    FeatureSpecificationVO featureSpecification = (FeatureSpecificationVO) o;
    return Objects.equals(this.id, featureSpecification.id) &&
        Objects.equals(this.isBundle, featureSpecification.isBundle) &&
        Objects.equals(this.isEnabled, featureSpecification.isEnabled) &&
        Objects.equals(this.name, featureSpecification.name) &&
        Objects.equals(this.version, featureSpecification.version) &&
        Objects.equals(this.constraint, featureSpecification.constraint) &&
        Objects.equals(this.featureSpecCharacteristic, featureSpecification.featureSpecCharacteristic) &&
        Objects.equals(this.featureSpecRelationship, featureSpecification.featureSpecRelationship) &&
        Objects.equals(this.validFor, featureSpecification.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isBundle, isEnabled, name, version, constraint, featureSpecCharacteristic, featureSpecRelationship, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    featureSpecCharacteristic: ").append(toIndentedString(featureSpecCharacteristic)).append("\n");
    sb.append("    featureSpecRelationship: ").append(toIndentedString(featureSpecRelationship)).append("\n");
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

