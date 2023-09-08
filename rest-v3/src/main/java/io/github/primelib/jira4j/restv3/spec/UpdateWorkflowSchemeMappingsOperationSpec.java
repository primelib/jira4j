package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import io.github.primelib.jira4j.restv3.model.WorkflowSchemeUpdateRequiredMappingsRequest;
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
 * UpdateWorkflowSchemeMappingsSpec
 * <p>
 * Specification for the UpdateWorkflowSchemeMappings operation.
 * <p>
 * Get required status mappings for workflow scheme update
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateWorkflowSchemeMappingsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowSchemeUpdateRequiredMappingsRequest workflowSchemeUpdateRequiredMappingsRequest;

    /**
     * Constructs a validated instance of {@link UpdateWorkflowSchemeMappingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWorkflowSchemeMappingsOperationSpec(Consumer<UpdateWorkflowSchemeMappingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateWorkflowSchemeMappingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowSchemeUpdateRequiredMappingsRequest 
     */
    @ApiStatus.Internal
    public UpdateWorkflowSchemeMappingsOperationSpec(WorkflowSchemeUpdateRequiredMappingsRequest workflowSchemeUpdateRequiredMappingsRequest) {
        this.workflowSchemeUpdateRequiredMappingsRequest = workflowSchemeUpdateRequiredMappingsRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowSchemeUpdateRequiredMappingsRequest, "workflowSchemeUpdateRequiredMappingsRequest is a required parameter!");
    }
}
