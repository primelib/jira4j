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
 * CustomFieldContextOption
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
    "disabled",
    "id",
    "optionId",
    "value"
})
@JsonTypeName("CustomFieldContextOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextOption {

    /**
     * Whether the option is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    /**
     * The ID of the custom field option.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * For cascading options, the ID of the custom field option containing the cascading option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CustomFieldContextOption}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextOption(Consumer<CustomFieldContextOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextOption(Consumer)} instead.
     * @param disabled Whether the option is disabled.
     * @param id The ID of the custom field option.
     * @param optionId For cascading options, the ID of the custom field option containing the cascading option.
     * @param value The value of the custom field option.
     */
    @ApiStatus.Internal
    public CustomFieldContextOption(Boolean disabled, String id, String optionId, String value) {
        this.disabled = disabled;
        this.id = id;
        this.optionId = optionId;
        this.value = value;
    }

}
