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
 * WorkflowSchemeAssociations
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
    "projectIds",
    "workflowScheme"
})
@JsonTypeName("WorkflowSchemeAssociations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeAssociations {

    /**
     * The list of projects that use the workflow scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds;

    @JsonProperty("workflowScheme")
    protected WorkflowSchemeAssociationsWorkflowScheme workflowScheme;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeAssociations}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeAssociations(Consumer<WorkflowSchemeAssociations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeAssociations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeAssociations(Consumer)} instead.
     * @param projectIds The list of projects that use the workflow scheme.
     * @param workflowScheme workflowScheme
     */
    @ApiStatus.Internal
    public WorkflowSchemeAssociations(List<String> projectIds, WorkflowSchemeAssociationsWorkflowScheme workflowScheme) {
        this.projectIds = projectIds;
        this.workflowScheme = workflowScheme;
    }

}
