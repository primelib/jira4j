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
 * WorkflowSchemeUpdateRequest
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
    "description",
    "id",
    "name",
    "statusMappingsByIssueTypeOverride",
    "statusMappingsByWorkflows",
    "version",
    "workflowsForIssueTypes"
})
@JsonTypeName("WorkflowSchemeUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeUpdateRequest {

    /**
     * The ID of the workflow for issue types without having a mapping defined in this workflow scheme. Only used in global-scoped workflow schemes. If the {@code defaultWorkflowId} isn't specified, this is set to *Jira Workflow (jira)*.
     */
    @JsonProperty("defaultWorkflowId")
    protected String defaultWorkflowId;

    /**
     * The new description for this workflow scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of this workflow scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The new name for this workflow scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Overrides, for the selected issue types, any status mappings provided in {@code statusMappingsByWorkflows}. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of {@code statusMappingsByWorkflows} and {@code statusMappingsByIssueTypeOverride}.
     */
    @JsonProperty("statusMappingsByIssueTypeOverride")
    protected List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride;

    /**
     * The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of {@code statusMappingsByWorkflows} and {@code statusMappingsByIssueTypeOverride}.
     */
    @JsonProperty("statusMappingsByWorkflows")
    protected List<MappingsByWorkflow> statusMappingsByWorkflows;

    @JsonProperty("version")
    protected DocumentVersion version;

    /**
     * Mappings from workflows to issue types.
     */
    @JsonProperty("workflowsForIssueTypes")
    protected List<WorkflowSchemeAssociation> workflowsForIssueTypes;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeUpdateRequest(Consumer<WorkflowSchemeUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeUpdateRequest(Consumer)} instead.
     * @param defaultWorkflowId The ID of the workflow for issue types without having a mapping defined in this workflow scheme. Only used in global-scoped workflow schemes. If the {@code defaultWorkflowId} isn't specified, this is set to *Jira Workflow (jira)*.
     * @param description The new description for this workflow scheme.
     * @param id The ID of this workflow scheme.
     * @param name The new name for this workflow scheme.
     * @param statusMappingsByIssueTypeOverride Overrides, for the selected issue types, any status mappings provided in {@code statusMappingsByWorkflows}. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of {@code statusMappingsByWorkflows} and {@code statusMappingsByIssueTypeOverride}.
     * @param statusMappingsByWorkflows The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of {@code statusMappingsByWorkflows} and {@code statusMappingsByIssueTypeOverride}.
     * @param version version
     * @param workflowsForIssueTypes Mappings from workflows to issue types.
     */
    @ApiStatus.Internal
    public WorkflowSchemeUpdateRequest(String defaultWorkflowId, String description, String id, String name, List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride, List<MappingsByWorkflow> statusMappingsByWorkflows, DocumentVersion version, List<WorkflowSchemeAssociation> workflowsForIssueTypes) {
        this.defaultWorkflowId = defaultWorkflowId;
        this.description = description;
        this.id = id;
        this.name = name;
        this.statusMappingsByIssueTypeOverride = statusMappingsByIssueTypeOverride;
        this.statusMappingsByWorkflows = statusMappingsByWorkflows;
        this.version = version;
        this.workflowsForIssueTypes = workflowsForIssueTypes;
    }

}
