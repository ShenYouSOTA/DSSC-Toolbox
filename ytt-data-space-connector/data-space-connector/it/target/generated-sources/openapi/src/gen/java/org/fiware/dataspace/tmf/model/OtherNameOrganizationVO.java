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
 * Keeps track of other names, for example the old name of an organization.
 **/
@ApiModel(description = "Keeps track of other names, for example the old name of an organization.")
@JsonTypeName("OtherNameOrganization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class OtherNameOrganizationVO   {
  private String name;
  private String nameType;
  private String tradingName;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Organization name (department name for example)
   **/
  public OtherNameOrganizationVO name(String name) {
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
   * Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh
   **/
  public OtherNameOrganizationVO nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

  
  @ApiModelProperty(value = "Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh")
  @JsonProperty("nameType")
  public String getNameType() {
    return nameType;
  }

  @JsonProperty("nameType")
  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  /**
   * The name that the organization trades under
   **/
  public OtherNameOrganizationVO tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  
  @ApiModelProperty(value = "The name that the organization trades under")
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
  public OtherNameOrganizationVO validFor(TimePeriodVO validFor) {
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
  public OtherNameOrganizationVO atBaseType(String atBaseType) {
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
  public OtherNameOrganizationVO atSchemaLocation(URI atSchemaLocation) {
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
  public OtherNameOrganizationVO atType(String atType) {
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
    OtherNameOrganizationVO otherNameOrganization = (OtherNameOrganizationVO) o;
    return Objects.equals(this.name, otherNameOrganization.name) &&
        Objects.equals(this.nameType, otherNameOrganization.nameType) &&
        Objects.equals(this.tradingName, otherNameOrganization.tradingName) &&
        Objects.equals(this.validFor, otherNameOrganization.validFor) &&
        Objects.equals(this.atBaseType, otherNameOrganization.atBaseType) &&
        Objects.equals(this.atSchemaLocation, otherNameOrganization.atSchemaLocation) &&
        Objects.equals(this.atType, otherNameOrganization.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameType, tradingName, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherNameOrganizationVO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
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

