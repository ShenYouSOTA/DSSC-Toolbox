package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.ServiceSpecificationVO;
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
@JsonTypeName("ServiceSpecificationDeleteEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceSpecificationDeleteEventPayloadVO   {
  private ServiceSpecificationVO serviceSpecification;

  /**
   **/
  public ServiceSpecificationDeleteEventPayloadVO serviceSpecification(ServiceSpecificationVO serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceSpecification")
  @Valid public ServiceSpecificationVO getServiceSpecification() {
    return serviceSpecification;
  }

  @JsonProperty("serviceSpecification")
  public void setServiceSpecification(ServiceSpecificationVO serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecificationDeleteEventPayloadVO serviceSpecificationDeleteEventPayload = (ServiceSpecificationDeleteEventPayloadVO) o;
    return Objects.equals(this.serviceSpecification, serviceSpecificationDeleteEventPayload.serviceSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificationDeleteEventPayloadVO {\n");
    
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
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

