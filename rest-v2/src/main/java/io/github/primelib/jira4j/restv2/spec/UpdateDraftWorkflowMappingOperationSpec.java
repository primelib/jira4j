package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypesWorkflowMapping;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateDraftWorkflowMappingSpec
 * <p>
 * Specification for the UpdateDraftWorkflowMapping operation.
 * <p>
 * Set issue types for workflow in workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateDraftWorkflowMappingOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the workflow scheme that the draft belongs to.
     */
    @NotNull 
    private Long id;

    /**
     * The name of the workflow.
     */
    @NotNull 
    private String workflowName;

    /**
     */
    @NotNull 
    private IssueTypesWorkflowMapping issueTypesWorkflowMapping;

    /**
     * Constructs a validated instance of {@link UpdateDraftWorkflowMappingOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateDraftWorkflowMappingOperationSpec(Consumer<UpdateDraftWorkflowMappingOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateDraftWorkflowMappingOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme that the draft belongs to.
     * @param workflowName         The name of the workflow.
     * @param issueTypesWorkflowMapping 
     */
    @ApiStatus.Internal
    public UpdateDraftWorkflowMappingOperationSpec(Long id, String workflowName, IssueTypesWorkflowMapping issueTypesWorkflowMapping) {
        this.id = id;
        this.workflowName = workflowName;
        this.issueTypesWorkflowMapping = issueTypesWorkflowMapping;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
        Objects.requireNonNull(issueTypesWorkflowMapping, "issueTypesWorkflowMapping is a required parameter!");
    }
}
