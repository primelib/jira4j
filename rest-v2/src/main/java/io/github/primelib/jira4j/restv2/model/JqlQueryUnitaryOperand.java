package io.github.primelib.jira4j.restv2.model;

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
 * JqlQueryUnitaryOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "encodedValue",
    "value",
    "arguments",
    "encodedOperand",
    "function",
    "keyword"
})
@JsonTypeName("JqlQueryUnitaryOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryUnitaryOperand {

    /**
     * Constructs a validated implementation of {@link JqlQueryUnitaryOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryUnitaryOperand(Consumer<JqlQueryUnitaryOperand> spec) {
        spec.accept(this);
    }

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

    /**
     * The keyword that is the operand value.
     */
    @JsonProperty("keyword")
    protected KeywordEnum keyword;


    /**
     * The keyword that is the operand value.
     */
    @AllArgsConstructor
    public enum KeywordEnum {
        EMPTY("empty");

        private final String value;
    }

}
