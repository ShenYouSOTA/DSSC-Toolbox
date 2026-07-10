package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fiware.dataspace.tmf.model.ProductSpecificationVO;
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
@JsonTypeName("ProductSpecificationDeleteEventPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductSpecificationDeleteEventPayloadVO   {
  private ProductSpecificationVO productSpecification;

  /**
   **/
  public ProductSpecificationDeleteEventPayloadVO productSpecification(ProductSpecificationVO productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productSpecification")
  @Valid public ProductSpecificationVO getProductSpecification() {
    return productSpecification;
  }

  @JsonProperty("productSpecification")
  public void setProductSpecification(ProductSpecificationVO productSpecification) {
    this.productSpecification = productSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationDeleteEventPayloadVO productSpecificationDeleteEventPayload = (ProductSpecificationDeleteEventPayloadVO) o;
    return Objects.equals(this.productSpecification, productSpecificationDeleteEventPayload.productSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationDeleteEventPayloadVO {\n");
    
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

