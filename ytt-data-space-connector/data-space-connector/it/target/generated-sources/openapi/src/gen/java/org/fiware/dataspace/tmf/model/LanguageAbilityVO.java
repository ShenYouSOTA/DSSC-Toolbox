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
 * Ability of an individual to understand or converse in a language.
 **/
@ApiModel(description = "Ability of an individual to understand or converse in a language.")
@JsonTypeName("LanguageAbility")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class LanguageAbilityVO   {
  private Boolean isFavouriteLanguage;
  private String languageCode;
  private String languageName;
  private String listeningProficiency;
  private String readingProficiency;
  private String speakingProficiency;
  private String writingProficiency;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * A “true” value specifies whether the language is considered by the individual as his favourite one
   **/
  public LanguageAbilityVO isFavouriteLanguage(Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
    return this;
  }

  
  @ApiModelProperty(value = "A “true” value specifies whether the language is considered by the individual as his favourite one")
  @JsonProperty("isFavouriteLanguage")
  public Boolean getIsFavouriteLanguage() {
    return isFavouriteLanguage;
  }

  @JsonProperty("isFavouriteLanguage")
  public void setIsFavouriteLanguage(Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
  }

  /**
   * Language code (RFC 5646)
   **/
  public LanguageAbilityVO languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  
  @ApiModelProperty(value = "Language code (RFC 5646)")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  @JsonProperty("languageCode")
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  /**
   * Language name
   **/
  public LanguageAbilityVO languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  
  @ApiModelProperty(value = "Language name")
  @JsonProperty("languageName")
  public String getLanguageName() {
    return languageName;
  }

  @JsonProperty("languageName")
  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  /**
   * Listening proficiency evaluated for this language
   **/
  public LanguageAbilityVO listeningProficiency(String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
    return this;
  }

  
  @ApiModelProperty(value = "Listening proficiency evaluated for this language")
  @JsonProperty("listeningProficiency")
  public String getListeningProficiency() {
    return listeningProficiency;
  }

  @JsonProperty("listeningProficiency")
  public void setListeningProficiency(String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
  }

  /**
   * Reading proficiency evaluated for this language
   **/
  public LanguageAbilityVO readingProficiency(String readingProficiency) {
    this.readingProficiency = readingProficiency;
    return this;
  }

  
  @ApiModelProperty(value = "Reading proficiency evaluated for this language")
  @JsonProperty("readingProficiency")
  public String getReadingProficiency() {
    return readingProficiency;
  }

  @JsonProperty("readingProficiency")
  public void setReadingProficiency(String readingProficiency) {
    this.readingProficiency = readingProficiency;
  }

  /**
   * Speaking proficiency evaluated for this language
   **/
  public LanguageAbilityVO speakingProficiency(String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
    return this;
  }

  
  @ApiModelProperty(value = "Speaking proficiency evaluated for this language")
  @JsonProperty("speakingProficiency")
  public String getSpeakingProficiency() {
    return speakingProficiency;
  }

  @JsonProperty("speakingProficiency")
  public void setSpeakingProficiency(String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
  }

  /**
   * Writing proficiency evaluated for this language
   **/
  public LanguageAbilityVO writingProficiency(String writingProficiency) {
    this.writingProficiency = writingProficiency;
    return this;
  }

  
  @ApiModelProperty(value = "Writing proficiency evaluated for this language")
  @JsonProperty("writingProficiency")
  public String getWritingProficiency() {
    return writingProficiency;
  }

  @JsonProperty("writingProficiency")
  public void setWritingProficiency(String writingProficiency) {
    this.writingProficiency = writingProficiency;
  }

  /**
   **/
  public LanguageAbilityVO validFor(TimePeriodVO validFor) {
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
  public LanguageAbilityVO atBaseType(String atBaseType) {
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
  public LanguageAbilityVO atSchemaLocation(URI atSchemaLocation) {
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
  public LanguageAbilityVO atType(String atType) {
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
    LanguageAbilityVO languageAbility = (LanguageAbilityVO) o;
    return Objects.equals(this.isFavouriteLanguage, languageAbility.isFavouriteLanguage) &&
        Objects.equals(this.languageCode, languageAbility.languageCode) &&
        Objects.equals(this.languageName, languageAbility.languageName) &&
        Objects.equals(this.listeningProficiency, languageAbility.listeningProficiency) &&
        Objects.equals(this.readingProficiency, languageAbility.readingProficiency) &&
        Objects.equals(this.speakingProficiency, languageAbility.speakingProficiency) &&
        Objects.equals(this.writingProficiency, languageAbility.writingProficiency) &&
        Objects.equals(this.validFor, languageAbility.validFor) &&
        Objects.equals(this.atBaseType, languageAbility.atBaseType) &&
        Objects.equals(this.atSchemaLocation, languageAbility.atSchemaLocation) &&
        Objects.equals(this.atType, languageAbility.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFavouriteLanguage, languageCode, languageName, listeningProficiency, readingProficiency, speakingProficiency, writingProficiency, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageAbilityVO {\n");
    
    sb.append("    isFavouriteLanguage: ").append(toIndentedString(isFavouriteLanguage)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    listeningProficiency: ").append(toIndentedString(listeningProficiency)).append("\n");
    sb.append("    readingProficiency: ").append(toIndentedString(readingProficiency)).append("\n");
    sb.append("    speakingProficiency: ").append(toIndentedString(speakingProficiency)).append("\n");
    sb.append("    writingProficiency: ").append(toIndentedString(writingProficiency)).append("\n");
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

