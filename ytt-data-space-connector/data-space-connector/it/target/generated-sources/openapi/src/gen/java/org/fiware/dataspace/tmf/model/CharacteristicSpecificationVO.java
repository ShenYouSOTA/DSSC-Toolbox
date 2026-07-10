package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.CharacteristicSpecificationRelationshipVO;
import org.fiware.dataspace.tmf.model.CharacteristicValueSpecificationVO;
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
 * This class defines a characteristic specification.
 **/
@ApiModel(description = "This class defines a characteristic specification.")
@JsonTypeName("CharacteristicSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CharacteristicSpecificationVO   {
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
  private @Valid List<@Valid CharacteristicSpecificationRelationshipVO> charSpecRelationship = new ArrayList<>();
  private @Valid List<@Valid CharacteristicValueSpecificationVO> characteristicValueSpecification = new ArrayList<>();
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atValueSchemaLocation;

  /**
   * Unique ID for the characteristic
   **/
  public CharacteristicSpecificationVO id(String id) {
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
  public CharacteristicSpecificationVO configurable(Boolean configurable) {
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
  public CharacteristicSpecificationVO description(String description) {
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
  public CharacteristicSpecificationVO extensible(Boolean extensible) {
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
  public CharacteristicSpecificationVO isUnique(Boolean isUnique) {
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
  public CharacteristicSpecificationVO maxCardinality(Integer maxCardinality) {
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
  public CharacteristicSpecificationVO minCardinality(Integer minCardinality) {
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
  public CharacteristicSpecificationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   **/
  public CharacteristicSpecificationVO regex(String regex) {
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
  public CharacteristicSpecificationVO valueType(String valueType) {
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
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   **/
  public CharacteristicSpecificationVO charSpecRelationship(List<@Valid CharacteristicSpecificationRelationshipVO> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.")
  @JsonProperty("charSpecRelationship")
  @Valid public List<@Valid CharacteristicSpecificationRelationshipVO> getCharSpecRelationship() {
    return charSpecRelationship;
  }

  @JsonProperty("charSpecRelationship")
  public void setCharSpecRelationship(List<@Valid CharacteristicSpecificationRelationshipVO> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
  }

  public CharacteristicSpecificationVO addCharSpecRelationshipItem(CharacteristicSpecificationRelationshipVO charSpecRelationshipItem) {
    if (this.charSpecRelationship == null) {
      this.charSpecRelationship = new ArrayList<>();
    }

    this.charSpecRelationship.add(charSpecRelationshipItem);
    return this;
  }

  public CharacteristicSpecificationVO removeCharSpecRelationshipItem(CharacteristicSpecificationRelationshipVO charSpecRelationshipItem) {
    if (charSpecRelationshipItem != null && this.charSpecRelationship != null) {
      this.charSpecRelationship.remove(charSpecRelationshipItem);
    }

    return this;
  }
  /**
   * A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.
   **/
  public CharacteristicSpecificationVO characteristicValueSpecification(List<@Valid CharacteristicValueSpecificationVO> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.")
  @JsonProperty("characteristicValueSpecification")
  @Valid public List<@Valid CharacteristicValueSpecificationVO> getCharacteristicValueSpecification() {
    return characteristicValueSpecification;
  }

  @JsonProperty("characteristicValueSpecification")
  public void setCharacteristicValueSpecification(List<@Valid CharacteristicValueSpecificationVO> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
  }

  public CharacteristicSpecificationVO addCharacteristicValueSpecificationItem(CharacteristicValueSpecificationVO characteristicValueSpecificationItem) {
    if (this.characteristicValueSpecification == null) {
      this.characteristicValueSpecification = new ArrayList<>();
    }

    this.characteristicValueSpecification.add(characteristicValueSpecificationItem);
    return this;
  }

  public CharacteristicSpecificationVO removeCharacteristicValueSpecificationItem(CharacteristicValueSpecificationVO characteristicValueSpecificationItem) {
    if (characteristicValueSpecificationItem != null && this.characteristicValueSpecification != null) {
      this.characteristicValueSpecification.remove(characteristicValueSpecificationItem);
    }

    return this;
  }
  /**
   **/
  public CharacteristicSpecificationVO validFor(TimePeriodVO validFor) {
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
  public CharacteristicSpecificationVO atBaseType(String atBaseType) {
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
  public CharacteristicSpecificationVO atSchemaLocation(URI atSchemaLocation) {
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
  public CharacteristicSpecificationVO atType(String atType) {
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
  public CharacteristicSpecificationVO atValueSchemaLocation(String atValueSchemaLocation) {
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
    CharacteristicSpecificationVO characteristicSpecification = (CharacteristicSpecificationVO) o;
    return Objects.equals(this.id, characteristicSpecification.id) &&
        Objects.equals(this.configurable, characteristicSpecification.configurable) &&
        Objects.equals(this.description, characteristicSpecification.description) &&
        Objects.equals(this.extensible, characteristicSpecification.extensible) &&
        Objects.equals(this.isUnique, characteristicSpecification.isUnique) &&
        Objects.equals(this.maxCardinality, characteristicSpecification.maxCardinality) &&
        Objects.equals(this.minCardinality, characteristicSpecification.minCardinality) &&
        Objects.equals(this.name, characteristicSpecification.name) &&
        Objects.equals(this.regex, characteristicSpecification.regex) &&
        Objects.equals(this.valueType, characteristicSpecification.valueType) &&
        Objects.equals(this.charSpecRelationship, characteristicSpecification.charSpecRelationship) &&
        Objects.equals(this.characteristicValueSpecification, characteristicSpecification.characteristicValueSpecification) &&
        Objects.equals(this.validFor, characteristicSpecification.validFor) &&
        Objects.equals(this.atBaseType, characteristicSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, characteristicSpecification.atType) &&
        Objects.equals(this.atValueSchemaLocation, characteristicSpecification.atValueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, charSpecRelationship, characteristicValueSpecification, validFor, atBaseType, atSchemaLocation, atType, atValueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecificationVO {\n");
    
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
    sb.append("    charSpecRelationship: ").append(toIndentedString(charSpecRelationship)).append("\n");
    sb.append("    characteristicValueSpecification: ").append(toIndentedString(characteristicValueSpecification)).append("\n");
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

