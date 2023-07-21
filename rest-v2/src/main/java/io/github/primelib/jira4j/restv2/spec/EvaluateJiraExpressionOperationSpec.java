package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.JiraExpressionEvalRequestBean;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code meta.complexity} that returns information about the expression complexity. For example, the number of expensive operations used by the expression and how close the expression is to reaching the [complexity limit](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions). Useful when designing and debugging your expressions.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link EvaluateJiraExpressionOperationSpec}.
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
     * Constructs a validated instance of {@link EvaluateJiraExpressionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jiraExpressionEvalRequestBean The Jira expression and the evaluation context.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code meta.complexity} that returns information about the expression complexity. For example, the number of expensive operations used by the expression and how close the expression is to reaching the [complexity limit](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions). Useful when designing and debugging your expressions.
     */
    @ApiStatus.Internal
    public EvaluateJiraExpressionOperationSpec(JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean, String expand) {
        this.jiraExpressionEvalRequestBean = jiraExpressionEvalRequestBean;
        this.expand = expand;

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
