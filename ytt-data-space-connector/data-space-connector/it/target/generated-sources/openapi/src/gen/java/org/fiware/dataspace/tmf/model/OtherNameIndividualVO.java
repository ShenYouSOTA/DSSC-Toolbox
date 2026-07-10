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
 * Keeps track of other names, for example the old name of a woman before marriage or an artist name.
 **/
@ApiModel(description = "Keeps track of other names, for example the old name of a woman before marriage or an artist name.")
@JsonTypeName("OtherNameIndividual")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class OtherNameIndividualVO   {
  private String aristocraticTitle;
  private String familyName;
  private String familyNamePrefix;
  private String formattedName;
  private String fullName;
  private String generation;
  private String givenName;
  private String legalName;
  private String middleName;
  private String preferredGivenName;
  private String title;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * e.g. Baron, Graf, Earl,…
   **/
  public OtherNameIndividualVO aristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. Baron, Graf, Earl,…")
  @JsonProperty("aristocraticTitle")
  public String getAristocraticTitle() {
    return aristocraticTitle;
  }

  @JsonProperty("aristocraticTitle")
  public void setAristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   **/
  public OtherNameIndividualVO familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the non-chosen or inherited name. Also known as last name in the Western context")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  @JsonProperty("familyName")
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  /**
   * Family name prefix
   **/
  public OtherNameIndividualVO familyNamePrefix(String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
    return this;
  }

  
  @ApiModelProperty(value = "Family name prefix")
  @JsonProperty("familyNamePrefix")
  public String getFamilyNamePrefix() {
    return familyNamePrefix;
  }

  @JsonProperty("familyNamePrefix")
  public void setFamilyNamePrefix(String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
  }

  /**
   * . A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean,…)
   **/
  public OtherNameIndividualVO formattedName(String formattedName) {
    this.formattedName = formattedName;
    return this;
  }

  
  @ApiModelProperty(value = ". A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean,…)")
  @JsonProperty("formattedName")
  public String getFormattedName() {
    return formattedName;
  }

  @JsonProperty("formattedName")
  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }

  /**
   * Full name flatten (first, middle, and last names)
   **/
  public OtherNameIndividualVO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "Full name flatten (first, middle, and last names)")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  @JsonProperty("fullName")
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * e.g. Sr, Jr…
   **/
  public OtherNameIndividualVO generation(String generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. Sr, Jr…")
  @JsonProperty("generation")
  public String getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(String generation) {
    this.generation = generation;
  }

  /**
   * First name
   **/
  public OtherNameIndividualVO givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  
  @ApiModelProperty(value = "First name")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }

  @JsonProperty("givenName")
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * Legal name or birth name (name one has for official purposes)
   **/
  public OtherNameIndividualVO legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  
  @ApiModelProperty(value = "Legal name or birth name (name one has for official purposes)")
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }

  @JsonProperty("legalName")
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * Middle name or initial
   **/
  public OtherNameIndividualVO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  
  @ApiModelProperty(value = "Middle name or initial")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  @JsonProperty("middleName")
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Contains the chosen name by which the person prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname
   **/
  public OtherNameIndividualVO preferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the chosen name by which the person prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname")
  @JsonProperty("preferredGivenName")
  public String getPreferredGivenName() {
    return preferredGivenName;
  }

  @JsonProperty("preferredGivenName")
  public void setPreferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
  }

  /**
   * Use for titles (aristrocatic, social, ...): Pr, Dr, Sir,....
   **/
  public OtherNameIndividualVO title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Use for titles (aristrocatic, social, ...): Pr, Dr, Sir,....")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public OtherNameIndividualVO validFor(TimePeriodVO validFor) {
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
  public OtherNameIndividualVO atBaseType(String atBaseType) {
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
  public OtherNameIndividualVO atSchemaLocation(URI atSchemaLocation) {
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
  public OtherNameIndividualVO atType(String atType) {
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
    OtherNameIndividualVO otherNameIndividual = (OtherNameIndividualVO) o;
    return Objects.equals(this.aristocraticTitle, otherNameIndividual.aristocraticTitle) &&
        Objects.equals(this.familyName, otherNameIndividual.familyName) &&
        Objects.equals(this.familyNamePrefix, otherNameIndividual.familyNamePrefix) &&
        Objects.equals(this.formattedName, otherNameIndividual.formattedName) &&
        Objects.equals(this.fullName, otherNameIndividual.fullName) &&
        Objects.equals(this.generation, otherNameIndividual.generation) &&
        Objects.equals(this.givenName, otherNameIndividual.givenName) &&
        Objects.equals(this.legalName, otherNameIndividual.legalName) &&
        Objects.equals(this.middleName, otherNameIndividual.middleName) &&
        Objects.equals(this.preferredGivenName, otherNameIndividual.preferredGivenName) &&
        Objects.equals(this.title, otherNameIndividual.title) &&
        Objects.equals(this.validFor, otherNameIndividual.validFor) &&
        Objects.equals(this.atBaseType, otherNameIndividual.atBaseType) &&
        Objects.equals(this.atSchemaLocation, otherNameIndividual.atSchemaLocation) &&
        Objects.equals(this.atType, otherNameIndividual.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aristocraticTitle, familyName, familyNamePrefix, formattedName, fullName, generation, givenName, legalName, middleName, preferredGivenName, title, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherNameIndividualVO {\n");
    
    sb.append("    aristocraticTitle: ").append(toIndentedString(aristocraticTitle)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    familyNamePrefix: ").append(toIndentedString(familyNamePrefix)).append("\n");
    sb.append("    formattedName: ").append(toIndentedString(formattedName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    preferredGivenName: ").append(toIndentedString(preferredGivenName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

