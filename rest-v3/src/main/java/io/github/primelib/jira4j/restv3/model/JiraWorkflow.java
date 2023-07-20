package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraWorkflow
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "isEditable",
    "name",
    "scope",
    "startPointLayout",
    "statuses",
    "taskId",
    "transitions",
    "usages",
    "version"
})
@JsonTypeName("JiraWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraWorkflow {

    /**
     * Constructs a validated implementation of {@link JiraWorkflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraWorkflow(Consumer<JiraWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * The description of the workflow.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the workflow.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Indicates if the workflow can be edited.
     */
    @JsonProperty("isEditable")
    protected Boolean isEditable;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected WorkflowScope scope;

    @JsonProperty("startPointLayout")
    protected WorkflowLayout startPointLayout;

    /**
     * The statuses referenced in this workflow.
     */
    @JsonProperty("statuses")
    protected Set<WorkflowReferenceStatus> statuses;

    /**
     * If there is a current [asynchronous task](#async-operations) operation for this workflow.
     */
    @JsonProperty("taskId")
    protected String taskId;

    /**
     * The transitions of the workflow.
     */
    @JsonProperty("transitions")
    protected Set<WorkflowTransitions> transitions;

    /**
     * The `workflows.usages` expand is an optional parameter that can be used when reading and updating workflows in Jira. It provides additional information about the projects and issue types associated with the requested workflows.
     */
    @JsonProperty("usages")
    protected Set<ProjectIssueTypes> usages;

    @JsonProperty("version")
    protected DocumentVersion version;


}
