package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateWorkflowTransitionPropertySpec
 * <p>
 * Specification for the UpdateWorkflowTransitionProperty operation.
 * <p>
 * Update workflow transition property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateWorkflowTransitionPropertyOperationSpec {
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
     * The key of the property being updated, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
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
    private Map<String, Object> requestBody;

    /**
     * The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
     */
    @Nullable 
    private String workflowMode;

    /**
     * Constructs a validated implementation of {@link UpdateWorkflowTransitionPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWorkflowTransitionPropertyOperationSpec(Consumer<UpdateWorkflowTransitionPropertyOperationSpec> spec) {
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
        Objects.requireNonNull(transitionId, "transitionId is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
