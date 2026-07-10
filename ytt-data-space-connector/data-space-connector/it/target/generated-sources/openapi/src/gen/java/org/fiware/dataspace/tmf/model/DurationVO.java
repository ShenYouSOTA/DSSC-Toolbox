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
 * A time interval in a given unit of time
 **/
@ApiModel(description = "A time interval in a given unit of time")
@JsonTypeName("Duration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class DurationVO   {
  private Integer amount;
  private String units;

  /**
   * Time interval (number of seconds, minutes, hours, etc.)
   **/
  public DurationVO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "Time interval (number of seconds, minutes, hours, etc.)")
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * Unit of time (seconds, minutes, hours, etc.)
   **/
  public DurationVO units(String units) {
    this.units = units;
    return this;
  }

  
  @ApiModelProperty(value = "Unit of time (seconds, minutes, hours, etc.)")
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
    DurationVO duration = (DurationVO) o;
    return Objects.equals(this.amount, duration.amount) &&
        Objects.equals(this.units, duration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationVO {\n");
    
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

