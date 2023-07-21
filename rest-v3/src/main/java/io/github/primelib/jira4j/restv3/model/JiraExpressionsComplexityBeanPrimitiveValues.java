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
 * JiraExpressionsComplexityBeanPrimitiveValues
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
    "limit",
    "value"
})
@JsonTypeName("JiraExpressionsComplexityBean_primitiveValues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsComplexityBeanPrimitiveValues {

    /**
     * The maximum allowed complexity. The evaluation will fail if this value is exceeded.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * The complexity value of the current expression.
     */
    @JsonProperty("value")
    protected Integer value;

    /**
     * Constructs a validated instance of {@link JiraExpressionsComplexityBeanPrimitiveValues}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionsComplexityBeanPrimitiveValues(Consumer<JiraExpressionsComplexityBeanPrimitiveValues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionsComplexityBeanPrimitiveValues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionsComplexityBeanPrimitiveValues(Consumer)} instead.
     * @param limit The maximum allowed complexity. The evaluation will fail if this value is exceeded.
     * @param value The complexity value of the current expression.
     */
    @ApiStatus.Internal
    public JiraExpressionsComplexityBeanPrimitiveValues(Integer limit, Integer value) {
        this.limit = limit;
        this.value = value;
    }

}
