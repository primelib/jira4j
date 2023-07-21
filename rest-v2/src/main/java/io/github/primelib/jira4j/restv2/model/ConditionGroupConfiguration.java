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

/**
 * ConditionGroupConfiguration
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
@JsonTypeName("ConditionGroupConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConditionGroupConfiguration {

    /**
     * The nested conditions of the condition group.
     */
    @JsonProperty("conditionGroups")
    protected List<ConditionGroupConfiguration> conditionGroups;

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
     * Constructs a validated instance of {@link ConditionGroupConfiguration}.
     *
     * @param spec the specification to process
     */
    public ConditionGroupConfiguration(Consumer<ConditionGroupConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConditionGroupConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConditionGroupConfiguration(Consumer)} instead.
     * @param conditionGroups The nested conditions of the condition group.
     * @param conditions The rules for this condition.
     * @param operation Determines how the conditions in the group are evaluated. Accepts either {@code ANY} or {@code ALL}. If {@code ANY} is used, at least one condition in the group must be true for the group to evaluate to true. If {@code ALL} is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @ApiStatus.Internal
    public ConditionGroupConfiguration(List<ConditionGroupConfiguration> conditionGroups, List<WorkflowRuleConfiguration> conditions, OperationEnum operation) {
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

        private final String value;
    }

}
