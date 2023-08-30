package io.github.primelib.jira4j.restv3.spec;

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
 * DeleteIssueSpec
 * <p>
 * Specification for the DeleteIssue operation.
 * <p>
 * Delete issue
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteIssueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the issue.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * Whether the issue's subtasks are deleted when the issue is deleted.
     */
    @Nullable 
    private String deleteSubtasks;

    /**
     * Constructs a validated instance of {@link DeleteIssueOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteIssueOperationSpec(Consumer<DeleteIssueOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteIssueOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param deleteSubtasks       Whether the issue's subtasks are deleted when the issue is deleted.
     */
    @ApiStatus.Internal
    public DeleteIssueOperationSpec(String issueIdOrKey, String deleteSubtasks) {
        this.issueIdOrKey = issueIdOrKey;
        this.deleteSubtasks = deleteSubtasks;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
    }
}
