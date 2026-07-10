package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.ServiceCategoryVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The event data structure
 **/
@ApiModel(description = "The event data structure")
@JsonTypeName("ServiceCategoryDeleteEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceCategoryDeleteEventPayloadVO   {
  private ServiceCategoryVO serviceCategory;

  /**
   **/
  public ServiceCategoryDeleteEventPayloadVO serviceCategory(ServiceCategoryVO serviceCategory) {
    this.serviceCategory = serviceCategory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceCategory")
  @Valid public ServiceCategoryVO getServiceCategory() {
    return serviceCategory;
  }

  @JsonProperty("serviceCategory")
  public void setServiceCategory(ServiceCategoryVO serviceCategory) {
    this.serviceCategory = serviceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCategoryDeleteEventPayloadVO serviceCategoryDeleteEventPayload = (ServiceCategoryDeleteEventPayloadVO) o;
    return Objects.equals(this.serviceCategory, serviceCategoryDeleteEventPayload.serviceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCategoryDeleteEventPayloadVO {\n");
    
    sb.append("    serviceCategory: ").append(toIndentedString(serviceCategory)).append("\n");
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

