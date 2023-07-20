package io.github.primelib.jira4j.restv2.model;

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
 * WorkflowTransitionRules
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WorkflowTransitionRules}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitionRules(Consumer<WorkflowTransitionRules> spec) {
        spec.accept(this);
    }

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


}
