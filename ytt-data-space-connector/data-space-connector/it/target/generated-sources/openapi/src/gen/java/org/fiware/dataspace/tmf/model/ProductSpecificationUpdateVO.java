package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
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
 * Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,lastUpdate,@type,@baseType
 **/
@ApiModel(description = "Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,lastUpdate,@type,@baseType")
@JsonTypeName("ProductSpecification_Update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductSpecificationUpdateVO   {
  private String brand;
  private String description;
  private Boolean isBundle;
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
  private URI atSchemaLocation;

  /**
   * The manufacturer or trademark of the specification
   **/
  public ProductSpecificationUpdateVO brand(String brand) {
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
  public ProductSpecificationUpdateVO description(String description) {
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
  public ProductSpecificationUpdateVO isBundle(Boolean isBundle) {
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
   * Used to indicate the current lifecycle status
   **/
  public ProductSpecificationUpdateVO lifecycleStatus(String lifecycleStatus) {
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
  public ProductSpecificationUpdateVO name(String name) {
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
  public ProductSpecificationUpdateVO productNumber(String productNumber) {
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
  public ProductSpecificationUpdateVO version(String version) {
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
  public ProductSpecificationUpdateVO attachment(List<@Valid AttachmentRefOrValueVO> attachment) {
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

  public ProductSpecificationUpdateVO addAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }

    this.attachment.add(attachmentItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (attachmentItem != null && this.attachment != null) {
      this.attachment.remove(attachmentItem);
    }

    return this;
  }
  /**
   * A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.
   **/
  public ProductSpecificationUpdateVO bundledProductSpecification(List<@Valid BundledProductSpecificationVO> bundledProductSpecification) {
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

  public ProductSpecificationUpdateVO addBundledProductSpecificationItem(BundledProductSpecificationVO bundledProductSpecificationItem) {
    if (this.bundledProductSpecification == null) {
      this.bundledProductSpecification = new ArrayList<>();
    }

    this.bundledProductSpecification.add(bundledProductSpecificationItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeBundledProductSpecificationItem(BundledProductSpecificationVO bundledProductSpecificationItem) {
    if (bundledProductSpecificationItem != null && this.bundledProductSpecification != null) {
      this.bundledProductSpecification.remove(bundledProductSpecificationItem);
    }

    return this;
  }
  /**
   * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
   **/
  public ProductSpecificationUpdateVO productSpecCharacteristic(List<@Valid ProductSpecificationCharacteristicVO> productSpecCharacteristic) {
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

  public ProductSpecificationUpdateVO addProductSpecCharacteristicItem(ProductSpecificationCharacteristicVO productSpecCharacteristicItem) {
    if (this.productSpecCharacteristic == null) {
      this.productSpecCharacteristic = new ArrayList<>();
    }

    this.productSpecCharacteristic.add(productSpecCharacteristicItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeProductSpecCharacteristicItem(ProductSpecificationCharacteristicVO productSpecCharacteristicItem) {
    if (productSpecCharacteristicItem != null && this.productSpecCharacteristic != null) {
      this.productSpecCharacteristic.remove(productSpecCharacteristicItem);
    }

    return this;
  }
  /**
   * A migration, substitution, dependency or exclusivity relationship between/among product specifications.
   **/
  public ProductSpecificationUpdateVO productSpecificationRelationship(List<@Valid ProductSpecificationRelationshipVO> productSpecificationRelationship) {
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

  public ProductSpecificationUpdateVO addProductSpecificationRelationshipItem(ProductSpecificationRelationshipVO productSpecificationRelationshipItem) {
    if (this.productSpecificationRelationship == null) {
      this.productSpecificationRelationship = new ArrayList<>();
    }

    this.productSpecificationRelationship.add(productSpecificationRelationshipItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeProductSpecificationRelationshipItem(ProductSpecificationRelationshipVO productSpecificationRelationshipItem) {
    if (productSpecificationRelationshipItem != null && this.productSpecificationRelationship != null) {
      this.productSpecificationRelationship.remove(productSpecificationRelationshipItem);
    }

    return this;
  }
  /**
   * A related party defines party or party role linked to a specific entity.
   **/
  public ProductSpecificationUpdateVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
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

  public ProductSpecificationUpdateVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   * The ResourceSpecification is required to realize a ProductSpecification.
   **/
  public ProductSpecificationUpdateVO resourceSpecification(List<@Valid ResourceSpecificationRefVO> resourceSpecification) {
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

  public ProductSpecificationUpdateVO addResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<>();
    }

    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (resourceSpecificationItem != null && this.resourceSpecification != null) {
      this.resourceSpecification.remove(resourceSpecificationItem);
    }

    return this;
  }
  /**
   * ServiceSpecification(s) required to realize a ProductSpecification.
   **/
  public ProductSpecificationUpdateVO serviceSpecification(List<@Valid ServiceSpecificationRefVO> serviceSpecification) {
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

  public ProductSpecificationUpdateVO addServiceSpecificationItem(ServiceSpecificationRefVO serviceSpecificationItem) {
    if (this.serviceSpecification == null) {
      this.serviceSpecification = new ArrayList<>();
    }

    this.serviceSpecification.add(serviceSpecificationItem);
    return this;
  }

  public ProductSpecificationUpdateVO removeServiceSpecificationItem(ServiceSpecificationRefVO serviceSpecificationItem) {
    if (serviceSpecificationItem != null && this.serviceSpecification != null) {
      this.serviceSpecification.remove(serviceSpecificationItem);
    }

    return this;
  }
  /**
   **/
  public ProductSpecificationUpdateVO targetProductSchema(TargetProductSchemaVO targetProductSchema) {
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
  public ProductSpecificationUpdateVO validFor(TimePeriodVO validFor) {
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
  public ProductSpecificationUpdateVO atSchemaLocation(URI atSchemaLocation) {
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
    ProductSpecificationUpdateVO productSpecificationUpdate = (ProductSpecificationUpdateVO) o;
    return Objects.equals(this.brand, productSpecificationUpdate.brand) &&
        Objects.equals(this.description, productSpecificationUpdate.description) &&
        Objects.equals(this.isBundle, productSpecificationUpdate.isBundle) &&
        Objects.equals(this.lifecycleStatus, productSpecificationUpdate.lifecycleStatus) &&
        Objects.equals(this.name, productSpecificationUpdate.name) &&
        Objects.equals(this.productNumber, productSpecificationUpdate.productNumber) &&
        Objects.equals(this.version, productSpecificationUpdate.version) &&
        Objects.equals(this.attachment, productSpecificationUpdate.attachment) &&
        Objects.equals(this.bundledProductSpecification, productSpecificationUpdate.bundledProductSpecification) &&
        Objects.equals(this.productSpecCharacteristic, productSpecificationUpdate.productSpecCharacteristic) &&
        Objects.equals(this.productSpecificationRelationship, productSpecificationUpdate.productSpecificationRelationship) &&
        Objects.equals(this.relatedParty, productSpecificationUpdate.relatedParty) &&
        Objects.equals(this.resourceSpecification, productSpecificationUpdate.resourceSpecification) &&
        Objects.equals(this.serviceSpecification, productSpecificationUpdate.serviceSpecification) &&
        Objects.equals(this.targetProductSchema, productSpecificationUpdate.targetProductSchema) &&
        Objects.equals(this.validFor, productSpecificationUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, productSpecificationUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, description, isBundle, lifecycleStatus, name, productNumber, version, attachment, bundledProductSpecification, productSpecCharacteristic, productSpecificationRelationship, relatedParty, resourceSpecification, serviceSpecification, targetProductSchema, validFor, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationUpdateVO {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
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

