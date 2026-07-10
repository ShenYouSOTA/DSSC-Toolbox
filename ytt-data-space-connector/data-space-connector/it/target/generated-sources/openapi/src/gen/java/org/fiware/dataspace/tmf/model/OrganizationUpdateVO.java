package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.CharacteristicVO;
import org.fiware.dataspace.tmf.model.ContactMediumVO;
import org.fiware.dataspace.tmf.model.ExternalReferenceVO;
import org.fiware.dataspace.tmf.model.OrganizationChildRelationshipVO;
import org.fiware.dataspace.tmf.model.OrganizationIdentificationVO;
import org.fiware.dataspace.tmf.model.OrganizationParentRelationshipVO;
import org.fiware.dataspace.tmf.model.OrganizationStateTypeVO;
import org.fiware.dataspace.tmf.model.OtherNameOrganizationVO;
import org.fiware.dataspace.tmf.model.PartyCreditProfileVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.TaxExemptionCertificateVO;
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
 * Organization represents a group of people identified by shared interests or purpose. Examples include business, department and enterprise. Because of the complex nature of many businesses, both organizations and organization units are represented by the same data. Skipped properties: id,href
 **/
@ApiModel(description = "Organization represents a group of people identified by shared interests or purpose. Examples include business, department and enterprise. Because of the complex nature of many businesses, both organizations and organization units are represented by the same data. Skipped properties: id,href")
@JsonTypeName("Organization_Update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class OrganizationUpdateVO   {
  private Boolean isHeadOffice;
  private Boolean isLegalEntity;
  private String name;
  private String nameType;
  private String organizationType;
  private String tradingName;
  private @Valid List<@Valid ContactMediumVO> contactMedium = new ArrayList<>();
  private @Valid List<@Valid PartyCreditProfileVO> creditRating = new ArrayList<>();
  private TimePeriodVO existsDuring;
  private @Valid List<@Valid ExternalReferenceVO> externalReference = new ArrayList<>();
  private @Valid List<@Valid OrganizationChildRelationshipVO> organizationChildRelationship = new ArrayList<>();
  private @Valid List<@Valid OrganizationIdentificationVO> organizationIdentification = new ArrayList<>();
  private OrganizationParentRelationshipVO organizationParentRelationship;
  private @Valid List<@Valid OtherNameOrganizationVO> otherName = new ArrayList<>();
  private @Valid List<@Valid CharacteristicVO> partyCharacteristic = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private OrganizationStateTypeVO status;
  private @Valid List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate = new ArrayList<>();
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * If value is true, the organization is the head office
   **/
  public OrganizationUpdateVO isHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
    return this;
  }

  
  @ApiModelProperty(value = "If value is true, the organization is the head office")
  @JsonProperty("isHeadOffice")
  public Boolean getIsHeadOffice() {
    return isHeadOffice;
  }

  @JsonProperty("isHeadOffice")
  public void setIsHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
  }

  /**
   * If value is true, the organization is a legal entity known by a national referential.
   **/
  public OrganizationUpdateVO isLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
    return this;
  }

  
  @ApiModelProperty(value = "If value is true, the organization is a legal entity known by a national referential.")
  @JsonProperty("isLegalEntity")
  public Boolean getIsLegalEntity() {
    return isLegalEntity;
  }

  @JsonProperty("isLegalEntity")
  public void setIsLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
  }

  /**
   * Organization name (department name for example)
   **/
  public OrganizationUpdateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Organization name (department name for example)")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of the name : Co, Inc, Ltd,…
   **/
  public OrganizationUpdateVO nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the name : Co, Inc, Ltd,…")
  @JsonProperty("nameType")
  public String getNameType() {
    return nameType;
  }

  @JsonProperty("nameType")
  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  /**
   * Type of Organization (company, department...)
   **/
  public OrganizationUpdateVO organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of Organization (company, department...)")
  @JsonProperty("organizationType")
  public String getOrganizationType() {
    return organizationType;
  }

  @JsonProperty("organizationType")
  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  /**
   * Name that the organization (unit) trades under
   **/
  public OrganizationUpdateVO tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  
  @ApiModelProperty(value = "Name that the organization (unit) trades under")
  @JsonProperty("tradingName")
  public String getTradingName() {
    return tradingName;
  }

  @JsonProperty("tradingName")
  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  /**
   **/
  public OrganizationUpdateVO contactMedium(List<@Valid ContactMediumVO> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contactMedium")
  @Valid public List<@Valid ContactMediumVO> getContactMedium() {
    return contactMedium;
  }

  @JsonProperty("contactMedium")
  public void setContactMedium(List<@Valid ContactMediumVO> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public OrganizationUpdateVO addContactMediumItem(ContactMediumVO contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }

    this.contactMedium.add(contactMediumItem);
    return this;
  }

  public OrganizationUpdateVO removeContactMediumItem(ContactMediumVO contactMediumItem) {
    if (contactMediumItem != null && this.contactMedium != null) {
      this.contactMedium.remove(contactMediumItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO creditRating(List<@Valid PartyCreditProfileVO> creditRating) {
    this.creditRating = creditRating;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditRating")
  @Valid public List<@Valid PartyCreditProfileVO> getCreditRating() {
    return creditRating;
  }

  @JsonProperty("creditRating")
  public void setCreditRating(List<@Valid PartyCreditProfileVO> creditRating) {
    this.creditRating = creditRating;
  }

  public OrganizationUpdateVO addCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (this.creditRating == null) {
      this.creditRating = new ArrayList<>();
    }

    this.creditRating.add(creditRatingItem);
    return this;
  }

  public OrganizationUpdateVO removeCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (creditRatingItem != null && this.creditRating != null) {
      this.creditRating.remove(creditRatingItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO existsDuring(TimePeriodVO existsDuring) {
    this.existsDuring = existsDuring;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("existsDuring")
  @Valid public TimePeriodVO getExistsDuring() {
    return existsDuring;
  }

  @JsonProperty("existsDuring")
  public void setExistsDuring(TimePeriodVO existsDuring) {
    this.existsDuring = existsDuring;
  }

  /**
   **/
  public OrganizationUpdateVO externalReference(List<@Valid ExternalReferenceVO> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("externalReference")
  @Valid public List<@Valid ExternalReferenceVO> getExternalReference() {
    return externalReference;
  }

  @JsonProperty("externalReference")
  public void setExternalReference(List<@Valid ExternalReferenceVO> externalReference) {
    this.externalReference = externalReference;
  }

  public OrganizationUpdateVO addExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }

    this.externalReference.add(externalReferenceItem);
    return this;
  }

  public OrganizationUpdateVO removeExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (externalReferenceItem != null && this.externalReference != null) {
      this.externalReference.remove(externalReferenceItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO organizationChildRelationship(List<@Valid OrganizationChildRelationshipVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organizationChildRelationship")
  @Valid public List<@Valid OrganizationChildRelationshipVO> getOrganizationChildRelationship() {
    return organizationChildRelationship;
  }

  @JsonProperty("organizationChildRelationship")
  public void setOrganizationChildRelationship(List<@Valid OrganizationChildRelationshipVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
  }

  public OrganizationUpdateVO addOrganizationChildRelationshipItem(OrganizationChildRelationshipVO organizationChildRelationshipItem) {
    if (this.organizationChildRelationship == null) {
      this.organizationChildRelationship = new ArrayList<>();
    }

    this.organizationChildRelationship.add(organizationChildRelationshipItem);
    return this;
  }

  public OrganizationUpdateVO removeOrganizationChildRelationshipItem(OrganizationChildRelationshipVO organizationChildRelationshipItem) {
    if (organizationChildRelationshipItem != null && this.organizationChildRelationship != null) {
      this.organizationChildRelationship.remove(organizationChildRelationshipItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO organizationIdentification(List<@Valid OrganizationIdentificationVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organizationIdentification")
  @Valid public List<@Valid OrganizationIdentificationVO> getOrganizationIdentification() {
    return organizationIdentification;
  }

  @JsonProperty("organizationIdentification")
  public void setOrganizationIdentification(List<@Valid OrganizationIdentificationVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
  }

  public OrganizationUpdateVO addOrganizationIdentificationItem(OrganizationIdentificationVO organizationIdentificationItem) {
    if (this.organizationIdentification == null) {
      this.organizationIdentification = new ArrayList<>();
    }

    this.organizationIdentification.add(organizationIdentificationItem);
    return this;
  }

  public OrganizationUpdateVO removeOrganizationIdentificationItem(OrganizationIdentificationVO organizationIdentificationItem) {
    if (organizationIdentificationItem != null && this.organizationIdentification != null) {
      this.organizationIdentification.remove(organizationIdentificationItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO organizationParentRelationship(OrganizationParentRelationshipVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organizationParentRelationship")
  @Valid public OrganizationParentRelationshipVO getOrganizationParentRelationship() {
    return organizationParentRelationship;
  }

  @JsonProperty("organizationParentRelationship")
  public void setOrganizationParentRelationship(OrganizationParentRelationshipVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
  }

  /**
   **/
  public OrganizationUpdateVO otherName(List<@Valid OtherNameOrganizationVO> otherName) {
    this.otherName = otherName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("otherName")
  @Valid public List<@Valid OtherNameOrganizationVO> getOtherName() {
    return otherName;
  }

  @JsonProperty("otherName")
  public void setOtherName(List<@Valid OtherNameOrganizationVO> otherName) {
    this.otherName = otherName;
  }

  public OrganizationUpdateVO addOtherNameItem(OtherNameOrganizationVO otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }

    this.otherName.add(otherNameItem);
    return this;
  }

  public OrganizationUpdateVO removeOtherNameItem(OtherNameOrganizationVO otherNameItem) {
    if (otherNameItem != null && this.otherName != null) {
      this.otherName.remove(otherNameItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO partyCharacteristic(List<@Valid CharacteristicVO> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partyCharacteristic")
  @Valid public List<@Valid CharacteristicVO> getPartyCharacteristic() {
    return partyCharacteristic;
  }

  @JsonProperty("partyCharacteristic")
  public void setPartyCharacteristic(List<@Valid CharacteristicVO> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
  }

  public OrganizationUpdateVO addPartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (this.partyCharacteristic == null) {
      this.partyCharacteristic = new ArrayList<>();
    }

    this.partyCharacteristic.add(partyCharacteristicItem);
    return this;
  }

  public OrganizationUpdateVO removePartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (partyCharacteristicItem != null && this.partyCharacteristic != null) {
      this.partyCharacteristic.remove(partyCharacteristicItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relatedParty")
  @Valid public List<@Valid RelatedPartyVO> getRelatedParty() {
    return relatedParty;
  }

  @JsonProperty("relatedParty")
  public void setRelatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public OrganizationUpdateVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public OrganizationUpdateVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationUpdateVO status(OrganizationStateTypeVO status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OrganizationStateTypeVO getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(OrganizationStateTypeVO status) {
    this.status = status;
  }

  /**
   **/
  public OrganizationUpdateVO taxExemptionCertificate(List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taxExemptionCertificate")
  @Valid public List<@Valid TaxExemptionCertificateVO> getTaxExemptionCertificate() {
    return taxExemptionCertificate;
  }

  @JsonProperty("taxExemptionCertificate")
  public void setTaxExemptionCertificate(List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
  }

  public OrganizationUpdateVO addTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (this.taxExemptionCertificate == null) {
      this.taxExemptionCertificate = new ArrayList<>();
    }

    this.taxExemptionCertificate.add(taxExemptionCertificateItem);
    return this;
  }

  public OrganizationUpdateVO removeTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (taxExemptionCertificateItem != null && this.taxExemptionCertificate != null) {
      this.taxExemptionCertificate.remove(taxExemptionCertificateItem);
    }

    return this;
  }
  /**
   * When sub-classing, this defines the super-class
   **/
  public OrganizationUpdateVO atBaseType(String atBaseType) {
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
  public OrganizationUpdateVO atSchemaLocation(URI atSchemaLocation) {
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
  public OrganizationUpdateVO atType(String atType) {
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
    OrganizationUpdateVO organizationUpdate = (OrganizationUpdateVO) o;
    return Objects.equals(this.isHeadOffice, organizationUpdate.isHeadOffice) &&
        Objects.equals(this.isLegalEntity, organizationUpdate.isLegalEntity) &&
        Objects.equals(this.name, organizationUpdate.name) &&
        Objects.equals(this.nameType, organizationUpdate.nameType) &&
        Objects.equals(this.organizationType, organizationUpdate.organizationType) &&
        Objects.equals(this.tradingName, organizationUpdate.tradingName) &&
        Objects.equals(this.contactMedium, organizationUpdate.contactMedium) &&
        Objects.equals(this.creditRating, organizationUpdate.creditRating) &&
        Objects.equals(this.existsDuring, organizationUpdate.existsDuring) &&
        Objects.equals(this.externalReference, organizationUpdate.externalReference) &&
        Objects.equals(this.organizationChildRelationship, organizationUpdate.organizationChildRelationship) &&
        Objects.equals(this.organizationIdentification, organizationUpdate.organizationIdentification) &&
        Objects.equals(this.organizationParentRelationship, organizationUpdate.organizationParentRelationship) &&
        Objects.equals(this.otherName, organizationUpdate.otherName) &&
        Objects.equals(this.partyCharacteristic, organizationUpdate.partyCharacteristic) &&
        Objects.equals(this.relatedParty, organizationUpdate.relatedParty) &&
        Objects.equals(this.status, organizationUpdate.status) &&
        Objects.equals(this.taxExemptionCertificate, organizationUpdate.taxExemptionCertificate) &&
        Objects.equals(this.atBaseType, organizationUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, organizationUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, organizationUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHeadOffice, isLegalEntity, name, nameType, organizationType, tradingName, contactMedium, creditRating, existsDuring, externalReference, organizationChildRelationship, organizationIdentification, organizationParentRelationship, otherName, partyCharacteristic, relatedParty, status, taxExemptionCertificate, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUpdateVO {\n");
    
    sb.append("    isHeadOffice: ").append(toIndentedString(isHeadOffice)).append("\n");
    sb.append("    isLegalEntity: ").append(toIndentedString(isLegalEntity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    creditRating: ").append(toIndentedString(creditRating)).append("\n");
    sb.append("    existsDuring: ").append(toIndentedString(existsDuring)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    organizationChildRelationship: ").append(toIndentedString(organizationChildRelationship)).append("\n");
    sb.append("    organizationIdentification: ").append(toIndentedString(organizationIdentification)).append("\n");
    sb.append("    organizationParentRelationship: ").append(toIndentedString(organizationParentRelationship)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    partyCharacteristic: ").append(toIndentedString(partyCharacteristic)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxExemptionCertificate: ").append(toIndentedString(taxExemptionCertificate)).append("\n");
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

