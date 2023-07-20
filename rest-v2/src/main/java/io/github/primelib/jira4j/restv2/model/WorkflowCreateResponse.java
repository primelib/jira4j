package io.github.primelib.jira4j.restv2.model;

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
 * WorkflowCreateResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "statuses",
    "workflows"
})
@JsonTypeName("WorkflowCreateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreateResponse {

    /**
     * Constructs a validated implementation of {@link WorkflowCreateResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCreateResponse(Consumer<WorkflowCreateResponse> spec) {
        spec.accept(this);
    }

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


}
