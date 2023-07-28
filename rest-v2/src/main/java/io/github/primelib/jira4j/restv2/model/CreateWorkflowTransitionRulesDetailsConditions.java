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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateWorkflowTransitionRulesDetailsConditions
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
    "conditions",
    "configuration",
    "operator",
    "type"
})
@JsonTypeName("CreateWorkflowTransitionRulesDetails_conditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionRulesDetailsConditions {

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<CreateWorkflowCondition> conditions;

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> configuration;

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
     * Constructs a validated instance of {@link CreateWorkflowTransitionRulesDetailsConditions}.
     *
     * @param spec the specification to process
     */
    public CreateWorkflowTransitionRulesDetailsConditions(Consumer<CreateWorkflowTransitionRulesDetailsConditions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionRulesDetailsConditions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWorkflowTransitionRulesDetailsConditions(Consumer)} instead.
     * @param conditions The list of workflow conditions.
     * @param configuration EXPERIMENTAL. The configuration of the transition rule.
     * @param operator The compound condition operator.
     * @param type The type of the transition rule.
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionRulesDetailsConditions(List<CreateWorkflowCondition> conditions, Map<String, Object> configuration, OperatorEnum operator, String type) {
        this.conditions = conditions;
        this.configuration = configuration;
        this.operator = operator;
        this.type = type;
    }

    /**
     * The compound condition operator.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        AND("AND"),
        OR("OR");

        private static final OperatorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperatorEnum of(String input) {
            if (input != null) {
                for (OperatorEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
