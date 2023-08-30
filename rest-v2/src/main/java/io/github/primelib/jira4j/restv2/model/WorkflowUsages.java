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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowUsages
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
    "workflowId",
    "workflowName"
})
@JsonTypeName("WorkflowUsages")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUsages {

    /**
     * Workflow ID.
     */
    @JsonProperty("workflowId")
    protected String workflowId;

    /**
     * Workflow name.
     */
    @JsonProperty("workflowName")
    protected String workflowName;

    /**
     * Constructs a validated instance of {@link WorkflowUsages}.
     *
     * @param spec the specification to process
     */
    public WorkflowUsages(Consumer<WorkflowUsages> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowUsages}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowUsages(Consumer)} instead.
     * @param workflowId Workflow ID.
     * @param workflowName Workflow name.
     */
    @ApiStatus.Internal
    public WorkflowUsages(String workflowId, String workflowName) {
        this.workflowId = workflowId;
        this.workflowName = workflowName;
    }

}
