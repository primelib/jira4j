package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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
 * WorkflowUpdateResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "statuses",
    "taskId",
    "workflows"
})
@JsonTypeName("WorkflowUpdateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdateResponse {

    /**
     * Constructs a validated implementation of {@link WorkflowUpdateResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowUpdateResponse(Consumer<WorkflowUpdateResponse> spec) {
        spec.accept(this);
    }

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


}
