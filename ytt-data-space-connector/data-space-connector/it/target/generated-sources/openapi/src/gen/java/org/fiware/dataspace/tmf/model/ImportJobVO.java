package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.fiware.dataspace.tmf.model.JobStateTypeVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a task used to import resources from a file
 **/
@ApiModel(description = "Represents a task used to import resources from a file")
@JsonTypeName("ImportJob")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:27.299795020+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ImportJobVO   {
  private String id;
  private URI href;
  private Date completionDate;
  private String contentType;
  private Date creationDate;
  private String errorLog;
  private String path;
  private URI url;
  private JobStateTypeVO status;

  /**
   * Identifier of the import job
   **/
  public ImportJobVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the import job")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the import job
   **/
  public ImportJobVO href(URI href) {
    this.href = href;
    return this;
  }

  
  @ApiModelProperty(value = "Reference of the import job")
  @JsonProperty("href")
  public URI getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(URI href) {
    this.href = href;
  }

  /**
   * Date at which the job was completed
   **/
  public ImportJobVO completionDate(Date completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date at which the job was completed")
  @JsonProperty("completionDate")
  public Date getCompletionDate() {
    return completionDate;
  }

  @JsonProperty("completionDate")
  public void setCompletionDate(Date completionDate) {
    this.completionDate = completionDate;
  }

  /**
   * Indicates the format of the imported data
   **/
  public ImportJobVO contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates the format of the imported data")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  @JsonProperty("contentType")
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * Date at which the job was created
   **/
  public ImportJobVO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Date at which the job was created")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }

  @JsonProperty("creationDate")
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Reason for failure if status is failed
   **/
  public ImportJobVO errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

  
  @ApiModelProperty(value = "Reason for failure if status is failed")
  @JsonProperty("errorLog")
  public String getErrorLog() {
    return errorLog;
  }

  @JsonProperty("errorLog")
  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  /**
   * URL of the root resource where the content of the file specified by the import job must be applied
   **/
  public ImportJobVO path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "URL of the root resource where the content of the file specified by the import job must be applied")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * URL of the file containing the data to be imported
   **/
  public ImportJobVO url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "URL of the file containing the data to be imported")
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
  public ImportJobVO status(JobStateTypeVO status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public JobStateTypeVO getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(JobStateTypeVO status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobVO importJob = (ImportJobVO) o;
    return Objects.equals(this.id, importJob.id) &&
        Objects.equals(this.href, importJob.href) &&
        Objects.equals(this.completionDate, importJob.completionDate) &&
        Objects.equals(this.contentType, importJob.contentType) &&
        Objects.equals(this.creationDate, importJob.creationDate) &&
        Objects.equals(this.errorLog, importJob.errorLog) &&
        Objects.equals(this.path, importJob.path) &&
        Objects.equals(this.url, importJob.url) &&
        Objects.equals(this.status, importJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, completionDate, contentType, creationDate, errorLog, path, url, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

