package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * WorkflowSchemeUpdateRequiredMappingsRequest
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
    "defaultWorkflowId",
    "id",
    "workflowsForIssueTypes"
})
@JsonTypeName("WorkflowSchemeUpdateRequiredMappingsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeUpdateRequiredMappingsRequest {

    /**
     * The ID of the new default workflow for this workflow scheme. Only used in global-scoped workflow schemes. If it isn't specified, is set to *Jira Workflow (jira)*.
     */
    @JsonProperty("defaultWorkflowId")
    protected String defaultWorkflowId;

    /**
     * The ID of the workflow scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The new workflow to issue type mappings for this workflow scheme.
     */
    @JsonProperty("workflowsForIssueTypes")
    protected List<WorkflowSchemeAssociation> workflowsForIssueTypes;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequiredMappingsRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeUpdateRequiredMappingsRequest(Consumer<WorkflowSchemeUpdateRequiredMappingsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequiredMappingsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeUpdateRequiredMappingsRequest(Consumer)} instead.
     * @param defaultWorkflowId The ID of the new default workflow for this workflow scheme. Only used in global-scoped workflow schemes. If it isn't specified, is set to *Jira Workflow (jira)*.
     * @param id The ID of the workflow scheme.
     * @param workflowsForIssueTypes The new workflow to issue type mappings for this workflow scheme.
     */
    @ApiStatus.Internal
    public WorkflowSchemeUpdateRequiredMappingsRequest(String defaultWorkflowId, String id, List<WorkflowSchemeAssociation> workflowsForIssueTypes) {
        this.defaultWorkflowId = defaultWorkflowId;
        this.id = id;
        this.workflowsForIssueTypes = workflowsForIssueTypes;
    }

}
