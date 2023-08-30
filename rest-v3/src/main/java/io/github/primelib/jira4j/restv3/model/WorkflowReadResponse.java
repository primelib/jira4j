package io.github.primelib.jira4j.restv3.model;

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
 * WorkflowReadResponse
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
    "workflows"
})
@JsonTypeName("WorkflowReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowReadResponse {

    /**
     * List of statuses.
     */
    @JsonProperty("statuses")
    protected Set<JiraWorkflowStatus> statuses;

    /**
     * List of workflows.
     */
    @JsonProperty("workflows")
    protected Set<JiraWorkflow> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowReadResponse}.
     *
     * @param spec the specification to process
     */
    public WorkflowReadResponse(Consumer<WorkflowReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowReadResponse(Consumer)} instead.
     * @param statuses List of statuses.
     * @param workflows List of workflows.
     */
    @ApiStatus.Internal
    public WorkflowReadResponse(Set<JiraWorkflowStatus> statuses, Set<JiraWorkflow> workflows) {
        this.statuses = statuses;
        this.workflows = workflows;
    }

}
