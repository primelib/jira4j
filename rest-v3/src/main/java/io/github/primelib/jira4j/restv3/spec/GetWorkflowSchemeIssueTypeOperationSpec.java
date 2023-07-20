package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWorkflowSchemeIssueTypeSpec
 * <p>
 * Specification for the GetWorkflowSchemeIssueType operation.
 * <p>
 * Get workflow for issue type in workflow scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowSchemeIssueTypeOperationSpec {
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
     * The ID of the issue type.
     */
    @NotNull 
    private String issueType;

    /**
     * Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
     */
    @Nullable 
    private Boolean returnDraftIfExists = false;

    /**
     * Constructs a validated implementation of {@link GetWorkflowSchemeIssueTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorkflowSchemeIssueTypeOperationSpec(Consumer<GetWorkflowSchemeIssueTypeOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(issueType, "issueType is a required parameter!");
    }

}
