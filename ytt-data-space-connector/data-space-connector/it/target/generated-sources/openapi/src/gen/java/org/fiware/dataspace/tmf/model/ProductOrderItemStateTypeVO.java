package org.fiware.dataspace.tmf.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for the state of the product order item
 */
public enum ProductOrderItemStateTypeVO {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  IN_PROGRESS("inProgress"),
  
  CANCELLED("cancelled"),
  
  COMPLETED("completed"),
  
  FAILED("failed"),
  
  ASSESSING_CANCELLATION("assessingCancellation"),
  
  PENDING_CANCELLATION("pendingCancellation");

  private String value;

  ProductOrderItemStateTypeVO(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ProductOrderItemStateTypeVO fromString(String s) {
      for (ProductOrderItemStateTypeVO b : ProductOrderItemStateTypeVO.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOrderItemStateTypeVO fromValue(String value) {
    for (ProductOrderItemStateTypeVO b : ProductOrderItemStateTypeVO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


