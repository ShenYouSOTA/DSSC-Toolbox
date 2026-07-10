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
import org.fiware.dataspace.tmf.model.PartyCreditProfileVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.TaxExemptionCertificateVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Generic Party structure used to define commonalities between sub concepts of Individual and Organization.
 **/
@ApiModel(description = "Generic Party structure used to define commonalities between sub concepts of Individual and Organization.")
@JsonTypeName("Party")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class PartyVO   {
  private String id;
  private String href;
  private @Valid List<@Valid ContactMediumVO> contactMedium = new ArrayList<>();
  private @Valid List<@Valid PartyCreditProfileVO> creditRating = new ArrayList<>();
  private @Valid List<@Valid ExternalReferenceVO> externalReference = new ArrayList<>();
  private @Valid List<@Valid CharacteristicVO> partyCharacteristic = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private @Valid List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate = new ArrayList<>();
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Unique identifier of the organization
   **/
  public PartyVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the organization")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hyperlink to access the organization
   **/
  public PartyVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink to access the organization")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   **/
  public PartyVO contactMedium(List<@Valid ContactMediumVO> contactMedium) {
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

  public PartyVO addContactMediumItem(ContactMediumVO contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }

    this.contactMedium.add(contactMediumItem);
    return this;
  }

  public PartyVO removeContactMediumItem(ContactMediumVO contactMediumItem) {
    if (contactMediumItem != null && this.contactMedium != null) {
      this.contactMedium.remove(contactMediumItem);
    }

    return this;
  }
  /**
   **/
  public PartyVO creditRating(List<@Valid PartyCreditProfileVO> creditRating) {
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

  public PartyVO addCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (this.creditRating == null) {
      this.creditRating = new ArrayList<>();
    }

    this.creditRating.add(creditRatingItem);
    return this;
  }

  public PartyVO removeCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (creditRatingItem != null && this.creditRating != null) {
      this.creditRating.remove(creditRatingItem);
    }

    return this;
  }
  /**
   **/
  public PartyVO externalReference(List<@Valid ExternalReferenceVO> externalReference) {
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

  public PartyVO addExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }

    this.externalReference.add(externalReferenceItem);
    return this;
  }

  public PartyVO removeExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (externalReferenceItem != null && this.externalReference != null) {
      this.externalReference.remove(externalReferenceItem);
    }

    return this;
  }
  /**
   **/
  public PartyVO partyCharacteristic(List<@Valid CharacteristicVO> partyCharacteristic) {
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

  public PartyVO addPartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (this.partyCharacteristic == null) {
      this.partyCharacteristic = new ArrayList<>();
    }

    this.partyCharacteristic.add(partyCharacteristicItem);
    return this;
  }

  public PartyVO removePartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (partyCharacteristicItem != null && this.partyCharacteristic != null) {
      this.partyCharacteristic.remove(partyCharacteristicItem);
    }

    return this;
  }
  /**
   **/
  public PartyVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
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

  public PartyVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public PartyVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   **/
  public PartyVO taxExemptionCertificate(List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate) {
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

  public PartyVO addTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (this.taxExemptionCertificate == null) {
      this.taxExemptionCertificate = new ArrayList<>();
    }

    this.taxExemptionCertificate.add(taxExemptionCertificateItem);
    return this;
  }

  public PartyVO removeTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (taxExemptionCertificateItem != null && this.taxExemptionCertificate != null) {
      this.taxExemptionCertificate.remove(taxExemptionCertificateItem);
    }

    return this;
  }
  /**
   * When sub-classing, this defines the super-class
   **/
  public PartyVO atBaseType(String atBaseType) {
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
  public PartyVO atSchemaLocation(URI atSchemaLocation) {
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
  public PartyVO atType(String atType) {
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
    PartyVO party = (PartyVO) o;
    return Objects.equals(this.id, party.id) &&
        Objects.equals(this.href, party.href) &&
        Objects.equals(this.contactMedium, party.contactMedium) &&
        Objects.equals(this.creditRating, party.creditRating) &&
        Objects.equals(this.externalReference, party.externalReference) &&
        Objects.equals(this.partyCharacteristic, party.partyCharacteristic) &&
        Objects.equals(this.relatedParty, party.relatedParty) &&
        Objects.equals(this.taxExemptionCertificate, party.taxExemptionCertificate) &&
        Objects.equals(this.atBaseType, party.atBaseType) &&
        Objects.equals(this.atSchemaLocation, party.atSchemaLocation) &&
        Objects.equals(this.atType, party.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, contactMedium, creditRating, externalReference, partyCharacteristic, relatedParty, taxExemptionCertificate, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    creditRating: ").append(toIndentedString(creditRating)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    partyCharacteristic: ").append(toIndentedString(partyCharacteristic)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

