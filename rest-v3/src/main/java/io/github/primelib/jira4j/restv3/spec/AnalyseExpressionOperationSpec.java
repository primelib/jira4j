package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.JiraExpressionForAnalysis;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AnalyseExpressionSpec
 * <p>
 * Specification for the AnalyseExpression operation.
 * <p>
 * Analyse Jira expression
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyseExpressionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The Jira expressions to analyse.
     */
    @NotNull 
    private JiraExpressionForAnalysis jiraExpressionForAnalysis;

    /**
     * The check to perform:
     *  *
     * `syntax` Each expression's syntax is checked to ensure the expression can be parsed. Also, syntactic limits are validated. For example, the expression's length.
     * *
     * `type` EXPERIMENTAL. Each expression is type checked and the final type of the expression inferred. Any type errors that would result in the expression failure at runtime are reported. For example, accessing properties that don't exist or passing the wrong number of arguments to functions. Also performs the syntax check.
     * *
     * `complexity` EXPERIMENTAL. Determines the formulae for how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) each expression may execute.
     */
    @Nullable 
    private String check = "syntax";

    /**
     * Constructs a validated implementation of {@link AnalyseExpressionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyseExpressionOperationSpec(Consumer<AnalyseExpressionOperationSpec> spec) {
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
        Objects.requireNonNull(jiraExpressionForAnalysis, "jiraExpressionForAnalysis is a required parameter!");
    }

}
