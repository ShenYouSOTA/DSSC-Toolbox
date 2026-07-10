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
 * An individual might be evaluated for its worthiness and this evaluation might be based on a credit rating given by a credit agency.
 **/
@ApiModel(description = "An individual might be evaluated for its worthiness and this evaluation might be based on a credit rating given by a credit agency.")
@JsonTypeName("PartyCreditProfile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class PartyCreditProfileVO   {
  private String creditAgencyName;
  private String creditAgencyType;
  private String ratingReference;
  private Integer ratingScore;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Name of the credit agency giving the score
   **/
  public PartyCreditProfileVO creditAgencyName(String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the credit agency giving the score")
  @JsonProperty("creditAgencyName")
  public String getCreditAgencyName() {
    return creditAgencyName;
  }

  @JsonProperty("creditAgencyName")
  public void setCreditAgencyName(String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
  }

  /**
   * Type of the credit agency giving the score
   **/
  public PartyCreditProfileVO creditAgencyType(String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the credit agency giving the score")
  @JsonProperty("creditAgencyType")
  public String getCreditAgencyType() {
    return creditAgencyType;
  }

  @JsonProperty("creditAgencyType")
  public void setCreditAgencyType(String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
  }

  /**
   * Reference corresponding to the credit rating
   **/
  public PartyCreditProfileVO ratingReference(String ratingReference) {
    this.ratingReference = ratingReference;
    return this;
  }

  
  @ApiModelProperty(value = "Reference corresponding to the credit rating")
  @JsonProperty("ratingReference")
  public String getRatingReference() {
    return ratingReference;
  }

  @JsonProperty("ratingReference")
  public void setRatingReference(String ratingReference) {
    this.ratingReference = ratingReference;
  }

  /**
   * A measure of a party’s creditworthiness calculated on the basis of a combination of factors such as their income and credit history
   **/
  public PartyCreditProfileVO ratingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
    return this;
  }

  
  @ApiModelProperty(value = "A measure of a party’s creditworthiness calculated on the basis of a combination of factors such as their income and credit history")
  @JsonProperty("ratingScore")
  public Integer getRatingScore() {
    return ratingScore;
  }

  @JsonProperty("ratingScore")
  public void setRatingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
  }

  /**
   **/
  public PartyCreditProfileVO validFor(TimePeriodVO validFor) {
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
  public PartyCreditProfileVO atBaseType(String atBaseType) {
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
  public PartyCreditProfileVO atSchemaLocation(URI atSchemaLocation) {
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
  public PartyCreditProfileVO atType(String atType) {
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
    PartyCreditProfileVO partyCreditProfile = (PartyCreditProfileVO) o;
    return Objects.equals(this.creditAgencyName, partyCreditProfile.creditAgencyName) &&
        Objects.equals(this.creditAgencyType, partyCreditProfile.creditAgencyType) &&
        Objects.equals(this.ratingReference, partyCreditProfile.ratingReference) &&
        Objects.equals(this.ratingScore, partyCreditProfile.ratingScore) &&
        Objects.equals(this.validFor, partyCreditProfile.validFor) &&
        Objects.equals(this.atBaseType, partyCreditProfile.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyCreditProfile.atSchemaLocation) &&
        Objects.equals(this.atType, partyCreditProfile.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAgencyName, creditAgencyType, ratingReference, ratingScore, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyCreditProfileVO {\n");
    
    sb.append("    creditAgencyName: ").append(toIndentedString(creditAgencyName)).append("\n");
    sb.append("    creditAgencyType: ").append(toIndentedString(creditAgencyType)).append("\n");
    sb.append("    ratingReference: ").append(toIndentedString(ratingReference)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
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

