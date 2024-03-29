package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueArchivalSyncRequest;
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
 * ArchiveIssuesSpec
 * <p>
 * Specification for the ArchiveIssues operation.
 * <p>
 * Archive issue(s) by issue ID/key
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchiveIssuesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Contains a list of issue keys or IDs to be archived.
     */
    @NotNull 
    private IssueArchivalSyncRequest issueArchivalSyncRequest;

    /**
     * Constructs a validated instance of {@link ArchiveIssuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArchiveIssuesOperationSpec(Consumer<ArchiveIssuesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ArchiveIssuesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueArchivalSyncRequest Contains a list of issue keys or IDs to be archived.
     */
    @ApiStatus.Internal
    public ArchiveIssuesOperationSpec(IssueArchivalSyncRequest issueArchivalSyncRequest) {
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
