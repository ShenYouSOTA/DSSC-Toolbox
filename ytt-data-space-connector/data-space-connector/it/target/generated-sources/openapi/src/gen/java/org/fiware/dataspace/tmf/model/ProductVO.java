package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.AgreementItemRefVO;
import org.fiware.dataspace.tmf.model.BillingAccountRefVO;
import org.fiware.dataspace.tmf.model.CharacteristicVO;
import org.fiware.dataspace.tmf.model.ProductOfferingRefVO;
import org.fiware.dataspace.tmf.model.ProductPriceVO;
import org.fiware.dataspace.tmf.model.ProductRefOrValueVO;
import org.fiware.dataspace.tmf.model.ProductRelationshipVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationRefVO;
import org.fiware.dataspace.tmf.model.ProductStatusTypeVO;
import org.fiware.dataspace.tmf.model.ProductTermVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.RelatedPlaceRefOrValueVO;
import org.fiware.dataspace.tmf.model.RelatedProductOrderItemVO;
import org.fiware.dataspace.tmf.model.ResourceRefVO;
import org.fiware.dataspace.tmf.model.ServiceRefVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s).
 **/
@ApiModel(description = "A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s).")
@JsonTypeName("Product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductVO   {
  private String id;
  private String href;
  private String description;
  private Boolean isBundle;
  private Boolean isCustomerVisible;
  private String name;
  private Date orderDate;
  private String productSerialNumber;
  private Date startDate;
  private Date terminationDate;
  private @Valid List<@Valid AgreementItemRefVO> agreement = new ArrayList<>();
  private BillingAccountRefVO billingAccount;
  private @Valid List<@Valid RelatedPlaceRefOrValueVO> place = new ArrayList<>();
  private @Valid List<@Valid ProductRefOrValueVO> product = new ArrayList<>();
  private @Valid List<@Valid CharacteristicVO> productCharacteristic = new ArrayList<>();
  private ProductOfferingRefVO productOffering;
  private @Valid List<@Valid RelatedProductOrderItemVO> productOrderItem = new ArrayList<>();
  private @Valid List<@Valid ProductPriceVO> productPrice = new ArrayList<>();
  private @Valid List<@Valid ProductRelationshipVO> productRelationship = new ArrayList<>();
  private ProductSpecificationRefVO productSpecification;
  private @Valid List<@Valid ProductTermVO> productTerm = new ArrayList<>();
  private @Valid List<@Valid ResourceRefVO> realizingResource = new ArrayList<>();
  private @Valid List<@Valid ServiceRefVO> realizingService = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private ProductStatusTypeVO status;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Unique identifier of the product
   **/
  public ProductVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the product")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the product
   **/
  public ProductVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the product")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   **/
  public ProductVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Is the description of the product. It could be copied from the description of the Product Offering.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.
   **/
  public ProductVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * If true, the product is visible by the customer.
   **/
  public ProductVO isCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
    return this;
  }

  
  @ApiModelProperty(value = "If true, the product is visible by the customer.")
  @JsonProperty("isCustomerVisible")
  public Boolean getIsCustomerVisible() {
    return isCustomerVisible;
  }

  @JsonProperty("isCustomerVisible")
  public void setIsCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
  }

  /**
   * Name of the product. It could be the same as the name of the product offering
   **/
  public ProductVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the product. It could be the same as the name of the product offering")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Is the date when the product was ordered
   **/
  public ProductVO orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  
  @ApiModelProperty(value = "Is the date when the product was ordered")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }

  @JsonProperty("orderDate")
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  /**
   * Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.
   **/
  public ProductVO productSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.")
  @JsonProperty("productSerialNumber")
  public String getProductSerialNumber() {
    return productSerialNumber;
  }

  @JsonProperty("productSerialNumber")
  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  /**
   * Is the date from which the product starts
   **/
  public ProductVO startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(value = "Is the date from which the product starts")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  @JsonProperty("startDate")
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Is the date when the product was terminated
   **/
  public ProductVO terminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Is the date when the product was terminated")
  @JsonProperty("terminationDate")
  public Date getTerminationDate() {
    return terminationDate;
  }

  @JsonProperty("terminationDate")
  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  /**
   **/
  public ProductVO agreement(List<@Valid AgreementItemRefVO> agreement) {
    this.agreement = agreement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("agreement")
  @Valid public List<@Valid AgreementItemRefVO> getAgreement() {
    return agreement;
  }

  @JsonProperty("agreement")
  public void setAgreement(List<@Valid AgreementItemRefVO> agreement) {
    this.agreement = agreement;
  }

  public ProductVO addAgreementItem(AgreementItemRefVO agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }

    this.agreement.add(agreementItem);
    return this;
  }

  public ProductVO removeAgreementItem(AgreementItemRefVO agreementItem) {
    if (agreementItem != null && this.agreement != null) {
      this.agreement.remove(agreementItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO billingAccount(BillingAccountRefVO billingAccount) {
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
  public ProductVO place(List<@Valid RelatedPlaceRefOrValueVO> place) {
    this.place = place;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("place")
  @Valid public List<@Valid RelatedPlaceRefOrValueVO> getPlace() {
    return place;
  }

  @JsonProperty("place")
  public void setPlace(List<@Valid RelatedPlaceRefOrValueVO> place) {
    this.place = place;
  }

  public ProductVO addPlaceItem(RelatedPlaceRefOrValueVO placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }

    this.place.add(placeItem);
    return this;
  }

  public ProductVO removePlaceItem(RelatedPlaceRefOrValueVO placeItem) {
    if (placeItem != null && this.place != null) {
      this.place.remove(placeItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO product(List<@Valid ProductRefOrValueVO> product) {
    this.product = product;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product")
  @Valid public List<@Valid ProductRefOrValueVO> getProduct() {
    return product;
  }

  @JsonProperty("product")
  public void setProduct(List<@Valid ProductRefOrValueVO> product) {
    this.product = product;
  }

  public ProductVO addProductItem(ProductRefOrValueVO productItem) {
    if (this.product == null) {
      this.product = new ArrayList<>();
    }

    this.product.add(productItem);
    return this;
  }

  public ProductVO removeProductItem(ProductRefOrValueVO productItem) {
    if (productItem != null && this.product != null) {
      this.product.remove(productItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO productCharacteristic(List<@Valid CharacteristicVO> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productCharacteristic")
  @Valid public List<@Valid CharacteristicVO> getProductCharacteristic() {
    return productCharacteristic;
  }

  @JsonProperty("productCharacteristic")
  public void setProductCharacteristic(List<@Valid CharacteristicVO> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductVO addProductCharacteristicItem(CharacteristicVO productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<>();
    }

    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

  public ProductVO removeProductCharacteristicItem(CharacteristicVO productCharacteristicItem) {
    if (productCharacteristicItem != null && this.productCharacteristic != null) {
      this.productCharacteristic.remove(productCharacteristicItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO productOffering(ProductOfferingRefVO productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOffering")
  @Valid public ProductOfferingRefVO getProductOffering() {
    return productOffering;
  }

  @JsonProperty("productOffering")
  public void setProductOffering(ProductOfferingRefVO productOffering) {
    this.productOffering = productOffering;
  }

  /**
   **/
  public ProductVO productOrderItem(List<@Valid RelatedProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOrderItem")
  @Valid public List<@Valid RelatedProductOrderItemVO> getProductOrderItem() {
    return productOrderItem;
  }

  @JsonProperty("productOrderItem")
  public void setProductOrderItem(List<@Valid RelatedProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductVO addProductOrderItemItem(RelatedProductOrderItemVO productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<>();
    }

    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  public ProductVO removeProductOrderItemItem(RelatedProductOrderItemVO productOrderItemItem) {
    if (productOrderItemItem != null && this.productOrderItem != null) {
      this.productOrderItem.remove(productOrderItemItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO productPrice(List<@Valid ProductPriceVO> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productPrice")
  @Valid public List<@Valid ProductPriceVO> getProductPrice() {
    return productPrice;
  }

  @JsonProperty("productPrice")
  public void setProductPrice(List<@Valid ProductPriceVO> productPrice) {
    this.productPrice = productPrice;
  }

  public ProductVO addProductPriceItem(ProductPriceVO productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new ArrayList<>();
    }

    this.productPrice.add(productPriceItem);
    return this;
  }

  public ProductVO removeProductPriceItem(ProductPriceVO productPriceItem) {
    if (productPriceItem != null && this.productPrice != null) {
      this.productPrice.remove(productPriceItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO productRelationship(List<@Valid ProductRelationshipVO> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productRelationship")
  @Valid public List<@Valid ProductRelationshipVO> getProductRelationship() {
    return productRelationship;
  }

  @JsonProperty("productRelationship")
  public void setProductRelationship(List<@Valid ProductRelationshipVO> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public ProductVO addProductRelationshipItem(ProductRelationshipVO productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<>();
    }

    this.productRelationship.add(productRelationshipItem);
    return this;
  }

  public ProductVO removeProductRelationshipItem(ProductRelationshipVO productRelationshipItem) {
    if (productRelationshipItem != null && this.productRelationship != null) {
      this.productRelationship.remove(productRelationshipItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO productSpecification(ProductSpecificationRefVO productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productSpecification")
  @Valid public ProductSpecificationRefVO getProductSpecification() {
    return productSpecification;
  }

  @JsonProperty("productSpecification")
  public void setProductSpecification(ProductSpecificationRefVO productSpecification) {
    this.productSpecification = productSpecification;
  }

  /**
   **/
  public ProductVO productTerm(List<@Valid ProductTermVO> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productTerm")
  @Valid public List<@Valid ProductTermVO> getProductTerm() {
    return productTerm;
  }

  @JsonProperty("productTerm")
  public void setProductTerm(List<@Valid ProductTermVO> productTerm) {
    this.productTerm = productTerm;
  }

  public ProductVO addProductTermItem(ProductTermVO productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new ArrayList<>();
    }

    this.productTerm.add(productTermItem);
    return this;
  }

  public ProductVO removeProductTermItem(ProductTermVO productTermItem) {
    if (productTermItem != null && this.productTerm != null) {
      this.productTerm.remove(productTermItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO realizingResource(List<@Valid ResourceRefVO> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realizingResource")
  @Valid public List<@Valid ResourceRefVO> getRealizingResource() {
    return realizingResource;
  }

  @JsonProperty("realizingResource")
  public void setRealizingResource(List<@Valid ResourceRefVO> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public ProductVO addRealizingResourceItem(ResourceRefVO realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new ArrayList<>();
    }

    this.realizingResource.add(realizingResourceItem);
    return this;
  }

  public ProductVO removeRealizingResourceItem(ResourceRefVO realizingResourceItem) {
    if (realizingResourceItem != null && this.realizingResource != null) {
      this.realizingResource.remove(realizingResourceItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO realizingService(List<@Valid ServiceRefVO> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realizingService")
  @Valid public List<@Valid ServiceRefVO> getRealizingService() {
    return realizingService;
  }

  @JsonProperty("realizingService")
  public void setRealizingService(List<@Valid ServiceRefVO> realizingService) {
    this.realizingService = realizingService;
  }

  public ProductVO addRealizingServiceItem(ServiceRefVO realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new ArrayList<>();
    }

    this.realizingService.add(realizingServiceItem);
    return this;
  }

  public ProductVO removeRealizingServiceItem(ServiceRefVO realizingServiceItem) {
    if (realizingServiceItem != null && this.realizingService != null) {
      this.realizingService.remove(realizingServiceItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relatedParty")
  @Valid public List<@Valid RelatedPartyVO> getRelatedParty() {
    return relatedParty;
  }

  @JsonProperty("relatedParty")
  public void setRelatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ProductVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   **/
  public ProductVO status(ProductStatusTypeVO status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ProductStatusTypeVO getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ProductStatusTypeVO status) {
    this.status = status;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductVO atBaseType(String atBaseType) {
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
  public ProductVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductVO atType(String atType) {
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
    ProductVO product = (ProductVO) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.href, product.href) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.isBundle, product.isBundle) &&
        Objects.equals(this.isCustomerVisible, product.isCustomerVisible) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.orderDate, product.orderDate) &&
        Objects.equals(this.productSerialNumber, product.productSerialNumber) &&
        Objects.equals(this.startDate, product.startDate) &&
        Objects.equals(this.terminationDate, product.terminationDate) &&
        Objects.equals(this.agreement, product.agreement) &&
        Objects.equals(this.billingAccount, product.billingAccount) &&
        Objects.equals(this.place, product.place) &&
        Objects.equals(this.product, product.product) &&
        Objects.equals(this.productCharacteristic, product.productCharacteristic) &&
        Objects.equals(this.productOffering, product.productOffering) &&
        Objects.equals(this.productOrderItem, product.productOrderItem) &&
        Objects.equals(this.productPrice, product.productPrice) &&
        Objects.equals(this.productRelationship, product.productRelationship) &&
        Objects.equals(this.productSpecification, product.productSpecification) &&
        Objects.equals(this.productTerm, product.productTerm) &&
        Objects.equals(this.realizingResource, product.realizingResource) &&
        Objects.equals(this.realizingService, product.realizingService) &&
        Objects.equals(this.relatedParty, product.relatedParty) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.atBaseType, product.atBaseType) &&
        Objects.equals(this.atSchemaLocation, product.atSchemaLocation) &&
        Objects.equals(this.atType, product.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, isCustomerVisible, name, orderDate, productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isCustomerVisible: ").append(toIndentedString(isCustomerVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    productSerialNumber: ").append(toIndentedString(productSerialNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    realizingResource: ").append(toIndentedString(realizingResource)).append("\n");
    sb.append("    realizingService: ").append(toIndentedString(realizingService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

