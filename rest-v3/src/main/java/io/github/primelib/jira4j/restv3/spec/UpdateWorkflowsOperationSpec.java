package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.WorkflowUpdateRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateWorkflowsSpec
 * <p>
 * Specification for the UpdateWorkflows operation.
 * <p>
 * Bulk update workflows
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateWorkflowsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowUpdateRequest workflowUpdateRequest;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `workflows.usages` Returns the project and issue types that each workflow is associated with.
     * *
     * `statuses.usages` Returns the project and issue types that each status is associated with.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link UpdateWorkflowsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWorkflowsOperationSpec(Consumer<UpdateWorkflowsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowUpdateRequest, "workflowUpdateRequest is a required parameter!");
    }

}
