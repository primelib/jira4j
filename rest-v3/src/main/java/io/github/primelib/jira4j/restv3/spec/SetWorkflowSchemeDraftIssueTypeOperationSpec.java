package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueTypeWorkflowMapping;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetWorkflowSchemeDraftIssueTypeSpec
 * <p>
 * Specification for the SetWorkflowSchemeDraftIssueType operation.
 * <p>
 * Set workflow for issue type in draft workflow scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetWorkflowSchemeDraftIssueTypeOperationSpec {
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
     * The ID of the issue type.
     */
    @NotNull 
    private String issueType;

    /**
     * The issue type-project mapping.
     */
    @NotNull 
    private IssueTypeWorkflowMapping issueTypeWorkflowMapping;

    /**
     * Constructs a validated implementation of {@link SetWorkflowSchemeDraftIssueTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetWorkflowSchemeDraftIssueTypeOperationSpec(Consumer<SetWorkflowSchemeDraftIssueTypeOperationSpec> spec) {
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
        Objects.requireNonNull(issueTypeWorkflowMapping, "issueTypeWorkflowMapping is a required parameter!");
    }

}
