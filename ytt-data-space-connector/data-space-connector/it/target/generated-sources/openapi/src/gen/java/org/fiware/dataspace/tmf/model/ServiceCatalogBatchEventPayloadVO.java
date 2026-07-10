package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.ServiceCatalogVO;
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
@JsonTypeName("ServiceCatalogBatchEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceCatalogBatchEventPayloadVO   {
  private ServiceCatalogVO serviceCatalog;

  /**
   **/
  public ServiceCatalogBatchEventPayloadVO serviceCatalog(ServiceCatalogVO serviceCatalog) {
    this.serviceCatalog = serviceCatalog;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceCatalog")
  @Valid public ServiceCatalogVO getServiceCatalog() {
    return serviceCatalog;
  }

  @JsonProperty("serviceCatalog")
  public void setServiceCatalog(ServiceCatalogVO serviceCatalog) {
    this.serviceCatalog = serviceCatalog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCatalogBatchEventPayloadVO serviceCatalogBatchEventPayload = (ServiceCatalogBatchEventPayloadVO) o;
    return Objects.equals(this.serviceCatalog, serviceCatalogBatchEventPayload.serviceCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCatalogBatchEventPayloadVO {\n");
    
    sb.append("    serviceCatalog: ").append(toIndentedString(serviceCatalog)).append("\n");
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

