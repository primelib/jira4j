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
 * WorkflowCreateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "scope",
    "statuses",
    "workflows"
})
@JsonTypeName("WorkflowCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreateRequest {

    /**
     * Constructs a validated implementation of {@link WorkflowCreateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCreateRequest(Consumer<WorkflowCreateRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("scope")
    protected WorkflowScope scope;

    /**
     * The statuses to associate with the workflows.
     */
    @JsonProperty("statuses")
    protected List<WorkflowStatusUpdate> statuses = new ArrayList<>();

    /**
     * The details of the workflows to create.
     */
    @JsonProperty("workflows")
    protected List<WorkflowCreate> workflows = new ArrayList<>();


}
