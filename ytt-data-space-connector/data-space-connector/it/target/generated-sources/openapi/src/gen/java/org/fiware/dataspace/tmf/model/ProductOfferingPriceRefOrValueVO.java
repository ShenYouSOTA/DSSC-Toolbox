package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.ConstraintRefVO;
import org.fiware.dataspace.tmf.model.POPAlterationVO;
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
 * A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product offering price and not to this ReforValue structure
 **/
@ApiModel(description = "A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product offering price and not to this ReforValue structure")
@JsonTypeName("ProductOfferingPriceRefOrValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOfferingPriceRefOrValueVO   {
  private String id;
  private URI href;
  private String description;
  private Date lastUpdate;
  private String lifecycleStatus;
  private String name;
  private String priceType;
  private String recurringChargePeriod;
  private Integer recurringChargePeriodLength;
  private String version;
  private @Valid List<@Valid ConstraintRefVO> constraint = new ArrayList<>();
  private ProductPriceValueVO price;
  private @Valid List<@Valid POPAlterationVO> priceAlteration = new ArrayList<>();
  private QuantityVO unitOfMeasure;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atReferredType;

  /**
   * unique identifier
   **/
  public ProductOfferingPriceRefOrValueVO id(String id) {
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
  public ProductOfferingPriceRefOrValueVO href(URI href) {
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
   * Description of the productOfferingPrice
   **/
  public ProductOfferingPriceRefOrValueVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the productOfferingPrice")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * the last update time of this ProductOfferingPrice
   **/
  public ProductOfferingPriceRefOrValueVO lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "the last update time of this ProductOfferingPrice")
  @JsonProperty("lastUpdate")
  public Date getLastUpdate() {
    return lastUpdate;
  }

  @JsonProperty("lastUpdate")
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * the lifecycle status of this ProductOfferingPrice
   **/
  public ProductOfferingPriceRefOrValueVO lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "the lifecycle status of this ProductOfferingPrice")
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  @JsonProperty("lifecycleStatus")
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * Name of the productOfferingPrice
   **/
  public ProductOfferingPriceRefOrValueVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the productOfferingPrice")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A category that describes the price charge, such as recurring, penalty, One time fee and so forth.
   **/
  public ProductOfferingPriceRefOrValueVO priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(value = "A category that describes the price charge, such as recurring, penalty, One time fee and so forth.")
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  @JsonProperty("priceType")
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * The period type to repeat the application of the price Could be month, week...
   **/
  public ProductOfferingPriceRefOrValueVO recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  
  @ApiModelProperty(value = "The period type to repeat the application of the price Could be month, week...")
  @JsonProperty("recurringChargePeriod")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  @JsonProperty("recurringChargePeriod")
  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   **/
  public ProductOfferingPriceRefOrValueVO recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

  
  @ApiModelProperty(value = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable")
  @JsonProperty("recurringChargePeriodLength")
  public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }

  @JsonProperty("recurringChargePeriodLength")
  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }

  /**
   * ProductOffering version
   **/
  public ProductOfferingPriceRefOrValueVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "ProductOffering version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   **/
  public ProductOfferingPriceRefOrValueVO constraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
    return this;
  }

  
  @ApiModelProperty(value = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.")
  @JsonProperty("constraint")
  @Valid public List<@Valid ConstraintRefVO> getConstraint() {
    return constraint;
  }

  @JsonProperty("constraint")
  public void setConstraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
  }

  public ProductOfferingPriceRefOrValueVO addConstraintItem(ConstraintRefVO constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }

    this.constraint.add(constraintItem);
    return this;
  }

  public ProductOfferingPriceRefOrValueVO removeConstraintItem(ConstraintRefVO constraintItem) {
    if (constraintItem != null && this.constraint != null) {
      this.constraint.remove(constraintItem);
    }

    return this;
  }
  /**
   **/
  public ProductOfferingPriceRefOrValueVO price(ProductPriceValueVO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  @Valid public ProductPriceValueVO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(ProductPriceValueVO price) {
    this.price = price;
  }

  /**
   **/
  public ProductOfferingPriceRefOrValueVO priceAlteration(List<@Valid POPAlterationVO> priceAlteration) {
    this.priceAlteration = priceAlteration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priceAlteration")
  @Valid public List<@Valid POPAlterationVO> getPriceAlteration() {
    return priceAlteration;
  }

  @JsonProperty("priceAlteration")
  public void setPriceAlteration(List<@Valid POPAlterationVO> priceAlteration) {
    this.priceAlteration = priceAlteration;
  }

  public ProductOfferingPriceRefOrValueVO addPriceAlterationItem(POPAlterationVO priceAlterationItem) {
    if (this.priceAlteration == null) {
      this.priceAlteration = new ArrayList<>();
    }

    this.priceAlteration.add(priceAlterationItem);
    return this;
  }

  public ProductOfferingPriceRefOrValueVO removePriceAlterationItem(POPAlterationVO priceAlterationItem) {
    if (priceAlterationItem != null && this.priceAlteration != null) {
      this.priceAlteration.remove(priceAlterationItem);
    }

    return this;
  }
  /**
   **/
  public ProductOfferingPriceRefOrValueVO unitOfMeasure(QuantityVO unitOfMeasure) {
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
  public ProductOfferingPriceRefOrValueVO validFor(TimePeriodVO validFor) {
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
  public ProductOfferingPriceRefOrValueVO atBaseType(String atBaseType) {
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
  public ProductOfferingPriceRefOrValueVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductOfferingPriceRefOrValueVO atType(String atType) {
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

  /**
   * The actual type of the target instance when needed for disambiguation.
   **/
  public ProductOfferingPriceRefOrValueVO atReferredType(String atReferredType) {
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
    ProductOfferingPriceRefOrValueVO productOfferingPriceRefOrValue = (ProductOfferingPriceRefOrValueVO) o;
    return Objects.equals(this.id, productOfferingPriceRefOrValue.id) &&
        Objects.equals(this.href, productOfferingPriceRefOrValue.href) &&
        Objects.equals(this.description, productOfferingPriceRefOrValue.description) &&
        Objects.equals(this.lastUpdate, productOfferingPriceRefOrValue.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceRefOrValue.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceRefOrValue.name) &&
        Objects.equals(this.priceType, productOfferingPriceRefOrValue.priceType) &&
        Objects.equals(this.recurringChargePeriod, productOfferingPriceRefOrValue.recurringChargePeriod) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceRefOrValue.recurringChargePeriodLength) &&
        Objects.equals(this.version, productOfferingPriceRefOrValue.version) &&
        Objects.equals(this.constraint, productOfferingPriceRefOrValue.constraint) &&
        Objects.equals(this.price, productOfferingPriceRefOrValue.price) &&
        Objects.equals(this.priceAlteration, productOfferingPriceRefOrValue.priceAlteration) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceRefOrValue.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceRefOrValue.validFor) &&
        Objects.equals(this.atBaseType, productOfferingPriceRefOrValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceRefOrValue.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceRefOrValue.atType) &&
        Objects.equals(this.atReferredType, productOfferingPriceRefOrValue.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, lastUpdate, lifecycleStatus, name, priceType, recurringChargePeriod, recurringChargePeriodLength, version, constraint, price, priceAlteration, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceRefOrValueVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

