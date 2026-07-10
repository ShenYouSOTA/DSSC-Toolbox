package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.fiware.dataspace.tmf.model.ProductOrderRefVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request for cancellation an existing product order Skipped properties: id,href,state,effectiveCancellationDate
 **/
@ApiModel(description = "Request for cancellation an existing product order Skipped properties: id,href,state,effectiveCancellationDate")
@JsonTypeName("CancelProductOrder_Create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class CancelProductOrderCreateVO   {
  private String cancellationReason;
  private Date requestedCancellationDate;
  private ProductOrderRefVO productOrder;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Reason why the order is cancelled.
   **/
  public CancelProductOrderCreateVO cancellationReason(String cancellationReason) {
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
   * Date when the submitter wants the order to be cancelled
   **/
  public CancelProductOrderCreateVO requestedCancellationDate(Date requestedCancellationDate) {
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
  public CancelProductOrderCreateVO productOrder(ProductOrderRefVO productOrder) {
    this.productOrder = productOrder;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("productOrder")
  @NotNull @Valid public ProductOrderRefVO getProductOrder() {
    return productOrder;
  }

  @JsonProperty("productOrder")
  public void setProductOrder(ProductOrderRefVO productOrder) {
    this.productOrder = productOrder;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public CancelProductOrderCreateVO atBaseType(String atBaseType) {
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
  public CancelProductOrderCreateVO atSchemaLocation(URI atSchemaLocation) {
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
  public CancelProductOrderCreateVO atType(String atType) {
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
    CancelProductOrderCreateVO cancelProductOrderCreate = (CancelProductOrderCreateVO) o;
    return Objects.equals(this.cancellationReason, cancelProductOrderCreate.cancellationReason) &&
        Objects.equals(this.requestedCancellationDate, cancelProductOrderCreate.requestedCancellationDate) &&
        Objects.equals(this.productOrder, cancelProductOrderCreate.productOrder) &&
        Objects.equals(this.atBaseType, cancelProductOrderCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, cancelProductOrderCreate.atSchemaLocation) &&
        Objects.equals(this.atType, cancelProductOrderCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, requestedCancellationDate, productOrder, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderCreateVO {\n");
    
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
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

