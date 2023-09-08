package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import io.github.primelib.jira4j.restv3.model.WorkflowSchemeUpdateRequest;
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
 * UpdateSchemesSpec
 * <p>
 * Specification for the UpdateSchemes operation.
 * <p>
 * Update workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateSchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowSchemeUpdateRequest workflowSchemeUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateSchemesOperationSpec(Consumer<UpdateSchemesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowSchemeUpdateRequest 
     */
    @ApiStatus.Internal
    public UpdateSchemesOperationSpec(WorkflowSchemeUpdateRequest workflowSchemeUpdateRequest) {
        this.workflowSchemeUpdateRequest = workflowSchemeUpdateRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowSchemeUpdateRequest, "workflowSchemeUpdateRequest is a required parameter!");
    }
}
