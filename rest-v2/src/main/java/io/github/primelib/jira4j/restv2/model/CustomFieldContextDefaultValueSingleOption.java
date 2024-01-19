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
 * CustomFieldContextDefaultValueSingleOption
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
    "contextId",
    "optionId",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueSingleOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueSingleOption {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The ID of the default option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleOption}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueSingleOption(Consumer<CustomFieldContextDefaultValueSingleOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueSingleOption(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param optionId The ID of the default option.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueSingleOption(String contextId, String optionId, String type) {
        this.contextId = contextId;
        this.optionId = optionId;
        this.type = type;
    }

}
