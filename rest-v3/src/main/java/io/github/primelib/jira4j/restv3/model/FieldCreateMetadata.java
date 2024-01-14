package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldCreateMetadata
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "allowedValues",
    "autoCompleteUrl",
    "configuration",
    "defaultValue",
    "fieldId",
    "hasDefaultValue",
    "key",
    "name",
    "operations",
    "required",
    "schema"
})
@JsonTypeName("FieldCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldCreateMetadata {

    /**
     * The list of values allowed in the field.
     */
    @JsonProperty("allowedValues")
    protected List<Object> allowedValues;

    /**
     * The URL that can be used to automatically complete the field.
     */
    @JsonProperty("autoCompleteUrl")
    protected String autoCompleteUrl;

    /**
     * The configuration properties.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> configuration;

    /**
     * The default value of the field.
     */
    @JsonProperty("defaultValue")
    protected Object defaultValue;

    /**
     * The field id.
     */
    @JsonProperty("fieldId")
    protected String fieldId;

    /**
     * Whether the field has a default value.
     */
    @JsonProperty("hasDefaultValue")
    protected Boolean hasDefaultValue;

    /**
     * The key of the field.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the field.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The list of operations that can be performed on the field.
     */
    @JsonProperty("operations")
    protected List<String> operations;

    /**
     * Whether the field is required.
     */
    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("schema")
    protected FieldCreateMetadataSchema schema;

    /**
     * Constructs a validated instance of {@link FieldCreateMetadata}.
     *
     * @param spec the specification to process
     */
    public FieldCreateMetadata(Consumer<FieldCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldCreateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldCreateMetadata(Consumer)} instead.
     * @param allowedValues The list of values allowed in the field.
     * @param autoCompleteUrl The URL that can be used to automatically complete the field.
     * @param configuration The configuration properties.
     * @param defaultValue The default value of the field.
     * @param fieldId The field id.
     * @param hasDefaultValue Whether the field has a default value.
     * @param key The key of the field.
     * @param name The name of the field.
     * @param operations The list of operations that can be performed on the field.
     * @param required Whether the field is required.
     * @param schema schema
     */
    @ApiStatus.Internal
    public FieldCreateMetadata(List<Object> allowedValues, String autoCompleteUrl, Map<String, Object> configuration, Object defaultValue, String fieldId, Boolean hasDefaultValue, String key, String name, List<String> operations, Boolean required, FieldCreateMetadataSchema schema) {
        this.allowedValues = allowedValues;
        this.autoCompleteUrl = autoCompleteUrl;
        this.configuration = configuration;
        this.defaultValue = defaultValue;
        this.fieldId = fieldId;
        this.hasDefaultValue = hasDefaultValue;
        this.key = key;
        this.name = name;
        this.operations = operations;
        this.required = required;
        this.schema = schema;
    }

}
