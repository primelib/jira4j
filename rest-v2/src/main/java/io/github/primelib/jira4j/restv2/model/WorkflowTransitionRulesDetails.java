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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRulesDetails
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
    "workflowId",
    "workflowRuleIds"
})
@JsonTypeName("WorkflowTransitionRulesDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesDetails {

    @JsonProperty("workflowId")
    protected WorkflowId workflowId;

    /**
     * The list of connect workflow rule IDs.
     */
    @JsonProperty("workflowRuleIds")
    protected Set<String> workflowRuleIds;

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesDetails}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitionRulesDetails(Consumer<WorkflowTransitionRulesDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitionRulesDetails(Consumer)} instead.
     * @param workflowId var.name
     * @param workflowRuleIds The list of connect workflow rule IDs.
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesDetails(WorkflowId workflowId, Set<String> workflowRuleIds) {
        this.workflowId = workflowId;
        this.workflowRuleIds = workflowRuleIds;
    }

}
