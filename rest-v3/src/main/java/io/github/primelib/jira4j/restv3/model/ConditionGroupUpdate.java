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
 * ConditionGroupUpdate
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
    "conditionGroups",
    "conditions",
    "operation"
})
@JsonTypeName("ConditionGroupUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConditionGroupUpdate {

    /**
     * The nested conditions of the condition group.
     */
    @JsonProperty("conditionGroups")
    protected List<ConditionGroupUpdate> conditionGroups;

    /**
     * The rules for this condition.
     */
    @JsonProperty("conditions")
    protected List<WorkflowRuleConfiguration> conditions;

    /**
     * Determines how the conditions in the group are evaluated. Accepts either {@code ANY} or {@code ALL}. If {@code ANY} is used, at least one condition in the group must be true for the group to evaluate to true. If {@code ALL} is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    /**
     * Constructs a validated instance of {@link ConditionGroupUpdate}.
     *
     * @param spec the specification to process
     */
    public ConditionGroupUpdate(Consumer<ConditionGroupUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConditionGroupUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConditionGroupUpdate(Consumer)} instead.
     * @param conditionGroups The nested conditions of the condition group.
     * @param conditions The rules for this condition.
     * @param operation Determines how the conditions in the group are evaluated. Accepts either {@code ANY} or {@code ALL}. If {@code ANY} is used, at least one condition in the group must be true for the group to evaluate to true. If {@code ALL} is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @ApiStatus.Internal
    public ConditionGroupUpdate(List<ConditionGroupUpdate> conditionGroups, List<WorkflowRuleConfiguration> conditions, OperationEnum operation) {
        this.conditionGroups = conditionGroups;
        this.conditions = conditions;
        this.operation = operation;
    }

    /**
     * Determines how the conditions in the group are evaluated. Accepts either {@code ANY} or {@code ALL}. If {@code ANY} is used, at least one condition in the group must be true for the group to evaluate to true. If {@code ALL} is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        ANY("ANY"),
        ALL("ALL");

        private static final OperationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperationEnum of(String input) {
            if (input != null) {
                for (OperationEnum v : VALUES) {
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
