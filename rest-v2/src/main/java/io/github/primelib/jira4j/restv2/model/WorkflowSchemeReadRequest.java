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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowSchemeReadRequest
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
    "projectIds",
    "workflowSchemeIds"
})
@JsonTypeName("WorkflowSchemeReadRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeReadRequest {

    /**
     * The list of project IDs to query.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds;

    /**
     * The list of workflow scheme IDs to query.
     */
    @JsonProperty("workflowSchemeIds")
    protected List<String> workflowSchemeIds;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeReadRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeReadRequest(Consumer<WorkflowSchemeReadRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeReadRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeReadRequest(Consumer)} instead.
     * @param projectIds The list of project IDs to query.
     * @param workflowSchemeIds The list of workflow scheme IDs to query.
     */
    @ApiStatus.Internal
    public WorkflowSchemeReadRequest(List<String> projectIds, List<String> workflowSchemeIds) {
        this.projectIds = projectIds;
        this.workflowSchemeIds = workflowSchemeIds;
    }

}
