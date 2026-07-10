package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.MoneyVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 **/
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@JsonTypeName("ProductPriceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductPriceValueVO   {
  private Float percentage;
  private String taxCategory;
  private Float taxRate;
  private MoneyVO dutyFreeAmount;
  private MoneyVO taxIncludedAmount;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Percentage to apply for ProdOfferPriceAlteration
   **/
  public ProductPriceValueVO percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  
  @ApiModelProperty(value = "Percentage to apply for ProdOfferPriceAlteration")
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  @JsonProperty("percentage")
  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  /**
   * Tax category
   **/
  public ProductPriceValueVO taxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  
  @ApiModelProperty(value = "Tax category")
  @JsonProperty("taxCategory")
  public String getTaxCategory() {
    return taxCategory;
  }

  @JsonProperty("taxCategory")
  public void setTaxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
  }

  /**
   * Tax rate
   **/
  public ProductPriceValueVO taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  
  @ApiModelProperty(value = "Tax rate")
  @JsonProperty("taxRate")
  public Float getTaxRate() {
    return taxRate;
  }

  @JsonProperty("taxRate")
  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  /**
   **/
  public ProductPriceValueVO dutyFreeAmount(MoneyVO dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dutyFreeAmount")
  @Valid public MoneyVO getDutyFreeAmount() {
    return dutyFreeAmount;
  }

  @JsonProperty("dutyFreeAmount")
  public void setDutyFreeAmount(MoneyVO dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  /**
   **/
  public ProductPriceValueVO taxIncludedAmount(MoneyVO taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taxIncludedAmount")
  @Valid public MoneyVO getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  @JsonProperty("taxIncludedAmount")
  public void setTaxIncludedAmount(MoneyVO taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductPriceValueVO atBaseType(String atBaseType) {
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
  public ProductPriceValueVO atSchemaLocation(URI atSchemaLocation) {
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
   * When sub-classing, this defines the sub-class Extensible name
   **/
  public ProductPriceValueVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")
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
    ProductPriceValueVO productPriceValue = (ProductPriceValueVO) o;
    return Objects.equals(this.percentage, productPriceValue.percentage) &&
        Objects.equals(this.taxCategory, productPriceValue.taxCategory) &&
        Objects.equals(this.taxRate, productPriceValue.taxRate) &&
        Objects.equals(this.dutyFreeAmount, productPriceValue.dutyFreeAmount) &&
        Objects.equals(this.taxIncludedAmount, productPriceValue.taxIncludedAmount) &&
        Objects.equals(this.atBaseType, productPriceValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productPriceValue.atSchemaLocation) &&
        Objects.equals(this.atType, productPriceValue.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, taxCategory, taxRate, dutyFreeAmount, taxIncludedAmount, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceValueVO {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
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

