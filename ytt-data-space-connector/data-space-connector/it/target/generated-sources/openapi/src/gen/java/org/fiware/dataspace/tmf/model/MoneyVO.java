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
 * A base / value business entity used to represent money
 **/
@ApiModel(description = "A base / value business entity used to represent money")
@JsonTypeName("Money")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class MoneyVO   {
  private String unit;
  private Float value;

  /**
   * Currency (ISO4217 norm uses 3 letters to define the currency)
   **/
  public MoneyVO unit(String unit) {
    this.unit = unit;
    return this;
  }

  
  @ApiModelProperty(value = "Currency (ISO4217 norm uses 3 letters to define the currency)")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  @JsonProperty("unit")
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   * A positive floating point number
   **/
  public MoneyVO value(Float value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "A positive floating point number")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyVO money = (MoneyVO) o;
    return Objects.equals(this.unit, money.unit) &&
        Objects.equals(this.value, money.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyVO {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

