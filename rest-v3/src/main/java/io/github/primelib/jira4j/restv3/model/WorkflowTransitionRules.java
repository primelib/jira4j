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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRules
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
    "postFunctions",
    "validators",
    "workflowId"
})
@JsonTypeName("WorkflowTransitionRules")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRules {

    /**
     * The list of conditions within the workflow.
     */
    @JsonProperty("conditions")
    protected List<AppWorkflowTransitionRule> conditions;

    /**
     * The list of post functions within the workflow.
     */
    @JsonProperty("postFunctions")
    protected List<AppWorkflowTransitionRule> postFunctions;

    /**
     * The list of validators within the workflow.
     */
    @JsonProperty("validators")
    protected List<AppWorkflowTransitionRule> validators;

    @JsonProperty("workflowId")
    protected WorkflowId workflowId;

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRules}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitionRules(Consumer<WorkflowTransitionRules> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRules}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitionRules(Consumer)} instead.
     * @param conditions The list of conditions within the workflow.
     * @param postFunctions The list of post functions within the workflow.
     * @param validators The list of validators within the workflow.
     * @param workflowId workflowId
     */
    @ApiStatus.Internal
    public WorkflowTransitionRules(List<AppWorkflowTransitionRule> conditions, List<AppWorkflowTransitionRule> postFunctions, List<AppWorkflowTransitionRule> validators, WorkflowId workflowId) {
        this.conditions = conditions;
        this.postFunctions = postFunctions;
        this.validators = validators;
        this.workflowId = workflowId;
    }

}
