package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.MediumCharacteristicVO;
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
 * Indicates the contact medium that could be used to contact the party.
 **/
@ApiModel(description = "Indicates the contact medium that could be used to contact the party.")
@JsonTypeName("ContactMedium")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ContactMediumVO   {
  private String mediumType;
  private Boolean preferred;
  private MediumCharacteristicVO characteristic;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Type of the contact medium, such as: email address, telephone number, postal address
   **/
  public ContactMediumVO mediumType(String mediumType) {
    this.mediumType = mediumType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the contact medium, such as: email address, telephone number, postal address")
  @JsonProperty("mediumType")
  public String getMediumType() {
    return mediumType;
  }

  @JsonProperty("mediumType")
  public void setMediumType(String mediumType) {
    this.mediumType = mediumType;
  }

  /**
   * If true, indicates that is the preferred contact medium
   **/
  public ContactMediumVO preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  
  @ApiModelProperty(value = "If true, indicates that is the preferred contact medium")
  @JsonProperty("preferred")
  public Boolean getPreferred() {
    return preferred;
  }

  @JsonProperty("preferred")
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  /**
   **/
  public ContactMediumVO characteristic(MediumCharacteristicVO characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("characteristic")
  @Valid public MediumCharacteristicVO getCharacteristic() {
    return characteristic;
  }

  @JsonProperty("characteristic")
  public void setCharacteristic(MediumCharacteristicVO characteristic) {
    this.characteristic = characteristic;
  }

  /**
   **/
  public ContactMediumVO validFor(TimePeriodVO validFor) {
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
  public ContactMediumVO atBaseType(String atBaseType) {
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
  public ContactMediumVO atSchemaLocation(URI atSchemaLocation) {
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
  public ContactMediumVO atType(String atType) {
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
    ContactMediumVO contactMedium = (ContactMediumVO) o;
    return Objects.equals(this.mediumType, contactMedium.mediumType) &&
        Objects.equals(this.preferred, contactMedium.preferred) &&
        Objects.equals(this.characteristic, contactMedium.characteristic) &&
        Objects.equals(this.validFor, contactMedium.validFor) &&
        Objects.equals(this.atBaseType, contactMedium.atBaseType) &&
        Objects.equals(this.atSchemaLocation, contactMedium.atSchemaLocation) &&
        Objects.equals(this.atType, contactMedium.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediumType, preferred, characteristic, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMediumVO {\n");
    
    sb.append("    mediumType: ").append(toIndentedString(mediumType)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
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

