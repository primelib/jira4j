package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.WorkflowScheme;
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
 * UpdateWorkflowSchemeDraftSpec
 * <p>
 * Specification for the UpdateWorkflowSchemeDraft operation.
 * <p>
 * Update draft workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateWorkflowSchemeDraftOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the active workflow scheme that the draft was created from.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private WorkflowScheme workflowScheme;

    /**
     * Constructs a validated instance of {@link UpdateWorkflowSchemeDraftOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWorkflowSchemeDraftOperationSpec(Consumer<UpdateWorkflowSchemeDraftOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateWorkflowSchemeDraftOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the active workflow scheme that the draft was created from.
     * @param workflowScheme       
     */
    @ApiStatus.Internal
    public UpdateWorkflowSchemeDraftOperationSpec(Long id, WorkflowScheme workflowScheme) {
        this.id = id;
        this.workflowScheme = workflowScheme;

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
        Objects.requireNonNull(workflowScheme, "workflowScheme is a required parameter!");
    }
}
