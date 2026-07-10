package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.fiware.dataspace.tmf.model.ServiceSpecificationCreateEventPayloadVO;
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
@JsonTypeName("ServiceSpecificationCreateEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ServiceSpecificationCreateEventVO   {
  private ServiceSpecificationCreateEventPayloadVO event;
  private String eventId;
  private Date eventTime;
  private String eventType;
  private String correlationId;
  private String domain;
  private String title;
  private String description;
  private String priority;
  private Date timeOcurred;

  /**
   **/
  public ServiceSpecificationCreateEventVO event(ServiceSpecificationCreateEventPayloadVO event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  @Valid public ServiceSpecificationCreateEventPayloadVO getEvent() {
    return event;
  }

  @JsonProperty("event")
  public void setEvent(ServiceSpecificationCreateEventPayloadVO event) {
    this.event = event;
  }

  /**
   * The identifier of the notification.
   **/
  public ServiceSpecificationCreateEventVO eventId(String eventId) {
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
   * Time of the event occurrence.
   **/
  public ServiceSpecificationCreateEventVO eventTime(Date eventTime) {
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
   * The type of the notification.
   **/
  public ServiceSpecificationCreateEventVO eventType(String eventType) {
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
   * The correlation id for this event.
   **/
  public ServiceSpecificationCreateEventVO correlationId(String correlationId) {
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
   * The domain of the event.
   **/
  public ServiceSpecificationCreateEventVO domain(String domain) {
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
   * The title of the event.
   **/
  public ServiceSpecificationCreateEventVO title(String title) {
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
   * An explnatory of the event.
   **/
  public ServiceSpecificationCreateEventVO description(String description) {
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
   * A priority.
   **/
  public ServiceSpecificationCreateEventVO priority(String priority) {
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
   * The time the event occured.
   **/
  public ServiceSpecificationCreateEventVO timeOcurred(Date timeOcurred) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecificationCreateEventVO serviceSpecificationCreateEvent = (ServiceSpecificationCreateEventVO) o;
    return Objects.equals(this.event, serviceSpecificationCreateEvent.event) &&
        Objects.equals(this.eventId, serviceSpecificationCreateEvent.eventId) &&
        Objects.equals(this.eventTime, serviceSpecificationCreateEvent.eventTime) &&
        Objects.equals(this.eventType, serviceSpecificationCreateEvent.eventType) &&
        Objects.equals(this.correlationId, serviceSpecificationCreateEvent.correlationId) &&
        Objects.equals(this.domain, serviceSpecificationCreateEvent.domain) &&
        Objects.equals(this.title, serviceSpecificationCreateEvent.title) &&
        Objects.equals(this.description, serviceSpecificationCreateEvent.description) &&
        Objects.equals(this.priority, serviceSpecificationCreateEvent.priority) &&
        Objects.equals(this.timeOcurred, serviceSpecificationCreateEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificationCreateEventVO {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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

