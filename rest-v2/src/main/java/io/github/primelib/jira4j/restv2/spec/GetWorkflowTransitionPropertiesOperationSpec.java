package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWorkflowTransitionPropertiesSpec
 * <p>
 * Specification for the GetWorkflowTransitionProperties operation.
 * <p>
 * Get workflow transition properties
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionPropertiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
     */
    @NotNull 
    private Long transitionId;

    /**
     * The name of the workflow that the transition belongs to.
     */
    @NotNull 
    private String workflowName;

    /**
     * Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
     */
    @Nullable 
    private Boolean includeReservedKeys = false;

    /**
     * The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
     */
    @Nullable 
    private String key;

    /**
     * The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
     */
    @Nullable 
    private String workflowMode = "live";

    /**
     * Constructs a validated implementation of {@link GetWorkflowTransitionPropertiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionPropertiesOperationSpec(Consumer<GetWorkflowTransitionPropertiesOperationSpec> spec) {
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
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
    }

}
