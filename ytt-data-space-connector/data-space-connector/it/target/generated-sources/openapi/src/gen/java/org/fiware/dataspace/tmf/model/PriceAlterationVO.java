package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
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
 * Is an amount, usually of money, that modifies the price charged for an order item.
 **/
@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item.")
@JsonTypeName("PriceAlteration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class PriceAlterationVO   {
  private Integer applicationDuration;
  private String description;
  private String name;
  private String priceType;
  private Integer priority;
  private String recurringChargePeriod;
  private String unitOfMeasure;
  private PriceVO price;
  private ProductOfferingPriceRefVO productOfferingPrice;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge)
   **/
  public PriceAlterationVO applicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  
  @ApiModelProperty(value = "Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge)")
  @JsonProperty("applicationDuration")
  public Integer getApplicationDuration() {
    return applicationDuration;
  }

  @JsonProperty("applicationDuration")
  public void setApplicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  /**
   * A narrative that explains in detail the semantics of this order item price alteration
   **/
  public PriceAlterationVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price alteration")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Name of the order item price alteration
   **/
  public PriceAlterationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the order item price alteration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A category that describes the price such as recurring, one time and usage.
   **/
  public PriceAlterationVO priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A category that describes the price such as recurring, one time and usage.")
  @JsonProperty("priceType")
  @NotNull public String getPriceType() {
    return priceType;
  }

  @JsonProperty("priceType")
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Priority level for applying this alteration among all the defined alterations on the order item price
   **/
  public PriceAlterationVO priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "Priority level for applying this alteration among all the defined alterations on the order item price")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * Could be month, week...
   **/
  public PriceAlterationVO recurringChargePeriod(String recurringChargePeriod) {
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
  public PriceAlterationVO unitOfMeasure(String unitOfMeasure) {
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
  public PriceAlterationVO price(PriceVO price) {
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
  public PriceAlterationVO productOfferingPrice(ProductOfferingPriceRefVO productOfferingPrice) {
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
  public PriceAlterationVO atBaseType(String atBaseType) {
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
  public PriceAlterationVO atSchemaLocation(URI atSchemaLocation) {
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
  public PriceAlterationVO atType(String atType) {
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
    PriceAlterationVO priceAlteration = (PriceAlterationVO) o;
    return Objects.equals(this.applicationDuration, priceAlteration.applicationDuration) &&
        Objects.equals(this.description, priceAlteration.description) &&
        Objects.equals(this.name, priceAlteration.name) &&
        Objects.equals(this.priceType, priceAlteration.priceType) &&
        Objects.equals(this.priority, priceAlteration.priority) &&
        Objects.equals(this.recurringChargePeriod, priceAlteration.recurringChargePeriod) &&
        Objects.equals(this.unitOfMeasure, priceAlteration.unitOfMeasure) &&
        Objects.equals(this.price, priceAlteration.price) &&
        Objects.equals(this.productOfferingPrice, priceAlteration.productOfferingPrice) &&
        Objects.equals(this.atBaseType, priceAlteration.atBaseType) &&
        Objects.equals(this.atSchemaLocation, priceAlteration.atSchemaLocation) &&
        Objects.equals(this.atType, priceAlteration.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationDuration, description, name, priceType, priority, recurringChargePeriod, unitOfMeasure, price, productOfferingPrice, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAlterationVO {\n");
    
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

