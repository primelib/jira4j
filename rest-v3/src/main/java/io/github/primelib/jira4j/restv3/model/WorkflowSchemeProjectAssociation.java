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
 * WorkflowSchemeProjectAssociation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "projectId",
    "workflowSchemeId"
})
@JsonTypeName("WorkflowSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeProjectAssociation {

    /**
     * Constructs a validated implementation of {@link WorkflowSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowSchemeProjectAssociation(Consumer<WorkflowSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The ID of the workflow scheme. If the workflow scheme ID is `null`, the operation assigns the default workflow scheme.
     */
    @JsonProperty("workflowSchemeId")
    protected String workflowSchemeId;


}
