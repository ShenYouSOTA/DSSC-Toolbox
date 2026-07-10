package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.DurationVO;
import org.fiware.dataspace.tmf.model.ProductPriceValueVO;
import org.fiware.dataspace.tmf.model.QuantityVO;
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
 * Is an amount, usually of money, that modifies the price charged for an order item.
 **/
@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item.")
@JsonTypeName("POPAlteration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class POPAlterationVO   {
  private String id;
  private URI href;
  private String description;
  private String name;
  private String priceType;
  private Integer priority;
  private String recurringChargePeriod;
  private DurationVO applicationDuration;
  private ProductPriceValueVO price;
  private QuantityVO unitOfMeasure;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * unique identifier
   **/
  public POPAlterationVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "unique identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hyperlink reference
   **/
  public POPAlterationVO href(URI href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink reference")
  @JsonProperty("href")
  public URI getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(URI href) {
    this.href = href;
  }

  /**
   * A narrative that explains in detail the semantics of this order item price alteration
   **/
  public POPAlterationVO description(String description) {
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
   * Name given to this price alteration
   **/
  public POPAlterationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name given to this price alteration")
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
  public POPAlterationVO priceType(String priceType) {
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
  public POPAlterationVO priority(Integer priority) {
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
  public POPAlterationVO recurringChargePeriod(String recurringChargePeriod) {
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
   **/
  public POPAlterationVO applicationDuration(DurationVO applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationDuration")
  @Valid public DurationVO getApplicationDuration() {
    return applicationDuration;
  }

  @JsonProperty("applicationDuration")
  public void setApplicationDuration(DurationVO applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  /**
   **/
  public POPAlterationVO price(ProductPriceValueVO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("price")
  @NotNull @Valid public ProductPriceValueVO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(ProductPriceValueVO price) {
    this.price = price;
  }

  /**
   **/
  public POPAlterationVO unitOfMeasure(QuantityVO unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unitOfMeasure")
  @Valid public QuantityVO getUnitOfMeasure() {
    return unitOfMeasure;
  }

  @JsonProperty("unitOfMeasure")
  public void setUnitOfMeasure(QuantityVO unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   **/
  public POPAlterationVO validFor(TimePeriodVO validFor) {
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
  public POPAlterationVO atBaseType(String atBaseType) {
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
  public POPAlterationVO atSchemaLocation(URI atSchemaLocation) {
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
  public POPAlterationVO atType(String atType) {
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
    POPAlterationVO poPAlteration = (POPAlterationVO) o;
    return Objects.equals(this.id, poPAlteration.id) &&
        Objects.equals(this.href, poPAlteration.href) &&
        Objects.equals(this.description, poPAlteration.description) &&
        Objects.equals(this.name, poPAlteration.name) &&
        Objects.equals(this.priceType, poPAlteration.priceType) &&
        Objects.equals(this.priority, poPAlteration.priority) &&
        Objects.equals(this.recurringChargePeriod, poPAlteration.recurringChargePeriod) &&
        Objects.equals(this.applicationDuration, poPAlteration.applicationDuration) &&
        Objects.equals(this.price, poPAlteration.price) &&
        Objects.equals(this.unitOfMeasure, poPAlteration.unitOfMeasure) &&
        Objects.equals(this.validFor, poPAlteration.validFor) &&
        Objects.equals(this.atBaseType, poPAlteration.atBaseType) &&
        Objects.equals(this.atSchemaLocation, poPAlteration.atSchemaLocation) &&
        Objects.equals(this.atType, poPAlteration.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, priceType, priority, recurringChargePeriod, applicationDuration, price, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POPAlterationVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

