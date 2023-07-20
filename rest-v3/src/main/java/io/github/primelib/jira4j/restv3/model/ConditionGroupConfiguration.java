package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConditionGroupConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditionGroups",
    "conditions",
    "operation"
})
@JsonTypeName("ConditionGroupConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConditionGroupConfiguration {

    /**
     * Constructs a validated implementation of {@link ConditionGroupConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConditionGroupConfiguration(Consumer<ConditionGroupConfiguration> spec) {
        spec.accept(this);
    }

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
     * Determines how the conditions in the group are evaluated. Accepts either `ANY` or `ALL`. If `ANY` is used, at least one condition in the group must be true for the group to evaluate to true. If `ALL` is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;


    /**
     * Determines how the conditions in the group are evaluated. Accepts either `ANY` or `ALL`. If `ANY` is used, at least one condition in the group must be true for the group to evaluate to true. If `ALL` is used, all conditions in the group must be true for the group to evaluate to true.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        ANY("ANY"),
        ALL("ALL");

        private final String value;
    }

}
