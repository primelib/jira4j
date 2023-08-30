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
 * CustomFieldContextDefaultValueForgeNumberField
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
    "number",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeNumberField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeNumberField {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The default floating-point number.
     */
    @JsonProperty("number")
    protected Double number;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeNumberField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueForgeNumberField(Consumer<CustomFieldContextDefaultValueForgeNumberField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeNumberField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueForgeNumberField(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param number The default floating-point number.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeNumberField(String contextId, Double number, String type) {
        this.contextId = contextId;
        this.number = number;
        this.type = type;
    }

}
