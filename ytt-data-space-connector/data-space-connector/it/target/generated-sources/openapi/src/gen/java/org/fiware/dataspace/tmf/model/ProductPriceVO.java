package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.BillingAccountRefVO;
import org.fiware.dataspace.tmf.model.PriceAlterationVO;
import org.fiware.dataspace.tmf.model.PriceVO;
import org.fiware.dataspace.tmf.model.ProductOfferingPriceRefVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An amount, usually of money, that represents the actual price paid by a Customer for a purchase, a rent or a lease of a Product. The price is valid for a defined period of time.
 **/
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by a Customer for a purchase, a rent or a lease of a Product. The price is valid for a defined period of time.")
@JsonTypeName("ProductPrice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductPriceVO   {
  private String description;
  private String name;
  private String priceType;
  private String recurringChargePeriod;
  private String unitOfMeasure;
  private BillingAccountRefVO billingAccount;
  private PriceVO price;
  private ProductOfferingPriceRefVO productOfferingPrice;
  private @Valid List<@Valid PriceAlterationVO> productPriceAlteration = new ArrayList<>();
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * A narrative that explains in detail the semantics of this product price.
   **/
  public ProductPriceVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this product price.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A short descriptive name such as \&quot;Subscription price\&quot;.
   **/
  public ProductPriceVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "A short descriptive name such as \"Subscription price\".")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   **/
  public ProductPriceVO priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.")
  @JsonProperty("priceType")
  @NotNull public String getPriceType() {
    return priceType;
  }

  @JsonProperty("priceType")
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Could be month, week...
   **/
  public ProductPriceVO recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  
  @ApiModelProperty(value = "Could be month, week...")
  @JsonProperty("recurringChargePeriod")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  @JsonProperty("recurringChargePeriod")
  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  /**
   * Could be minutes, GB...
   **/
  public ProductPriceVO unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  
  @ApiModelProperty(value = "Could be minutes, GB...")
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  @JsonProperty("unitOfMeasure")
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   **/
  public ProductPriceVO billingAccount(BillingAccountRefVO billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("billingAccount")
  @Valid public BillingAccountRefVO getBillingAccount() {
    return billingAccount;
  }

  @JsonProperty("billingAccount")
  public void setBillingAccount(BillingAccountRefVO billingAccount) {
    this.billingAccount = billingAccount;
  }

  /**
   **/
  public ProductPriceVO price(PriceVO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("price")
  @NotNull @Valid public PriceVO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(PriceVO price) {
    this.price = price;
  }

  /**
   **/
  public ProductPriceVO productOfferingPrice(ProductOfferingPriceRefVO productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOfferingPrice")
  @Valid public ProductOfferingPriceRefVO getProductOfferingPrice() {
    return productOfferingPrice;
  }

  @JsonProperty("productOfferingPrice")
  public void setProductOfferingPrice(ProductOfferingPriceRefVO productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  /**
   **/
  public ProductPriceVO productPriceAlteration(List<@Valid PriceAlterationVO> productPriceAlteration) {
    this.productPriceAlteration = productPriceAlteration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productPriceAlteration")
  @Valid public List<@Valid PriceAlterationVO> getProductPriceAlteration() {
    return productPriceAlteration;
  }

  @JsonProperty("productPriceAlteration")
  public void setProductPriceAlteration(List<@Valid PriceAlterationVO> productPriceAlteration) {
    this.productPriceAlteration = productPriceAlteration;
  }

  public ProductPriceVO addProductPriceAlterationItem(PriceAlterationVO productPriceAlterationItem) {
    if (this.productPriceAlteration == null) {
      this.productPriceAlteration = new ArrayList<>();
    }

    this.productPriceAlteration.add(productPriceAlterationItem);
    return this;
  }

  public ProductPriceVO removeProductPriceAlterationItem(PriceAlterationVO productPriceAlterationItem) {
    if (productPriceAlterationItem != null && this.productPriceAlteration != null) {
      this.productPriceAlteration.remove(productPriceAlterationItem);
    }

    return this;
  }
  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductPriceVO atBaseType(String atBaseType) {
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
  public ProductPriceVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductPriceVO atType(String atType) {
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
    ProductPriceVO productPrice = (ProductPriceVO) o;
    return Objects.equals(this.description, productPrice.description) &&
        Objects.equals(this.name, productPrice.name) &&
        Objects.equals(this.priceType, productPrice.priceType) &&
        Objects.equals(this.recurringChargePeriod, productPrice.recurringChargePeriod) &&
        Objects.equals(this.unitOfMeasure, productPrice.unitOfMeasure) &&
        Objects.equals(this.billingAccount, productPrice.billingAccount) &&
        Objects.equals(this.price, productPrice.price) &&
        Objects.equals(this.productOfferingPrice, productPrice.productOfferingPrice) &&
        Objects.equals(this.productPriceAlteration, productPrice.productPriceAlteration) &&
        Objects.equals(this.atBaseType, productPrice.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productPrice.atSchemaLocation) &&
        Objects.equals(this.atType, productPrice.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, priceType, recurringChargePeriod, unitOfMeasure, billingAccount, price, productOfferingPrice, productPriceAlteration, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productPriceAlteration: ").append(toIndentedString(productPriceAlteration)).append("\n");
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

