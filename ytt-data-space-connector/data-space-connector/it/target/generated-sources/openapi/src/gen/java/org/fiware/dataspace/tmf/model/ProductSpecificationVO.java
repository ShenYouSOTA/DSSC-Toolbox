package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.AttachmentRefOrValueVO;
import org.fiware.dataspace.tmf.model.BundledProductSpecificationVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationCharacteristicVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationRelationshipVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.ResourceSpecificationRefVO;
import org.fiware.dataspace.tmf.model.ServiceSpecificationRefVO;
import org.fiware.dataspace.tmf.model.TargetProductSchemaVO;
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
 * Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
 **/
@ApiModel(description = "Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")
@JsonTypeName("ProductSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductSpecificationVO   {
  private String id;
  private String href;
  private String brand;
  private String description;
  private Boolean isBundle;
  private Date lastUpdate;
  private String lifecycleStatus;
  private String name;
  private String productNumber;
  private String version;
  private @Valid List<@Valid AttachmentRefOrValueVO> attachment = new ArrayList<>();
  private @Valid List<@Valid BundledProductSpecificationVO> bundledProductSpecification = new ArrayList<>();
  private @Valid List<@Valid ProductSpecificationCharacteristicVO> productSpecCharacteristic = new ArrayList<>();
  private @Valid List<@Valid ProductSpecificationRelationshipVO> productSpecificationRelationship = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private @Valid List<@Valid ResourceSpecificationRefVO> resourceSpecification = new ArrayList<>();
  private @Valid List<@Valid ServiceSpecificationRefVO> serviceSpecification = new ArrayList<>();
  private TargetProductSchemaVO targetProductSchema;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Unique identifier of the product specification
   **/
  public ProductSpecificationVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the product specification")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the product specification
   **/
  public ProductSpecificationVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the product specification")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * The manufacturer or trademark of the specification
   **/
  public ProductSpecificationVO brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "The manufacturer or trademark of the specification")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * A narrative that explains in detail what the product specification is
   **/
  public ProductSpecificationVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains in detail what the product specification is")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).
   **/
  public ProductSpecificationVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * Date and time of the last update
   **/
  public ProductSpecificationVO lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time of the last update")
  @JsonProperty("lastUpdate")
  public Date getLastUpdate() {
    return lastUpdate;
  }

  @JsonProperty("lastUpdate")
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Used to indicate the current lifecycle status
   **/
  public ProductSpecificationVO lifecycleStatus(String lifecycleStatus) {
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
   * Name of the product specification
   **/
  public ProductSpecificationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the product specification")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * An identification number assigned to uniquely identity the specification
   **/
  public ProductSpecificationVO productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  
  @ApiModelProperty(value = "An identification number assigned to uniquely identity the specification")
  @JsonProperty("productNumber")
  public String getProductNumber() {
    return productNumber;
  }

  @JsonProperty("productNumber")
  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  /**
   * Product specification version
   **/
  public ProductSpecificationVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "Product specification version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Complements the description of an element (for instance a product) through video, pictures...
   **/
  public ProductSpecificationVO attachment(List<@Valid AttachmentRefOrValueVO> attachment) {
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

  public ProductSpecificationVO addAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }

    this.attachment.add(attachmentItem);
    return this;
  }

  public ProductSpecificationVO removeAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (attachmentItem != null && this.attachment != null) {
      this.attachment.remove(attachmentItem);
    }

    return this;
  }
  /**
   * A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.
   **/
  public ProductSpecificationVO bundledProductSpecification(List<@Valid BundledProductSpecificationVO> bundledProductSpecification) {
    this.bundledProductSpecification = bundledProductSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.")
  @JsonProperty("bundledProductSpecification")
  @Valid public List<@Valid BundledProductSpecificationVO> getBundledProductSpecification() {
    return bundledProductSpecification;
  }

  @JsonProperty("bundledProductSpecification")
  public void setBundledProductSpecification(List<@Valid BundledProductSpecificationVO> bundledProductSpecification) {
    this.bundledProductSpecification = bundledProductSpecification;
  }

  public ProductSpecificationVO addBundledProductSpecificationItem(BundledProductSpecificationVO bundledProductSpecificationItem) {
    if (this.bundledProductSpecification == null) {
      this.bundledProductSpecification = new ArrayList<>();
    }

    this.bundledProductSpecification.add(bundledProductSpecificationItem);
    return this;
  }

  public ProductSpecificationVO removeBundledProductSpecificationItem(BundledProductSpecificationVO bundledProductSpecificationItem) {
    if (bundledProductSpecificationItem != null && this.bundledProductSpecification != null) {
      this.bundledProductSpecification.remove(bundledProductSpecificationItem);
    }

    return this;
  }
  /**
   * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
   **/
  public ProductSpecificationVO productSpecCharacteristic(List<@Valid ProductSpecificationCharacteristicVO> productSpecCharacteristic) {
    this.productSpecCharacteristic = productSpecCharacteristic;
    return this;
  }

  
  @ApiModelProperty(value = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
  @JsonProperty("productSpecCharacteristic")
  @Valid public List<@Valid ProductSpecificationCharacteristicVO> getProductSpecCharacteristic() {
    return productSpecCharacteristic;
  }

  @JsonProperty("productSpecCharacteristic")
  public void setProductSpecCharacteristic(List<@Valid ProductSpecificationCharacteristicVO> productSpecCharacteristic) {
    this.productSpecCharacteristic = productSpecCharacteristic;
  }

  public ProductSpecificationVO addProductSpecCharacteristicItem(ProductSpecificationCharacteristicVO productSpecCharacteristicItem) {
    if (this.productSpecCharacteristic == null) {
      this.productSpecCharacteristic = new ArrayList<>();
    }

    this.productSpecCharacteristic.add(productSpecCharacteristicItem);
    return this;
  }

  public ProductSpecificationVO removeProductSpecCharacteristicItem(ProductSpecificationCharacteristicVO productSpecCharacteristicItem) {
    if (productSpecCharacteristicItem != null && this.productSpecCharacteristic != null) {
      this.productSpecCharacteristic.remove(productSpecCharacteristicItem);
    }

    return this;
  }
  /**
   * A migration, substitution, dependency or exclusivity relationship between/among product specifications.
   **/
  public ProductSpecificationVO productSpecificationRelationship(List<@Valid ProductSpecificationRelationshipVO> productSpecificationRelationship) {
    this.productSpecificationRelationship = productSpecificationRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "A migration, substitution, dependency or exclusivity relationship between/among product specifications.")
  @JsonProperty("productSpecificationRelationship")
  @Valid public List<@Valid ProductSpecificationRelationshipVO> getProductSpecificationRelationship() {
    return productSpecificationRelationship;
  }

  @JsonProperty("productSpecificationRelationship")
  public void setProductSpecificationRelationship(List<@Valid ProductSpecificationRelationshipVO> productSpecificationRelationship) {
    this.productSpecificationRelationship = productSpecificationRelationship;
  }

  public ProductSpecificationVO addProductSpecificationRelationshipItem(ProductSpecificationRelationshipVO productSpecificationRelationshipItem) {
    if (this.productSpecificationRelationship == null) {
      this.productSpecificationRelationship = new ArrayList<>();
    }

    this.productSpecificationRelationship.add(productSpecificationRelationshipItem);
    return this;
  }

  public ProductSpecificationVO removeProductSpecificationRelationshipItem(ProductSpecificationRelationshipVO productSpecificationRelationshipItem) {
    if (productSpecificationRelationshipItem != null && this.productSpecificationRelationship != null) {
      this.productSpecificationRelationship.remove(productSpecificationRelationshipItem);
    }

    return this;
  }
  /**
   * A related party defines party or party role linked to a specific entity.
   **/
  public ProductSpecificationVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(value = "A related party defines party or party role linked to a specific entity.")
  @JsonProperty("relatedParty")
  @Valid public List<@Valid RelatedPartyVO> getRelatedParty() {
    return relatedParty;
  }

  @JsonProperty("relatedParty")
  public void setRelatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductSpecificationVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ProductSpecificationVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   * The ResourceSpecification is required to realize a ProductSpecification.
   **/
  public ProductSpecificationVO resourceSpecification(List<@Valid ResourceSpecificationRefVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "The ResourceSpecification is required to realize a ProductSpecification.")
  @JsonProperty("resourceSpecification")
  @Valid public List<@Valid ResourceSpecificationRefVO> getResourceSpecification() {
    return resourceSpecification;
  }

  @JsonProperty("resourceSpecification")
  public void setResourceSpecification(List<@Valid ResourceSpecificationRefVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  public ProductSpecificationVO addResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<>();
    }

    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

  public ProductSpecificationVO removeResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (resourceSpecificationItem != null && this.resourceSpecification != null) {
      this.resourceSpecification.remove(resourceSpecificationItem);
    }

    return this;
  }
  /**
   * ServiceSpecification(s) required to realize a ProductSpecification.
   **/
  public ProductSpecificationVO serviceSpecification(List<@Valid ServiceSpecificationRefVO> serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "ServiceSpecification(s) required to realize a ProductSpecification.")
  @JsonProperty("serviceSpecification")
  @Valid public List<@Valid ServiceSpecificationRefVO> getServiceSpecification() {
    return serviceSpecification;
  }

  @JsonProperty("serviceSpecification")
  public void setServiceSpecification(List<@Valid ServiceSpecificationRefVO> serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  public ProductSpecificationVO addServiceSpecificationItem(ServiceSpecificationRefVO serviceSpecificationItem) {
    if (this.serviceSpecification == null) {
      this.serviceSpecification = new ArrayList<>();
    }

    this.serviceSpecification.add(serviceSpecificationItem);
    return this;
  }

  public ProductSpecificationVO removeServiceSpecificationItem(ServiceSpecificationRefVO serviceSpecificationItem) {
    if (serviceSpecificationItem != null && this.serviceSpecification != null) {
      this.serviceSpecification.remove(serviceSpecificationItem);
    }

    return this;
  }
  /**
   **/
  public ProductSpecificationVO targetProductSchema(TargetProductSchemaVO targetProductSchema) {
    this.targetProductSchema = targetProductSchema;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targetProductSchema")
  @Valid public TargetProductSchemaVO getTargetProductSchema() {
    return targetProductSchema;
  }

  @JsonProperty("targetProductSchema")
  public void setTargetProductSchema(TargetProductSchemaVO targetProductSchema) {
    this.targetProductSchema = targetProductSchema;
  }

  /**
   **/
  public ProductSpecificationVO validFor(TimePeriodVO validFor) {
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
  public ProductSpecificationVO atBaseType(String atBaseType) {
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
  public ProductSpecificationVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductSpecificationVO atType(String atType) {
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
    ProductSpecificationVO productSpecification = (ProductSpecificationVO) o;
    return Objects.equals(this.id, productSpecification.id) &&
        Objects.equals(this.href, productSpecification.href) &&
        Objects.equals(this.brand, productSpecification.brand) &&
        Objects.equals(this.description, productSpecification.description) &&
        Objects.equals(this.isBundle, productSpecification.isBundle) &&
        Objects.equals(this.lastUpdate, productSpecification.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productSpecification.lifecycleStatus) &&
        Objects.equals(this.name, productSpecification.name) &&
        Objects.equals(this.productNumber, productSpecification.productNumber) &&
        Objects.equals(this.version, productSpecification.version) &&
        Objects.equals(this.attachment, productSpecification.attachment) &&
        Objects.equals(this.bundledProductSpecification, productSpecification.bundledProductSpecification) &&
        Objects.equals(this.productSpecCharacteristic, productSpecification.productSpecCharacteristic) &&
        Objects.equals(this.productSpecificationRelationship, productSpecification.productSpecificationRelationship) &&
        Objects.equals(this.relatedParty, productSpecification.relatedParty) &&
        Objects.equals(this.resourceSpecification, productSpecification.resourceSpecification) &&
        Objects.equals(this.serviceSpecification, productSpecification.serviceSpecification) &&
        Objects.equals(this.targetProductSchema, productSpecification.targetProductSchema) &&
        Objects.equals(this.validFor, productSpecification.validFor) &&
        Objects.equals(this.atBaseType, productSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, brand, description, isBundle, lastUpdate, lifecycleStatus, name, productNumber, version, attachment, bundledProductSpecification, productSpecCharacteristic, productSpecificationRelationship, relatedParty, resourceSpecification, serviceSpecification, targetProductSchema, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductSpecification: ").append(toIndentedString(bundledProductSpecification)).append("\n");
    sb.append("    productSpecCharacteristic: ").append(toIndentedString(productSpecCharacteristic)).append("\n");
    sb.append("    productSpecificationRelationship: ").append(toIndentedString(productSpecificationRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    targetProductSchema: ").append(toIndentedString(targetProductSchema)).append("\n");
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

