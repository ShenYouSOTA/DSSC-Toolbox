package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.BundledProductOfferingPriceRelationshipVO;
import org.fiware.dataspace.tmf.model.ConstraintRefVO;
import org.fiware.dataspace.tmf.model.MoneyVO;
import org.fiware.dataspace.tmf.model.PlaceRefVO;
import org.fiware.dataspace.tmf.model.PricingLogicAlgorithmVO;
import org.fiware.dataspace.tmf.model.ProductOfferingPriceRelationshipVO;
import org.fiware.dataspace.tmf.model.ProductOfferingTermVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationCharacteristicValueUseVO;
import org.fiware.dataspace.tmf.model.QuantityVO;
import org.fiware.dataspace.tmf.model.TaxItemVO;
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
 * Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href
 **/
@ApiModel(description = "Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href")
@JsonTypeName("ProductOfferingPrice_Create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOfferingPriceCreateVO   {
  private String description;
  private Boolean isBundle;
  private Date lastUpdate;
  private String lifecycleStatus;
  private String name;
  private Float percentage;
  private String priceType;
  private Integer recurringChargePeriodLength;
  private String recurringChargePeriodType;
  private String version;
  private @Valid List<@Valid BundledProductOfferingPriceRelationshipVO> bundledPopRelationship = new ArrayList<>();
  private @Valid List<@Valid ConstraintRefVO> constraint = new ArrayList<>();
  private @Valid List<@Valid PlaceRefVO> place = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingPriceRelationshipVO> popRelationship = new ArrayList<>();
  private MoneyVO price;
  private @Valid List<@Valid PricingLogicAlgorithmVO> pricingLogicAlgorithm = new ArrayList<>();
  private @Valid List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingTermVO> productOfferingTerm = new ArrayList<>();
  private @Valid List<@Valid TaxItemVO> tax = new ArrayList<>();
  private QuantityVO unitOfMeasure;
  private TimePeriodVO validFor;
  private String atBaseType;
  private String atSchemaLocation;
  private String atType;

  /**
   * Description of the productOfferingPrice
   **/
  public ProductOfferingPriceCreateVO description(String description) {
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
   * A flag indicating if this ProductOfferingPrice is composite (bundle) or not
   **/
  public ProductOfferingPriceCreateVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "A flag indicating if this ProductOfferingPrice is composite (bundle) or not")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * the last update time of this ProductOfferingPrice
   **/
  public ProductOfferingPriceCreateVO lastUpdate(Date lastUpdate) {
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
  public ProductOfferingPriceCreateVO lifecycleStatus(String lifecycleStatus) {
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
  public ProductOfferingPriceCreateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the productOfferingPrice")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)
   **/
  public ProductOfferingPriceCreateVO percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  
  @ApiModelProperty(value = "Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)")
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  @JsonProperty("percentage")
  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   **/
  public ProductOfferingPriceCreateVO priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  
  @ApiModelProperty(value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.")
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  @JsonProperty("priceType")
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   **/
  public ProductOfferingPriceCreateVO recurringChargePeriodLength(Integer recurringChargePeriodLength) {
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
   * The period to repeat the application of the price Could be month, week...
   **/
  public ProductOfferingPriceCreateVO recurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
    return this;
  }

  
  @ApiModelProperty(value = "The period to repeat the application of the price Could be month, week...")
  @JsonProperty("recurringChargePeriodType")
  public String getRecurringChargePeriodType() {
    return recurringChargePeriodType;
  }

  @JsonProperty("recurringChargePeriodType")
  public void setRecurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
  }

  /**
   * ProductOfferingPrice version
   **/
  public ProductOfferingPriceCreateVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "ProductOfferingPrice version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.
   **/
  public ProductOfferingPriceCreateVO bundledPopRelationship(List<@Valid BundledProductOfferingPriceRelationshipVO> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.")
  @JsonProperty("bundledPopRelationship")
  @Valid public List<@Valid BundledProductOfferingPriceRelationshipVO> getBundledPopRelationship() {
    return bundledPopRelationship;
  }

  @JsonProperty("bundledPopRelationship")
  public void setBundledPopRelationship(List<@Valid BundledProductOfferingPriceRelationshipVO> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
  }

  public ProductOfferingPriceCreateVO addBundledPopRelationshipItem(BundledProductOfferingPriceRelationshipVO bundledPopRelationshipItem) {
    if (this.bundledPopRelationship == null) {
      this.bundledPopRelationship = new ArrayList<>();
    }

    this.bundledPopRelationship.add(bundledPopRelationshipItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removeBundledPopRelationshipItem(BundledProductOfferingPriceRelationshipVO bundledPopRelationshipItem) {
    if (bundledPopRelationshipItem != null && this.bundledPopRelationship != null) {
      this.bundledPopRelationship.remove(bundledPopRelationshipItem);
    }

    return this;
  }
  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   **/
  public ProductOfferingPriceCreateVO constraint(List<@Valid ConstraintRefVO> constraint) {
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

  public ProductOfferingPriceCreateVO addConstraintItem(ConstraintRefVO constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }

    this.constraint.add(constraintItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removeConstraintItem(ConstraintRefVO constraintItem) {
    if (constraintItem != null && this.constraint != null) {
      this.constraint.remove(constraintItem);
    }

    return this;
  }
  /**
   * Place defines the places where the products are sold or delivered.
   **/
  public ProductOfferingPriceCreateVO place(List<@Valid PlaceRefVO> place) {
    this.place = place;
    return this;
  }

  
  @ApiModelProperty(value = "Place defines the places where the products are sold or delivered.")
  @JsonProperty("place")
  @Valid public List<@Valid PlaceRefVO> getPlace() {
    return place;
  }

  @JsonProperty("place")
  public void setPlace(List<@Valid PlaceRefVO> place) {
    this.place = place;
  }

  public ProductOfferingPriceCreateVO addPlaceItem(PlaceRefVO placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }

    this.place.add(placeItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removePlaceItem(PlaceRefVO placeItem) {
    if (placeItem != null && this.place != null) {
      this.place.remove(placeItem);
    }

    return this;
  }
  /**
   * Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount
   **/
  public ProductOfferingPriceCreateVO popRelationship(List<@Valid ProductOfferingPriceRelationshipVO> popRelationship) {
    this.popRelationship = popRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount")
  @JsonProperty("popRelationship")
  @Valid public List<@Valid ProductOfferingPriceRelationshipVO> getPopRelationship() {
    return popRelationship;
  }

  @JsonProperty("popRelationship")
  public void setPopRelationship(List<@Valid ProductOfferingPriceRelationshipVO> popRelationship) {
    this.popRelationship = popRelationship;
  }

  public ProductOfferingPriceCreateVO addPopRelationshipItem(ProductOfferingPriceRelationshipVO popRelationshipItem) {
    if (this.popRelationship == null) {
      this.popRelationship = new ArrayList<>();
    }

    this.popRelationship.add(popRelationshipItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removePopRelationshipItem(ProductOfferingPriceRelationshipVO popRelationshipItem) {
    if (popRelationshipItem != null && this.popRelationship != null) {
      this.popRelationship.remove(popRelationshipItem);
    }

    return this;
  }
  /**
   **/
  public ProductOfferingPriceCreateVO price(MoneyVO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  @Valid public MoneyVO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(MoneyVO price) {
    this.price = price;
  }

  /**
   * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).
   **/
  public ProductOfferingPriceCreateVO pricingLogicAlgorithm(List<@Valid PricingLogicAlgorithmVO> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).")
  @JsonProperty("pricingLogicAlgorithm")
  @Valid public List<@Valid PricingLogicAlgorithmVO> getPricingLogicAlgorithm() {
    return pricingLogicAlgorithm;
  }

  @JsonProperty("pricingLogicAlgorithm")
  public void setPricingLogicAlgorithm(List<@Valid PricingLogicAlgorithmVO> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
  }

  public ProductOfferingPriceCreateVO addPricingLogicAlgorithmItem(PricingLogicAlgorithmVO pricingLogicAlgorithmItem) {
    if (this.pricingLogicAlgorithm == null) {
      this.pricingLogicAlgorithm = new ArrayList<>();
    }

    this.pricingLogicAlgorithm.add(pricingLogicAlgorithmItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removePricingLogicAlgorithmItem(PricingLogicAlgorithmVO pricingLogicAlgorithmItem) {
    if (pricingLogicAlgorithmItem != null && this.pricingLogicAlgorithm != null) {
      this.pricingLogicAlgorithm.remove(pricingLogicAlgorithmItem);
    }

    return this;
  }
  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   **/
  public ProductOfferingPriceCreateVO prodSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  
  @ApiModelProperty(value = "A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.")
  @JsonProperty("prodSpecCharValueUse")
  @Valid public List<@Valid ProductSpecificationCharacteristicValueUseVO> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  @JsonProperty("prodSpecCharValueUse")
  public void setProdSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOfferingPriceCreateVO addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUseVO prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<>();
    }

    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removeProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUseVO prodSpecCharValueUseItem) {
    if (prodSpecCharValueUseItem != null && this.prodSpecCharValueUse != null) {
      this.prodSpecCharValueUse.remove(prodSpecCharValueUseItem);
    }

    return this;
  }
  /**
   * A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.
   **/
  public ProductOfferingPriceCreateVO productOfferingTerm(List<@Valid ProductOfferingTermVO> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  
  @ApiModelProperty(value = "A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.")
  @JsonProperty("productOfferingTerm")
  @Valid public List<@Valid ProductOfferingTermVO> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  @JsonProperty("productOfferingTerm")
  public void setProductOfferingTerm(List<@Valid ProductOfferingTermVO> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOfferingPriceCreateVO addProductOfferingTermItem(ProductOfferingTermVO productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<>();
    }

    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removeProductOfferingTermItem(ProductOfferingTermVO productOfferingTermItem) {
    if (productOfferingTermItem != null && this.productOfferingTerm != null) {
      this.productOfferingTerm.remove(productOfferingTermItem);
    }

    return this;
  }
  /**
   * An amount of money levied on the price of a Product by a legislative body.
   **/
  public ProductOfferingPriceCreateVO tax(List<@Valid TaxItemVO> tax) {
    this.tax = tax;
    return this;
  }

  
  @ApiModelProperty(value = "An amount of money levied on the price of a Product by a legislative body.")
  @JsonProperty("tax")
  @Valid public List<@Valid TaxItemVO> getTax() {
    return tax;
  }

  @JsonProperty("tax")
  public void setTax(List<@Valid TaxItemVO> tax) {
    this.tax = tax;
  }

  public ProductOfferingPriceCreateVO addTaxItem(TaxItemVO taxItem) {
    if (this.tax == null) {
      this.tax = new ArrayList<>();
    }

    this.tax.add(taxItem);
    return this;
  }

  public ProductOfferingPriceCreateVO removeTaxItem(TaxItemVO taxItem) {
    if (taxItem != null && this.tax != null) {
      this.tax.remove(taxItem);
    }

    return this;
  }
  /**
   **/
  public ProductOfferingPriceCreateVO unitOfMeasure(QuantityVO unitOfMeasure) {
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
  public ProductOfferingPriceCreateVO validFor(TimePeriodVO validFor) {
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
   * the immediate base class type of this product offering price
   **/
  public ProductOfferingPriceCreateVO atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  
  @ApiModelProperty(value = "the immediate base class type of this product offering price")
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  @JsonProperty("@baseType")
  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  /**
   * hyperlink reference to the schema describing this resource
   **/
  public ProductOfferingPriceCreateVO atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  
  @ApiModelProperty(value = "hyperlink reference to the schema describing this resource")
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  @JsonProperty("@schemaLocation")
  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  /**
   * The class type of this Product offering price
   **/
  public ProductOfferingPriceCreateVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "The class type of this Product offering price")
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
    ProductOfferingPriceCreateVO productOfferingPriceCreate = (ProductOfferingPriceCreateVO) o;
    return Objects.equals(this.description, productOfferingPriceCreate.description) &&
        Objects.equals(this.isBundle, productOfferingPriceCreate.isBundle) &&
        Objects.equals(this.lastUpdate, productOfferingPriceCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceCreate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceCreate.name) &&
        Objects.equals(this.percentage, productOfferingPriceCreate.percentage) &&
        Objects.equals(this.priceType, productOfferingPriceCreate.priceType) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceCreate.recurringChargePeriodLength) &&
        Objects.equals(this.recurringChargePeriodType, productOfferingPriceCreate.recurringChargePeriodType) &&
        Objects.equals(this.version, productOfferingPriceCreate.version) &&
        Objects.equals(this.bundledPopRelationship, productOfferingPriceCreate.bundledPopRelationship) &&
        Objects.equals(this.constraint, productOfferingPriceCreate.constraint) &&
        Objects.equals(this.place, productOfferingPriceCreate.place) &&
        Objects.equals(this.popRelationship, productOfferingPriceCreate.popRelationship) &&
        Objects.equals(this.price, productOfferingPriceCreate.price) &&
        Objects.equals(this.pricingLogicAlgorithm, productOfferingPriceCreate.pricingLogicAlgorithm) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingPriceCreate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingTerm, productOfferingPriceCreate.productOfferingTerm) &&
        Objects.equals(this.tax, productOfferingPriceCreate.tax) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceCreate.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceCreate.validFor) &&
        Objects.equals(this.atBaseType, productOfferingPriceCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceCreate.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, lastUpdate, lifecycleStatus, name, percentage, priceType, recurringChargePeriodLength, recurringChargePeriodType, version, bundledPopRelationship, constraint, place, popRelationship, price, pricingLogicAlgorithm, prodSpecCharValueUse, productOfferingTerm, tax, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceCreateVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    recurringChargePeriodType: ").append(toIndentedString(recurringChargePeriodType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bundledPopRelationship: ").append(toIndentedString(bundledPopRelationship)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    popRelationship: ").append(toIndentedString(popRelationship)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingLogicAlgorithm: ").append(toIndentedString(pricingLogicAlgorithm)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

