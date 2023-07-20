package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.WorkflowCapabilities;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * WorkflowCapabilitiesSpec
 * <p>
 * Specification for the WorkflowCapabilities operation.
 * <p>
 * Get available workflow capabilities
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCapabilitiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @Nullable 
    private String workflowId;

    /**
     */
    @Nullable 
    private String projectId;

    /**
     */
    @Nullable 
    private String issueTypeId;

    /**
     * Constructs a validated implementation of {@link WorkflowCapabilitiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCapabilitiesOperationSpec(Consumer<WorkflowCapabilitiesOperationSpec> spec) {
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
    }

}
