package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.fiware.dataspace.tmf.model.AgreementRefVO;
import org.fiware.dataspace.tmf.model.BillingAccountRefVO;
import org.fiware.dataspace.tmf.model.NoteVO;
import org.fiware.dataspace.tmf.model.OrderPriceVO;
import org.fiware.dataspace.tmf.model.PaymentRefVO;
import org.fiware.dataspace.tmf.model.ProductOfferingQualificationRefVO;
import org.fiware.dataspace.tmf.model.ProductOrderItemVO;
import org.fiware.dataspace.tmf.model.ProductOrderStateTypeVO;
import org.fiware.dataspace.tmf.model.QuoteRefVO;
import org.fiware.dataspace.tmf.model.RelatedChannelVO;
import org.fiware.dataspace.tmf.model.RelatedPartyVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa,
 **/
@ApiModel(description = "A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa,")
@JsonTypeName("ProductOrder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOrderVO   {
  private String id;
  private String href;
  private Date cancellationDate;
  private String cancellationReason;
  private String category;
  private Date completionDate;
  private String description;
  private Date expectedCompletionDate;
  private String externalId;
  private String notificationContact;
  private Date orderDate;
  private String priority;
  private Date requestedCompletionDate;
  private Date requestedStartDate;
  private @Valid List<@Valid AgreementRefVO> agreement = new ArrayList<>();
  private BillingAccountRefVO billingAccount;
  private @Valid List<@Valid RelatedChannelVO> channel = new ArrayList<>();
  private @Valid List<@Valid NoteVO> note = new ArrayList<>();
  private @Valid List<@Valid OrderPriceVO> orderTotalPrice = new ArrayList<>();
  private @Valid List<@Valid PaymentRefVO> payment = new ArrayList<>();
  private @Valid List<@Valid ProductOfferingQualificationRefVO> productOfferingQualification = new ArrayList<>();
  private @Valid List<@Valid ProductOrderItemVO> productOrderItem = new ArrayList<>();
  private @Valid List<@Valid QuoteRefVO> quote = new ArrayList<>();
  private @Valid List<@Valid RelatedPartyVO> relatedParty = new ArrayList<>();
  private ProductOrderStateTypeVO state;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * ID created on repository side (OM system)
   **/
  public ProductOrderVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "ID created on repository side (OM system)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hyperlink to access the order
   **/
  public ProductOrderVO href(String href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Hyperlink to access the order")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Date when the order is cancelled. This is used when order is cancelled. 
   **/
  public ProductOrderVO cancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date when the order is cancelled. This is used when order is cancelled. ")
  @JsonProperty("cancellationDate")
  public Date getCancellationDate() {
    return cancellationDate;
  }

  @JsonProperty("cancellationDate")
  public void setCancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  /**
   * Reason why the order is cancelled. This is used when order is cancelled. 
   **/
  public ProductOrderVO cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  
  @ApiModelProperty(value = "Reason why the order is cancelled. This is used when order is cancelled. ")
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }

  @JsonProperty("cancellationReason")
  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  /**
   * Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \&quot;enterprise\&quot;, \&quot;residential\&quot;, ...)
   **/
  public ProductOrderVO category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...)")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Date when the order was completed
   **/
  public ProductOrderVO completionDate(Date completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date when the order was completed")
  @JsonProperty("completionDate")
  public Date getCompletionDate() {
    return completionDate;
  }

  @JsonProperty("completionDate")
  public void setCompletionDate(Date completionDate) {
    this.completionDate = completionDate;
  }

  /**
   * Description of the product order
   **/
  public ProductOrderVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the product order")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Expected delivery date amended by the provider
   **/
  public ProductOrderVO expectedCompletionDate(Date expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  
  @ApiModelProperty(value = "Expected delivery date amended by the provider")
  @JsonProperty("expectedCompletionDate")
  public Date getExpectedCompletionDate() {
    return expectedCompletionDate;
  }

  @JsonProperty("expectedCompletionDate")
  public void setExpectedCompletionDate(Date expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

  /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
   **/
  public ProductOrderVO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(value = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  @JsonProperty("externalId")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Contact attached to the order to send back information regarding this order
   **/
  public ProductOrderVO notificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
    return this;
  }

  
  @ApiModelProperty(value = "Contact attached to the order to send back information regarding this order")
  @JsonProperty("notificationContact")
  public String getNotificationContact() {
    return notificationContact;
  }

  @JsonProperty("notificationContact")
  public void setNotificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
  }

  /**
   * Date when the order was created
   **/
  public ProductOrderVO orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date when the order was created")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }

  @JsonProperty("orderDate")
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)
   **/
  public ProductOrderVO priority(String priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)")
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * Requested delivery date from the requestor perspective
   **/
  public ProductOrderVO requestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  
  @ApiModelProperty(value = "Requested delivery date from the requestor perspective")
  @JsonProperty("requestedCompletionDate")
  public Date getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  @JsonProperty("requestedCompletionDate")
  public void setRequestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  /**
   * Order fulfillment start date wished by the requestor. This is used when, for any reason, requestor cannot allow seller to begin to operationally begin the fulfillment before a date. 
   **/
  public ProductOrderVO requestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  
  @ApiModelProperty(value = "Order fulfillment start date wished by the requestor. This is used when, for any reason, requestor cannot allow seller to begin to operationally begin the fulfillment before a date. ")
  @JsonProperty("requestedStartDate")
  public Date getRequestedStartDate() {
    return requestedStartDate;
  }

  @JsonProperty("requestedStartDate")
  public void setRequestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  /**
   * A reference to an agreement defined in the context of the product order
   **/
  public ProductOrderVO agreement(List<@Valid AgreementRefVO> agreement) {
    this.agreement = agreement;
    return this;
  }

  
  @ApiModelProperty(value = "A reference to an agreement defined in the context of the product order")
  @JsonProperty("agreement")
  @Valid public List<@Valid AgreementRefVO> getAgreement() {
    return agreement;
  }

  @JsonProperty("agreement")
  public void setAgreement(List<@Valid AgreementRefVO> agreement) {
    this.agreement = agreement;
  }

  public ProductOrderVO addAgreementItem(AgreementRefVO agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }

    this.agreement.add(agreementItem);
    return this;
  }

  public ProductOrderVO removeAgreementItem(AgreementRefVO agreementItem) {
    if (agreementItem != null && this.agreement != null) {
      this.agreement.remove(agreementItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO billingAccount(BillingAccountRefVO billingAccount) {
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
  public ProductOrderVO channel(List<@Valid RelatedChannelVO> channel) {
    this.channel = channel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("channel")
  @Valid public List<@Valid RelatedChannelVO> getChannel() {
    return channel;
  }

  @JsonProperty("channel")
  public void setChannel(List<@Valid RelatedChannelVO> channel) {
    this.channel = channel;
  }

  public ProductOrderVO addChannelItem(RelatedChannelVO channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<>();
    }

    this.channel.add(channelItem);
    return this;
  }

  public ProductOrderVO removeChannelItem(RelatedChannelVO channelItem) {
    if (channelItem != null && this.channel != null) {
      this.channel.remove(channelItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO note(List<@Valid NoteVO> note) {
    this.note = note;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("note")
  @Valid public List<@Valid NoteVO> getNote() {
    return note;
  }

  @JsonProperty("note")
  public void setNote(List<@Valid NoteVO> note) {
    this.note = note;
  }

  public ProductOrderVO addNoteItem(NoteVO noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }

    this.note.add(noteItem);
    return this;
  }

  public ProductOrderVO removeNoteItem(NoteVO noteItem) {
    if (noteItem != null && this.note != null) {
      this.note.remove(noteItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO orderTotalPrice(List<@Valid OrderPriceVO> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderTotalPrice")
  @Valid public List<@Valid OrderPriceVO> getOrderTotalPrice() {
    return orderTotalPrice;
  }

  @JsonProperty("orderTotalPrice")
  public void setOrderTotalPrice(List<@Valid OrderPriceVO> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
  }

  public ProductOrderVO addOrderTotalPriceItem(OrderPriceVO orderTotalPriceItem) {
    if (this.orderTotalPrice == null) {
      this.orderTotalPrice = new ArrayList<>();
    }

    this.orderTotalPrice.add(orderTotalPriceItem);
    return this;
  }

  public ProductOrderVO removeOrderTotalPriceItem(OrderPriceVO orderTotalPriceItem) {
    if (orderTotalPriceItem != null && this.orderTotalPrice != null) {
      this.orderTotalPrice.remove(orderTotalPriceItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO payment(List<@Valid PaymentRefVO> payment) {
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

  public ProductOrderVO addPaymentItem(PaymentRefVO paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<>();
    }

    this.payment.add(paymentItem);
    return this;
  }

  public ProductOrderVO removePaymentItem(PaymentRefVO paymentItem) {
    if (paymentItem != null && this.payment != null) {
      this.payment.remove(paymentItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO productOfferingQualification(List<@Valid ProductOfferingQualificationRefVO> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("productOfferingQualification")
  @Valid public List<@Valid ProductOfferingQualificationRefVO> getProductOfferingQualification() {
    return productOfferingQualification;
  }

  @JsonProperty("productOfferingQualification")
  public void setProductOfferingQualification(List<@Valid ProductOfferingQualificationRefVO> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
  }

  public ProductOrderVO addProductOfferingQualificationItem(ProductOfferingQualificationRefVO productOfferingQualificationItem) {
    if (this.productOfferingQualification == null) {
      this.productOfferingQualification = new ArrayList<>();
    }

    this.productOfferingQualification.add(productOfferingQualificationItem);
    return this;
  }

  public ProductOrderVO removeProductOfferingQualificationItem(ProductOfferingQualificationRefVO productOfferingQualificationItem) {
    if (productOfferingQualificationItem != null && this.productOfferingQualification != null) {
      this.productOfferingQualification.remove(productOfferingQualificationItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO productOrderItem(List<@Valid ProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("productOrderItem")
  @NotNull @Valid  @Size(min=1)public List<@Valid ProductOrderItemVO> getProductOrderItem() {
    return productOrderItem;
  }

  @JsonProperty("productOrderItem")
  public void setProductOrderItem(List<@Valid ProductOrderItemVO> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductOrderVO addProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<>();
    }

    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  public ProductOrderVO removeProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (productOrderItemItem != null && this.productOrderItem != null) {
      this.productOrderItem.remove(productOrderItemItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO quote(List<@Valid QuoteRefVO> quote) {
    this.quote = quote;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quote")
  @Valid public List<@Valid QuoteRefVO> getQuote() {
    return quote;
  }

  @JsonProperty("quote")
  public void setQuote(List<@Valid QuoteRefVO> quote) {
    this.quote = quote;
  }

  public ProductOrderVO addQuoteItem(QuoteRefVO quoteItem) {
    if (this.quote == null) {
      this.quote = new ArrayList<>();
    }

    this.quote.add(quoteItem);
    return this;
  }

  public ProductOrderVO removeQuoteItem(QuoteRefVO quoteItem) {
    if (quoteItem != null && this.quote != null) {
      this.quote.remove(quoteItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relatedParty")
  @Valid public List<@Valid RelatedPartyVO> getRelatedParty() {
    return relatedParty;
  }

  @JsonProperty("relatedParty")
  public void setRelatedParty(List<@Valid RelatedPartyVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductOrderVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ProductOrderVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderVO state(ProductOrderStateTypeVO state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public ProductOrderStateTypeVO getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(ProductOrderStateTypeVO state) {
    this.state = state;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductOrderVO atBaseType(String atBaseType) {
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
  public ProductOrderVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductOrderVO atType(String atType) {
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
    ProductOrderVO productOrder = (ProductOrderVO) o;
    return Objects.equals(this.id, productOrder.id) &&
        Objects.equals(this.href, productOrder.href) &&
        Objects.equals(this.cancellationDate, productOrder.cancellationDate) &&
        Objects.equals(this.cancellationReason, productOrder.cancellationReason) &&
        Objects.equals(this.category, productOrder.category) &&
        Objects.equals(this.completionDate, productOrder.completionDate) &&
        Objects.equals(this.description, productOrder.description) &&
        Objects.equals(this.expectedCompletionDate, productOrder.expectedCompletionDate) &&
        Objects.equals(this.externalId, productOrder.externalId) &&
        Objects.equals(this.notificationContact, productOrder.notificationContact) &&
        Objects.equals(this.orderDate, productOrder.orderDate) &&
        Objects.equals(this.priority, productOrder.priority) &&
        Objects.equals(this.requestedCompletionDate, productOrder.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, productOrder.requestedStartDate) &&
        Objects.equals(this.agreement, productOrder.agreement) &&
        Objects.equals(this.billingAccount, productOrder.billingAccount) &&
        Objects.equals(this.channel, productOrder.channel) &&
        Objects.equals(this.note, productOrder.note) &&
        Objects.equals(this.orderTotalPrice, productOrder.orderTotalPrice) &&
        Objects.equals(this.payment, productOrder.payment) &&
        Objects.equals(this.productOfferingQualification, productOrder.productOfferingQualification) &&
        Objects.equals(this.productOrderItem, productOrder.productOrderItem) &&
        Objects.equals(this.quote, productOrder.quote) &&
        Objects.equals(this.relatedParty, productOrder.relatedParty) &&
        Objects.equals(this.state, productOrder.state) &&
        Objects.equals(this.atBaseType, productOrder.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOrder.atSchemaLocation) &&
        Objects.equals(this.atType, productOrder.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationDate, cancellationReason, category, completionDate, description, expectedCompletionDate, externalId, notificationContact, orderDate, priority, requestedCompletionDate, requestedStartDate, agreement, billingAccount, channel, note, orderTotalPrice, payment, productOfferingQualification, productOrderItem, quote, relatedParty, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    productOfferingQualification: ").append(toIndentedString(productOfferingQualification)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

