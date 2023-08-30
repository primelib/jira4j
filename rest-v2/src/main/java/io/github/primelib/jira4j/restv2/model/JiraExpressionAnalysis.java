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
 * JiraExpressionAnalysis
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
    "complexity",
    "errors",
    "expression",
    "type",
    "valid"
})
@JsonTypeName("JiraExpressionAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionAnalysis {

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

    /**
     * Constructs a validated instance of {@link JiraExpressionAnalysis}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionAnalysis(Consumer<JiraExpressionAnalysis> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionAnalysis}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionAnalysis(Consumer)} instead.
     * @param complexity complexity
     * @param errors A list of validation errors. Not included if the expression is valid.
     * @param expression The analysed expression.
     * @param type EXPERIMENTAL. The inferred type of the expression.
     * @param valid Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
     */
    @ApiStatus.Internal
    public JiraExpressionAnalysis(JiraExpressionComplexity complexity, List<JiraExpressionValidationError> errors, String expression, String type, Boolean valid) {
        this.complexity = complexity;
        this.errors = errors;
        this.expression = expression;
        this.type = type;
        this.valid = valid;
    }

}
