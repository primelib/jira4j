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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowCondition
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
    "configuration",
    "nodeType",
    "type",
    "conditions",
    "operator"
})
@JsonTypeName("WorkflowCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCondition {

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Object configuration;

    @JsonProperty("nodeType")
    protected String nodeType;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<WorkflowCondition> conditions;

    /**
     * The compound condition operator.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * Constructs a validated instance of {@link WorkflowCondition}.
     *
     * @param spec the specification to process
     */
    public WorkflowCondition(Consumer<WorkflowCondition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCondition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCondition(Consumer)} instead.
     * @param configuration EXPERIMENTAL. The configuration of the transition rule.
     * @param nodeType nodeType
     * @param type The type of the transition rule.
     * @param conditions The list of workflow conditions.
     * @param operator The compound condition operator.
     */
    @ApiStatus.Internal
    public WorkflowCondition(Object configuration, String nodeType, String type, List<WorkflowCondition> conditions, OperatorEnum operator) {
        this.configuration = configuration;
        this.nodeType = nodeType;
        this.type = type;
        this.conditions = conditions;
        this.operator = operator;
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
