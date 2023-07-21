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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueryClauseOperand
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
     * Encoded operand, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedOperand")
    protected String encodedOperand;

    /**
     * The list of operand values.
     */
    @JsonProperty("values")
    protected List<JqlQueryUnitaryOperand> values;

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
    protected List<String> arguments;

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
     * Constructs a validated instance of {@link JqlQueryClauseOperand}.
     *
     * @param spec the specification to process
     */
    public JqlQueryClauseOperand(Consumer<JqlQueryClauseOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryClauseOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryClauseOperand(Consumer)} instead.
     * @param encodedOperand Encoded operand, which can be used directly in a JQL query.
     * @param values The list of operand values.
     * @param encodedValue Encoded value, which can be used directly in a JQL query.
     * @param value The operand value.
     * @param arguments The list of function arguments.
     * @param function The name of the function.
     * @param keyword The keyword that is the operand value.
     */
    @ApiStatus.Internal
    public JqlQueryClauseOperand(String encodedOperand, List<JqlQueryUnitaryOperand> values, String encodedValue, String value, List<String> arguments, String function, KeywordEnum keyword) {
        this.encodedOperand = encodedOperand;
        this.values = values;
        this.encodedValue = encodedValue;
        this.value = value;
        this.arguments = arguments;
        this.function = function;
        this.keyword = keyword;
    }

    /**
     * The keyword that is the operand value.
     */
    @AllArgsConstructor
    public enum KeywordEnum {
        EMPTY("empty");

        private final String value;
    }

}
