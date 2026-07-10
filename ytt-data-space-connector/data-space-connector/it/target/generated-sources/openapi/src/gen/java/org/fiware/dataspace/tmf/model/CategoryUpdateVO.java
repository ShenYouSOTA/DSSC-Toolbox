package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.CategoryRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingRefVO;
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
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate,@type,@baseType
 **/
@ApiModel(description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate,@type,@baseType")
@JsonTypeName("Category_Update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CategoryUpdateVO   {
  private String description;
  private Boolean isRoot;
  private String lifecycleStatus;
  private String name;
  private String parentId;
  private String version;
  private @Valid List<@Valid ProductOfferingRefVO> productOffering = new ArrayList<>();
  private @Valid List<@Valid CategoryRefVO> subCategory = new ArrayList<>();
  private TimePeriodVO validFor;
  private URI atSchemaLocation;

  /**
   * Description of the category
   **/
  public CategoryUpdateVO description(String description) {
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
  public CategoryUpdateVO isRoot(Boolean isRoot) {
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
   * Used to indicate the current lifecycle status
   **/
  public CategoryUpdateVO lifecycleStatus(String lifecycleStatus) {
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
  public CategoryUpdateVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the category")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Unique identifier of the parent category
   **/
  public CategoryUpdateVO parentId(String parentId) {
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
   * Category version
   **/
  public CategoryUpdateVO version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "Category version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
   **/
  public CategoryUpdateVO productOffering(List<@Valid ProductOfferingRefVO> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  
  @ApiModelProperty(value = "A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.")
  @JsonProperty("productOffering")
  @Valid public List<@Valid ProductOfferingRefVO> getProductOffering() {
    return productOffering;
  }

  @JsonProperty("productOffering")
  public void setProductOffering(List<@Valid ProductOfferingRefVO> productOffering) {
    this.productOffering = productOffering;
  }

  public CategoryUpdateVO addProductOfferingItem(ProductOfferingRefVO productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<>();
    }

    this.productOffering.add(productOfferingItem);
    return this;
  }

  public CategoryUpdateVO removeProductOfferingItem(ProductOfferingRefVO productOfferingItem) {
    if (productOfferingItem != null && this.productOffering != null) {
      this.productOffering.remove(productOfferingItem);
    }

    return this;
  }
  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.
   **/
  public CategoryUpdateVO subCategory(List<@Valid CategoryRefVO> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  
  @ApiModelProperty(value = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.")
  @JsonProperty("subCategory")
  @Valid public List<@Valid CategoryRefVO> getSubCategory() {
    return subCategory;
  }

  @JsonProperty("subCategory")
  public void setSubCategory(List<@Valid CategoryRefVO> subCategory) {
    this.subCategory = subCategory;
  }

  public CategoryUpdateVO addSubCategoryItem(CategoryRefVO subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<>();
    }

    this.subCategory.add(subCategoryItem);
    return this;
  }

  public CategoryUpdateVO removeSubCategoryItem(CategoryRefVO subCategoryItem) {
    if (subCategoryItem != null && this.subCategory != null) {
      this.subCategory.remove(subCategoryItem);
    }

    return this;
  }
  /**
   **/
  public CategoryUpdateVO validFor(TimePeriodVO validFor) {
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
  public CategoryUpdateVO atSchemaLocation(URI atSchemaLocation) {
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
    CategoryUpdateVO categoryUpdate = (CategoryUpdateVO) o;
    return Objects.equals(this.description, categoryUpdate.description) &&
        Objects.equals(this.isRoot, categoryUpdate.isRoot) &&
        Objects.equals(this.lifecycleStatus, categoryUpdate.lifecycleStatus) &&
        Objects.equals(this.name, categoryUpdate.name) &&
        Objects.equals(this.parentId, categoryUpdate.parentId) &&
        Objects.equals(this.version, categoryUpdate.version) &&
        Objects.equals(this.productOffering, categoryUpdate.productOffering) &&
        Objects.equals(this.subCategory, categoryUpdate.subCategory) &&
        Objects.equals(this.validFor, categoryUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, categoryUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isRoot, lifecycleStatus, name, parentId, version, productOffering, subCategory, validFor, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdateVO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
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

