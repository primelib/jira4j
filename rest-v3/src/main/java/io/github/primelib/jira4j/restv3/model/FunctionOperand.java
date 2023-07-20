package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunctionOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "arguments",
    "encodedOperand",
    "function"
})
@JsonTypeName("FunctionOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FunctionOperand {

    /**
     * Constructs a validated implementation of {@link FunctionOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FunctionOperand(Consumer<FunctionOperand> spec) {
        spec.accept(this);
    }

    /**
     * The list of function arguments.
     */
    @JsonProperty("arguments")
    protected List<String> arguments = new ArrayList<>();

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


}
