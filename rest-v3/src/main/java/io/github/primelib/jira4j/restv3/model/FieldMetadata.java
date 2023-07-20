package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allowedValues",
    "autoCompleteUrl",
    "configuration",
    "defaultValue",
    "hasDefaultValue",
    "key",
    "name",
    "operations",
    "required",
    "schema"
})
@JsonTypeName("FieldMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldMetadata {

    /**
     * Constructs a validated implementation of {@link FieldMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldMetadata(Consumer<FieldMetadata> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> _configuration = new HashMap<>();

    /**
     * The default value of the field.
     */
    @JsonProperty("defaultValue")
    protected Object defaultValue = null;

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
    protected List<String> operations = new ArrayList<>();

    /**
     * Whether the field is required.
     */
    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("schema")
    protected FieldMetadataSchema schema;


}
