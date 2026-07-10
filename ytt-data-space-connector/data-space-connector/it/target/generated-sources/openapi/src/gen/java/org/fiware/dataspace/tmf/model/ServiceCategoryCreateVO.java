package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.ServiceCandidateRefVO;
import org.fiware.dataspace.tmf.model.ServiceCategoryRefVO;
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
 * The (service) category resource is used to group service candidates in logical containers. Categories can contain other categories. Skipped properties: id,href
 **/
@ApiModel(description = "The (service) category resource is used to group service candidates in logical containers. Categories can contain other categories. Skipped properties: id,href")
@JsonTypeName("ServiceCategory_Create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceCategoryCreateVO   {
  private String description;
  private Boolean isRoot;
  private Date lastUpdate;
  private String lifecycleStatus;
  private String name;
  private String parentId;
  private String version;
  private @Valid List<@Valid ServiceCategoryRefVO> category = new ArrayList<>();
  private @Valid List<@Valid ServiceCandidateRefVO> serviceCandidate = new ArrayList<>();
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Description of the category
   **/
  public ServiceCategoryCreateVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the category")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   **/
  public ServiceCategoryCreateVO isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  
  @ApiModelProperty(value = "If true, this Boolean indicates that the category is a root of categories")
  @JsonProperty("isRoot")
  public Boolean getIsRoot() {
    return isRoot;
  }

  @JsonProperty("isRoot")
  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  /**
   * Date and time of the last update
   **/
  public ServiceCategoryCreateVO lastUpdate(Date lastUpdate) {
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
  public ServiceCategoryCreateVO lifecycleStatus(String lifecycleStatus) {
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
   * Name of the category
   **/
  public ServiceCategoryCreateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the category")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Unique identifier of the parent category
   **/
  public ServiceCategoryCreateVO parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the parent category")
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * ServiceCategory version
   **/
  public ServiceCategoryCreateVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "ServiceCategory version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * List of child categories in the tree for in this category
   **/
  public ServiceCategoryCreateVO category(List<@Valid ServiceCategoryRefVO> category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "List of child categories in the tree for in this category")
  @JsonProperty("category")
  @Valid public List<@Valid ServiceCategoryRefVO> getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(List<@Valid ServiceCategoryRefVO> category) {
    this.category = category;
  }

  public ServiceCategoryCreateVO addCategoryItem(ServiceCategoryRefVO categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }

    this.category.add(categoryItem);
    return this;
  }

  public ServiceCategoryCreateVO removeCategoryItem(ServiceCategoryRefVO categoryItem) {
    if (categoryItem != null && this.category != null) {
      this.category.remove(categoryItem);
    }

    return this;
  }
  /**
   * List of service candidates associated with this category
   **/
  public ServiceCategoryCreateVO serviceCandidate(List<@Valid ServiceCandidateRefVO> serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  
  @ApiModelProperty(value = "List of service candidates associated with this category")
  @JsonProperty("serviceCandidate")
  @Valid public List<@Valid ServiceCandidateRefVO> getServiceCandidate() {
    return serviceCandidate;
  }

  @JsonProperty("serviceCandidate")
  public void setServiceCandidate(List<@Valid ServiceCandidateRefVO> serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }

  public ServiceCategoryCreateVO addServiceCandidateItem(ServiceCandidateRefVO serviceCandidateItem) {
    if (this.serviceCandidate == null) {
      this.serviceCandidate = new ArrayList<>();
    }

    this.serviceCandidate.add(serviceCandidateItem);
    return this;
  }

  public ServiceCategoryCreateVO removeServiceCandidateItem(ServiceCandidateRefVO serviceCandidateItem) {
    if (serviceCandidateItem != null && this.serviceCandidate != null) {
      this.serviceCandidate.remove(serviceCandidateItem);
    }

    return this;
  }
  /**
   **/
  public ServiceCategoryCreateVO validFor(TimePeriodVO validFor) {
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
  public ServiceCategoryCreateVO atBaseType(String atBaseType) {
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
  public ServiceCategoryCreateVO atSchemaLocation(URI atSchemaLocation) {
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
  public ServiceCategoryCreateVO atType(String atType) {
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
    ServiceCategoryCreateVO serviceCategoryCreate = (ServiceCategoryCreateVO) o;
    return Objects.equals(this.description, serviceCategoryCreate.description) &&
        Objects.equals(this.isRoot, serviceCategoryCreate.isRoot) &&
        Objects.equals(this.lastUpdate, serviceCategoryCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, serviceCategoryCreate.lifecycleStatus) &&
        Objects.equals(this.name, serviceCategoryCreate.name) &&
        Objects.equals(this.parentId, serviceCategoryCreate.parentId) &&
        Objects.equals(this.version, serviceCategoryCreate.version) &&
        Objects.equals(this.category, serviceCategoryCreate.category) &&
        Objects.equals(this.serviceCandidate, serviceCategoryCreate.serviceCandidate) &&
        Objects.equals(this.validFor, serviceCategoryCreate.validFor) &&
        Objects.equals(this.atBaseType, serviceCategoryCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceCategoryCreate.atSchemaLocation) &&
        Objects.equals(this.atType, serviceCategoryCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isRoot, lastUpdate, lifecycleStatus, name, parentId, version, category, serviceCandidate, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCategoryCreateVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
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

