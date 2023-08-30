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
 * GetWorkflowTransitionPropertiesSpec
 * <p>
 * Specification for the GetWorkflowTransitionProperties operation.
 * <p>
 * Get workflow transition properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Boolean includeReservedKeys;

    /**
     * The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
     */
    @Nullable 
    private String key;

    /**
     * The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
     */
    @Nullable 
    private String workflowMode;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionPropertiesOperationSpec}.
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
     * Constructs a validated instance of {@link GetWorkflowTransitionPropertiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
     * @param workflowName         The name of the workflow that the transition belongs to.
     * @param includeReservedKeys  Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
     * @param key                  The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
     * @param workflowMode         The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionPropertiesOperationSpec(Long transitionId, String workflowName, Boolean includeReservedKeys, String key, String workflowMode) {
        this.transitionId = transitionId;
        this.workflowName = workflowName;
        this.includeReservedKeys = includeReservedKeys;
        this.key = key;
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
        Objects.requireNonNull(workflowName, "workflowName is a required parameter!");
    }
}
