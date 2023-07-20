package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionAnalysis
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "complexity",
    "errors",
    "expression",
    "type",
    "valid"
})
@JsonTypeName("JiraExpressionAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionAnalysis {

    /**
     * Constructs a validated implementation of {@link JiraExpressionAnalysis}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionAnalysis(Consumer<JiraExpressionAnalysis> spec) {
        spec.accept(this);
    }

    @JsonProperty("complexity")
    protected JiraExpressionComplexity complexity;

    /**
     * A list of validation errors. Not included if the expression is valid.
     */
    @JsonProperty("errors")
    protected List<JiraExpressionValidationError> errors;

    /**
     * The analysed expression.
     */
    @JsonProperty("expression")
    protected String expression;

    /**
     * EXPERIMENTAL. The inferred type of the expression.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
     */
    @JsonProperty("valid")
    protected Boolean valid;


}
