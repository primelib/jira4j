package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Workflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Workflow(Consumer<Workflow> spec) {
        spec.accept(this);
    }

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


}
