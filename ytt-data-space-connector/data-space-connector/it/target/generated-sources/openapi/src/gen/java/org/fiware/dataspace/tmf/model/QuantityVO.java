package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An amount in a given unit
 **/
@ApiModel(description = "An amount in a given unit")
@JsonTypeName("Quantity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class QuantityVO   {
  private Float amount = 1.0f;
  private String units;

  /**
   * Numeric value in a given unit
   **/
  public QuantityVO amount(Float amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "Numeric value in a given unit")
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(Float amount) {
    this.amount = amount;
  }

  /**
   * Unit
   **/
  public QuantityVO units(String units) {
    this.units = units;
    return this;
  }

  
  @ApiModelProperty(value = "Unit")
  @JsonProperty("units")
  public String getUnits() {
    return units;
  }

  @JsonProperty("units")
  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityVO quantity = (QuantityVO) o;
    return Objects.equals(this.amount, quantity.amount) &&
        Objects.equals(this.units, quantity.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityVO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

