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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowCompoundCondition
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
    "nodeType",
    "operator"
})
@JsonTypeName("WorkflowCompoundCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCompoundCondition {

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<WorkflowCondition> conditions;

    @JsonProperty("nodeType")
    protected String nodeType;

    /**
     * The compound condition operator.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * Constructs a validated instance of {@link WorkflowCompoundCondition}.
     *
     * @param spec the specification to process
     */
    public WorkflowCompoundCondition(Consumer<WorkflowCompoundCondition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCompoundCondition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCompoundCondition(Consumer)} instead.
     * @param conditions The list of workflow conditions.
     * @param nodeType nodeType
     * @param operator The compound condition operator.
     */
    @ApiStatus.Internal
    public WorkflowCompoundCondition(List<WorkflowCondition> conditions, String nodeType, OperatorEnum operator) {
        this.conditions = conditions;
        this.nodeType = nodeType;
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
