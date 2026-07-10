package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.ServiceCandidateVO;
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
@JsonTypeName("ServiceCandidateCreateEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceCandidateCreateEventPayloadVO   {
  private ServiceCandidateVO serviceCandidate;

  /**
   **/
  public ServiceCandidateCreateEventPayloadVO serviceCandidate(ServiceCandidateVO serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceCandidate")
  @Valid public ServiceCandidateVO getServiceCandidate() {
    return serviceCandidate;
  }

  @JsonProperty("serviceCandidate")
  public void setServiceCandidate(ServiceCandidateVO serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCandidateCreateEventPayloadVO serviceCandidateCreateEventPayload = (ServiceCandidateCreateEventPayloadVO) o;
    return Objects.equals(this.serviceCandidate, serviceCandidateCreateEventPayload.serviceCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCandidateCreateEventPayloadVO {\n");
    
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
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

