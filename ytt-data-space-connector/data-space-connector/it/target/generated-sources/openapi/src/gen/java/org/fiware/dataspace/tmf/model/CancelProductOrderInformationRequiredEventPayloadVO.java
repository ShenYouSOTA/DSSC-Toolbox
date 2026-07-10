package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.CancelProductOrderVO;
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
@JsonTypeName("CancelProductOrderInformationRequiredEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CancelProductOrderInformationRequiredEventPayloadVO   {
  private CancelProductOrderVO cancelProductOrder;

  /**
   **/
  public CancelProductOrderInformationRequiredEventPayloadVO cancelProductOrder(CancelProductOrderVO cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cancelProductOrder")
  @Valid public CancelProductOrderVO getCancelProductOrder() {
    return cancelProductOrder;
  }

  @JsonProperty("cancelProductOrder")
  public void setCancelProductOrder(CancelProductOrderVO cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelProductOrderInformationRequiredEventPayloadVO cancelProductOrderInformationRequiredEventPayload = (CancelProductOrderInformationRequiredEventPayloadVO) o;
    return Objects.equals(this.cancelProductOrder, cancelProductOrderInformationRequiredEventPayload.cancelProductOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelProductOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderInformationRequiredEventPayloadVO {\n");
    
    sb.append("    cancelProductOrder: ").append(toIndentedString(cancelProductOrder)).append("\n");
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

