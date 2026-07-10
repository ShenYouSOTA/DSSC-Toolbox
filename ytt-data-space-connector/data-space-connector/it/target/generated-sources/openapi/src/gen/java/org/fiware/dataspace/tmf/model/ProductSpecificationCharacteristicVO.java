package org.fiware.dataspace.tmf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fiware.dataspace.tmf.model.CharacteristicValueSpecificationVO;
import org.fiware.dataspace.tmf.model.ProductSpecificationCharacteristicRelationshipVO;
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
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
 **/
@ApiModel(description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
@JsonTypeName("ProductSpecificationCharacteristic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-20T17:24:20.082499380+08:00[Asia/Shanghai]", comments = "Generator version: 7.9.0")@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)

public class ProductSpecificationCharacteristicVO   {
  private String id;
  private Boolean configurable;
  private String description;
  private Boolean extensible;
  private Boolean isUnique;
  private Integer maxCardinality;
  private Integer minCardinality;
  private String name;
  private String regex;
  private String valueType;
  private @Valid List<@Valid ProductSpecificationCharacteristicRelationshipVO> productSpecCharRelationship = new ArrayList<>();
  private @Valid List<@Valid CharacteristicValueSpecificationVO> productSpecCharacteristicValue = new ArrayList<>();
  private TimePeriodVO validFor;
  private String atBaseType;
  private URI atSchemaLocation;
  private String atType;
  private String atValueSchemaLocation;

  /**
   * Unique ID for the characteristic
   **/
  public ProductSpecificationCharacteristicVO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique ID for the characteristic")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   **/
  public ProductSpecificationCharacteristicVO configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  
  @ApiModelProperty(value = "If true, the Boolean indicates that the target Characteristic is configurable")
  @JsonProperty("configurable")
  public Boolean getConfigurable() {
    return configurable;
  }

  @JsonProperty("configurable")
  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   **/
  public ProductSpecificationCharacteristicVO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A narrative that explains the CharacteristicSpecification.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   **/
  public ProductSpecificationCharacteristicVO extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.")
  @JsonProperty("extensible")
  public Boolean getExtensible() {
    return extensible;
  }

  @JsonProperty("extensible")
  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \&quot;unique while value is in effect\&quot; and \&quot;unique whether value is in effect or not\&quot;
   **/
  public ProductSpecificationCharacteristicVO isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  
  @ApiModelProperty(value = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"")
  @JsonProperty("isUnique")
  public Boolean getIsUnique() {
    return isUnique;
  }

  @JsonProperty("isUnique")
  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   **/
  public ProductSpecificationCharacteristicVO maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.")
  @JsonProperty("maxCardinality")
  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  @JsonProperty("maxCardinality")
  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   **/
  public ProductSpecificationCharacteristicVO minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.")
  @JsonProperty("minCardinality")
  public Integer getMinCardinality() {
    return minCardinality;
  }

  @JsonProperty("minCardinality")
  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   **/
  public ProductSpecificationCharacteristicVO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   **/
  public ProductSpecificationCharacteristicVO regex(String regex) {
    this.regex = regex;
    return this;
  }

  
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value.")
  @JsonProperty("regex")
  public String getRegex() {
    return regex;
  }

  @JsonProperty("regex")
  public void setRegex(String regex) {
    this.regex = regex;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   **/
  public ProductSpecificationCharacteristicVO valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }

  @JsonProperty("valueType")
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   **/
  public ProductSpecificationCharacteristicVO productSpecCharRelationship(List<@Valid ProductSpecificationCharacteristicRelationshipVO> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.")
  @JsonProperty("productSpecCharRelationship")
  @Valid public List<@Valid ProductSpecificationCharacteristicRelationshipVO> getProductSpecCharRelationship() {
    return productSpecCharRelationship;
  }

  @JsonProperty("productSpecCharRelationship")
  public void setProductSpecCharRelationship(List<@Valid ProductSpecificationCharacteristicRelationshipVO> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
  }

  public ProductSpecificationCharacteristicVO addProductSpecCharRelationshipItem(ProductSpecificationCharacteristicRelationshipVO productSpecCharRelationshipItem) {
    if (this.productSpecCharRelationship == null) {
      this.productSpecCharRelationship = new ArrayList<>();
    }

    this.productSpecCharRelationship.add(productSpecCharRelationshipItem);
    return this;
  }

  public ProductSpecificationCharacteristicVO removeProductSpecCharRelationshipItem(ProductSpecificationCharacteristicRelationshipVO productSpecCharRelationshipItem) {
    if (productSpecCharRelationshipItem != null && this.productSpecCharRelationship != null) {
      this.productSpecCharRelationship.remove(productSpecCharRelationshipItem);
    }

    return this;
  }
  /**
   * A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.
   **/
  public ProductSpecificationCharacteristicVO productSpecCharacteristicValue(List<@Valid CharacteristicValueSpecificationVO> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
    return this;
  }

  
  @ApiModelProperty(value = "A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.")
  @JsonProperty("productSpecCharacteristicValue")
  @Valid public List<@Valid CharacteristicValueSpecificationVO> getProductSpecCharacteristicValue() {
    return productSpecCharacteristicValue;
  }

  @JsonProperty("productSpecCharacteristicValue")
  public void setProductSpecCharacteristicValue(List<@Valid CharacteristicValueSpecificationVO> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
  }

  public ProductSpecificationCharacteristicVO addProductSpecCharacteristicValueItem(CharacteristicValueSpecificationVO productSpecCharacteristicValueItem) {
    if (this.productSpecCharacteristicValue == null) {
      this.productSpecCharacteristicValue = new ArrayList<>();
    }

    this.productSpecCharacteristicValue.add(productSpecCharacteristicValueItem);
    return this;
  }

  public ProductSpecificationCharacteristicVO removeProductSpecCharacteristicValueItem(CharacteristicValueSpecificationVO productSpecCharacteristicValueItem) {
    if (productSpecCharacteristicValueItem != null && this.productSpecCharacteristicValue != null) {
      this.productSpecCharacteristicValue.remove(productSpecCharacteristicValueItem);
    }

    return this;
  }
  /**
   **/
  public ProductSpecificationCharacteristicVO validFor(TimePeriodVO validFor) {
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

  /**
   * When sub-classing, this defines the super-class
   **/
  public ProductSpecificationCharacteristicVO atBaseType(String atBaseType) {
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
  public ProductSpecificationCharacteristicVO atSchemaLocation(URI atSchemaLocation) {
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
   * When sub-classing, this defines the sub-class Extensible name
   **/
  public ProductSpecificationCharacteristicVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  @JsonProperty("@type")
  public void setAtType(String atType) {
    this.atType = atType;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   **/
  public ProductSpecificationCharacteristicVO atValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
    return this;
  }

  
  @ApiModelProperty(value = "This (optional) field provides a link to the schema describing the value type.")
  @JsonProperty("@valueSchemaLocation")
  public String getAtValueSchemaLocation() {
    return atValueSchemaLocation;
  }

  @JsonProperty("@valueSchemaLocation")
  public void setAtValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationCharacteristicVO productSpecificationCharacteristic = (ProductSpecificationCharacteristicVO) o;
    return Objects.equals(this.id, productSpecificationCharacteristic.id) &&
        Objects.equals(this.configurable, productSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, productSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, productSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, productSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, productSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, productSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, productSpecificationCharacteristic.name) &&
        Objects.equals(this.regex, productSpecificationCharacteristic.regex) &&
        Objects.equals(this.valueType, productSpecificationCharacteristic.valueType) &&
        Objects.equals(this.productSpecCharRelationship, productSpecificationCharacteristic.productSpecCharRelationship) &&
        Objects.equals(this.productSpecCharacteristicValue, productSpecificationCharacteristic.productSpecCharacteristicValue) &&
        Objects.equals(this.validFor, productSpecificationCharacteristic.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationCharacteristic.atType) &&
        Objects.equals(this.atValueSchemaLocation, productSpecificationCharacteristic.atValueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, productSpecCharRelationship, productSpecCharacteristicValue, validFor, atBaseType, atSchemaLocation, atType, atValueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristicVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    productSpecCharRelationship: ").append(toIndentedString(productSpecCharRelationship)).append("\n");
    sb.append("    productSpecCharacteristicValue: ").append(toIndentedString(productSpecCharacteristicValue)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atValueSchemaLocation: ").append(toIndentedString(atValueSchemaLocation)).append("\n");
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

