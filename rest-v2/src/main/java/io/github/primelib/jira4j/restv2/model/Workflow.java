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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Workflow
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
    "created",
    "description",
    "hasDraftWorkflow",
    "id",
    "isDefault",
    "operations",
    "projects",
    "schemes",
    "statuses",
    "transitions",
    "updated"
})
@JsonTypeName("Workflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Workflow {

    /**
     * The creation date of the workflow.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The description of the workflow.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Whether the workflow has a draft version.
     */
    @JsonProperty("hasDraftWorkflow")
    protected Boolean hasDraftWorkflow;

    @JsonProperty("id")
    protected PublishedWorkflowId id;

    /**
     * Whether this is the default workflow.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    @JsonProperty("operations")
    protected WorkflowOperations operations;

    /**
     * The projects the workflow is assigned to, through workflow schemes.
     */
    @JsonProperty("projects")
    protected List<ProjectDetails> projects;

    /**
     * The workflow schemes the workflow is assigned to.
     */
    @JsonProperty("schemes")
    protected List<WorkflowSchemeIdName> schemes;

    /**
     * The statuses of the workflow.
     */
    @JsonProperty("statuses")
    protected List<WorkflowStatus> statuses;

    /**
     * The transitions of the workflow.
     */
    @JsonProperty("transitions")
    protected List<Transition> transitions;

    /**
     * The last edited date of the workflow.
     */
    @JsonProperty("updated")
    protected OffsetDateTime updated;

    /**
     * Constructs a validated instance of {@link Workflow}.
     *
     * @param spec the specification to process
     */
    public Workflow(Consumer<Workflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Workflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Workflow(Consumer)} instead.
     * @param created The creation date of the workflow.
     * @param description The description of the workflow.
     * @param hasDraftWorkflow Whether the workflow has a draft version.
     * @param id id
     * @param isDefault Whether this is the default workflow.
     * @param operations operations
     * @param projects The projects the workflow is assigned to, through workflow schemes.
     * @param schemes The workflow schemes the workflow is assigned to.
     * @param statuses The statuses of the workflow.
     * @param transitions The transitions of the workflow.
     * @param updated The last edited date of the workflow.
     */
    @ApiStatus.Internal
    public Workflow(OffsetDateTime created, String description, Boolean hasDraftWorkflow, PublishedWorkflowId id, Boolean isDefault, WorkflowOperations operations, List<ProjectDetails> projects, List<WorkflowSchemeIdName> schemes, List<WorkflowStatus> statuses, List<Transition> transitions, OffsetDateTime updated) {
        this.created = created;
        this.description = description;
        this.hasDraftWorkflow = hasDraftWorkflow;
        this.id = id;
        this.isDefault = isDefault;
        this.operations = operations;
        this.projects = projects;
        this.schemes = schemes;
        this.statuses = statuses;
        this.transitions = transitions;
        this.updated = updated;
    }

}
