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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraWorkflow
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
     * Use the optional {@code workflows.usages} expand to get additional information about the projects and issue types associated with the requested workflows.
     */
    @JsonProperty("usages")
    protected Set<ProjectIssueTypes> usages;

    @JsonProperty("version")
    protected DocumentVersion version;

    /**
     * Constructs a validated instance of {@link JiraWorkflow}.
     *
     * @param spec the specification to process
     */
    public JiraWorkflow(Consumer<JiraWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraWorkflow(Consumer)} instead.
     * @param description The description of the workflow.
     * @param id The ID of the workflow.
     * @param isEditable Indicates if the workflow can be edited.
     * @param name The name of the workflow.
     * @param scope scope
     * @param startPointLayout startPointLayout
     * @param statuses The statuses referenced in this workflow.
     * @param taskId If there is a current [asynchronous task](#async-operations) operation for this workflow.
     * @param transitions The transitions of the workflow.
     * @param usages Use the optional {@code workflows.usages} expand to get additional information about the projects and issue types associated with the requested workflows.
     * @param version version
     */
    @ApiStatus.Internal
    public JiraWorkflow(String description, String id, Boolean isEditable, String name, WorkflowScope scope, WorkflowLayout startPointLayout, Set<WorkflowReferenceStatus> statuses, String taskId, Set<WorkflowTransitions> transitions, Set<ProjectIssueTypes> usages, DocumentVersion version) {
        this.description = description;
        this.id = id;
        this.isEditable = isEditable;
        this.name = name;
        this.scope = scope;
        this.startPointLayout = startPointLayout;
        this.statuses = statuses;
        this.taskId = taskId;
        this.transitions = transitions;
        this.usages = usages;
        this.version = version;
    }

}
