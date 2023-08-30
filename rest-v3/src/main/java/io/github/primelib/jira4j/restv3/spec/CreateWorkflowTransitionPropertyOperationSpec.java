package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowTransitionProperty;
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
 * CreateWorkflowTransitionPropertySpec
 * <p>
 * Specification for the CreateWorkflowTransitionProperty operation.
 * <p>
 * Create workflow transition property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
     */
    @NotNull 
    private Long transitionId;

    /**
     * The key of the property being added, also known as the name of the property. Set this to the same value as the {@code key} defined in the request body.
     */
    @NotNull 
    private String key;

    /**
     * The name of the workflow that the transition belongs to.
     */
    @NotNull 
    private String workflowName;

    /**
     */
    @NotNull 
    private WorkflowTransitionProperty workflowTransitionProperty;

    /**
     * The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
     */
    @Nullable 
    private String workflowMode;

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionPropertyOperationSpec(Consumer<CreateWorkflowTransitionPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
     * @param key                  The key of the property being added, also known as the name of the property. Set this to the same value as the {@code key} defined in the request body.
     * @param workflowName         The name of the workflow that the transition belongs to.
     * @param workflowTransitionProperty 
     * @param workflowMode         The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionPropertyOperationSpec(Long transitionId, String key, String workflowName, WorkflowTransitionProperty workflowTransitionProperty, String workflowMode) {
        this.transitionId = transitionId;
        this.key = key;
        this.workflowName = workflowName;
        this.workflowTransitionProperty = workflowTransitionProperty;
        this.workflowMode = workflowMode;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(transitionId, "transitionId is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
        Objects.requireNonNull(workflowTransitionProperty, "workflowTransitionProperty is a required parameter!");
    }
}
