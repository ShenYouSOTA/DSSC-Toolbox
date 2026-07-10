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
 * It&#39;s a Quote item that has been executed previously.
 **/
@ApiModel(description = "It's a Quote item that has been executed previously.")
@JsonTypeName("QuoteItemRef")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class QuoteItemRefVO   {
  private String id;
  private String href;
  private String name;
  private String quoteHref;
  private String quoteId;
  private String quoteName;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atReferredType;

  /**
   * Id of an item of a quote
   **/
  public QuoteItemRefVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Id of an item of a quote")
  @JsonProperty("id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the related entity.
   **/
  public QuoteItemRefVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the related entity.")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Name of the related entity.
   **/
  public QuoteItemRefVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the related entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Reference of the related entity.
   **/
  public QuoteItemRefVO quoteHref(String quoteHref) {
    this.quoteHref = quoteHref;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the related entity.")
  @JsonProperty("quoteHref")
  public String getQuoteHref() {
    return quoteHref;
  }

  @JsonProperty("quoteHref")
  public void setQuoteHref(String quoteHref) {
    this.quoteHref = quoteHref;
  }

  /**
   * Unique identifier of a related entity.
   **/
  public QuoteItemRefVO quoteId(String quoteId) {
    this.quoteId = quoteId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @JsonProperty("quoteId")
  @NotNull public String getQuoteId() {
    return quoteId;
  }

  @JsonProperty("quoteId")
  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

  /**
   * Name of the related entity.
   **/
  public QuoteItemRefVO quoteName(String quoteName) {
    this.quoteName = quoteName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the related entity.")
  @JsonProperty("quoteName")
  public String getQuoteName() {
    return quoteName;
  }

  @JsonProperty("quoteName")
  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public QuoteItemRefVO atBaseType(String atBaseType) {
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
  public QuoteItemRefVO atSchemaLocation(URI atSchemaLocation) {
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
  public QuoteItemRefVO atType(String atType) {
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

  /**
   * The actual type of the target instance when needed for disambiguation.
   **/
  public QuoteItemRefVO atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  @JsonProperty("@referredType")
  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteItemRefVO quoteItemRef = (QuoteItemRefVO) o;
    return Objects.equals(this.id, quoteItemRef.id) &&
        Objects.equals(this.href, quoteItemRef.href) &&
        Objects.equals(this.name, quoteItemRef.name) &&
        Objects.equals(this.quoteHref, quoteItemRef.quoteHref) &&
        Objects.equals(this.quoteId, quoteItemRef.quoteId) &&
        Objects.equals(this.quoteName, quoteItemRef.quoteName) &&
        Objects.equals(this.atBaseType, quoteItemRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quoteItemRef.atSchemaLocation) &&
        Objects.equals(this.atType, quoteItemRef.atType) &&
        Objects.equals(this.atReferredType, quoteItemRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, quoteHref, quoteId, quoteName, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteItemRefVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quoteHref: ").append(toIndentedString(quoteHref)).append("\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

