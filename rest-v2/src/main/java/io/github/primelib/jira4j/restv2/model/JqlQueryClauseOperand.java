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
 * JqlQueryClauseOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "encodedOperand",
    "values",
    "encodedValue",
    "value",
    "arguments",
    "function",
    "keyword"
})
@JsonTypeName("JqlQueryClauseOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryClauseOperand {

    /**
     * Constructs a validated implementation of {@link JqlQueryClauseOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryClauseOperand(Consumer<JqlQueryClauseOperand> spec) {
        spec.accept(this);
    }

    /**
     * Encoded operand, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedOperand")
    protected String encodedOperand;

    /**
     * The list of operand values.
     */
    @JsonProperty("values")
    protected List<JqlQueryUnitaryOperand> values = new ArrayList<>();

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
