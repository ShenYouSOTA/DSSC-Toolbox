package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.fiware.dataspace.tmf.model.AttachmentRefOrValueVO;
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
 * Represents our registration of information used as proof of identity by an individual (passport, national identity card, drivers license, social security number, birth certificate)
 **/
@ApiModel(description = "Represents our registration of information used as proof of identity by an individual (passport, national identity card, drivers license, social security number, birth certificate)")
@JsonTypeName("IndividualIdentification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class IndividualIdentificationVO   {
  private String identificationId;
  private String identificationType;
  private String issuingAuthority;
  private Date issuingDate;
  private AttachmentRefOrValueVO attachment;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Identifier
   **/
  public IndividualIdentificationVO identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier")
  @JsonProperty("identificationId")
  public String getIdentificationId() {
    return identificationId;
  }

  @JsonProperty("identificationId")
  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  /**
   * Identification type (passport, national identity card, drivers license, social security number, birth certificate)
   **/
  public IndividualIdentificationVO identificationType(String identificationType) {
    this.identificationType = identificationType;
    return this;
  }

  
  @ApiModelProperty(value = "Identification type (passport, national identity card, drivers license, social security number, birth certificate)")
  @JsonProperty("identificationType")
  public String getIdentificationType() {
    return identificationType;
  }

  @JsonProperty("identificationType")
  public void setIdentificationType(String identificationType) {
    this.identificationType = identificationType;
  }

  /**
   * Authority which has issued the identifier, such as: social security, town hall
   **/
  public IndividualIdentificationVO issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

  
  @ApiModelProperty(value = "Authority which has issued the identifier, such as: social security, town hall")
  @JsonProperty("issuingAuthority")
  public String getIssuingAuthority() {
    return issuingAuthority;
  }

  @JsonProperty("issuingAuthority")
  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  /**
   * Date at which the identifier was issued
   **/
  public IndividualIdentificationVO issuingDate(Date issuingDate) {
    this.issuingDate = issuingDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date at which the identifier was issued")
  @JsonProperty("issuingDate")
  public Date getIssuingDate() {
    return issuingDate;
  }

  @JsonProperty("issuingDate")
  public void setIssuingDate(Date issuingDate) {
    this.issuingDate = issuingDate;
  }

  /**
   **/
  public IndividualIdentificationVO attachment(AttachmentRefOrValueVO attachment) {
    this.attachment = attachment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attachment")
  @Valid public AttachmentRefOrValueVO getAttachment() {
    return attachment;
  }

  @JsonProperty("attachment")
  public void setAttachment(AttachmentRefOrValueVO attachment) {
    this.attachment = attachment;
  }

  /**
   **/
  public IndividualIdentificationVO validFor(TimePeriodVO validFor) {
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
  public IndividualIdentificationVO atBaseType(String atBaseType) {
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
  public IndividualIdentificationVO atSchemaLocation(URI atSchemaLocation) {
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
  public IndividualIdentificationVO atType(String atType) {
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
    IndividualIdentificationVO individualIdentification = (IndividualIdentificationVO) o;
    return Objects.equals(this.identificationId, individualIdentification.identificationId) &&
        Objects.equals(this.identificationType, individualIdentification.identificationType) &&
        Objects.equals(this.issuingAuthority, individualIdentification.issuingAuthority) &&
        Objects.equals(this.issuingDate, individualIdentification.issuingDate) &&
        Objects.equals(this.attachment, individualIdentification.attachment) &&
        Objects.equals(this.validFor, individualIdentification.validFor) &&
        Objects.equals(this.atBaseType, individualIdentification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, individualIdentification.atSchemaLocation) &&
        Objects.equals(this.atType, individualIdentification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationId, identificationType, issuingAuthority, issuingDate, attachment, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualIdentificationVO {\n");
    
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

