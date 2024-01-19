package io.github.primelib.jira4j.restv2.model;

import java.util.List;
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
 * WorkflowUpdateResponse
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
    "statuses",
    "taskId",
    "workflows"
})
@JsonTypeName("WorkflowUpdateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdateResponse {

    /**
     * List of updated statuses.
     */
    @JsonProperty("statuses")
    protected Set<JiraWorkflowStatus> statuses;

    /**
     * If there is a [asynchronous task](#async-operations) operation, as a result of this update.
     */
    @JsonProperty("taskId")
    protected String taskId;

    /**
     * List of updated workflows.
     */
    @JsonProperty("workflows")
    protected Set<JiraWorkflow> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowUpdateResponse}.
     *
     * @param spec the specification to process
     */
    public WorkflowUpdateResponse(Consumer<WorkflowUpdateResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowUpdateResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowUpdateResponse(Consumer)} instead.
     * @param statuses List of updated statuses.
     * @param taskId If there is a [asynchronous task](#async-operations) operation, as a result of this update.
     * @param workflows List of updated workflows.
     */
    @ApiStatus.Internal
    public WorkflowUpdateResponse(Set<JiraWorkflowStatus> statuses, String taskId, Set<JiraWorkflow> workflows) {
        this.statuses = statuses;
        this.taskId = taskId;
        this.workflows = workflows;
    }

}
