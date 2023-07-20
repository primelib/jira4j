package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteWorkflowMappingSpec
 * <p>
 * Specification for the DeleteWorkflowMapping operation.
 * <p>
 * Delete issue types for workflow in workflow scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteWorkflowMappingOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the workflow scheme.
     */
    @NotNull 
    private Long id;

    /**
     * The name of the workflow.
     */
    @NotNull 
    private String workflowName;

    /**
     * Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
     */
    @Nullable 
    private Boolean updateDraftIfNeeded;

    /**
     * Constructs a validated implementation of {@link DeleteWorkflowMappingOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteWorkflowMappingOperationSpec(Consumer<DeleteWorkflowMappingOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
    }

}
