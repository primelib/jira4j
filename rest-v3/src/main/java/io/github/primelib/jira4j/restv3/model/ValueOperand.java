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
 * ValueOperand
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
    "encodedValue",
    "value"
})
@JsonTypeName("ValueOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValueOperand {

    /**
     * Encoded value, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedValue")
    protected String encodedValue;

    /**
     * The operand value.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link ValueOperand}.
     *
     * @param spec the specification to process
     */
    public ValueOperand(Consumer<ValueOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ValueOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ValueOperand(Consumer)} instead.
     * @param encodedValue Encoded value, which can be used directly in a JQL query.
     * @param value The operand value.
     */
    @ApiStatus.Internal
    public ValueOperand(String encodedValue, String value) {
        this.encodedValue = encodedValue;
        this.value = value;
    }

}
