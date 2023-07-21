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
 * WorkflowSchemeProjectAssociation
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
    "projectId",
    "workflowSchemeId"
})
@JsonTypeName("WorkflowSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeProjectAssociation {

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The ID of the workflow scheme. If the workflow scheme ID is {@code null}, the operation assigns the default workflow scheme.
     */
    @JsonProperty("workflowSchemeId")
    protected String workflowSchemeId;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeProjectAssociation(Consumer<WorkflowSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeProjectAssociation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeProjectAssociation(Consumer)} instead.
     * @param projectId The ID of the project.
     * @param workflowSchemeId The ID of the workflow scheme. If the workflow scheme ID is {@code null}, the operation assigns the default workflow scheme.
     */
    @ApiStatus.Internal
    public WorkflowSchemeProjectAssociation(String projectId, String workflowSchemeId) {
        this.projectId = projectId;
        this.workflowSchemeId = workflowSchemeId;
    }

}
