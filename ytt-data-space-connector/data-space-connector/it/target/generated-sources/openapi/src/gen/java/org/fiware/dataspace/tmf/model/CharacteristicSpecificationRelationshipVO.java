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
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Characteristic specifications. The specification characteristic is embedded within the specification whose ID and href are in this entity, and identified by its ID.
 **/
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Characteristic specifications. The specification characteristic is embedded within the specification whose ID and href are in this entity, and identified by its ID.")
@JsonTypeName("CharacteristicSpecificationRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CharacteristicSpecificationRelationshipVO   {
  private String characteristicSpecificationId;
  private String name;
  private URI parentSpecificationHref;
  private String parentSpecificationId;
  private String relationshipType;
  private TimePeriodVO validFor;

  /**
   * Unique identifier of the characteristic within the specification
   **/
  public CharacteristicSpecificationRelationshipVO characteristicSpecificationId(String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the characteristic within the specification")
  @JsonProperty("characteristicSpecificationId")
  public String getCharacteristicSpecificationId() {
    return characteristicSpecificationId;
  }

  @JsonProperty("characteristicSpecificationId")
  public void setCharacteristicSpecificationId(String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
  }

  /**
   * Name of the target characteristic within the specification
   **/
  public CharacteristicSpecificationRelationshipVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the target characteristic within the specification")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Hyperlink reference to the parent specification containing the target characteristic
   **/
  public CharacteristicSpecificationRelationshipVO parentSpecificationHref(URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink reference to the parent specification containing the target characteristic")
  @JsonProperty("parentSpecificationHref")
  public URI getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  @JsonProperty("parentSpecificationHref")
  public void setParentSpecificationHref(URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  /**
   * Unique identifier of the parent specification containing the target characteristic
   **/
  public CharacteristicSpecificationRelationshipVO parentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the parent specification containing the target characteristic")
  @JsonProperty("parentSpecificationId")
  public String getParentSpecificationId() {
    return parentSpecificationId;
  }

  @JsonProperty("parentSpecificationId")
  public void setParentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   **/
  public CharacteristicSpecificationRelationshipVO relationshipType(String relationshipType) {
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
  public CharacteristicSpecificationRelationshipVO validFor(TimePeriodVO validFor) {
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
    CharacteristicSpecificationRelationshipVO characteristicSpecificationRelationship = (CharacteristicSpecificationRelationshipVO) o;
    return Objects.equals(this.characteristicSpecificationId, characteristicSpecificationRelationship.characteristicSpecificationId) &&
        Objects.equals(this.name, characteristicSpecificationRelationship.name) &&
        Objects.equals(this.parentSpecificationHref, characteristicSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.parentSpecificationId, characteristicSpecificationRelationship.parentSpecificationId) &&
        Objects.equals(this.relationshipType, characteristicSpecificationRelationship.relationshipType) &&
        Objects.equals(this.validFor, characteristicSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristicSpecificationId, name, parentSpecificationHref, parentSpecificationId, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecificationRelationshipVO {\n");
    
    sb.append("    characteristicSpecificationId: ").append(toIndentedString(characteristicSpecificationId)).append("\n");
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

