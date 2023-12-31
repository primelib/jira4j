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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionEvaluationMetaDataBeanComplexity
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
    "beans",
    "expensiveOperations",
    "primitiveValues",
    "steps"
})
@JsonTypeName("JiraExpressionEvaluationMetaDataBean_complexity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvaluationMetaDataBeanComplexity {

    @JsonProperty("beans")
    protected JiraExpressionsComplexityBeanBeans beans;

    @JsonProperty("expensiveOperations")
    protected JiraExpressionsComplexityBeanExpensiveOperations expensiveOperations;

    @JsonProperty("primitiveValues")
    protected JiraExpressionsComplexityBeanPrimitiveValues primitiveValues;

    @JsonProperty("steps")
    protected JiraExpressionsComplexityBeanSteps steps;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBeanComplexity}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvaluationMetaDataBeanComplexity(Consumer<JiraExpressionEvaluationMetaDataBeanComplexity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBeanComplexity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvaluationMetaDataBeanComplexity(Consumer)} instead.
     * @param beans beans
     * @param expensiveOperations expensiveOperations
     * @param primitiveValues primitiveValues
     * @param steps steps
     */
    @ApiStatus.Internal
    public JiraExpressionEvaluationMetaDataBeanComplexity(JiraExpressionsComplexityBeanBeans beans, JiraExpressionsComplexityBeanExpensiveOperations expensiveOperations, JiraExpressionsComplexityBeanPrimitiveValues primitiveValues, JiraExpressionsComplexityBeanSteps steps) {
        this.beans = beans;
        this.expensiveOperations = expensiveOperations;
        this.primitiveValues = primitiveValues;
        this.steps = steps;
    }

}
