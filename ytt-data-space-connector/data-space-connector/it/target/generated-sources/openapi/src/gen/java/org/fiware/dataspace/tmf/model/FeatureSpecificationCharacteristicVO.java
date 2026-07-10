package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.CharacteristicValueSpecificationVO;
import org.fiware.dataspace.tmf.model.FeatureSpecificationCharacteristicRelationshipVO;
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
 * Configuration feature characteristic specification.
 **/
@ApiModel(description = "Configuration feature characteristic specification.")
@JsonTypeName("FeatureSpecificationCharacteristic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class FeatureSpecificationCharacteristicVO   {
  private String id;
  private Boolean configurable;
  private String description;
  private Boolean extensible;
  private Boolean isUnique;
  private Integer maxCardinality;
  private Integer minCardinality;
  private String name;
  private String regex;
  private String valueType;
  private @Valid List<@Valid FeatureSpecificationCharacteristicRelationshipVO> featureSpecCharRelationship = new ArrayList<>();
  private @Valid List<@Valid CharacteristicValueSpecificationVO> featureSpecCharacteristicValue = new ArrayList<>();
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atValueSchemaLocation;

  /**
   * Unique ID for the characteristic
   **/
  public FeatureSpecificationCharacteristicVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique ID for the characteristic")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   **/
  public FeatureSpecificationCharacteristicVO configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  
  @ApiModelProperty(value = "If true, the Boolean indicates that the target Characteristic is configurable")
  @JsonProperty("configurable")
  public Boolean getConfigurable() {
    return configurable;
  }

  @JsonProperty("configurable")
  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   **/
  public FeatureSpecificationCharacteristicVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains the CharacteristicSpecification.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   **/
  public FeatureSpecificationCharacteristicVO extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.")
  @JsonProperty("extensible")
  public Boolean getExtensible() {
    return extensible;
  }

  @JsonProperty("extensible")
  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \&quot;unique while value is in effect\&quot; and \&quot;unique whether value is in effect or not\&quot;
   **/
  public FeatureSpecificationCharacteristicVO isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  
  @ApiModelProperty(value = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"")
  @JsonProperty("isUnique")
  public Boolean getIsUnique() {
    return isUnique;
  }

  @JsonProperty("isUnique")
  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   **/
  public FeatureSpecificationCharacteristicVO maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.")
  @JsonProperty("maxCardinality")
  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  @JsonProperty("maxCardinality")
  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   **/
  public FeatureSpecificationCharacteristicVO minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.")
  @JsonProperty("minCardinality")
  public Integer getMinCardinality() {
    return minCardinality;
  }

  @JsonProperty("minCardinality")
  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   **/
  public FeatureSpecificationCharacteristicVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   **/
  public FeatureSpecificationCharacteristicVO regex(String regex) {
    this.regex = regex;
    return this;
  }

  
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value.")
  @JsonProperty("regex")
  public String getRegex() {
    return regex;
  }

  @JsonProperty("regex")
  public void setRegex(String regex) {
    this.regex = regex;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   **/
  public FeatureSpecificationCharacteristicVO valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }

  @JsonProperty("valueType")
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among feature characteristics.
   **/
  public FeatureSpecificationCharacteristicVO featureSpecCharRelationship(List<@Valid FeatureSpecificationCharacteristicRelationshipVO> featureSpecCharRelationship) {
    this.featureSpecCharRelationship = featureSpecCharRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among feature characteristics.")
  @JsonProperty("featureSpecCharRelationship")
  @Valid public List<@Valid FeatureSpecificationCharacteristicRelationshipVO> getFeatureSpecCharRelationship() {
    return featureSpecCharRelationship;
  }

  @JsonProperty("featureSpecCharRelationship")
  public void setFeatureSpecCharRelationship(List<@Valid FeatureSpecificationCharacteristicRelationshipVO> featureSpecCharRelationship) {
    this.featureSpecCharRelationship = featureSpecCharRelationship;
  }

  public FeatureSpecificationCharacteristicVO addFeatureSpecCharRelationshipItem(FeatureSpecificationCharacteristicRelationshipVO featureSpecCharRelationshipItem) {
    if (this.featureSpecCharRelationship == null) {
      this.featureSpecCharRelationship = new ArrayList<>();
    }

    this.featureSpecCharRelationship.add(featureSpecCharRelationshipItem);
    return this;
  }

  public FeatureSpecificationCharacteristicVO removeFeatureSpecCharRelationshipItem(FeatureSpecificationCharacteristicRelationshipVO featureSpecCharRelationshipItem) {
    if (featureSpecCharRelationshipItem != null && this.featureSpecCharRelationship != null) {
      this.featureSpecCharRelationship.remove(featureSpecCharRelationshipItem);
    }

    return this;
  }
  /**
   * Used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a FeatureCharacteristic object.
   **/
  public FeatureSpecificationCharacteristicVO featureSpecCharacteristicValue(List<@Valid CharacteristicValueSpecificationVO> featureSpecCharacteristicValue) {
    this.featureSpecCharacteristicValue = featureSpecCharacteristicValue;
    return this;
  }

  
  @ApiModelProperty(value = "Used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a FeatureCharacteristic object.")
  @JsonProperty("featureSpecCharacteristicValue")
  @Valid public List<@Valid CharacteristicValueSpecificationVO> getFeatureSpecCharacteristicValue() {
    return featureSpecCharacteristicValue;
  }

  @JsonProperty("featureSpecCharacteristicValue")
  public void setFeatureSpecCharacteristicValue(List<@Valid CharacteristicValueSpecificationVO> featureSpecCharacteristicValue) {
    this.featureSpecCharacteristicValue = featureSpecCharacteristicValue;
  }

  public FeatureSpecificationCharacteristicVO addFeatureSpecCharacteristicValueItem(CharacteristicValueSpecificationVO featureSpecCharacteristicValueItem) {
    if (this.featureSpecCharacteristicValue == null) {
      this.featureSpecCharacteristicValue = new ArrayList<>();
    }

    this.featureSpecCharacteristicValue.add(featureSpecCharacteristicValueItem);
    return this;
  }

  public FeatureSpecificationCharacteristicVO removeFeatureSpecCharacteristicValueItem(CharacteristicValueSpecificationVO featureSpecCharacteristicValueItem) {
    if (featureSpecCharacteristicValueItem != null && this.featureSpecCharacteristicValue != null) {
      this.featureSpecCharacteristicValue.remove(featureSpecCharacteristicValueItem);
    }

    return this;
  }
  /**
   **/
  public FeatureSpecificationCharacteristicVO validFor(TimePeriodVO validFor) {
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
  public FeatureSpecificationCharacteristicVO atBaseType(String atBaseType) {
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
  public FeatureSpecificationCharacteristicVO atSchemaLocation(URI atSchemaLocation) {
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
  public FeatureSpecificationCharacteristicVO atType(String atType) {
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

  /**
   * This (optional) field provides a link to the schema describing the value type.
   **/
  public FeatureSpecificationCharacteristicVO atValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
    return this;
  }

  
  @ApiModelProperty(value = "This (optional) field provides a link to the schema describing the value type.")
  @JsonProperty("@valueSchemaLocation")
  public String getAtValueSchemaLocation() {
    return atValueSchemaLocation;
  }

  @JsonProperty("@valueSchemaLocation")
  public void setAtValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSpecificationCharacteristicVO featureSpecificationCharacteristic = (FeatureSpecificationCharacteristicVO) o;
    return Objects.equals(this.id, featureSpecificationCharacteristic.id) &&
        Objects.equals(this.configurable, featureSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, featureSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, featureSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, featureSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, featureSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, featureSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, featureSpecificationCharacteristic.name) &&
        Objects.equals(this.regex, featureSpecificationCharacteristic.regex) &&
        Objects.equals(this.valueType, featureSpecificationCharacteristic.valueType) &&
        Objects.equals(this.featureSpecCharRelationship, featureSpecificationCharacteristic.featureSpecCharRelationship) &&
        Objects.equals(this.featureSpecCharacteristicValue, featureSpecificationCharacteristic.featureSpecCharacteristicValue) &&
        Objects.equals(this.validFor, featureSpecificationCharacteristic.validFor) &&
        Objects.equals(this.atBaseType, featureSpecificationCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, featureSpecificationCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, featureSpecificationCharacteristic.atType) &&
        Objects.equals(this.atValueSchemaLocation, featureSpecificationCharacteristic.atValueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, featureSpecCharRelationship, featureSpecCharacteristicValue, validFor, atBaseType, atSchemaLocation, atType, atValueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationCharacteristicVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    featureSpecCharRelationship: ").append(toIndentedString(featureSpecCharRelationship)).append("\n");
    sb.append("    featureSpecCharacteristicValue: ").append(toIndentedString(featureSpecCharacteristicValue)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atValueSchemaLocation: ").append(toIndentedString(atValueSchemaLocation)).append("\n");
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

