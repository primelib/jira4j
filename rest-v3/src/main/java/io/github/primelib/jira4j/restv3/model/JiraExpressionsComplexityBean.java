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
 * JiraExpressionsComplexityBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "beans",
    "expensiveOperations",
    "primitiveValues",
    "steps"
})
@JsonTypeName("JiraExpressionsComplexityBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsComplexityBean {

    /**
     * Constructs a validated implementation of {@link JiraExpressionsComplexityBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionsComplexityBean(Consumer<JiraExpressionsComplexityBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("beans")
    protected JiraExpressionsComplexityBeanBeans beans;

    @JsonProperty("expensiveOperations")
    protected JiraExpressionsComplexityBeanExpensiveOperations expensiveOperations;

    @JsonProperty("primitiveValues")
    protected JiraExpressionsComplexityBeanPrimitiveValues primitiveValues;

    @JsonProperty("steps")
    protected JiraExpressionsComplexityBeanSteps steps;


}
