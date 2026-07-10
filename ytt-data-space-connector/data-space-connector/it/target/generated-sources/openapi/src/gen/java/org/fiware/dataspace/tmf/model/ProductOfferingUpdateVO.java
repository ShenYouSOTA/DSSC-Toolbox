package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.AgreementRefVO;
import org.fiware.dataspace.tmf.model.AttachmentRefOrValueVO;
import org.fiware.dataspace.tmf.model.BundledProductOfferingVO;
import org.fiware.dataspace.tmf.model.CategoryRefVO;
import org.fiware.dataspace.tmf.model.ChannelRefVO;
import org.fiware.dataspace.tmf.model.MarketSegmentRefVO;
import org.fiware.dataspace.tmf.model.PlaceRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingPriceRefOrValueVO;
import org.fiware.dataspace.tmf.model.ProductOfferingRelationshipVO;
import org.fiware.dataspace.tmf.model.ProductOfferingTermVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationCharacteristicValueUseVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationRefVO;
import org.fiware.dataspace.tmf.model.ResourceCandidateRefVO;
import org.fiware.dataspace.tmf.model.SLARefVO;
import org.fiware.dataspace.tmf.model.ServiceCandidateRefVO;
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
 * Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href,lastUpdate,@type,@baseType
 **/
@ApiModel(description = "Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href,lastUpdate,@type,@baseType")
@JsonTypeName("ProductOffering_Update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOfferingUpdateVO   {
  private String description;
  private Boolean isBundle;
  private Boolean isSellable;
  private String lifecycleStatus;
  private String name;
  private String statusReason;
  private String version;
  private @Valid List<@Valid AgreementRefVO> agreement = new ArrayList<>();
  private @Valid List<@Valid AttachmentRefOrValueVO> attachment = new ArrayList<>();
  private @Valid List<@Valid BundledProductOfferingVO> bundledProductOffering = new ArrayList<>();
  private @Valid List<@Valid CategoryRefVO> category = new ArrayList<>();
  private @Valid List<@Valid ChannelRefVO> channel = new ArrayList<>();
  private @Valid List<@Valid MarketSegmentRefVO> marketSegment = new ArrayList<>();
  private @Valid List<@Valid PlaceRefVO> place = new ArrayList<>();
  private @Valid List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingPriceRefOrValueVO> productOfferingPrice = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingRelationshipVO> productOfferingRelationship = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingTermVO> productOfferingTerm = new ArrayList<>();
  private ProductSpecificationRefVO productSpecification;
  private ResourceCandidateRefVO resourceCandidate;
  private ServiceCandidateRefVO serviceCandidate;
  private SLARefVO serviceLevelAgreement;
  private TimePeriodVO validFor;
  private URI atSchemaLocation;

  /**
   * Description of the productOffering
   **/
  public ProductOfferingUpdateVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the productOffering")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).
   **/
  public ProductOfferingUpdateVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.
   **/
  public ProductOfferingUpdateVO isSellable(Boolean isSellable) {
    this.isSellable = isSellable;
    return this;
  }

  
  @ApiModelProperty(value = "A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.")
  @JsonProperty("isSellable")
  public Boolean getIsSellable() {
    return isSellable;
  }

  @JsonProperty("isSellable")
  public void setIsSellable(Boolean isSellable) {
    this.isSellable = isSellable;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public ProductOfferingUpdateVO lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Used to indicate the current lifecycle status")
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  @JsonProperty("lifecycleStatus")
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * Name of the productOffering
   **/
  public ProductOfferingUpdateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the productOffering")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A string providing a complementary information on the value of the lifecycle status attribute.
   **/
  public ProductOfferingUpdateVO statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  
  @ApiModelProperty(value = "A string providing a complementary information on the value of the lifecycle status attribute.")
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  @JsonProperty("statusReason")
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * ProductOffering version
   **/
  public ProductOfferingUpdateVO version(String version) {
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
   * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
   **/
  public ProductOfferingUpdateVO agreement(List<@Valid AgreementRefVO> agreement) {
    this.agreement = agreement;
    return this;
  }

  
  @ApiModelProperty(value = "An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.")
  @JsonProperty("agreement")
  @Valid public List<@Valid AgreementRefVO> getAgreement() {
    return agreement;
  }

  @JsonProperty("agreement")
  public void setAgreement(List<@Valid AgreementRefVO> agreement) {
    this.agreement = agreement;
  }

  public ProductOfferingUpdateVO addAgreementItem(AgreementRefVO agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }

    this.agreement.add(agreementItem);
    return this;
  }

  public ProductOfferingUpdateVO removeAgreementItem(AgreementRefVO agreementItem) {
    if (agreementItem != null && this.agreement != null) {
      this.agreement.remove(agreementItem);
    }

    return this;
  }
  /**
   * Complements the description of an element (for instance a product) through video, pictures...
   **/
  public ProductOfferingUpdateVO attachment(List<@Valid AttachmentRefOrValueVO> attachment) {
    this.attachment = attachment;
    return this;
  }

  
  @ApiModelProperty(value = "Complements the description of an element (for instance a product) through video, pictures...")
  @JsonProperty("attachment")
  @Valid public List<@Valid AttachmentRefOrValueVO> getAttachment() {
    return attachment;
  }

  @JsonProperty("attachment")
  public void setAttachment(List<@Valid AttachmentRefOrValueVO> attachment) {
    this.attachment = attachment;
  }

  public ProductOfferingUpdateVO addAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }

    this.attachment.add(attachmentItem);
    return this;
  }

  public ProductOfferingUpdateVO removeAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (attachmentItem != null && this.attachment != null) {
      this.attachment.remove(attachmentItem);
    }

    return this;
  }
  /**
   * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
   **/
  public ProductOfferingUpdateVO bundledProductOffering(List<@Valid BundledProductOfferingVO> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
    return this;
  }

  
  @ApiModelProperty(value = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")
  @JsonProperty("bundledProductOffering")
  @Valid public List<@Valid BundledProductOfferingVO> getBundledProductOffering() {
    return bundledProductOffering;
  }

  @JsonProperty("bundledProductOffering")
  public void setBundledProductOffering(List<@Valid BundledProductOfferingVO> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
  }

  public ProductOfferingUpdateVO addBundledProductOfferingItem(BundledProductOfferingVO bundledProductOfferingItem) {
    if (this.bundledProductOffering == null) {
      this.bundledProductOffering = new ArrayList<>();
    }

    this.bundledProductOffering.add(bundledProductOfferingItem);
    return this;
  }

  public ProductOfferingUpdateVO removeBundledProductOfferingItem(BundledProductOfferingVO bundledProductOfferingItem) {
    if (bundledProductOfferingItem != null && this.bundledProductOffering != null) {
      this.bundledProductOffering.remove(bundledProductOfferingItem);
    }

    return this;
  }
  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
   **/
  public ProductOfferingUpdateVO category(List<@Valid CategoryRefVO> category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")
  @JsonProperty("category")
  @Valid public List<@Valid CategoryRefVO> getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(List<@Valid CategoryRefVO> category) {
    this.category = category;
  }

  public ProductOfferingUpdateVO addCategoryItem(CategoryRefVO categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }

    this.category.add(categoryItem);
    return this;
  }

  public ProductOfferingUpdateVO removeCategoryItem(CategoryRefVO categoryItem) {
    if (categoryItem != null && this.category != null) {
      this.category.remove(categoryItem);
    }

    return this;
  }
  /**
   * The channel defines the channel for selling product offerings.
   **/
  public ProductOfferingUpdateVO channel(List<@Valid ChannelRefVO> channel) {
    this.channel = channel;
    return this;
  }

  
  @ApiModelProperty(value = "The channel defines the channel for selling product offerings.")
  @JsonProperty("channel")
  @Valid public List<@Valid ChannelRefVO> getChannel() {
    return channel;
  }

  @JsonProperty("channel")
  public void setChannel(List<@Valid ChannelRefVO> channel) {
    this.channel = channel;
  }

  public ProductOfferingUpdateVO addChannelItem(ChannelRefVO channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<>();
    }

    this.channel.add(channelItem);
    return this;
  }

  public ProductOfferingUpdateVO removeChannelItem(ChannelRefVO channelItem) {
    if (channelItem != null && this.channel != null) {
      this.channel.remove(channelItem);
    }

    return this;
  }
  /**
   * provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.
   **/
  public ProductOfferingUpdateVO marketSegment(List<@Valid MarketSegmentRefVO> marketSegment) {
    this.marketSegment = marketSegment;
    return this;
  }

  
  @ApiModelProperty(value = "provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.")
  @JsonProperty("marketSegment")
  @Valid public List<@Valid MarketSegmentRefVO> getMarketSegment() {
    return marketSegment;
  }

  @JsonProperty("marketSegment")
  public void setMarketSegment(List<@Valid MarketSegmentRefVO> marketSegment) {
    this.marketSegment = marketSegment;
  }

  public ProductOfferingUpdateVO addMarketSegmentItem(MarketSegmentRefVO marketSegmentItem) {
    if (this.marketSegment == null) {
      this.marketSegment = new ArrayList<>();
    }

    this.marketSegment.add(marketSegmentItem);
    return this;
  }

  public ProductOfferingUpdateVO removeMarketSegmentItem(MarketSegmentRefVO marketSegmentItem) {
    if (marketSegmentItem != null && this.marketSegment != null) {
      this.marketSegment.remove(marketSegmentItem);
    }

    return this;
  }
  /**
   * Place defines the places where the products are sold or delivered.
   **/
  public ProductOfferingUpdateVO place(List<@Valid PlaceRefVO> place) {
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

  public ProductOfferingUpdateVO addPlaceItem(PlaceRefVO placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }

    this.place.add(placeItem);
    return this;
  }

  public ProductOfferingUpdateVO removePlaceItem(PlaceRefVO placeItem) {
    if (placeItem != null && this.place != null) {
      this.place.remove(placeItem);
    }

    return this;
  }
  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic &#39;Color&#39; might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in &#39;ProductSpecificationCharacteristicValueUse&#39; is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   **/
  public ProductOfferingUpdateVO prodSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  
  @ApiModelProperty(value = "A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.")
  @JsonProperty("prodSpecCharValueUse")
  @Valid public List<@Valid ProductSpecificationCharacteristicValueUseVO> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  @JsonProperty("prodSpecCharValueUse")
  public void setProdSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUseVO> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOfferingUpdateVO addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUseVO prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<>();
    }

    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  public ProductOfferingUpdateVO removeProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUseVO prodSpecCharValueUseItem) {
    if (prodSpecCharValueUseItem != null && this.prodSpecCharValueUse != null) {
      this.prodSpecCharValueUse.remove(prodSpecCharValueUseItem);
    }

    return this;
  }
  /**
   * An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.
   **/
  public ProductOfferingUpdateVO productOfferingPrice(List<@Valid ProductOfferingPriceRefOrValueVO> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  
  @ApiModelProperty(value = "An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.")
  @JsonProperty("productOfferingPrice")
  @Valid public List<@Valid ProductOfferingPriceRefOrValueVO> getProductOfferingPrice() {
    return productOfferingPrice;
  }

  @JsonProperty("productOfferingPrice")
  public void setProductOfferingPrice(List<@Valid ProductOfferingPriceRefOrValueVO> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  public ProductOfferingUpdateVO addProductOfferingPriceItem(ProductOfferingPriceRefOrValueVO productOfferingPriceItem) {
    if (this.productOfferingPrice == null) {
      this.productOfferingPrice = new ArrayList<>();
    }

    this.productOfferingPrice.add(productOfferingPriceItem);
    return this;
  }

  public ProductOfferingUpdateVO removeProductOfferingPriceItem(ProductOfferingPriceRefOrValueVO productOfferingPriceItem) {
    if (productOfferingPriceItem != null && this.productOfferingPrice != null) {
      this.productOfferingPrice.remove(productOfferingPriceItem);
    }

    return this;
  }
  /**
   * A relationship between this product offering and other product offerings.
   **/
  public ProductOfferingUpdateVO productOfferingRelationship(List<@Valid ProductOfferingRelationshipVO> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "A relationship between this product offering and other product offerings.")
  @JsonProperty("productOfferingRelationship")
  @Valid public List<@Valid ProductOfferingRelationshipVO> getProductOfferingRelationship() {
    return productOfferingRelationship;
  }

  @JsonProperty("productOfferingRelationship")
  public void setProductOfferingRelationship(List<@Valid ProductOfferingRelationshipVO> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
  }

  public ProductOfferingUpdateVO addProductOfferingRelationshipItem(ProductOfferingRelationshipVO productOfferingRelationshipItem) {
    if (this.productOfferingRelationship == null) {
      this.productOfferingRelationship = new ArrayList<>();
    }

    this.productOfferingRelationship.add(productOfferingRelationshipItem);
    return this;
  }

  public ProductOfferingUpdateVO removeProductOfferingRelationshipItem(ProductOfferingRelationshipVO productOfferingRelationshipItem) {
    if (productOfferingRelationshipItem != null && this.productOfferingRelationship != null) {
      this.productOfferingRelationship.remove(productOfferingRelationshipItem);
    }

    return this;
  }
  /**
   * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
   **/
  public ProductOfferingUpdateVO productOfferingTerm(List<@Valid ProductOfferingTermVO> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  
  @ApiModelProperty(value = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.")
  @JsonProperty("productOfferingTerm")
  @Valid public List<@Valid ProductOfferingTermVO> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  @JsonProperty("productOfferingTerm")
  public void setProductOfferingTerm(List<@Valid ProductOfferingTermVO> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOfferingUpdateVO addProductOfferingTermItem(ProductOfferingTermVO productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<>();
    }

    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  public ProductOfferingUpdateVO removeProductOfferingTermItem(ProductOfferingTermVO productOfferingTermItem) {
    if (productOfferingTermItem != null && this.productOfferingTerm != null) {
      this.productOfferingTerm.remove(productOfferingTermItem);
    }

    return this;
  }
  /**
   **/
  public ProductOfferingUpdateVO productSpecification(ProductSpecificationRefVO productSpecification) {
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
  public ProductOfferingUpdateVO resourceCandidate(ResourceCandidateRefVO resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resourceCandidate")
  @Valid public ResourceCandidateRefVO getResourceCandidate() {
    return resourceCandidate;
  }

  @JsonProperty("resourceCandidate")
  public void setResourceCandidate(ResourceCandidateRefVO resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  /**
   **/
  public ProductOfferingUpdateVO serviceCandidate(ServiceCandidateRefVO serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceCandidate")
  @Valid public ServiceCandidateRefVO getServiceCandidate() {
    return serviceCandidate;
  }

  @JsonProperty("serviceCandidate")
  public void setServiceCandidate(ServiceCandidateRefVO serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }

  /**
   **/
  public ProductOfferingUpdateVO serviceLevelAgreement(SLARefVO serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceLevelAgreement")
  @Valid public SLARefVO getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }

  @JsonProperty("serviceLevelAgreement")
  public void setServiceLevelAgreement(SLARefVO serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
  }

  /**
   **/
  public ProductOfferingUpdateVO validFor(TimePeriodVO validFor) {
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
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   **/
  public ProductOfferingUpdateVO atSchemaLocation(URI atSchemaLocation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingUpdateVO productOfferingUpdate = (ProductOfferingUpdateVO) o;
    return Objects.equals(this.description, productOfferingUpdate.description) &&
        Objects.equals(this.isBundle, productOfferingUpdate.isBundle) &&
        Objects.equals(this.isSellable, productOfferingUpdate.isSellable) &&
        Objects.equals(this.lifecycleStatus, productOfferingUpdate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingUpdate.name) &&
        Objects.equals(this.statusReason, productOfferingUpdate.statusReason) &&
        Objects.equals(this.version, productOfferingUpdate.version) &&
        Objects.equals(this.agreement, productOfferingUpdate.agreement) &&
        Objects.equals(this.attachment, productOfferingUpdate.attachment) &&
        Objects.equals(this.bundledProductOffering, productOfferingUpdate.bundledProductOffering) &&
        Objects.equals(this.category, productOfferingUpdate.category) &&
        Objects.equals(this.channel, productOfferingUpdate.channel) &&
        Objects.equals(this.marketSegment, productOfferingUpdate.marketSegment) &&
        Objects.equals(this.place, productOfferingUpdate.place) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingUpdate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingPrice, productOfferingUpdate.productOfferingPrice) &&
        Objects.equals(this.productOfferingRelationship, productOfferingUpdate.productOfferingRelationship) &&
        Objects.equals(this.productOfferingTerm, productOfferingUpdate.productOfferingTerm) &&
        Objects.equals(this.productSpecification, productOfferingUpdate.productSpecification) &&
        Objects.equals(this.resourceCandidate, productOfferingUpdate.resourceCandidate) &&
        Objects.equals(this.serviceCandidate, productOfferingUpdate.serviceCandidate) &&
        Objects.equals(this.serviceLevelAgreement, productOfferingUpdate.serviceLevelAgreement) &&
        Objects.equals(this.validFor, productOfferingUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, productOfferingUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, isSellable, lifecycleStatus, name, statusReason, version, agreement, attachment, bundledProductOffering, category, channel, marketSegment, place, prodSpecCharValueUse, productOfferingPrice, productOfferingRelationship, productOfferingTerm, productSpecification, resourceCandidate, serviceCandidate, serviceLevelAgreement, validFor, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingUpdateVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isSellable: ").append(toIndentedString(isSellable)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productOfferingRelationship: ").append(toIndentedString(productOfferingRelationship)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
    sb.append("    serviceLevelAgreement: ").append(toIndentedString(serviceLevelAgreement)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

