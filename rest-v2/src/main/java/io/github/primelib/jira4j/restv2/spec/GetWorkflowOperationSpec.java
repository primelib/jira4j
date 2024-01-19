package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetWorkflowSpec
 * <p>
 * Specification for the GetWorkflow operation.
 * <p>
 * Get issue types for workflows in workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowOperationSpec {
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
     * The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
     */
    @Nullable 
    private String workflowName;

    /**
     * Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
     */
    @Nullable 
    private Boolean returnDraftIfExists;

    /**
     * Constructs a validated instance of {@link GetWorkflowOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorkflowOperationSpec(Consumer<GetWorkflowOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme.
     * @param workflowName         The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
     * @param returnDraftIfExists  Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
     */
    @ApiStatus.Internal
    public GetWorkflowOperationSpec(Long id, String workflowName, Boolean returnDraftIfExists) {
        this.id = id;
        this.workflowName = workflowName;
        this.returnDraftIfExists = returnDraftIfExists;

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
    }
}
