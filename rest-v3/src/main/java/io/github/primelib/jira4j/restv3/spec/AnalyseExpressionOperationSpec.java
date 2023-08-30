package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.JiraExpressionForAnalysis;
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
 * AnalyseExpressionSpec
 * <p>
 * Specification for the AnalyseExpression operation.
 * <p>
 * Analyse Jira expression
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code syntax} Each expression's syntax is checked to ensure the expression can be parsed. Also, syntactic limits are validated. For example, the expression's length.
     * *
     * {@code type} EXPERIMENTAL. Each expression is type checked and the final type of the expression inferred. Any type errors that would result in the expression failure at runtime are reported. For example, accessing properties that don't exist or passing the wrong number of arguments to functions. Also performs the syntax check.
     * *
     * {@code complexity} EXPERIMENTAL. Determines the formulae for how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) each expression may execute.
     */
    @Nullable 
    private String check;

    /**
     * Constructs a validated instance of {@link AnalyseExpressionOperationSpec}.
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
     * Constructs a validated instance of {@link AnalyseExpressionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jiraExpressionForAnalysis The Jira expressions to analyse.
     * @param check                The check to perform:   *  {@code syntax} Each expression's syntax is checked to ensure the expression can be parsed. Also, syntactic limits are validated. For example, the expression's length.  *  {@code type} EXPERIMENTAL. Each expression is type checked and the final type of the expression inferred. Any type errors that would result in the expression failure at runtime are reported. For example, accessing properties that don't exist or passing the wrong number of arguments to functions. Also performs the syntax check.  *  {@code complexity} EXPERIMENTAL. Determines the formulae for how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) each expression may execute.
     */
    @ApiStatus.Internal
    public AnalyseExpressionOperationSpec(JiraExpressionForAnalysis jiraExpressionForAnalysis, String check) {
        this.jiraExpressionForAnalysis = jiraExpressionForAnalysis;
        this.check = check;

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
