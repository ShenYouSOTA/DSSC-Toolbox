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
 * Skills evaluated for an individual with a level and possibly with a limited validity when an obsolescence is defined (Ex: the first-aid certificate first level is limited to one year and an update training is required each year to keep the level).
 **/
@ApiModel(description = "Skills evaluated for an individual with a level and possibly with a limited validity when an obsolescence is defined (Ex: the first-aid certificate first level is limited to one year and an update training is required each year to keep the level).")
@JsonTypeName("Skill")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class SkillVO   {
  private String comment;
  private String evaluatedLevel;
  private String skillCode;
  private String skillName;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * A free text comment linked to the evaluation done
   **/
  public SkillVO comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(value = "A free text comment linked to the evaluation done")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  @JsonProperty("comment")
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * Level of expertise in a skill evaluated for an individual
   **/
  public SkillVO evaluatedLevel(String evaluatedLevel) {
    this.evaluatedLevel = evaluatedLevel;
    return this;
  }

  
  @ApiModelProperty(value = "Level of expertise in a skill evaluated for an individual")
  @JsonProperty("evaluatedLevel")
  public String getEvaluatedLevel() {
    return evaluatedLevel;
  }

  @JsonProperty("evaluatedLevel")
  public void setEvaluatedLevel(String evaluatedLevel) {
    this.evaluatedLevel = evaluatedLevel;
  }

  /**
   * Code of the skill
   **/
  public SkillVO skillCode(String skillCode) {
    this.skillCode = skillCode;
    return this;
  }

  
  @ApiModelProperty(value = "Code of the skill")
  @JsonProperty("skillCode")
  public String getSkillCode() {
    return skillCode;
  }

  @JsonProperty("skillCode")
  public void setSkillCode(String skillCode) {
    this.skillCode = skillCode;
  }

  /**
   * Name of the skill such as Java language,…
   **/
  public SkillVO skillName(String skillName) {
    this.skillName = skillName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the skill such as Java language,…")
  @JsonProperty("skillName")
  public String getSkillName() {
    return skillName;
  }

  @JsonProperty("skillName")
  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  /**
   **/
  public SkillVO validFor(TimePeriodVO validFor) {
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
  public SkillVO atBaseType(String atBaseType) {
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
  public SkillVO atSchemaLocation(URI atSchemaLocation) {
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
  public SkillVO atType(String atType) {
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
    SkillVO skill = (SkillVO) o;
    return Objects.equals(this.comment, skill.comment) &&
        Objects.equals(this.evaluatedLevel, skill.evaluatedLevel) &&
        Objects.equals(this.skillCode, skill.skillCode) &&
        Objects.equals(this.skillName, skill.skillName) &&
        Objects.equals(this.validFor, skill.validFor) &&
        Objects.equals(this.atBaseType, skill.atBaseType) &&
        Objects.equals(this.atSchemaLocation, skill.atSchemaLocation) &&
        Objects.equals(this.atType, skill.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, evaluatedLevel, skillCode, skillName, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVO {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    evaluatedLevel: ").append(toIndentedString(evaluatedLevel)).append("\n");
    sb.append("    skillCode: ").append(toIndentedString(skillCode)).append("\n");
    sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
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

