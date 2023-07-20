package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.JiraExpressionEvalRequestBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * EvaluateJiraExpressionSpec
 * <p>
 * Specification for the EvaluateJiraExpression operation.
 * <p>
 * Evaluate Jira expression
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EvaluateJiraExpressionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The Jira expression and the evaluation context.
     */
    @NotNull 
    private JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts `meta.complexity` that returns information about the expression complexity. For example, the number of expensive operations used by the expression and how close the expression is to reaching the [complexity limit](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions). Useful when designing and debugging your expressions.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link EvaluateJiraExpressionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EvaluateJiraExpressionOperationSpec(Consumer<EvaluateJiraExpressionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(jiraExpressionEvalRequestBean, "jiraExpressionEvalRequestBean is a required parameter!");
    }

}
