package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.DefaultWorkflow;
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
 * GetDefaultWorkflowSpec
 * <p>
 * Specification for the GetDefaultWorkflow operation.
 * <p>
 * Get default workflow
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDefaultWorkflowOperationSpec {
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
     * Set to {@code true} to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
     */
    @Nullable 
    private Boolean returnDraftIfExists;

    /**
     * Constructs a validated instance of {@link GetDefaultWorkflowOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetDefaultWorkflowOperationSpec(Consumer<GetDefaultWorkflowOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetDefaultWorkflowOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme.
     * @param returnDraftIfExists  Set to {@code true} to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
     */
    @ApiStatus.Internal
    public GetDefaultWorkflowOperationSpec(Long id, Boolean returnDraftIfExists) {
        this.id = id;
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
