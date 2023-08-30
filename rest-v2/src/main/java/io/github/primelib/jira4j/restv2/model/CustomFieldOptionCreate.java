package io.github.primelib.jira4j.restv2.model;

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
 * CustomFieldOptionCreate
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
    "optionId",
    "value"
})
@JsonTypeName("CustomFieldOptionCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldOptionCreate {

    /**
     * Whether the option is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    /**
     * For cascading options, the ID of the custom field object containing the cascading option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CustomFieldOptionCreate}.
     *
     * @param spec the specification to process
     */
    public CustomFieldOptionCreate(Consumer<CustomFieldOptionCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldOptionCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldOptionCreate(Consumer)} instead.
     * @param disabled Whether the option is disabled.
     * @param optionId For cascading options, the ID of the custom field object containing the cascading option.
     * @param value The value of the custom field option.
     */
    @ApiStatus.Internal
    public CustomFieldOptionCreate(Boolean disabled, String optionId, String value) {
        this.disabled = disabled;
        this.optionId = optionId;
        this.value = value;
    }

}
