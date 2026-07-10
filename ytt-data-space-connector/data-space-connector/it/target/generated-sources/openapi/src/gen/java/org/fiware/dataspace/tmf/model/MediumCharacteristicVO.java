package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the contact medium characteristics that could be used to contact a party (an individual or an organization)
 **/
@ApiModel(description = "Describes the contact medium characteristics that could be used to contact a party (an individual or an organization)")
@JsonTypeName("MediumCharacteristic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class MediumCharacteristicVO   {
  private String city;
  private String contactType;
  private String country;
  private String emailAddress;
  private String faxNumber;
  private String phoneNumber;
  private String postCode;
  private String socialNetworkId;
  private String stateOrProvince;
  private String street1;
  private String street2;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * The city
   **/
  public MediumCharacteristicVO city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "The city")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The type of contact, for example: phone number such as mobile, fixed home, fixed office. postal address such as shipping instalation…
   **/
  public MediumCharacteristicVO contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of contact, for example: phone number such as mobile, fixed home, fixed office. postal address such as shipping instalation…")
  @JsonProperty("contactType")
  public String getContactType() {
    return contactType;
  }

  @JsonProperty("contactType")
  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  /**
   * The country
   **/
  public MediumCharacteristicVO country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "The country")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Full email address in standard format
   **/
  public MediumCharacteristicVO emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  
  @ApiModelProperty(value = "Full email address in standard format")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  @JsonProperty("emailAddress")
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * The fax number of the contact
   **/
  public MediumCharacteristicVO faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The fax number of the contact")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  @JsonProperty("faxNumber")
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  /**
   * The primary phone number of the contact
   **/
  public MediumCharacteristicVO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The primary phone number of the contact")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @JsonProperty("phoneNumber")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Postcode
   **/
  public MediumCharacteristicVO postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  
  @ApiModelProperty(value = "Postcode")
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  @JsonProperty("postCode")
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   * Identifier as a member of a social network
   **/
  public MediumCharacteristicVO socialNetworkId(String socialNetworkId) {
    this.socialNetworkId = socialNetworkId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier as a member of a social network")
  @JsonProperty("socialNetworkId")
  public String getSocialNetworkId() {
    return socialNetworkId;
  }

  @JsonProperty("socialNetworkId")
  public void setSocialNetworkId(String socialNetworkId) {
    this.socialNetworkId = socialNetworkId;
  }

  /**
   * State or province
   **/
  public MediumCharacteristicVO stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  
  @ApiModelProperty(value = "State or province")
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  @JsonProperty("stateOrProvince")
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  /**
   * Describes the street
   **/
  public MediumCharacteristicVO street1(String street1) {
    this.street1 = street1;
    return this;
  }

  
  @ApiModelProperty(value = "Describes the street")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }

  @JsonProperty("street1")
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  /**
   * Complementary street description
   **/
  public MediumCharacteristicVO street2(String street2) {
    this.street2 = street2;
    return this;
  }

  
  @ApiModelProperty(value = "Complementary street description")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }

  @JsonProperty("street2")
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public MediumCharacteristicVO atBaseType(String atBaseType) {
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
  public MediumCharacteristicVO atSchemaLocation(URI atSchemaLocation) {
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
  public MediumCharacteristicVO atType(String atType) {
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
    MediumCharacteristicVO mediumCharacteristic = (MediumCharacteristicVO) o;
    return Objects.equals(this.city, mediumCharacteristic.city) &&
        Objects.equals(this.contactType, mediumCharacteristic.contactType) &&
        Objects.equals(this.country, mediumCharacteristic.country) &&
        Objects.equals(this.emailAddress, mediumCharacteristic.emailAddress) &&
        Objects.equals(this.faxNumber, mediumCharacteristic.faxNumber) &&
        Objects.equals(this.phoneNumber, mediumCharacteristic.phoneNumber) &&
        Objects.equals(this.postCode, mediumCharacteristic.postCode) &&
        Objects.equals(this.socialNetworkId, mediumCharacteristic.socialNetworkId) &&
        Objects.equals(this.stateOrProvince, mediumCharacteristic.stateOrProvince) &&
        Objects.equals(this.street1, mediumCharacteristic.street1) &&
        Objects.equals(this.street2, mediumCharacteristic.street2) &&
        Objects.equals(this.atBaseType, mediumCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, mediumCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, mediumCharacteristic.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, contactType, country, emailAddress, faxNumber, phoneNumber, postCode, socialNetworkId, stateOrProvince, street1, street2, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediumCharacteristicVO {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    socialNetworkId: ").append(toIndentedString(socialNetworkId)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
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

