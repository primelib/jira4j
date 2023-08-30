package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.WorkflowReadRequest;
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
 * ReadWorkflowsSpec
 * <p>
 * Specification for the ReadWorkflows operation.
 * <p>
 * Bulk get workflows
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadWorkflowsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowReadRequest workflowReadRequest;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code workflows.usages} Returns the project and issue types that each workflow is associated with.
     * *
     * {@code statuses.usages} Returns the project and issue types that each status is associated with.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link ReadWorkflowsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadWorkflowsOperationSpec(Consumer<ReadWorkflowsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadWorkflowsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowReadRequest  
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code workflows.usages} Returns the project and issue types that each workflow is associated with.  *  {@code statuses.usages} Returns the project and issue types that each status is associated with.
     */
    @ApiStatus.Internal
    public ReadWorkflowsOperationSpec(WorkflowReadRequest workflowReadRequest, String expand) {
        this.workflowReadRequest = workflowReadRequest;
        this.expand = expand;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowReadRequest, "workflowReadRequest is a required parameter!");
    }
}
