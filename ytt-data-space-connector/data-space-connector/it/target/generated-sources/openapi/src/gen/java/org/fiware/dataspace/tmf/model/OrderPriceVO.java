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
 * An amount, usually of money, that represents the actual price paid by the Customer for this item or this order
 **/
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by the Customer for this item or this order")
@JsonTypeName("OrderPrice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class OrderPriceVO   {
  private String description;
  private String name;
  private String priceType;
  private String recurringChargePeriod;
  private String unitOfMeasure;
  private BillingAccountRefVO billingAccount;
  private PriceVO price;
  private @Valid List<@Valid PriceAlterationVO> priceAlteration = new ArrayList<>();
  private ProductOfferingPriceRefVO productOfferingPrice;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * A narrative that explains in detail the semantics of this order item price.
   **/
  public OrderPriceVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price.")
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
  public OrderPriceVO name(String name) {
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
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth
   **/
  public OrderPriceVO priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth")
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  @JsonProperty("priceType")
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Could be month, week...
   **/
  public OrderPriceVO recurringChargePeriod(String recurringChargePeriod) {
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
  public OrderPriceVO unitOfMeasure(String unitOfMeasure) {
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
  public OrderPriceVO billingAccount(BillingAccountRefVO billingAccount) {
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
  public OrderPriceVO price(PriceVO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  @Valid public PriceVO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(PriceVO price) {
    this.price = price;
  }

  /**
   * a strucuture used to describe a price alteration
   **/
  public OrderPriceVO priceAlteration(List<@Valid PriceAlterationVO> priceAlteration) {
    this.priceAlteration = priceAlteration;
    return this;
  }

  
  @ApiModelProperty(value = "a strucuture used to describe a price alteration")
  @JsonProperty("priceAlteration")
  @Valid public List<@Valid PriceAlterationVO> getPriceAlteration() {
    return priceAlteration;
  }

  @JsonProperty("priceAlteration")
  public void setPriceAlteration(List<@Valid PriceAlterationVO> priceAlteration) {
    this.priceAlteration = priceAlteration;
  }

  public OrderPriceVO addPriceAlterationItem(PriceAlterationVO priceAlterationItem) {
    if (this.priceAlteration == null) {
      this.priceAlteration = new ArrayList<>();
    }

    this.priceAlteration.add(priceAlterationItem);
    return this;
  }

  public OrderPriceVO removePriceAlterationItem(PriceAlterationVO priceAlterationItem) {
    if (priceAlterationItem != null && this.priceAlteration != null) {
      this.priceAlteration.remove(priceAlterationItem);
    }

    return this;
  }
  /**
   **/
  public OrderPriceVO productOfferingPrice(ProductOfferingPriceRefVO productOfferingPrice) {
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
   * When sub-classing, this defines the super-class
   **/
  public OrderPriceVO atBaseType(String atBaseType) {
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
  public OrderPriceVO atSchemaLocation(URI atSchemaLocation) {
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
  public OrderPriceVO atType(String atType) {
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
    OrderPriceVO orderPrice = (OrderPriceVO) o;
    return Objects.equals(this.description, orderPrice.description) &&
        Objects.equals(this.name, orderPrice.name) &&
        Objects.equals(this.priceType, orderPrice.priceType) &&
        Objects.equals(this.recurringChargePeriod, orderPrice.recurringChargePeriod) &&
        Objects.equals(this.unitOfMeasure, orderPrice.unitOfMeasure) &&
        Objects.equals(this.billingAccount, orderPrice.billingAccount) &&
        Objects.equals(this.price, orderPrice.price) &&
        Objects.equals(this.priceAlteration, orderPrice.priceAlteration) &&
        Objects.equals(this.productOfferingPrice, orderPrice.productOfferingPrice) &&
        Objects.equals(this.atBaseType, orderPrice.atBaseType) &&
        Objects.equals(this.atSchemaLocation, orderPrice.atSchemaLocation) &&
        Objects.equals(this.atType, orderPrice.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, priceType, recurringChargePeriod, unitOfMeasure, billingAccount, price, priceAlteration, productOfferingPrice, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPriceVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
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

