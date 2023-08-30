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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunctionOperand
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
    "arguments",
    "encodedOperand",
    "function"
})
@JsonTypeName("FunctionOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FunctionOperand {

    /**
     * The list of function arguments.
     */
    @JsonProperty("arguments")
    protected List<String> arguments;

    /**
     * Encoded operand, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedOperand")
    protected String encodedOperand;

    /**
     * The name of the function.
     */
    @JsonProperty("function")
    protected String function;

    /**
     * Constructs a validated instance of {@link FunctionOperand}.
     *
     * @param spec the specification to process
     */
    public FunctionOperand(Consumer<FunctionOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FunctionOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FunctionOperand(Consumer)} instead.
     * @param arguments The list of function arguments.
     * @param encodedOperand Encoded operand, which can be used directly in a JQL query.
     * @param function The name of the function.
     */
    @ApiStatus.Internal
    public FunctionOperand(List<String> arguments, String encodedOperand, String function) {
        this.arguments = arguments;
        this.encodedOperand = encodedOperand;
        this.function = function;
    }

}
