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

import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRulesUpdateErrorDetails
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
    "ruleUpdateErrors",
    "updateErrors",
    "workflowId"
})
@JsonTypeName("WorkflowTransitionRulesUpdateErrorDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesUpdateErrorDetails {

    /**
     * A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.
     */
    @JsonProperty("ruleUpdateErrors")
    protected Map<String, Set<String>> ruleUpdateErrors;

    /**
     * The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
     */
    @JsonProperty("updateErrors")
    protected Set<String> updateErrors;

    @JsonProperty("workflowId")
    protected WorkflowId workflowId;

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesUpdateErrorDetails}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitionRulesUpdateErrorDetails(Consumer<WorkflowTransitionRulesUpdateErrorDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesUpdateErrorDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitionRulesUpdateErrorDetails(Consumer)} instead.
     * @param ruleUpdateErrors A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.
     * @param updateErrors The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
     * @param workflowId workflowId
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesUpdateErrorDetails(Map<String, Set<String>> ruleUpdateErrors, Set<String> updateErrors, WorkflowId workflowId) {
        this.ruleUpdateErrors = ruleUpdateErrors;
        this.updateErrors = updateErrors;
        this.workflowId = workflowId;
    }

}
