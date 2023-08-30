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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JiraExpressionValidationError
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
    "column",
    "expression",
    "line",
    "message",
    "type"
})
@JsonTypeName("JiraExpressionValidationError")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionValidationError {

    /**
     * The text column in which the error occurred.
     */
    @JsonProperty("column")
    protected Integer column;

    /**
     * The part of the expression in which the error occurred.
     */
    @JsonProperty("expression")
    protected String expression;

    /**
     * The text line in which the error occurred.
     */
    @JsonProperty("line")
    protected Integer line;

    /**
     * Details about the error.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The error type.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link JiraExpressionValidationError}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionValidationError(Consumer<JiraExpressionValidationError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionValidationError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionValidationError(Consumer)} instead.
     * @param column The text column in which the error occurred.
     * @param expression The part of the expression in which the error occurred.
     * @param line The text line in which the error occurred.
     * @param message Details about the error.
     * @param type The error type.
     */
    @ApiStatus.Internal
    public JiraExpressionValidationError(Integer column, String expression, Integer line, String message, TypeEnum type) {
        this.column = column;
        this.expression = expression;
        this.line = line;
        this.message = message;
        this.type = type;
    }

    /**
     * The error type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SYNTAX("syntax"),
        TYPE("type"),
        OTHER("other");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
