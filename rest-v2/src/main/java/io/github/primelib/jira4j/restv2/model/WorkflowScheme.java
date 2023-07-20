package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultWorkflow",
    "description",
    "draft",
    "id",
    "issueTypeMappings",
    "issueTypes",
    "lastModified",
    "lastModifiedUser",
    "name",
    "originalDefaultWorkflow",
    "originalIssueTypeMappings",
    "self",
    "updateDraftIfNeeded"
})
@JsonTypeName("WorkflowScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowScheme {

    /**
     * Constructs a validated implementation of {@link WorkflowScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowScheme(Consumer<WorkflowScheme> spec) {
        spec.accept(this);
    }

    /**
     * The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
     */
    @JsonProperty("defaultWorkflow")
    protected String defaultWorkflow;

    /**
     * The description of the workflow scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Whether the workflow scheme is a draft or not.
     */
    @JsonProperty("draft")
    protected Boolean draft;

    /**
     * The ID of the workflow scheme.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
     */
    @JsonProperty("issueTypeMappings")
    protected Map<String, String> issueTypeMappings = new HashMap<>();

    /**
     * The issue types available in Jira.
     */
    @JsonProperty("issueTypes")
    protected Map<String, IssueTypeDetails> issueTypes = new HashMap<>();

    /**
     * The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
     */
    @JsonProperty("lastModified")
    protected String lastModified;

    @JsonProperty("lastModifiedUser")
    protected WorkflowSchemeLastModifiedUser lastModifiedUser;

    /**
     * The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
     */
    @JsonProperty("originalDefaultWorkflow")
    protected String originalDefaultWorkflow;

    /**
     * For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
     */
    @JsonProperty("originalIssueTypeMappings")
    protected Map<String, String> originalIssueTypeMappings = new HashMap<>();

    @JsonProperty("self")
    protected URI self;

    /**
     * Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:
     *  *
     * Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.
     * *
     * Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.
     * *
     * Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.
     * Defaults to `false`.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;


}
