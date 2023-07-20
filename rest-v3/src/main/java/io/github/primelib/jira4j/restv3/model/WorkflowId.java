package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowId
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "draft",
    "name"
})
@JsonTypeName("WorkflowId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowId {

    /**
     * Constructs a validated implementation of {@link WorkflowId}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowId(Consumer<WorkflowId> spec) {
        spec.accept(this);
    }

    /**
     * Whether the workflow is in the draft state.
     */
    @JsonProperty("draft")
    protected Boolean draft;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;


}
