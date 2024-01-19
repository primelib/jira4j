package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * WorkflowSchemeUpdateRequiredMappingsResponse
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
    "statusMappingsByIssueTypes",
    "statusMappingsByWorkflows",
    "statuses",
    "statusesPerWorkflow"
})
@JsonTypeName("WorkflowSchemeUpdateRequiredMappingsResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeUpdateRequiredMappingsResponse {

    /**
     * The list of required status mappings by issue type.
     */
    @JsonProperty("statusMappingsByIssueTypes")
    protected Set<RequiredMappingByIssueType> statusMappingsByIssueTypes;

    /**
     * The list of required status mappings by workflow.
     */
    @JsonProperty("statusMappingsByWorkflows")
    protected Set<RequiredMappingByWorkflows> statusMappingsByWorkflows;

    /**
     * The details of the statuses in the associated workflows.
     */
    @JsonProperty("statuses")
    protected Set<StatusMetadata> statuses;

    /**
     * The statuses associated with each workflow.
     */
    @JsonProperty("statusesPerWorkflow")
    protected Set<StatusesPerWorkflow> statusesPerWorkflow;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequiredMappingsResponse}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeUpdateRequiredMappingsResponse(Consumer<WorkflowSchemeUpdateRequiredMappingsResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeUpdateRequiredMappingsResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeUpdateRequiredMappingsResponse(Consumer)} instead.
     * @param statusMappingsByIssueTypes The list of required status mappings by issue type.
     * @param statusMappingsByWorkflows The list of required status mappings by workflow.
     * @param statuses The details of the statuses in the associated workflows.
     * @param statusesPerWorkflow The statuses associated with each workflow.
     */
    @ApiStatus.Internal
    public WorkflowSchemeUpdateRequiredMappingsResponse(Set<RequiredMappingByIssueType> statusMappingsByIssueTypes, Set<RequiredMappingByWorkflows> statusMappingsByWorkflows, Set<StatusMetadata> statuses, Set<StatusesPerWorkflow> statusesPerWorkflow) {
        this.statusMappingsByIssueTypes = statusMappingsByIssueTypes;
        this.statusMappingsByWorkflows = statusMappingsByWorkflows;
        this.statuses = statuses;
        this.statusesPerWorkflow = statusesPerWorkflow;
    }

}
