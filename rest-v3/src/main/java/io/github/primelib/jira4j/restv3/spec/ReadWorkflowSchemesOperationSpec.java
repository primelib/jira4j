package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import io.github.primelib.jira4j.restv3.model.WorkflowSchemeReadRequest;
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
 * ReadWorkflowSchemesSpec
 * <p>
 * Specification for the ReadWorkflowSchemes operation.
 * <p>
 * Bulk get workflow schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadWorkflowSchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowSchemeReadRequest workflowSchemeReadRequest;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code workflows.usages} Returns the project and issue types that each workflow in the workflow scheme is associated with.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link ReadWorkflowSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadWorkflowSchemesOperationSpec(Consumer<ReadWorkflowSchemesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadWorkflowSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowSchemeReadRequest 
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code workflows.usages} Returns the project and issue types that each workflow in the workflow scheme is associated with.
     */
    @ApiStatus.Internal
    public ReadWorkflowSchemesOperationSpec(WorkflowSchemeReadRequest workflowSchemeReadRequest, String expand) {
        this.workflowSchemeReadRequest = workflowSchemeReadRequest;
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
        Objects.requireNonNull(workflowSchemeReadRequest, "workflowSchemeReadRequest is a required parameter!");
    }
}
