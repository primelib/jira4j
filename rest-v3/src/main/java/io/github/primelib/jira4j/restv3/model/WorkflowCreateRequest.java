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
 * WorkflowCreateRequest
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
    "scope",
    "statuses",
    "workflows"
})
@JsonTypeName("WorkflowCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreateRequest {

    @JsonProperty("scope")
    protected WorkflowScope scope;

    /**
     * The statuses to associate with the workflows.
     */
    @JsonProperty("statuses")
    protected List<WorkflowStatusUpdate> statuses;

    /**
     * The details of the workflows to create.
     */
    @JsonProperty("workflows")
    protected List<WorkflowCreate> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowCreateRequest}.
     *
     * @param spec the specification to process
     */
    public WorkflowCreateRequest(Consumer<WorkflowCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCreateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCreateRequest(Consumer)} instead.
     * @param scope scope
     * @param statuses The statuses to associate with the workflows.
     * @param workflows The details of the workflows to create.
     */
    @ApiStatus.Internal
    public WorkflowCreateRequest(WorkflowScope scope, List<WorkflowStatusUpdate> statuses, List<WorkflowCreate> workflows) {
        this.scope = scope;
        this.statuses = statuses;
        this.workflows = workflows;
    }

}
