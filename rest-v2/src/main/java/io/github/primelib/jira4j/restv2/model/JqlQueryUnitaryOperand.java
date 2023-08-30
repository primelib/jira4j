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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JqlQueryUnitaryOperand
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
     * Constructs a validated instance of {@link JqlQueryUnitaryOperand}.
     *
     * @param spec the specification to process
     */
    public JqlQueryUnitaryOperand(Consumer<JqlQueryUnitaryOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryUnitaryOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryUnitaryOperand(Consumer)} instead.
     * @param encodedValue Encoded value, which can be used directly in a JQL query.
     * @param value The operand value.
     * @param arguments The list of function arguments.
     * @param encodedOperand Encoded operand, which can be used directly in a JQL query.
     * @param function The name of the function.
     * @param keyword The keyword that is the operand value.
     */
    @ApiStatus.Internal
    public JqlQueryUnitaryOperand(String encodedValue, String value, List<String> arguments, String encodedOperand, String function, KeywordEnum keyword) {
        this.encodedValue = encodedValue;
        this.value = value;
        this.arguments = arguments;
        this.encodedOperand = encodedOperand;
        this.function = function;
        this.keyword = keyword;
    }

    /**
     * The keyword that is the operand value.
     */
    @AllArgsConstructor
    public enum KeywordEnum {
        EMPTY("empty");

        private static final KeywordEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeywordEnum of(String input) {
            if (input != null) {
                for (KeywordEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
