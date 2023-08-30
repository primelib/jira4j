package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowCapabilities;
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
 * WorkflowCapabilitiesSpec
 * <p>
 * Specification for the WorkflowCapabilities operation.
 * <p>
 * Get available workflow capabilities
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link WorkflowCapabilitiesOperationSpec}.
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
     * Constructs a validated instance of {@link WorkflowCapabilitiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowId           
     * @param projectId            
     * @param issueTypeId          
     */
    @ApiStatus.Internal
    public WorkflowCapabilitiesOperationSpec(String workflowId, String projectId, String issueTypeId) {
        this.workflowId = workflowId;
        this.projectId = projectId;
        this.issueTypeId = issueTypeId;

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
