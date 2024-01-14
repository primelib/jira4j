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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldCreateMetadataSchema
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
    "configuration",
    "custom",
    "customId",
    "items",
    "system",
    "type"
})
@JsonTypeName("FieldCreateMetadata_schema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldCreateMetadataSchema {

    /**
     * If the field is a custom field, the configuration of the field.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> configuration;

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

    /**
     * Constructs a validated instance of {@link FieldCreateMetadataSchema}.
     *
     * @param spec the specification to process
     */
    public FieldCreateMetadataSchema(Consumer<FieldCreateMetadataSchema> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldCreateMetadataSchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldCreateMetadataSchema(Consumer)} instead.
     * @param configuration If the field is a custom field, the configuration of the field.
     * @param custom If the field is a custom field, the URI of the field.
     * @param customId If the field is a custom field, the custom ID of the field.
     * @param items When the data type is an array, the name of the field items within the array.
     * @param system If the field is a system field, the name of the field.
     * @param type The data type of the field.
     */
    @ApiStatus.Internal
    public FieldCreateMetadataSchema(Map<String, Object> configuration, String custom, Long customId, String items, String system, String type) {
        this.configuration = configuration;
        this.custom = custom;
        this.customId = customId;
        this.items = items;
        this.system = system;
        this.type = type;
    }

}
