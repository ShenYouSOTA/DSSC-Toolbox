package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.AppointmentRefVO;
import org.fiware.dataspace.tmf.model.BillingAccountRefVO;
import org.fiware.dataspace.tmf.model.OrderItemActionTypeVO;
import org.fiware.dataspace.tmf.model.OrderItemRelationshipVO;
import org.fiware.dataspace.tmf.model.OrderPriceVO;
import org.fiware.dataspace.tmf.model.OrderTermVO;
import org.fiware.dataspace.tmf.model.PaymentRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingQualificationItemRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingQualificationRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingRefVO;
import org.fiware.dataspace.tmf.model.ProductOrderItemStateTypeVO;
import org.fiware.dataspace.tmf.model.ProductRefOrValueVO;
import org.fiware.dataspace.tmf.model.QuoteItemRefVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An identified part of the order. A product order is decomposed into one or more order items.
 **/
@ApiModel(description = "An identified part of the order. A product order is decomposed into one or more order items.")
@JsonTypeName("ProductOrderItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOrderItemVO   {
  private String id;
  private Integer quantity;
  private OrderItemActionTypeVO action;
  private AppointmentRefVO appointment;
  private BillingAccountRefVO billingAccount;
  private @Valid List<@Valid OrderPriceVO> itemPrice = new ArrayList<>();
  private @Valid List<@Valid OrderTermVO> itemTerm = new ArrayList<>();
  private @Valid List<@Valid OrderPriceVO> itemTotalPrice = new ArrayList<>();
  private @Valid List<@Valid PaymentRefVO> payment = new ArrayList<>();
  private ProductRefOrValueVO product;
  private ProductOfferingRefVO productOffering;
  private ProductOfferingQualificationItemRefVO productOfferingQualificationItem;
  private @Valid List<@Valid ProductOrderItemVO> productOrderItem = new ArrayList<>();
  private @Valid List<@Valid OrderItemRelationshipVO> productOrderItemRelationship = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingQualificationRefVO> qualification = new ArrayList<>();
  private QuoteItemRefVO quoteItem;
  private ProductOrderItemStateTypeVO state;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   **/
  public ProductOrderItemVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
  @JsonProperty("id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Quantity ordered
   **/
  public ProductOrderItemVO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "Quantity ordered")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  public ProductOrderItemVO action(OrderItemActionTypeVO action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  @NotNull public OrderItemActionTypeVO getAction() {
    return action;
  }

  @JsonProperty("action")
  public void setAction(OrderItemActionTypeVO action) {
    this.action = action;
  }

  /**
   **/
  public ProductOrderItemVO appointment(AppointmentRefVO appointment) {
    this.appointment = appointment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("appointment")
  @Valid public AppointmentRefVO getAppointment() {
    return appointment;
  }

  @JsonProperty("appointment")
  public void setAppointment(AppointmentRefVO appointment) {
    this.appointment = appointment;
  }

  /**
   **/
  public ProductOrderItemVO billingAccount(BillingAccountRefVO billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("billingAccount")
  @Valid public BillingAccountRefVO getBillingAccount() {
    return billingAccount;
  }

  @JsonProperty("billingAccount")
  public void setBillingAccount(BillingAccountRefVO billingAccount) {
    this.billingAccount = billingAccount;
  }

  /**
   **/
  public ProductOrderItemVO itemPrice(List<@Valid OrderPriceVO> itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemPrice")
  @Valid public List<@Valid OrderPriceVO> getItemPrice() {
    return itemPrice;
  }

  @JsonProperty("itemPrice")
  public void setItemPrice(List<@Valid OrderPriceVO> itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ProductOrderItemVO addItemPriceItem(OrderPriceVO itemPriceItem) {
    if (this.itemPrice == null) {
      this.itemPrice = new ArrayList<>();
    }

    this.itemPrice.add(itemPriceItem);
    return this;
  }

  public ProductOrderItemVO removeItemPriceItem(OrderPriceVO itemPriceItem) {
    if (itemPriceItem != null && this.itemPrice != null) {
      this.itemPrice.remove(itemPriceItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO itemTerm(List<@Valid OrderTermVO> itemTerm) {
    this.itemTerm = itemTerm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemTerm")
  @Valid public List<@Valid OrderTermVO> getItemTerm() {
    return itemTerm;
  }

  @JsonProperty("itemTerm")
  public void setItemTerm(List<@Valid OrderTermVO> itemTerm) {
    this.itemTerm = itemTerm;
  }

  public ProductOrderItemVO addItemTermItem(OrderTermVO itemTermItem) {
    if (this.itemTerm == null) {
      this.itemTerm = new ArrayList<>();
    }

    this.itemTerm.add(itemTermItem);
    return this;
  }

  public ProductOrderItemVO removeItemTermItem(OrderTermVO itemTermItem) {
    if (itemTermItem != null && this.itemTerm != null) {
      this.itemTerm.remove(itemTermItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO itemTotalPrice(List<@Valid OrderPriceVO> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemTotalPrice")
  @Valid public List<@Valid OrderPriceVO> getItemTotalPrice() {
    return itemTotalPrice;
  }

  @JsonProperty("itemTotalPrice")
  public void setItemTotalPrice(List<@Valid OrderPriceVO> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
  }

  public ProductOrderItemVO addItemTotalPriceItem(OrderPriceVO itemTotalPriceItem) {
    if (this.itemTotalPrice == null) {
      this.itemTotalPrice = new ArrayList<>();
    }

    this.itemTotalPrice.add(itemTotalPriceItem);
    return this;
  }

  public ProductOrderItemVO removeItemTotalPriceItem(OrderPriceVO itemTotalPriceItem) {
    if (itemTotalPriceItem != null && this.itemTotalPrice != null) {
      this.itemTotalPrice.remove(itemTotalPriceItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO payment(List<@Valid PaymentRefVO> payment) {
    this.payment = payment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("payment")
  @Valid public List<@Valid PaymentRefVO> getPayment() {
    return payment;
  }

  @JsonProperty("payment")
  public void setPayment(List<@Valid PaymentRefVO> payment) {
    this.payment = payment;
  }

  public ProductOrderItemVO addPaymentItem(PaymentRefVO paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<>();
    }

    this.payment.add(paymentItem);
    return this;
  }

  public ProductOrderItemVO removePaymentItem(PaymentRefVO paymentItem) {
    if (paymentItem != null && this.payment != null) {
      this.payment.remove(paymentItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO product(ProductRefOrValueVO product) {
    this.product = product;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product")
  @Valid public ProductRefOrValueVO getProduct() {
    return product;
  }

  @JsonProperty("product")
  public void setProduct(ProductRefOrValueVO product) {
    this.product = product;
  }

  /**
   **/
  public ProductOrderItemVO productOffering(ProductOfferingRefVO productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOffering")
  @Valid public ProductOfferingRefVO getProductOffering() {
    return productOffering;
  }

  @JsonProperty("productOffering")
  public void setProductOffering(ProductOfferingRefVO productOffering) {
    this.productOffering = productOffering;
  }

  /**
   **/
  public ProductOrderItemVO productOfferingQualificationItem(ProductOfferingQualificationItemRefVO productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOfferingQualificationItem")
  @Valid public ProductOfferingQualificationItemRefVO getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }

  @JsonProperty("productOfferingQualificationItem")
  public void setProductOfferingQualificationItem(ProductOfferingQualificationItemRefVO productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
  }

  /**
   **/
  public ProductOrderItemVO productOrderItem(List<@Valid ProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOrderItem")
  @Valid public List<@Valid ProductOrderItemVO> getProductOrderItem() {
    return productOrderItem;
  }

  @JsonProperty("productOrderItem")
  public void setProductOrderItem(List<@Valid ProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductOrderItemVO addProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<>();
    }

    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  public ProductOrderItemVO removeProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (productOrderItemItem != null && this.productOrderItem != null) {
      this.productOrderItem.remove(productOrderItemItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO productOrderItemRelationship(List<@Valid OrderItemRelationshipVO> productOrderItemRelationship) {
    this.productOrderItemRelationship = productOrderItemRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOrderItemRelationship")
  @Valid public List<@Valid OrderItemRelationshipVO> getProductOrderItemRelationship() {
    return productOrderItemRelationship;
  }

  @JsonProperty("productOrderItemRelationship")
  public void setProductOrderItemRelationship(List<@Valid OrderItemRelationshipVO> productOrderItemRelationship) {
    this.productOrderItemRelationship = productOrderItemRelationship;
  }

  public ProductOrderItemVO addProductOrderItemRelationshipItem(OrderItemRelationshipVO productOrderItemRelationshipItem) {
    if (this.productOrderItemRelationship == null) {
      this.productOrderItemRelationship = new ArrayList<>();
    }

    this.productOrderItemRelationship.add(productOrderItemRelationshipItem);
    return this;
  }

  public ProductOrderItemVO removeProductOrderItemRelationshipItem(OrderItemRelationshipVO productOrderItemRelationshipItem) {
    if (productOrderItemRelationshipItem != null && this.productOrderItemRelationship != null) {
      this.productOrderItemRelationship.remove(productOrderItemRelationshipItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO qualification(List<@Valid ProductOfferingQualificationRefVO> qualification) {
    this.qualification = qualification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("qualification")
  @Valid public List<@Valid ProductOfferingQualificationRefVO> getQualification() {
    return qualification;
  }

  @JsonProperty("qualification")
  public void setQualification(List<@Valid ProductOfferingQualificationRefVO> qualification) {
    this.qualification = qualification;
  }

  public ProductOrderItemVO addQualificationItem(ProductOfferingQualificationRefVO qualificationItem) {
    if (this.qualification == null) {
      this.qualification = new ArrayList<>();
    }

    this.qualification.add(qualificationItem);
    return this;
  }

  public ProductOrderItemVO removeQualificationItem(ProductOfferingQualificationRefVO qualificationItem) {
    if (qualificationItem != null && this.qualification != null) {
      this.qualification.remove(qualificationItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderItemVO quoteItem(QuoteItemRefVO quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quoteItem")
  @Valid public QuoteItemRefVO getQuoteItem() {
    return quoteItem;
  }

  @JsonProperty("quoteItem")
  public void setQuoteItem(QuoteItemRefVO quoteItem) {
    this.quoteItem = quoteItem;
  }

  /**
   **/
  public ProductOrderItemVO state(ProductOrderItemStateTypeVO state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public ProductOrderItemStateTypeVO getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(ProductOrderItemStateTypeVO state) {
    this.state = state;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductOrderItemVO atBaseType(String atBaseType) {
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
  public ProductOrderItemVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductOrderItemVO atType(String atType) {
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
    ProductOrderItemVO productOrderItem = (ProductOrderItemVO) o;
    return Objects.equals(this.id, productOrderItem.id) &&
        Objects.equals(this.quantity, productOrderItem.quantity) &&
        Objects.equals(this.action, productOrderItem.action) &&
        Objects.equals(this.appointment, productOrderItem.appointment) &&
        Objects.equals(this.billingAccount, productOrderItem.billingAccount) &&
        Objects.equals(this.itemPrice, productOrderItem.itemPrice) &&
        Objects.equals(this.itemTerm, productOrderItem.itemTerm) &&
        Objects.equals(this.itemTotalPrice, productOrderItem.itemTotalPrice) &&
        Objects.equals(this.payment, productOrderItem.payment) &&
        Objects.equals(this.product, productOrderItem.product) &&
        Objects.equals(this.productOffering, productOrderItem.productOffering) &&
        Objects.equals(this.productOfferingQualificationItem, productOrderItem.productOfferingQualificationItem) &&
        Objects.equals(this.productOrderItem, productOrderItem.productOrderItem) &&
        Objects.equals(this.productOrderItemRelationship, productOrderItem.productOrderItemRelationship) &&
        Objects.equals(this.qualification, productOrderItem.qualification) &&
        Objects.equals(this.quoteItem, productOrderItem.quoteItem) &&
        Objects.equals(this.state, productOrderItem.state) &&
        Objects.equals(this.atBaseType, productOrderItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOrderItem.atSchemaLocation) &&
        Objects.equals(this.atType, productOrderItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, action, appointment, billingAccount, itemPrice, itemTerm, itemTotalPrice, payment, product, productOffering, productOfferingQualificationItem, productOrderItem, productOrderItemRelationship, qualification, quoteItem, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderItemVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemTerm: ").append(toIndentedString(itemTerm)).append("\n");
    sb.append("    itemTotalPrice: ").append(toIndentedString(itemTotalPrice)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productOrderItemRelationship: ").append(toIndentedString(productOrderItemRelationship)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
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

