package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.DefaultWorkflow;
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
 * UpdateDraftDefaultWorkflowSpec
 * <p>
 * Specification for the UpdateDraftDefaultWorkflow operation.
 * <p>
 * Update draft default workflow
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateDraftDefaultWorkflowOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the workflow scheme that the draft belongs to.
     */
    @NotNull 
    private Long id;

    /**
     * The object for the new default workflow.
     */
    @NotNull 
    private DefaultWorkflow defaultWorkflow;

    /**
     * Constructs a validated instance of {@link UpdateDraftDefaultWorkflowOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateDraftDefaultWorkflowOperationSpec(Consumer<UpdateDraftDefaultWorkflowOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateDraftDefaultWorkflowOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme that the draft belongs to.
     * @param defaultWorkflow      The object for the new default workflow.
     */
    @ApiStatus.Internal
    public UpdateDraftDefaultWorkflowOperationSpec(Long id, DefaultWorkflow defaultWorkflow) {
        this.id = id;
        this.defaultWorkflow = defaultWorkflow;

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
        Objects.requireNonNull(defaultWorkflow, "defaultWorkflow is a required parameter!");
    }
}
