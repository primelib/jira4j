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
 * JiraExpressionsComplexityBeanSteps
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "limit",
    "value"
})
@JsonTypeName("JiraExpressionsComplexityBean_steps")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsComplexityBeanSteps {

    /**
     * Constructs a validated implementation of {@link JiraExpressionsComplexityBeanSteps}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionsComplexityBeanSteps(Consumer<JiraExpressionsComplexityBeanSteps> spec) {
        spec.accept(this);
    }

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


}
