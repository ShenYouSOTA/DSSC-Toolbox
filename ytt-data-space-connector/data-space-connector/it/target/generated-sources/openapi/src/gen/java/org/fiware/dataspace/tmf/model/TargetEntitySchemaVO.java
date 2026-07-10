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
 * The reference object to the schema and type of target entity which is described by a specification
 **/
@ApiModel(description = "The reference object to the schema and type of target entity which is described by a specification")
@JsonTypeName("TargetEntitySchema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class TargetEntitySchemaVO   {
  private String atSchemaLocation;
  private String atType;

  /**
   * This field provides a link to the schema describing the target entity
   **/
  public TargetEntitySchemaVO atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This field provides a link to the schema describing the target entity")
  @JsonProperty("@schemaLocation")
  @NotNull public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  @JsonProperty("@schemaLocation")
  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  /**
   * Class type of the target entity
   **/
  public TargetEntitySchemaVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Class type of the target entity")
  @JsonProperty("@type")
  @NotNull public String getAtType() {
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
    TargetEntitySchemaVO targetEntitySchema = (TargetEntitySchemaVO) o;
    return Objects.equals(this.atSchemaLocation, targetEntitySchema.atSchemaLocation) &&
        Objects.equals(this.atType, targetEntitySchema.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetEntitySchemaVO {\n");
    
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

