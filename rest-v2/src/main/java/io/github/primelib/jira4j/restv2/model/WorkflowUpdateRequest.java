package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowUpdateRequest
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
@JsonTypeName("WorkflowUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdateRequest {

    /**
     * Constructs a validated implementation of {@link WorkflowUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowUpdateRequest(Consumer<WorkflowUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * The statuses to associate with the workflows.
     */
    @JsonProperty("statuses")
    protected List<WorkflowStatusUpdate> statuses = new ArrayList<>();

    /**
     * The details of the workflows to update.
     */
    @JsonProperty("workflows")
    protected List<WorkflowUpdate> workflows = new ArrayList<>();


}
