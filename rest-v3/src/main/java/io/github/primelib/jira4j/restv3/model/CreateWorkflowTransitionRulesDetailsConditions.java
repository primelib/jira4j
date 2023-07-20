package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowTransitionRulesDetailsConditions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditions",
    "configuration",
    "operator",
    "type"
})
@JsonTypeName("CreateWorkflowTransitionRulesDetails_conditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionRulesDetailsConditions {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowTransitionRulesDetailsConditions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionRulesDetailsConditions(Consumer<CreateWorkflowTransitionRulesDetailsConditions> spec) {
        spec.accept(this);
    }

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<CreateWorkflowCondition> conditions;

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> _configuration = new HashMap<>();

    /**
     * The compound condition operator.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;


    /**
     * The compound condition operator.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        AND("AND"),
        OR("OR");

        private final String value;
    }

}
