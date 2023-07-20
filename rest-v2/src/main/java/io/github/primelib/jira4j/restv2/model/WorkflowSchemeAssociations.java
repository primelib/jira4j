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
 * WorkflowSchemeAssociations
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "projectIds",
    "workflowScheme"
})
@JsonTypeName("WorkflowSchemeAssociations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeAssociations {

    /**
     * Constructs a validated implementation of {@link WorkflowSchemeAssociations}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowSchemeAssociations(Consumer<WorkflowSchemeAssociations> spec) {
        spec.accept(this);
    }

    /**
     * The list of projects that use the workflow scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds = new ArrayList<>();

    @JsonProperty("workflowScheme")
    protected WorkflowSchemeAssociationsWorkflowScheme workflowScheme;


}
