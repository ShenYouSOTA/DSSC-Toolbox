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
 * Sets the communication endpoint address the service instance must use to deliver notification information
 **/
@ApiModel(description = "Sets the communication endpoint address the service instance must use to deliver notification information")
@JsonTypeName("EventSubscriptionInput")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class EventSubscriptionInputVO   {
  private String callback;
  private String query;

  /**
   * The callback being registered.
   **/
  public EventSubscriptionInputVO callback(String callback) {
    this.callback = callback;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The callback being registered.")
  @JsonProperty("callback")
  @NotNull public String getCallback() {
    return callback;
  }

  @JsonProperty("callback")
  public void setCallback(String callback) {
    this.callback = callback;
  }

  /**
   * additional data to be passed
   **/
  public EventSubscriptionInputVO query(String query) {
    this.query = query;
    return this;
  }

  
  @ApiModelProperty(value = "additional data to be passed")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  @JsonProperty("query")
  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscriptionInputVO eventSubscriptionInput = (EventSubscriptionInputVO) o;
    return Objects.equals(this.callback, eventSubscriptionInput.callback) &&
        Objects.equals(this.query, eventSubscriptionInput.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionInputVO {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

