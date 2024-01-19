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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationItem
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

    /**
     * Constructs a validated instance of {@link FieldConfigurationItem}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationItem(Consumer<FieldConfigurationItem> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationItem}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationItem(Consumer)} instead.
     * @param description The description of the field within the field configuration.
     * @param id The ID of the field within the field configuration.
     * @param isHidden Whether the field is hidden in the field configuration.
     * @param isRequired Whether the field is required in the field configuration.
     * @param renderer The renderer type for the field within the field configuration.
     */
    @ApiStatus.Internal
    public FieldConfigurationItem(String description, String id, Boolean isHidden, Boolean isRequired, String renderer) {
        this.description = description;
        this.id = id;
        this.isHidden = isHidden;
        this.isRequired = isRequired;
        this.renderer = renderer;
    }

}
