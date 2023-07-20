package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldMetadataSchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "custom",
    "customId",
    "items",
    "system",
    "type"
})
@JsonTypeName("FieldMetadata_schema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldMetadataSchema {

    /**
     * Constructs a validated implementation of {@link FieldMetadataSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldMetadataSchema(Consumer<FieldMetadataSchema> spec) {
        spec.accept(this);
    }

    /**
     * If the field is a custom field, the configuration of the field.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> _configuration = new HashMap<>();

    /**
     * If the field is a custom field, the URI of the field.
     */
    @JsonProperty("custom")
    protected String custom;

    /**
     * If the field is a custom field, the custom ID of the field.
     */
    @JsonProperty("customId")
    protected Long customId;

    /**
     * When the data type is an array, the name of the field items within the array.
     */
    @JsonProperty("items")
    protected String items;

    /**
     * If the field is a system field, the name of the field.
     */
    @JsonProperty("system")
    protected String system;

    /**
     * The data type of the field.
     */
    @JsonProperty("type")
    protected String type;


}
