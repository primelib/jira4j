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
 * WorkflowCreateResponse
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
@JsonTypeName("WorkflowCreateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreateResponse {

    /**
     * List of created statuses.
     */
    @JsonProperty("statuses")
    protected Set<JiraWorkflowStatus> statuses;

    /**
     * List of created workflows.
     */
    @JsonProperty("workflows")
    protected Set<JiraWorkflow> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowCreateResponse}.
     *
     * @param spec the specification to process
     */
    public WorkflowCreateResponse(Consumer<WorkflowCreateResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCreateResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCreateResponse(Consumer)} instead.
     * @param statuses List of created statuses.
     * @param workflows List of created workflows.
     */
    @ApiStatus.Internal
    public WorkflowCreateResponse(Set<JiraWorkflowStatus> statuses, Set<JiraWorkflow> workflows) {
        this.statuses = statuses;
        this.workflows = workflows;
    }

}
