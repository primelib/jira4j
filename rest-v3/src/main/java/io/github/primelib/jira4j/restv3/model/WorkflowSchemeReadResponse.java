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
 * WorkflowSchemeReadResponse
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
    "defaultWorkflow",
    "description",
    "id",
    "name",
    "projectIdsUsingScheme",
    "scope",
    "taskId",
    "version",
    "workflowsForIssueTypes"
})
@JsonTypeName("WorkflowSchemeReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeReadResponse {

    @JsonProperty("defaultWorkflow")
    protected WorkflowMetadataRestModel defaultWorkflow;

    /**
     * The description of the workflow scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the workflow scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the workflow scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The IDs of projects using the workflow scheme.
     */
    @JsonProperty("projectIdsUsingScheme")
    protected List<String> projectIdsUsingScheme;

    @JsonProperty("scope")
    protected WorkflowScope scope;

    /**
     * Indicates if there's an [asynchronous task](#async-operations) for this workflow scheme.
     */
    @JsonProperty("taskId")
    protected String taskId;

    @JsonProperty("version")
    protected DocumentVersion version;

    /**
     * Mappings from workflows to issue types.
     */
    @JsonProperty("workflowsForIssueTypes")
    protected List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeReadResponse}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeReadResponse(Consumer<WorkflowSchemeReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeReadResponse(Consumer)} instead.
     * @param defaultWorkflow defaultWorkflow
     * @param description The description of the workflow scheme.
     * @param id The ID of the workflow scheme.
     * @param name The name of the workflow scheme.
     * @param projectIdsUsingScheme The IDs of projects using the workflow scheme.
     * @param scope scope
     * @param taskId Indicates if there's an [asynchronous task](#async-operations) for this workflow scheme.
     * @param version version
     * @param workflowsForIssueTypes Mappings from workflows to issue types.
     */
    @ApiStatus.Internal
    public WorkflowSchemeReadResponse(WorkflowMetadataRestModel defaultWorkflow, String description, String id, String name, List<String> projectIdsUsingScheme, WorkflowScope scope, String taskId, DocumentVersion version, List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes) {
        this.defaultWorkflow = defaultWorkflow;
        this.description = description;
        this.id = id;
        this.name = name;
        this.projectIdsUsingScheme = projectIdsUsingScheme;
        this.scope = scope;
        this.taskId = taskId;
        this.version = version;
        this.workflowsForIssueTypes = workflowsForIssueTypes;
    }

}
