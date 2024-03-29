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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionsComplexityBean
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
@JsonTypeName("JiraExpressionsComplexityBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsComplexityBean {

    @JsonProperty("beans")
    protected JiraExpressionsComplexityValueBean beans;

    @JsonProperty("expensiveOperations")
    protected JiraExpressionsComplexityValueBean expensiveOperations;

    @JsonProperty("primitiveValues")
    protected JiraExpressionsComplexityValueBean primitiveValues;

    @JsonProperty("steps")
    protected JiraExpressionsComplexityValueBean steps;

    /**
     * Constructs a validated instance of {@link JiraExpressionsComplexityBean}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionsComplexityBean(Consumer<JiraExpressionsComplexityBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionsComplexityBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionsComplexityBean(Consumer)} instead.
     * @param beans beans
     * @param expensiveOperations expensiveOperations
     * @param primitiveValues primitiveValues
     * @param steps steps
     */
    @ApiStatus.Internal
    public JiraExpressionsComplexityBean(JiraExpressionsComplexityValueBean beans, JiraExpressionsComplexityValueBean expensiveOperations, JiraExpressionsComplexityValueBean primitiveValues, JiraExpressionsComplexityValueBean steps) {
        this.beans = beans;
        this.expensiveOperations = expensiveOperations;
        this.primitiveValues = primitiveValues;
        this.steps = steps;
    }

}
