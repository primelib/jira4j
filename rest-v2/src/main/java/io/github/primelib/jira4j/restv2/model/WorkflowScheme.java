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

import java.net.URI;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowScheme
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
     * The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If {@code defaultWorkflow} is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
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
    protected Map<String, String> issueTypeMappings;

    /**
     * The issue types available in Jira.
     */
    @JsonProperty("issueTypes")
    protected Map<String, IssueTypeDetails> issueTypes;

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
    protected Map<String, String> originalIssueTypeMappings;

    @JsonProperty("self")
    protected URI self;

    /**
     * Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:
     *  *
     * Update an active workflow scheme with {@code updateDraftIfNeeded} set to {@code true}: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.
     * *
     * Update an active workflow scheme with {@code updateDraftIfNeeded} set to {@code false}: An error is returned, as active workflow schemes cannot be updated.
     * *
     * Update an inactive workflow scheme with {@code updateDraftIfNeeded} set to {@code true}: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.
     * Defaults to {@code false}.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * Constructs a validated instance of {@link WorkflowScheme}.
     *
     * @param spec the specification to process
     */
    public WorkflowScheme(Consumer<WorkflowScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowScheme(Consumer)} instead.
     * @param defaultWorkflow The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If {@code defaultWorkflow} is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
     * @param description The description of the workflow scheme.
     * @param draft Whether the workflow scheme is a draft or not.
     * @param id The ID of the workflow scheme.
     * @param issueTypeMappings The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
     * @param issueTypes The issue types available in Jira.
     * @param lastModified The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
     * @param lastModifiedUser lastModifiedUser
     * @param name The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
     * @param originalDefaultWorkflow For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
     * @param originalIssueTypeMappings For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
     * @param self self
     * @param updateDraftIfNeeded Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with {@code updateDraftIfNeeded} set to {@code true}: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with {@code updateDraftIfNeeded} set to {@code false}: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with {@code updateDraftIfNeeded} set to {@code true}: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to {@code false}.
     */
    @ApiStatus.Internal
    public WorkflowScheme(String defaultWorkflow, String description, Boolean draft, Long id, Map<String, String> issueTypeMappings, Map<String, IssueTypeDetails> issueTypes, String lastModified, WorkflowSchemeLastModifiedUser lastModifiedUser, String name, String originalDefaultWorkflow, Map<String, String> originalIssueTypeMappings, URI self, Boolean updateDraftIfNeeded) {
        this.defaultWorkflow = defaultWorkflow;
        this.description = description;
        this.draft = draft;
        this.id = id;
        this.issueTypeMappings = issueTypeMappings;
        this.issueTypes = issueTypes;
        this.lastModified = lastModified;
        this.lastModifiedUser = lastModifiedUser;
        this.name = name;
        this.originalDefaultWorkflow = originalDefaultWorkflow;
        this.originalIssueTypeMappings = originalIssueTypeMappings;
        this.self = self;
        this.updateDraftIfNeeded = updateDraftIfNeeded;
    }

}
