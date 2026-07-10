package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.fiware.dataspace.tmf.model.TaskStateTypeVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A Order cancel is a type of task which  can  be used to place a request to cancel an order
 **/
@ApiModel(description = "A Order cancel is a type of task which  can  be used to place a request to cancel an order")
@JsonTypeName("CancelOrder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CancelOrderVO   {
  private String id;
  private String href;
  private String cancellationReason;
  private Date effectiveCancellationDate;
  private Date requestedCancellationDate;
  private TaskStateTypeVO state;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * id of the cancellation request (this is not an order id)
   **/
  public CancelOrderVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "id of the cancellation request (this is not an order id)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hyperlink to access the cancellation request
   **/
  public CancelOrderVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink to access the cancellation request")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Reason why the order is cancelled.
   **/
  public CancelOrderVO cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  
  @ApiModelProperty(value = "Reason why the order is cancelled.")
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }

  @JsonProperty("cancellationReason")
  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  /**
   * Date when the order is cancelled.
   **/
  public CancelOrderVO effectiveCancellationDate(Date effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date when the order is cancelled.")
  @JsonProperty("effectiveCancellationDate")
  public Date getEffectiveCancellationDate() {
    return effectiveCancellationDate;
  }

  @JsonProperty("effectiveCancellationDate")
  public void setEffectiveCancellationDate(Date effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
  }

  /**
   * Date when the submitter wants the order to be cancelled
   **/
  public CancelOrderVO requestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date when the submitter wants the order to be cancelled")
  @JsonProperty("requestedCancellationDate")
  public Date getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  @JsonProperty("requestedCancellationDate")
  public void setRequestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  /**
   **/
  public CancelOrderVO state(TaskStateTypeVO state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public TaskStateTypeVO getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(TaskStateTypeVO state) {
    this.state = state;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public CancelOrderVO atBaseType(String atBaseType) {
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
  public CancelOrderVO atSchemaLocation(URI atSchemaLocation) {
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
   * When sub-classing, this defines the sub-class entity name
   **/
  public CancelOrderVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
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
    CancelOrderVO cancelOrder = (CancelOrderVO) o;
    return Objects.equals(this.id, cancelOrder.id) &&
        Objects.equals(this.href, cancelOrder.href) &&
        Objects.equals(this.cancellationReason, cancelOrder.cancellationReason) &&
        Objects.equals(this.effectiveCancellationDate, cancelOrder.effectiveCancellationDate) &&
        Objects.equals(this.requestedCancellationDate, cancelOrder.requestedCancellationDate) &&
        Objects.equals(this.state, cancelOrder.state) &&
        Objects.equals(this.atBaseType, cancelOrder.atBaseType) &&
        Objects.equals(this.atSchemaLocation, cancelOrder.atSchemaLocation) &&
        Objects.equals(this.atType, cancelOrder.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationReason, effectiveCancellationDate, requestedCancellationDate, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelOrderVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    effectiveCancellationDate: ").append(toIndentedString(effectiveCancellationDate)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

