package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowReadRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "projectAndIssueTypes",
    "workflowIds",
    "workflowNames"
})
@JsonTypeName("WorkflowReadRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowReadRequest {

    /**
     * Constructs a validated implementation of {@link WorkflowReadRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowReadRequest(Consumer<WorkflowReadRequest> spec) {
        spec.accept(this);
    }

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


}
