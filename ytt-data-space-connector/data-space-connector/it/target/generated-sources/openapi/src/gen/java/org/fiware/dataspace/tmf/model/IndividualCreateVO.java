package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.CharacteristicVO;
import org.fiware.dataspace.tmf.model.ContactMediumVO;
import org.fiware.dataspace.tmf.model.DisabilityVO;
import org.fiware.dataspace.tmf.model.ExternalReferenceVO;
import org.fiware.dataspace.tmf.model.IndividualIdentificationVO;
import org.fiware.dataspace.tmf.model.IndividualStateTypeVO;
import org.fiware.dataspace.tmf.model.LanguageAbilityVO;
import org.fiware.dataspace.tmf.model.OtherNameIndividualVO;
import org.fiware.dataspace.tmf.model.PartyCreditProfileVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.SkillVO;
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
 * Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about. Skipped properties: id,href
 **/
@ApiModel(description = "Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about. Skipped properties: id,href")
@JsonTypeName("Individual_Create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class IndividualCreateVO   {
  private String aristocraticTitle;
  private Date birthDate;
  private String countryOfBirth;
  private Date deathDate;
  private String familyName;
  private String familyNamePrefix;
  private String formattedName;
  private String fullName;
  private String gender;
  private String generation;
  private String givenName;
  private String legalName;
  private String location;
  private String maritalStatus;
  private String middleName;
  private String nationality;
  private String placeOfBirth;
  private String preferredGivenName;
  private String title;
  private @Valid List<@Valid ContactMediumVO> contactMedium = new ArrayList<>();
  private @Valid List<@Valid PartyCreditProfileVO> creditRating = new ArrayList<>();
  private @Valid List<@Valid DisabilityVO> disability = new ArrayList<>();
  private @Valid List<@Valid ExternalReferenceVO> externalReference = new ArrayList<>();
  private @Valid List<@Valid IndividualIdentificationVO> individualIdentification = new ArrayList<>();
  private @Valid List<@Valid LanguageAbilityVO> languageAbility = new ArrayList<>();
  private @Valid List<@Valid OtherNameIndividualVO> otherName = new ArrayList<>();
  private @Valid List<@Valid CharacteristicVO> partyCharacteristic = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private @Valid List<@Valid SkillVO> skill = new ArrayList<>();
  private IndividualStateTypeVO status;
  private @Valid List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate = new ArrayList<>();
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * e.g. Baron, Graf, Earl,…
   **/
  public IndividualCreateVO aristocraticTitle(String aristocraticTitle) {
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
   * Birth date
   **/
  public IndividualCreateVO birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  
  @ApiModelProperty(value = "Birth date")
  @JsonProperty("birthDate")
  public Date getBirthDate() {
    return birthDate;
  }

  @JsonProperty("birthDate")
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  /**
   * Country where the individual was born
   **/
  public IndividualCreateVO countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "Country where the individual was born")
  @JsonProperty("countryOfBirth")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  @JsonProperty("countryOfBirth")
  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  /**
   * Date of death
   **/
  public IndividualCreateVO deathDate(Date deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date of death")
  @JsonProperty("deathDate")
  public Date getDeathDate() {
    return deathDate;
  }

  @JsonProperty("deathDate")
  public void setDeathDate(Date deathDate) {
    this.deathDate = deathDate;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   **/
  public IndividualCreateVO familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Contains the non-chosen or inherited name. Also known as last name in the Western context")
  @JsonProperty("familyName")
  @NotNull public String getFamilyName() {
    return familyName;
  }

  @JsonProperty("familyName")
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  /**
   * Family name prefix
   **/
  public IndividualCreateVO familyNamePrefix(String familyNamePrefix) {
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
   * A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean,…)
   **/
  public IndividualCreateVO formattedName(String formattedName) {
    this.formattedName = formattedName;
    return this;
  }

  
  @ApiModelProperty(value = "A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean,…)")
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
  public IndividualCreateVO fullName(String fullName) {
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
   * Gender
   **/
  public IndividualCreateVO gender(String gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "Gender")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * e.g.. Sr, Jr, III (the third),…
   **/
  public IndividualCreateVO generation(String generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(value = "e.g.. Sr, Jr, III (the third),…")
  @JsonProperty("generation")
  public String getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(String generation) {
    this.generation = generation;
  }

  /**
   * First name of the individual
   **/
  public IndividualCreateVO givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "First name of the individual")
  @JsonProperty("givenName")
  @NotNull public String getGivenName() {
    return givenName;
  }

  @JsonProperty("givenName")
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * Legal name or birth name (name one has for official purposes)
   **/
  public IndividualCreateVO legalName(String legalName) {
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
   * Temporary current location od the individual (may be used if the individual has approved its sharing)
   **/
  public IndividualCreateVO location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "Temporary current location od the individual (may be used if the individual has approved its sharing)")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Marital status (married, divorced, widow ...)
   **/
  public IndividualCreateVO maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Marital status (married, divorced, widow ...)")
  @JsonProperty("maritalStatus")
  public String getMaritalStatus() {
    return maritalStatus;
  }

  @JsonProperty("maritalStatus")
  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  /**
   * Middles name or initial
   **/
  public IndividualCreateVO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  
  @ApiModelProperty(value = "Middles name or initial")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  @JsonProperty("middleName")
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Nationality
   **/
  public IndividualCreateVO nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  
  @ApiModelProperty(value = "Nationality")
  @JsonProperty("nationality")
  public String getNationality() {
    return nationality;
  }

  @JsonProperty("nationality")
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * Reference to the place where the individual was born
   **/
  public IndividualCreateVO placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "Reference to the place where the individual was born")
  @JsonProperty("placeOfBirth")
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  @JsonProperty("placeOfBirth")
  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  /**
   * Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname
   **/
  public IndividualCreateVO preferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname")
  @JsonProperty("preferredGivenName")
  public String getPreferredGivenName() {
    return preferredGivenName;
  }

  @JsonProperty("preferredGivenName")
  public void setPreferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
  }

  /**
   * Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...
   **/
  public IndividualCreateVO title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...")
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
  public IndividualCreateVO contactMedium(List<@Valid ContactMediumVO> contactMedium) {
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

  public IndividualCreateVO addContactMediumItem(ContactMediumVO contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }

    this.contactMedium.add(contactMediumItem);
    return this;
  }

  public IndividualCreateVO removeContactMediumItem(ContactMediumVO contactMediumItem) {
    if (contactMediumItem != null && this.contactMedium != null) {
      this.contactMedium.remove(contactMediumItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO creditRating(List<@Valid PartyCreditProfileVO> creditRating) {
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

  public IndividualCreateVO addCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (this.creditRating == null) {
      this.creditRating = new ArrayList<>();
    }

    this.creditRating.add(creditRatingItem);
    return this;
  }

  public IndividualCreateVO removeCreditRatingItem(PartyCreditProfileVO creditRatingItem) {
    if (creditRatingItem != null && this.creditRating != null) {
      this.creditRating.remove(creditRatingItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO disability(List<@Valid DisabilityVO> disability) {
    this.disability = disability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disability")
  @Valid public List<@Valid DisabilityVO> getDisability() {
    return disability;
  }

  @JsonProperty("disability")
  public void setDisability(List<@Valid DisabilityVO> disability) {
    this.disability = disability;
  }

  public IndividualCreateVO addDisabilityItem(DisabilityVO disabilityItem) {
    if (this.disability == null) {
      this.disability = new ArrayList<>();
    }

    this.disability.add(disabilityItem);
    return this;
  }

  public IndividualCreateVO removeDisabilityItem(DisabilityVO disabilityItem) {
    if (disabilityItem != null && this.disability != null) {
      this.disability.remove(disabilityItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO externalReference(List<@Valid ExternalReferenceVO> externalReference) {
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

  public IndividualCreateVO addExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }

    this.externalReference.add(externalReferenceItem);
    return this;
  }

  public IndividualCreateVO removeExternalReferenceItem(ExternalReferenceVO externalReferenceItem) {
    if (externalReferenceItem != null && this.externalReference != null) {
      this.externalReference.remove(externalReferenceItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO individualIdentification(List<@Valid IndividualIdentificationVO> individualIdentification) {
    this.individualIdentification = individualIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("individualIdentification")
  @Valid public List<@Valid IndividualIdentificationVO> getIndividualIdentification() {
    return individualIdentification;
  }

  @JsonProperty("individualIdentification")
  public void setIndividualIdentification(List<@Valid IndividualIdentificationVO> individualIdentification) {
    this.individualIdentification = individualIdentification;
  }

  public IndividualCreateVO addIndividualIdentificationItem(IndividualIdentificationVO individualIdentificationItem) {
    if (this.individualIdentification == null) {
      this.individualIdentification = new ArrayList<>();
    }

    this.individualIdentification.add(individualIdentificationItem);
    return this;
  }

  public IndividualCreateVO removeIndividualIdentificationItem(IndividualIdentificationVO individualIdentificationItem) {
    if (individualIdentificationItem != null && this.individualIdentification != null) {
      this.individualIdentification.remove(individualIdentificationItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO languageAbility(List<@Valid LanguageAbilityVO> languageAbility) {
    this.languageAbility = languageAbility;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("languageAbility")
  @Valid public List<@Valid LanguageAbilityVO> getLanguageAbility() {
    return languageAbility;
  }

  @JsonProperty("languageAbility")
  public void setLanguageAbility(List<@Valid LanguageAbilityVO> languageAbility) {
    this.languageAbility = languageAbility;
  }

  public IndividualCreateVO addLanguageAbilityItem(LanguageAbilityVO languageAbilityItem) {
    if (this.languageAbility == null) {
      this.languageAbility = new ArrayList<>();
    }

    this.languageAbility.add(languageAbilityItem);
    return this;
  }

  public IndividualCreateVO removeLanguageAbilityItem(LanguageAbilityVO languageAbilityItem) {
    if (languageAbilityItem != null && this.languageAbility != null) {
      this.languageAbility.remove(languageAbilityItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO otherName(List<@Valid OtherNameIndividualVO> otherName) {
    this.otherName = otherName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("otherName")
  @Valid public List<@Valid OtherNameIndividualVO> getOtherName() {
    return otherName;
  }

  @JsonProperty("otherName")
  public void setOtherName(List<@Valid OtherNameIndividualVO> otherName) {
    this.otherName = otherName;
  }

  public IndividualCreateVO addOtherNameItem(OtherNameIndividualVO otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }

    this.otherName.add(otherNameItem);
    return this;
  }

  public IndividualCreateVO removeOtherNameItem(OtherNameIndividualVO otherNameItem) {
    if (otherNameItem != null && this.otherName != null) {
      this.otherName.remove(otherNameItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO partyCharacteristic(List<@Valid CharacteristicVO> partyCharacteristic) {
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

  public IndividualCreateVO addPartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (this.partyCharacteristic == null) {
      this.partyCharacteristic = new ArrayList<>();
    }

    this.partyCharacteristic.add(partyCharacteristicItem);
    return this;
  }

  public IndividualCreateVO removePartyCharacteristicItem(CharacteristicVO partyCharacteristicItem) {
    if (partyCharacteristicItem != null && this.partyCharacteristic != null) {
      this.partyCharacteristic.remove(partyCharacteristicItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
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

  public IndividualCreateVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public IndividualCreateVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO skill(List<@Valid SkillVO> skill) {
    this.skill = skill;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("skill")
  @Valid public List<@Valid SkillVO> getSkill() {
    return skill;
  }

  @JsonProperty("skill")
  public void setSkill(List<@Valid SkillVO> skill) {
    this.skill = skill;
  }

  public IndividualCreateVO addSkillItem(SkillVO skillItem) {
    if (this.skill == null) {
      this.skill = new ArrayList<>();
    }

    this.skill.add(skillItem);
    return this;
  }

  public IndividualCreateVO removeSkillItem(SkillVO skillItem) {
    if (skillItem != null && this.skill != null) {
      this.skill.remove(skillItem);
    }

    return this;
  }
  /**
   **/
  public IndividualCreateVO status(IndividualStateTypeVO status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public IndividualStateTypeVO getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(IndividualStateTypeVO status) {
    this.status = status;
  }

  /**
   **/
  public IndividualCreateVO taxExemptionCertificate(List<@Valid TaxExemptionCertificateVO> taxExemptionCertificate) {
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

  public IndividualCreateVO addTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (this.taxExemptionCertificate == null) {
      this.taxExemptionCertificate = new ArrayList<>();
    }

    this.taxExemptionCertificate.add(taxExemptionCertificateItem);
    return this;
  }

  public IndividualCreateVO removeTaxExemptionCertificateItem(TaxExemptionCertificateVO taxExemptionCertificateItem) {
    if (taxExemptionCertificateItem != null && this.taxExemptionCertificate != null) {
      this.taxExemptionCertificate.remove(taxExemptionCertificateItem);
    }

    return this;
  }
  /**
   * When sub-classing, this defines the super-class
   **/
  public IndividualCreateVO atBaseType(String atBaseType) {
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
  public IndividualCreateVO atSchemaLocation(URI atSchemaLocation) {
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
  public IndividualCreateVO atType(String atType) {
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
    IndividualCreateVO individualCreate = (IndividualCreateVO) o;
    return Objects.equals(this.aristocraticTitle, individualCreate.aristocraticTitle) &&
        Objects.equals(this.birthDate, individualCreate.birthDate) &&
        Objects.equals(this.countryOfBirth, individualCreate.countryOfBirth) &&
        Objects.equals(this.deathDate, individualCreate.deathDate) &&
        Objects.equals(this.familyName, individualCreate.familyName) &&
        Objects.equals(this.familyNamePrefix, individualCreate.familyNamePrefix) &&
        Objects.equals(this.formattedName, individualCreate.formattedName) &&
        Objects.equals(this.fullName, individualCreate.fullName) &&
        Objects.equals(this.gender, individualCreate.gender) &&
        Objects.equals(this.generation, individualCreate.generation) &&
        Objects.equals(this.givenName, individualCreate.givenName) &&
        Objects.equals(this.legalName, individualCreate.legalName) &&
        Objects.equals(this.location, individualCreate.location) &&
        Objects.equals(this.maritalStatus, individualCreate.maritalStatus) &&
        Objects.equals(this.middleName, individualCreate.middleName) &&
        Objects.equals(this.nationality, individualCreate.nationality) &&
        Objects.equals(this.placeOfBirth, individualCreate.placeOfBirth) &&
        Objects.equals(this.preferredGivenName, individualCreate.preferredGivenName) &&
        Objects.equals(this.title, individualCreate.title) &&
        Objects.equals(this.contactMedium, individualCreate.contactMedium) &&
        Objects.equals(this.creditRating, individualCreate.creditRating) &&
        Objects.equals(this.disability, individualCreate.disability) &&
        Objects.equals(this.externalReference, individualCreate.externalReference) &&
        Objects.equals(this.individualIdentification, individualCreate.individualIdentification) &&
        Objects.equals(this.languageAbility, individualCreate.languageAbility) &&
        Objects.equals(this.otherName, individualCreate.otherName) &&
        Objects.equals(this.partyCharacteristic, individualCreate.partyCharacteristic) &&
        Objects.equals(this.relatedParty, individualCreate.relatedParty) &&
        Objects.equals(this.skill, individualCreate.skill) &&
        Objects.equals(this.status, individualCreate.status) &&
        Objects.equals(this.taxExemptionCertificate, individualCreate.taxExemptionCertificate) &&
        Objects.equals(this.atBaseType, individualCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, individualCreate.atSchemaLocation) &&
        Objects.equals(this.atType, individualCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aristocraticTitle, birthDate, countryOfBirth, deathDate, familyName, familyNamePrefix, formattedName, fullName, gender, generation, givenName, legalName, location, maritalStatus, middleName, nationality, placeOfBirth, preferredGivenName, title, contactMedium, creditRating, disability, externalReference, individualIdentification, languageAbility, otherName, partyCharacteristic, relatedParty, skill, status, taxExemptionCertificate, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualCreateVO {\n");
    
    sb.append("    aristocraticTitle: ").append(toIndentedString(aristocraticTitle)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    deathDate: ").append(toIndentedString(deathDate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    familyNamePrefix: ").append(toIndentedString(familyNamePrefix)).append("\n");
    sb.append("    formattedName: ").append(toIndentedString(formattedName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    preferredGivenName: ").append(toIndentedString(preferredGivenName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    creditRating: ").append(toIndentedString(creditRating)).append("\n");
    sb.append("    disability: ").append(toIndentedString(disability)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    individualIdentification: ").append(toIndentedString(individualIdentification)).append("\n");
    sb.append("    languageAbility: ").append(toIndentedString(languageAbility)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    partyCharacteristic: ").append(toIndentedString(partyCharacteristic)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
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

