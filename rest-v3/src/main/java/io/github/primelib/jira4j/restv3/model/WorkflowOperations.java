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
 * WorkflowOperations
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "canDelete",
    "canEdit"
})
@JsonTypeName("WorkflowOperations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowOperations {

    /**
     * Constructs a validated implementation of {@link WorkflowOperations}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowOperations(Consumer<WorkflowOperations> spec) {
        spec.accept(this);
    }

    /**
     * Whether the workflow can be deleted.
     */
    @JsonProperty("canDelete")
    protected Boolean canDelete;

    /**
     * Whether the workflow can be updated.
     */
    @JsonProperty("canEdit")
    protected Boolean canEdit;


}
