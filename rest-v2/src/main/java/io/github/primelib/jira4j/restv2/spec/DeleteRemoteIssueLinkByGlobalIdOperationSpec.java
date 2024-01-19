package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueLink;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLink;
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
 * DeleteRemoteIssueLinkByGlobalIdSpec
 * <p>
 * Specification for the DeleteRemoteIssueLinkByGlobalId operation.
 * <p>
 * Delete remote issue link by global ID
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteRemoteIssueLinkByGlobalIdOperationSpec {
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
     * The global ID of a remote issue link.
     */
    @NotNull 
    private String globalId;

    /**
     * Constructs a validated instance of {@link DeleteRemoteIssueLinkByGlobalIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteRemoteIssueLinkByGlobalIdOperationSpec(Consumer<DeleteRemoteIssueLinkByGlobalIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteRemoteIssueLinkByGlobalIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param globalId             The global ID of a remote issue link.
     */
    @ApiStatus.Internal
    public DeleteRemoteIssueLinkByGlobalIdOperationSpec(String issueIdOrKey, String globalId) {
        this.issueIdOrKey = issueIdOrKey;
        this.globalId = globalId;

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
        Objects.requireNonNull(globalId, "globalId is a required parameter!");
    }
}
