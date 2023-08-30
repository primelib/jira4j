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
 * DeleteWorkflowTransitionPropertySpec
 * <p>
 * Specification for the DeleteWorkflowTransitionProperty operation.
 * <p>
 * Delete workflow transition property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteWorkflowTransitionPropertyOperationSpec {
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
     * The name of the transition property to delete, also known as the name of the property.
     */
    @NotNull 
    private String key;

    /**
     * The name of the workflow that the transition belongs to.
     */
    @NotNull 
    private String workflowName;

    /**
     * The workflow status. Set to {@code live} for inactive workflows or {@code draft} for draft workflows. Active workflows cannot be edited.
     */
    @Nullable 
    private String workflowMode;

    /**
     * Constructs a validated instance of {@link DeleteWorkflowTransitionPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteWorkflowTransitionPropertyOperationSpec(Consumer<DeleteWorkflowTransitionPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteWorkflowTransitionPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
     * @param key                  The name of the transition property to delete, also known as the name of the property.
     * @param workflowName         The name of the workflow that the transition belongs to.
     * @param workflowMode         The workflow status. Set to {@code live} for inactive workflows or {@code draft} for draft workflows. Active workflows cannot be edited.
     */
    @ApiStatus.Internal
    public DeleteWorkflowTransitionPropertyOperationSpec(Long transitionId, String key, String workflowName, String workflowMode) {
        this.transitionId = transitionId;
        this.key = key;
        this.workflowName = workflowName;
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
    }
}
