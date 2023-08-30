package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueArchivalSyncRequest;
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
 * UnarchiveIssuesSpec
 * <p>
 * Specification for the UnarchiveIssues operation.
 * <p>
 * Unarchive issue(s) by issue keys/ID
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnarchiveIssuesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Contains a list of issue keys or IDs to be unarchived.
     */
    @NotNull 
    private IssueArchivalSyncRequest issueArchivalSyncRequest;

    /**
     * Constructs a validated instance of {@link UnarchiveIssuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnarchiveIssuesOperationSpec(Consumer<UnarchiveIssuesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UnarchiveIssuesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueArchivalSyncRequest Contains a list of issue keys or IDs to be unarchived.
     */
    @ApiStatus.Internal
    public UnarchiveIssuesOperationSpec(IssueArchivalSyncRequest issueArchivalSyncRequest) {
        this.issueArchivalSyncRequest = issueArchivalSyncRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueArchivalSyncRequest, "issueArchivalSyncRequest is a required parameter!");
    }
}
