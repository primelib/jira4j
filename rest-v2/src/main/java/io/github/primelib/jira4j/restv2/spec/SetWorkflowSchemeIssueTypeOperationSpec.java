package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeWorkflowMapping;
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
 * SetWorkflowSchemeIssueTypeSpec
 * <p>
 * Specification for the SetWorkflowSchemeIssueType operation.
 * <p>
 * Set workflow for issue type in workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetWorkflowSchemeIssueTypeOperationSpec {
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
     * The issue type-project mapping.
     */
    @NotNull 
    private IssueTypeWorkflowMapping issueTypeWorkflowMapping;

    /**
     * Constructs a validated instance of {@link SetWorkflowSchemeIssueTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetWorkflowSchemeIssueTypeOperationSpec(Consumer<SetWorkflowSchemeIssueTypeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetWorkflowSchemeIssueTypeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme.
     * @param issueType            The ID of the issue type.
     * @param issueTypeWorkflowMapping The issue type-project mapping.
     */
    @ApiStatus.Internal
    public SetWorkflowSchemeIssueTypeOperationSpec(Long id, String issueType, IssueTypeWorkflowMapping issueTypeWorkflowMapping) {
        this.id = id;
        this.issueType = issueType;
        this.issueTypeWorkflowMapping = issueTypeWorkflowMapping;

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
