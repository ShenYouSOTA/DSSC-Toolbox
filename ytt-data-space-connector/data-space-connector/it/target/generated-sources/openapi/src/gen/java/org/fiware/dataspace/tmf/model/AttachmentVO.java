package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.fiware.dataspace.tmf.model.QuantityVO;
import org.fiware.dataspace.tmf.model.TimePeriodVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Complements the description of an element (for instance a product) through video, pictures...
 **/
@ApiModel(description = "Complements the description of an element (for instance a product) through video, pictures...")
@JsonTypeName("Attachment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class AttachmentVO   {
  private String id;
  private URI href;
  private String attachmentType;
  private String content;
  private String description;
  private String mimeType;
  private String name;
  private URI url;
  private QuantityVO size;
  private TimePeriodVO validFor;

  /**
   * Unique identifier for this particular attachment
   **/
  public AttachmentVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "4aafacbd-11ff-4dc8-b445-305f2215715f", value = "Unique identifier for this particular attachment")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * URI for this Attachment
   **/
  public AttachmentVO href(URI href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(example = "http://host/Attachment/4aafacbd-11ff-4dc8-b445-305f2215715f", value = "URI for this Attachment")
  @JsonProperty("href")
  public URI getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(URI href) {
    this.href = href;
  }

  /**
   * Attachment type such as video, picture
   **/
  public AttachmentVO attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  
  @ApiModelProperty(example = "video", value = "Attachment type such as video, picture")
  @JsonProperty("attachmentType")
  public String getAttachmentType() {
    return attachmentType;
  }

  @JsonProperty("attachmentType")
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  /**
   * The actual contents of the attachment object, if embedded, encoded as base64
   **/
  public AttachmentVO content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The actual contents of the attachment object, if embedded, encoded as base64")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * A narrative text describing the content of the attachment
   **/
  public AttachmentVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Photograph of the Product", value = "A narrative text describing the content of the attachment")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Attachment mime type such as extension file for video, picture and document
   **/
  public AttachmentVO mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  
  @ApiModelProperty(value = "Attachment mime type such as extension file for video, picture and document")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }

  @JsonProperty("mimeType")
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The name of the attachment
   **/
  public AttachmentVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the attachment")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Uniform Resource Locator, is a web page address (a subset of URI)
   **/
  public AttachmentVO url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "http://host/Content/4aafacbd-11ff-4dc8-b445-305f2215715f", value = "Uniform Resource Locator, is a web page address (a subset of URI)")
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   **/
  public AttachmentVO size(QuantityVO size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  @Valid public QuantityVO getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(QuantityVO size) {
    this.size = size;
  }

  /**
   **/
  public AttachmentVO validFor(TimePeriodVO validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("validFor")
  @Valid public TimePeriodVO getValidFor() {
    return validFor;
  }

  @JsonProperty("validFor")
  public void setValidFor(TimePeriodVO validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentVO attachment = (AttachmentVO) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.href, attachment.href) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.validFor, attachment.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, attachmentType, content, description, mimeType, name, url, size, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

