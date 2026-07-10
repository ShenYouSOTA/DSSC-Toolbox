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
import org.fiware.dataspace.tmf.model.CharacteristicSpecificationVO;
import org.fiware.dataspace.tmf.model.ConstraintRefVO;
import org.fiware.dataspace.tmf.model.EntitySpecificationRelationshipVO;
import org.fiware.dataspace.tmf.model.FeatureSpecificationVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import org.fiware.dataspace.tmf.model.ResourceSpecificationRefVO;
import org.fiware.dataspace.tmf.model.ServiceLevelSpecificationRefVO;
import org.fiware.dataspace.tmf.model.ServiceSpecRelationshipVO;
import org.fiware.dataspace.tmf.model.TargetEntitySchemaVO;
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
 * ServiceSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same specification, these services would therefore share the same set of characteristics.
 **/
@ApiModel(description = "ServiceSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same specification, these services would therefore share the same set of characteristics.")
@JsonTypeName("ServiceSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceSpecificationVO   {
  private String id;
  private URI href;
  private String description;
  private Boolean isBundle;
  private Date lastUpdate;
  private String lifecycleStatus;
  private String name;
  private String version;
  private @Valid List<@Valid AttachmentRefOrValueVO> attachment = new ArrayList<>();
  private @Valid List<@Valid ConstraintRefVO> constraint = new ArrayList<>();
  private @Valid List<@Valid EntitySpecificationRelationshipVO> entitySpecRelationship = new ArrayList<>();
  private @Valid List<@Valid FeatureSpecificationVO> featureSpecification = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private @Valid List<@Valid ResourceSpecificationRefVO> resourceSpecification = new ArrayList<>();
  private @Valid List<@Valid ServiceLevelSpecificationRefVO> serviceLevelSpecification = new ArrayList<>();
  private @Valid List<@Valid ServiceSpecRelationshipVO> serviceSpecRelationship = new ArrayList<>();
  private @Valid List<@Valid CharacteristicSpecificationVO> specCharacteristic = new ArrayList<>();
  private TargetEntitySchemaVO targetEntitySchema;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * unique identifier
   **/
  public ServiceSpecificationVO id(String id) {
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
  public ServiceSpecificationVO href(URI href) {
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
   * Description of the specification
   **/
  public ServiceSpecificationVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the specification")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * isBundle determines whether specification represents a single specification (false), or a bundle of specifications (true).
   **/
  public ServiceSpecificationVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  
  @ApiModelProperty(value = "isBundle determines whether specification represents a single specification (false), or a bundle of specifications (true).")
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  @JsonProperty("isBundle")
  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  /**
   * Date and time of the last update of the specification
   **/
  public ServiceSpecificationVO lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time of the last update of the specification")
  @JsonProperty("lastUpdate")
  public Date getLastUpdate() {
    return lastUpdate;
  }

  @JsonProperty("lastUpdate")
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Used to indicate the current lifecycle status of this catalog item
   **/
  public ServiceSpecificationVO lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Used to indicate the current lifecycle status of this catalog item")
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  @JsonProperty("lifecycleStatus")
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * Name given to the specification
   **/
  public ServiceSpecificationVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name given to the specification")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * specification version
   **/
  public ServiceSpecificationVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "specification version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Attachments that may be of relevance to this specification, such as picture, document, media
   **/
  public ServiceSpecificationVO attachment(List<@Valid AttachmentRefOrValueVO> attachment) {
    this.attachment = attachment;
    return this;
  }

  
  @ApiModelProperty(value = "Attachments that may be of relevance to this specification, such as picture, document, media")
  @JsonProperty("attachment")
  @Valid public List<@Valid AttachmentRefOrValueVO> getAttachment() {
    return attachment;
  }

  @JsonProperty("attachment")
  public void setAttachment(List<@Valid AttachmentRefOrValueVO> attachment) {
    this.attachment = attachment;
  }

  public ServiceSpecificationVO addAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }

    this.attachment.add(attachmentItem);
    return this;
  }

  public ServiceSpecificationVO removeAttachmentItem(AttachmentRefOrValueVO attachmentItem) {
    if (attachmentItem != null && this.attachment != null) {
      this.attachment.remove(attachmentItem);
    }

    return this;
  }
  /**
   * This is a list of constraint references applied to this specification
   **/
  public ServiceSpecificationVO constraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
    return this;
  }

  
  @ApiModelProperty(value = "This is a list of constraint references applied to this specification")
  @JsonProperty("constraint")
  @Valid public List<@Valid ConstraintRefVO> getConstraint() {
    return constraint;
  }

  @JsonProperty("constraint")
  public void setConstraint(List<@Valid ConstraintRefVO> constraint) {
    this.constraint = constraint;
  }

  public ServiceSpecificationVO addConstraintItem(ConstraintRefVO constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }

    this.constraint.add(constraintItem);
    return this;
  }

  public ServiceSpecificationVO removeConstraintItem(ConstraintRefVO constraintItem) {
    if (constraintItem != null && this.constraint != null) {
      this.constraint.remove(constraintItem);
    }

    return this;
  }
  /**
   * Relationship to another specification
   **/
  public ServiceSpecificationVO entitySpecRelationship(List<@Valid EntitySpecificationRelationshipVO> entitySpecRelationship) {
    this.entitySpecRelationship = entitySpecRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "Relationship to another specification")
  @JsonProperty("entitySpecRelationship")
  @Valid public List<@Valid EntitySpecificationRelationshipVO> getEntitySpecRelationship() {
    return entitySpecRelationship;
  }

  @JsonProperty("entitySpecRelationship")
  public void setEntitySpecRelationship(List<@Valid EntitySpecificationRelationshipVO> entitySpecRelationship) {
    this.entitySpecRelationship = entitySpecRelationship;
  }

  public ServiceSpecificationVO addEntitySpecRelationshipItem(EntitySpecificationRelationshipVO entitySpecRelationshipItem) {
    if (this.entitySpecRelationship == null) {
      this.entitySpecRelationship = new ArrayList<>();
    }

    this.entitySpecRelationship.add(entitySpecRelationshipItem);
    return this;
  }

  public ServiceSpecificationVO removeEntitySpecRelationshipItem(EntitySpecificationRelationshipVO entitySpecRelationshipItem) {
    if (entitySpecRelationshipItem != null && this.entitySpecRelationship != null) {
      this.entitySpecRelationship.remove(entitySpecRelationshipItem);
    }

    return this;
  }
  /**
   * A list of Features for this specification.
   **/
  public ServiceSpecificationVO featureSpecification(List<@Valid FeatureSpecificationVO> featureSpecification) {
    this.featureSpecification = featureSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "A list of Features for this specification.")
  @JsonProperty("featureSpecification")
  @Valid public List<@Valid FeatureSpecificationVO> getFeatureSpecification() {
    return featureSpecification;
  }

  @JsonProperty("featureSpecification")
  public void setFeatureSpecification(List<@Valid FeatureSpecificationVO> featureSpecification) {
    this.featureSpecification = featureSpecification;
  }

  public ServiceSpecificationVO addFeatureSpecificationItem(FeatureSpecificationVO featureSpecificationItem) {
    if (this.featureSpecification == null) {
      this.featureSpecification = new ArrayList<>();
    }

    this.featureSpecification.add(featureSpecificationItem);
    return this;
  }

  public ServiceSpecificationVO removeFeatureSpecificationItem(FeatureSpecificationVO featureSpecificationItem) {
    if (featureSpecificationItem != null && this.featureSpecification != null) {
      this.featureSpecification.remove(featureSpecificationItem);
    }

    return this;
  }
  /**
   * Parties who manage or otherwise have an interest in this specification
   **/
  public ServiceSpecificationVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(value = "Parties who manage or otherwise have an interest in this specification")
  @JsonProperty("relatedParty")
  @Valid public List<@Valid RelatedPartyVO> getRelatedParty() {
    return relatedParty;
  }

  @JsonProperty("relatedParty")
  public void setRelatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceSpecificationVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ServiceSpecificationVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   * A list of resource specification references (ResourceSpecificationRef [*]). The ResourceSpecification is required for a service specification with type ResourceFacingServiceSpecification (RFSS).
   **/
  public ServiceSpecificationVO resourceSpecification(List<@Valid ResourceSpecificationRefVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "A list of resource specification references (ResourceSpecificationRef [*]). The ResourceSpecification is required for a service specification with type ResourceFacingServiceSpecification (RFSS).")
  @JsonProperty("resourceSpecification")
  @Valid public List<@Valid ResourceSpecificationRefVO> getResourceSpecification() {
    return resourceSpecification;
  }

  @JsonProperty("resourceSpecification")
  public void setResourceSpecification(List<@Valid ResourceSpecificationRefVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  public ServiceSpecificationVO addResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<>();
    }

    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

  public ServiceSpecificationVO removeResourceSpecificationItem(ResourceSpecificationRefVO resourceSpecificationItem) {
    if (resourceSpecificationItem != null && this.resourceSpecification != null) {
      this.resourceSpecification.remove(resourceSpecificationItem);
    }

    return this;
  }
  /**
   * A list of service level specifications related to this service specification, and which will need to be satisifiable for corresponding service instances; e.g. Gold, Platinum
   **/
  public ServiceSpecificationVO serviceLevelSpecification(List<@Valid ServiceLevelSpecificationRefVO> serviceLevelSpecification) {
    this.serviceLevelSpecification = serviceLevelSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "A list of service level specifications related to this service specification, and which will need to be satisifiable for corresponding service instances; e.g. Gold, Platinum")
  @JsonProperty("serviceLevelSpecification")
  @Valid public List<@Valid ServiceLevelSpecificationRefVO> getServiceLevelSpecification() {
    return serviceLevelSpecification;
  }

  @JsonProperty("serviceLevelSpecification")
  public void setServiceLevelSpecification(List<@Valid ServiceLevelSpecificationRefVO> serviceLevelSpecification) {
    this.serviceLevelSpecification = serviceLevelSpecification;
  }

  public ServiceSpecificationVO addServiceLevelSpecificationItem(ServiceLevelSpecificationRefVO serviceLevelSpecificationItem) {
    if (this.serviceLevelSpecification == null) {
      this.serviceLevelSpecification = new ArrayList<>();
    }

    this.serviceLevelSpecification.add(serviceLevelSpecificationItem);
    return this;
  }

  public ServiceSpecificationVO removeServiceLevelSpecificationItem(ServiceLevelSpecificationRefVO serviceLevelSpecificationItem) {
    if (serviceLevelSpecificationItem != null && this.serviceLevelSpecification != null) {
      this.serviceLevelSpecification.remove(serviceLevelSpecificationItem);
    }

    return this;
  }
  /**
   * A list of service specifications related to this specification, e.g. migration, substitution, dependency or exclusivity relationship
   **/
  public ServiceSpecificationVO serviceSpecRelationship(List<@Valid ServiceSpecRelationshipVO> serviceSpecRelationship) {
    this.serviceSpecRelationship = serviceSpecRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "A list of service specifications related to this specification, e.g. migration, substitution, dependency or exclusivity relationship")
  @JsonProperty("serviceSpecRelationship")
  @Valid public List<@Valid ServiceSpecRelationshipVO> getServiceSpecRelationship() {
    return serviceSpecRelationship;
  }

  @JsonProperty("serviceSpecRelationship")
  public void setServiceSpecRelationship(List<@Valid ServiceSpecRelationshipVO> serviceSpecRelationship) {
    this.serviceSpecRelationship = serviceSpecRelationship;
  }

  public ServiceSpecificationVO addServiceSpecRelationshipItem(ServiceSpecRelationshipVO serviceSpecRelationshipItem) {
    if (this.serviceSpecRelationship == null) {
      this.serviceSpecRelationship = new ArrayList<>();
    }

    this.serviceSpecRelationship.add(serviceSpecRelationshipItem);
    return this;
  }

  public ServiceSpecificationVO removeServiceSpecRelationshipItem(ServiceSpecRelationshipVO serviceSpecRelationshipItem) {
    if (serviceSpecRelationshipItem != null && this.serviceSpecRelationship != null) {
      this.serviceSpecRelationship.remove(serviceSpecRelationshipItem);
    }

    return this;
  }
  /**
   * List of characteristics that the entity can take
   **/
  public ServiceSpecificationVO specCharacteristic(List<@Valid CharacteristicSpecificationVO> specCharacteristic) {
    this.specCharacteristic = specCharacteristic;
    return this;
  }

  
  @ApiModelProperty(value = "List of characteristics that the entity can take")
  @JsonProperty("specCharacteristic")
  @Valid public List<@Valid CharacteristicSpecificationVO> getSpecCharacteristic() {
    return specCharacteristic;
  }

  @JsonProperty("specCharacteristic")
  public void setSpecCharacteristic(List<@Valid CharacteristicSpecificationVO> specCharacteristic) {
    this.specCharacteristic = specCharacteristic;
  }

  public ServiceSpecificationVO addSpecCharacteristicItem(CharacteristicSpecificationVO specCharacteristicItem) {
    if (this.specCharacteristic == null) {
      this.specCharacteristic = new ArrayList<>();
    }

    this.specCharacteristic.add(specCharacteristicItem);
    return this;
  }

  public ServiceSpecificationVO removeSpecCharacteristicItem(CharacteristicSpecificationVO specCharacteristicItem) {
    if (specCharacteristicItem != null && this.specCharacteristic != null) {
      this.specCharacteristic.remove(specCharacteristicItem);
    }

    return this;
  }
  /**
   **/
  public ServiceSpecificationVO targetEntitySchema(TargetEntitySchemaVO targetEntitySchema) {
    this.targetEntitySchema = targetEntitySchema;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targetEntitySchema")
  @Valid public TargetEntitySchemaVO getTargetEntitySchema() {
    return targetEntitySchema;
  }

  @JsonProperty("targetEntitySchema")
  public void setTargetEntitySchema(TargetEntitySchemaVO targetEntitySchema) {
    this.targetEntitySchema = targetEntitySchema;
  }

  /**
   **/
  public ServiceSpecificationVO validFor(TimePeriodVO validFor) {
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
  public ServiceSpecificationVO atBaseType(String atBaseType) {
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
  public ServiceSpecificationVO atSchemaLocation(URI atSchemaLocation) {
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
  public ServiceSpecificationVO atType(String atType) {
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
    ServiceSpecificationVO serviceSpecification = (ServiceSpecificationVO) o;
    return Objects.equals(this.id, serviceSpecification.id) &&
        Objects.equals(this.href, serviceSpecification.href) &&
        Objects.equals(this.description, serviceSpecification.description) &&
        Objects.equals(this.isBundle, serviceSpecification.isBundle) &&
        Objects.equals(this.lastUpdate, serviceSpecification.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, serviceSpecification.lifecycleStatus) &&
        Objects.equals(this.name, serviceSpecification.name) &&
        Objects.equals(this.version, serviceSpecification.version) &&
        Objects.equals(this.attachment, serviceSpecification.attachment) &&
        Objects.equals(this.constraint, serviceSpecification.constraint) &&
        Objects.equals(this.entitySpecRelationship, serviceSpecification.entitySpecRelationship) &&
        Objects.equals(this.featureSpecification, serviceSpecification.featureSpecification) &&
        Objects.equals(this.relatedParty, serviceSpecification.relatedParty) &&
        Objects.equals(this.resourceSpecification, serviceSpecification.resourceSpecification) &&
        Objects.equals(this.serviceLevelSpecification, serviceSpecification.serviceLevelSpecification) &&
        Objects.equals(this.serviceSpecRelationship, serviceSpecification.serviceSpecRelationship) &&
        Objects.equals(this.specCharacteristic, serviceSpecification.specCharacteristic) &&
        Objects.equals(this.targetEntitySchema, serviceSpecification.targetEntitySchema) &&
        Objects.equals(this.validFor, serviceSpecification.validFor) &&
        Objects.equals(this.atBaseType, serviceSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, serviceSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, lastUpdate, lifecycleStatus, name, version, attachment, constraint, entitySpecRelationship, featureSpecification, relatedParty, resourceSpecification, serviceLevelSpecification, serviceSpecRelationship, specCharacteristic, targetEntitySchema, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificationVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    entitySpecRelationship: ").append(toIndentedString(entitySpecRelationship)).append("\n");
    sb.append("    featureSpecification: ").append(toIndentedString(featureSpecification)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    serviceLevelSpecification: ").append(toIndentedString(serviceLevelSpecification)).append("\n");
    sb.append("    serviceSpecRelationship: ").append(toIndentedString(serviceSpecRelationship)).append("\n");
    sb.append("    specCharacteristic: ").append(toIndentedString(specCharacteristic)).append("\n");
    sb.append("    targetEntitySchema: ").append(toIndentedString(targetEntitySchema)).append("\n");
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

