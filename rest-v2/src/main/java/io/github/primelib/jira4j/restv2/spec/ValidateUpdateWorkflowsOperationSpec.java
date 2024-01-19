package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.WorkflowUpdateValidateRequestBean;
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
 * ValidateUpdateWorkflowsSpec
 * <p>
 * Specification for the ValidateUpdateWorkflows operation.
 * <p>
 * Validate update workflows
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValidateUpdateWorkflowsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowUpdateValidateRequestBean workflowUpdateValidateRequestBean;

    /**
     * Constructs a validated instance of {@link ValidateUpdateWorkflowsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ValidateUpdateWorkflowsOperationSpec(Consumer<ValidateUpdateWorkflowsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ValidateUpdateWorkflowsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowUpdateValidateRequestBean 
     */
    @ApiStatus.Internal
    public ValidateUpdateWorkflowsOperationSpec(WorkflowUpdateValidateRequestBean workflowUpdateValidateRequestBean) {
        this.workflowUpdateValidateRequestBean = workflowUpdateValidateRequestBean;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowUpdateValidateRequestBean, "workflowUpdateValidateRequestBean is a required parameter!");
    }
}
