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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusesPerWorkflow
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
    "initialStatusId",
    "statuses",
    "workflowId"
})
@JsonTypeName("StatusesPerWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusesPerWorkflow {

    /**
     * The ID of the initial status for the workflow.
     */
    @JsonProperty("initialStatusId")
    protected String initialStatusId;

    /**
     * The status IDs associated with the workflow.
     */
    @JsonProperty("statuses")
    protected Set<String> statuses;

    /**
     * The ID of the workflow.
     */
    @JsonProperty("workflowId")
    protected String workflowId;

    /**
     * Constructs a validated instance of {@link StatusesPerWorkflow}.
     *
     * @param spec the specification to process
     */
    public StatusesPerWorkflow(Consumer<StatusesPerWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusesPerWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusesPerWorkflow(Consumer)} instead.
     * @param initialStatusId The ID of the initial status for the workflow.
     * @param statuses The status IDs associated with the workflow.
     * @param workflowId The ID of the workflow.
     */
    @ApiStatus.Internal
    public StatusesPerWorkflow(String initialStatusId, Set<String> statuses, String workflowId) {
        this.initialStatusId = initialStatusId;
        this.statuses = statuses;
        this.workflowId = workflowId;
    }

}
