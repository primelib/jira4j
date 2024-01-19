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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowReadRequest
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
    "projectAndIssueTypes",
    "workflowIds",
    "workflowNames"
})
@JsonTypeName("WorkflowReadRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowReadRequest {

    /**
     * The list of projects and issue types to query.
     */
    @JsonProperty("projectAndIssueTypes")
    protected List<ProjectAndIssueTypePair> projectAndIssueTypes;

    /**
     * The list of workflow IDs to query.
     */
    @JsonProperty("workflowIds")
    protected List<String> workflowIds;

    /**
     * The list of workflow names to query.
     */
    @JsonProperty("workflowNames")
    protected List<String> workflowNames;

    /**
     * Constructs a validated instance of {@link WorkflowReadRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowReadRequest(Consumer<WorkflowReadRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowReadRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowReadRequest(Consumer)} instead.
     * @param projectAndIssueTypes The list of projects and issue types to query.
     * @param workflowIds The list of workflow IDs to query.
     * @param workflowNames The list of workflow names to query.
     */
    @ApiStatus.Internal
    public WorkflowReadRequest(List<ProjectAndIssueTypePair> projectAndIssueTypes, List<String> workflowIds, List<String> workflowNames) {
        this.projectAndIssueTypes = projectAndIssueTypes;
        this.workflowIds = workflowIds;
        this.workflowNames = workflowNames;
    }

}
