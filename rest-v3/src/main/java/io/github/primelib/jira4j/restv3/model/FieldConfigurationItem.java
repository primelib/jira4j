package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationItem
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "isHidden",
    "isRequired",
    "renderer"
})
@JsonTypeName("FieldConfigurationItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationItem {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationItem}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationItem(Consumer<FieldConfigurationItem> spec) {
        spec.accept(this);
    }

    /**
     * The description of the field within the field configuration.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the field within the field configuration.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the field is hidden in the field configuration.
     */
    @JsonProperty("isHidden")
    protected Boolean isHidden;

    /**
     * Whether the field is required in the field configuration.
     */
    @JsonProperty("isRequired")
    protected Boolean isRequired;

    /**
     * The renderer type for the field within the field configuration.
     */
    @JsonProperty("renderer")
    protected String renderer;


}
