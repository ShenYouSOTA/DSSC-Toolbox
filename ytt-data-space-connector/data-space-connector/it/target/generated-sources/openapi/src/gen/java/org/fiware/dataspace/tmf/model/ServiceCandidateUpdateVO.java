package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.ServiceCategoryRefVO;
import org.fiware.dataspace.tmf.model.ServiceSpecificationRefVO;
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
 * ServiceCandidate is an entity that makes a service specification available to a catalog. A ServiceCandidate and its associated service specification may be published - made visible - in any number of service catalogs, or in none. One service specification can be composed of other service specifications. Skipped properties: id,href,lastUpdate
 **/
@ApiModel(description = "ServiceCandidate is an entity that makes a service specification available to a catalog. A ServiceCandidate and its associated service specification may be published - made visible - in any number of service catalogs, or in none. One service specification can be composed of other service specifications. Skipped properties: id,href,lastUpdate")
@JsonTypeName("ServiceCandidate_Update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceCandidateUpdateVO   {
  private String description;
  private String lifecycleStatus;
  private String name;
  private String version;
  private @Valid List<@Valid ServiceCategoryRefVO> category = new ArrayList<>();
  private ServiceSpecificationRefVO serviceSpecification;
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Description of this REST resource
   **/
  public ServiceCandidateUpdateVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of this REST resource")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Used to indicate the current lifecycle status of the service candidate.
   **/
  public ServiceCandidateUpdateVO lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Used to indicate the current lifecycle status of the service candidate.")
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  @JsonProperty("lifecycleStatus")
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * Name given to this REST resource
   **/
  public ServiceCandidateUpdateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name given to this REST resource")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * the version of service candidate
   **/
  public ServiceCandidateUpdateVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "the version of service candidate")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * List of categories for this candidate
   **/
  public ServiceCandidateUpdateVO category(List<@Valid ServiceCategoryRefVO> category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "List of categories for this candidate")
  @JsonProperty("category")
  @Valid public List<@Valid ServiceCategoryRefVO> getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(List<@Valid ServiceCategoryRefVO> category) {
    this.category = category;
  }

  public ServiceCandidateUpdateVO addCategoryItem(ServiceCategoryRefVO categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }

    this.category.add(categoryItem);
    return this;
  }

  public ServiceCandidateUpdateVO removeCategoryItem(ServiceCategoryRefVO categoryItem) {
    if (categoryItem != null && this.category != null) {
      this.category.remove(categoryItem);
    }

    return this;
  }
  /**
   **/
  public ServiceCandidateUpdateVO serviceSpecification(ServiceSpecificationRefVO serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceSpecification")
  @Valid public ServiceSpecificationRefVO getServiceSpecification() {
    return serviceSpecification;
  }

  @JsonProperty("serviceSpecification")
  public void setServiceSpecification(ServiceSpecificationRefVO serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  /**
   **/
  public ServiceCandidateUpdateVO validFor(TimePeriodVO validFor) {
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
  public ServiceCandidateUpdateVO atBaseType(String atBaseType) {
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
  public ServiceCandidateUpdateVO atSchemaLocation(URI atSchemaLocation) {
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
  public ServiceCandidateUpdateVO atType(String atType) {
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
    ServiceCandidateUpdateVO serviceCandidateUpdate = (ServiceCandidateUpdateVO) o;
    return Objects.equals(this.description, serviceCandidateUpdate.description) &&
        Objects.equals(this.lifecycleStatus, serviceCandidateUpdate.lifecycleStatus) &&
        Objects.equals(this.name, serviceCandidateUpdate.name) &&
        Objects.equals(this.version, serviceCandidateUpdate.version) &&
        Objects.equals(this.category, serviceCandidateUpdate.category) &&
        Objects.equals(this.serviceSpecification, serviceCandidateUpdate.serviceSpecification) &&
        Objects.equals(this.validFor, serviceCandidateUpdate.validFor) &&
        Objects.equals(this.atBaseType, serviceCandidateUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceCandidateUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, serviceCandidateUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lifecycleStatus, name, version, category, serviceSpecification, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCandidateUpdateVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
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

