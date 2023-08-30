package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueLink;
import io.github.primelib.jira4j.restv3.model.RemoteIssueLink;
import io.github.primelib.jira4j.restv3.model.RemoteIssueLinkRequest;
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
 * UpdateRemoteIssueLinkSpec
 * <p>
 * Specification for the UpdateRemoteIssueLink operation.
 * <p>
 * Update remote issue link by ID
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRemoteIssueLinkOperationSpec {
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
     * The ID of the remote issue link.
     */
    @NotNull 
    private String linkId;

    /**
     */
    @NotNull 
    private RemoteIssueLinkRequest remoteIssueLinkRequest;

    /**
     * Constructs a validated instance of {@link UpdateRemoteIssueLinkOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateRemoteIssueLinkOperationSpec(Consumer<UpdateRemoteIssueLinkOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateRemoteIssueLinkOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param linkId               The ID of the remote issue link.
     * @param remoteIssueLinkRequest 
     */
    @ApiStatus.Internal
    public UpdateRemoteIssueLinkOperationSpec(String issueIdOrKey, String linkId, RemoteIssueLinkRequest remoteIssueLinkRequest) {
        this.issueIdOrKey = issueIdOrKey;
        this.linkId = linkId;
        this.remoteIssueLinkRequest = remoteIssueLinkRequest;

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
        Objects.requireNonNull(linkId, "linkId is a required parameter!");
        Objects.requireNonNull(remoteIssueLinkRequest, "remoteIssueLinkRequest is a required parameter!");
    }
}
