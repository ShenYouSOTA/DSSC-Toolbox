package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.fiware.dataspace.tmf.model.OrganizationAttributeValueChangeEventPayloadVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The notification data structure
 **/
@ApiModel(description = "The notification data structure")
@JsonTypeName("OrganizationAttributeValueChangeEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:17.360110070+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class OrganizationAttributeValueChangeEventVO   {
  private String eventId;
  private String fieldPath;
  private Date eventTime;
  private String description;
  private Date timeOcurred;
  private String title;
  private String eventType;
  private String domain;
  private String priority;
  private String correlationId;
  private OrganizationAttributeValueChangeEventPayloadVO event;

  /**
   * The identifier of the notification.
   **/
  public OrganizationAttributeValueChangeEventVO eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(value = "The identifier of the notification.")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  @JsonProperty("eventId")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The path identifying the object field concerned by this notification.
   **/
  public OrganizationAttributeValueChangeEventVO fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  
  @ApiModelProperty(value = "The path identifying the object field concerned by this notification.")
  @JsonProperty("fieldPath")
  public String getFieldPath() {
    return fieldPath;
  }

  @JsonProperty("fieldPath")
  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  /**
   * Time of the event occurrence.
   **/
  public OrganizationAttributeValueChangeEventVO eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  
  @ApiModelProperty(value = "Time of the event occurrence.")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }

  @JsonProperty("eventTime")
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * An explnatory of the event.
   **/
  public OrganizationAttributeValueChangeEventVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "An explnatory of the event.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The time the event occured.
   **/
  public OrganizationAttributeValueChangeEventVO timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  
  @ApiModelProperty(value = "The time the event occured.")
  @JsonProperty("timeOcurred")
  public Date getTimeOcurred() {
    return timeOcurred;
  }

  @JsonProperty("timeOcurred")
  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  /**
   * The title of the event.
   **/
  public OrganizationAttributeValueChangeEventVO title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The title of the event.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The type of the notification.
   **/
  public OrganizationAttributeValueChangeEventVO eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the notification.")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  @JsonProperty("eventType")
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * The domain of the event.
   **/
  public OrganizationAttributeValueChangeEventVO domain(String domain) {
    this.domain = domain;
    return this;
  }

  
  @ApiModelProperty(value = "The domain of the event.")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  @JsonProperty("domain")
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * A priority.
   **/
  public OrganizationAttributeValueChangeEventVO priority(String priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "A priority.")
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * The correlation id for this event.
   **/
  public OrganizationAttributeValueChangeEventVO correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  
  @ApiModelProperty(value = "The correlation id for this event.")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  @JsonProperty("correlationId")
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   **/
  public OrganizationAttributeValueChangeEventVO event(OrganizationAttributeValueChangeEventPayloadVO event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  @Valid public OrganizationAttributeValueChangeEventPayloadVO getEvent() {
    return event;
  }

  @JsonProperty("event")
  public void setEvent(OrganizationAttributeValueChangeEventPayloadVO event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAttributeValueChangeEventVO organizationAttributeValueChangeEvent = (OrganizationAttributeValueChangeEventVO) o;
    return Objects.equals(this.eventId, organizationAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.fieldPath, organizationAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.eventTime, organizationAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.description, organizationAttributeValueChangeEvent.description) &&
        Objects.equals(this.timeOcurred, organizationAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.title, organizationAttributeValueChangeEvent.title) &&
        Objects.equals(this.eventType, organizationAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.domain, organizationAttributeValueChangeEvent.domain) &&
        Objects.equals(this.priority, organizationAttributeValueChangeEvent.priority) &&
        Objects.equals(this.correlationId, organizationAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.event, organizationAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, fieldPath, eventTime, description, timeOcurred, title, eventType, domain, priority, correlationId, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAttributeValueChangeEventVO {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

