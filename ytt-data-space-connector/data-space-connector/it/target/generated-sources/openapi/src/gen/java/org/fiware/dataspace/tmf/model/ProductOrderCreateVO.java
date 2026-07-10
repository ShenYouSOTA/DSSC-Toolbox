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
 * A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa, Skipped properties: id,href,completionDate,orderDate,state,expectedCompletionDate,productOrderItem.state
 **/
@ApiModel(description = "A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa, Skipped properties: id,href,completionDate,orderDate,state,expectedCompletionDate,productOrderItem.state")
@JsonTypeName("ProductOrder_Create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:24.996391917+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductOrderCreateVO   {
  private Date cancellationDate;
  private String cancellationReason;
  private String category;
  private String description;
  private String externalId;
  private String notificationContact;
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
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;

  /**
   * Date when the order is cancelled. This is used when order is cancelled. 
   **/
  public ProductOrderCreateVO cancellationDate(Date cancellationDate) {
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
  public ProductOrderCreateVO cancellationReason(String cancellationReason) {
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
  public ProductOrderCreateVO category(String category) {
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
   * Description of the product order
   **/
  public ProductOrderCreateVO description(String description) {
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
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
   **/
  public ProductOrderCreateVO externalId(String externalId) {
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
  public ProductOrderCreateVO notificationContact(String notificationContact) {
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
   * A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)
   **/
  public ProductOrderCreateVO priority(String priority) {
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
  public ProductOrderCreateVO requestedCompletionDate(Date requestedCompletionDate) {
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
  public ProductOrderCreateVO requestedStartDate(Date requestedStartDate) {
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
  public ProductOrderCreateVO agreement(List<@Valid AgreementRefVO> agreement) {
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

  public ProductOrderCreateVO addAgreementItem(AgreementRefVO agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }

    this.agreement.add(agreementItem);
    return this;
  }

  public ProductOrderCreateVO removeAgreementItem(AgreementRefVO agreementItem) {
    if (agreementItem != null && this.agreement != null) {
      this.agreement.remove(agreementItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO billingAccount(BillingAccountRefVO billingAccount) {
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
  public ProductOrderCreateVO channel(List<@Valid RelatedChannelVO> channel) {
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

  public ProductOrderCreateVO addChannelItem(RelatedChannelVO channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<>();
    }

    this.channel.add(channelItem);
    return this;
  }

  public ProductOrderCreateVO removeChannelItem(RelatedChannelVO channelItem) {
    if (channelItem != null && this.channel != null) {
      this.channel.remove(channelItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO note(List<@Valid NoteVO> note) {
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

  public ProductOrderCreateVO addNoteItem(NoteVO noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }

    this.note.add(noteItem);
    return this;
  }

  public ProductOrderCreateVO removeNoteItem(NoteVO noteItem) {
    if (noteItem != null && this.note != null) {
      this.note.remove(noteItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO orderTotalPrice(List<@Valid OrderPriceVO> orderTotalPrice) {
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

  public ProductOrderCreateVO addOrderTotalPriceItem(OrderPriceVO orderTotalPriceItem) {
    if (this.orderTotalPrice == null) {
      this.orderTotalPrice = new ArrayList<>();
    }

    this.orderTotalPrice.add(orderTotalPriceItem);
    return this;
  }

  public ProductOrderCreateVO removeOrderTotalPriceItem(OrderPriceVO orderTotalPriceItem) {
    if (orderTotalPriceItem != null && this.orderTotalPrice != null) {
      this.orderTotalPrice.remove(orderTotalPriceItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO payment(List<@Valid PaymentRefVO> payment) {
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

  public ProductOrderCreateVO addPaymentItem(PaymentRefVO paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<>();
    }

    this.payment.add(paymentItem);
    return this;
  }

  public ProductOrderCreateVO removePaymentItem(PaymentRefVO paymentItem) {
    if (paymentItem != null && this.payment != null) {
      this.payment.remove(paymentItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO productOfferingQualification(List<@Valid ProductOfferingQualificationRefVO> productOfferingQualification) {
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

  public ProductOrderCreateVO addProductOfferingQualificationItem(ProductOfferingQualificationRefVO productOfferingQualificationItem) {
    if (this.productOfferingQualification == null) {
      this.productOfferingQualification = new ArrayList<>();
    }

    this.productOfferingQualification.add(productOfferingQualificationItem);
    return this;
  }

  public ProductOrderCreateVO removeProductOfferingQualificationItem(ProductOfferingQualificationRefVO productOfferingQualificationItem) {
    if (productOfferingQualificationItem != null && this.productOfferingQualification != null) {
      this.productOfferingQualification.remove(productOfferingQualificationItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO productOrderItem(List<@Valid ProductOrderItemVO> productOrderItem) {
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

  public ProductOrderCreateVO addProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<>();
    }

    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  public ProductOrderCreateVO removeProductOrderItemItem(ProductOrderItemVO productOrderItemItem) {
    if (productOrderItemItem != null && this.productOrderItem != null) {
      this.productOrderItem.remove(productOrderItemItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO quote(List<@Valid QuoteRefVO> quote) {
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

  public ProductOrderCreateVO addQuoteItem(QuoteRefVO quoteItem) {
    if (this.quote == null) {
      this.quote = new ArrayList<>();
    }

    this.quote.add(quoteItem);
    return this;
  }

  public ProductOrderCreateVO removeQuoteItem(QuoteRefVO quoteItem) {
    if (quoteItem != null && this.quote != null) {
      this.quote.remove(quoteItem);
    }

    return this;
  }
  /**
   **/
  public ProductOrderCreateVO relatedParty(List<@Valid RelatedPartyVO> relatedParty) {
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

  public ProductOrderCreateVO addRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }

    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  public ProductOrderCreateVO removeRelatedPartyItem(RelatedPartyVO relatedPartyItem) {
    if (relatedPartyItem != null && this.relatedParty != null) {
      this.relatedParty.remove(relatedPartyItem);
    }

    return this;
  }
  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductOrderCreateVO atBaseType(String atBaseType) {
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
  public ProductOrderCreateVO atSchemaLocation(URI atSchemaLocation) {
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
  public ProductOrderCreateVO atType(String atType) {
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
    ProductOrderCreateVO productOrderCreate = (ProductOrderCreateVO) o;
    return Objects.equals(this.cancellationDate, productOrderCreate.cancellationDate) &&
        Objects.equals(this.cancellationReason, productOrderCreate.cancellationReason) &&
        Objects.equals(this.category, productOrderCreate.category) &&
        Objects.equals(this.description, productOrderCreate.description) &&
        Objects.equals(this.externalId, productOrderCreate.externalId) &&
        Objects.equals(this.notificationContact, productOrderCreate.notificationContact) &&
        Objects.equals(this.priority, productOrderCreate.priority) &&
        Objects.equals(this.requestedCompletionDate, productOrderCreate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, productOrderCreate.requestedStartDate) &&
        Objects.equals(this.agreement, productOrderCreate.agreement) &&
        Objects.equals(this.billingAccount, productOrderCreate.billingAccount) &&
        Objects.equals(this.channel, productOrderCreate.channel) &&
        Objects.equals(this.note, productOrderCreate.note) &&
        Objects.equals(this.orderTotalPrice, productOrderCreate.orderTotalPrice) &&
        Objects.equals(this.payment, productOrderCreate.payment) &&
        Objects.equals(this.productOfferingQualification, productOrderCreate.productOfferingQualification) &&
        Objects.equals(this.productOrderItem, productOrderCreate.productOrderItem) &&
        Objects.equals(this.quote, productOrderCreate.quote) &&
        Objects.equals(this.relatedParty, productOrderCreate.relatedParty) &&
        Objects.equals(this.atBaseType, productOrderCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOrderCreate.atSchemaLocation) &&
        Objects.equals(this.atType, productOrderCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationDate, cancellationReason, category, description, externalId, notificationContact, priority, requestedCompletionDate, requestedStartDate, agreement, billingAccount, channel, note, orderTotalPrice, payment, productOfferingQualification, productOrderItem, quote, relatedParty, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderCreateVO {\n");
    
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
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

