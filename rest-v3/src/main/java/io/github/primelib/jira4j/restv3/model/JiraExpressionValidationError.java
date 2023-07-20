package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionValidationError
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JiraExpressionValidationError}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionValidationError(Consumer<JiraExpressionValidationError> spec) {
        spec.accept(this);
    }

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
     * The error type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SYNTAX("syntax"),
        TYPE("type"),
        OTHER("other");

        private final String value;
    }

}
