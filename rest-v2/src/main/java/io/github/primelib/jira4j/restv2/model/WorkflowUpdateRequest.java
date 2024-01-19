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
 * WorkflowUpdateRequest
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
@JsonTypeName("WorkflowUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdateRequest {

    /**
     * The statuses to associate with the workflows.
     */
    @JsonProperty("statuses")
    protected List<WorkflowStatusUpdate> statuses;

    /**
     * The details of the workflows to update.
     */
    @JsonProperty("workflows")
    protected List<WorkflowUpdate> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowUpdateRequest(Consumer<WorkflowUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowUpdateRequest(Consumer)} instead.
     * @param statuses The statuses to associate with the workflows.
     * @param workflows The details of the workflows to update.
     */
    @ApiStatus.Internal
    public WorkflowUpdateRequest(List<WorkflowStatusUpdate> statuses, List<WorkflowUpdate> workflows) {
        this.statuses = statuses;
        this.workflows = workflows;
    }

}
