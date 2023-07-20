package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueLink;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLink;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Map<String, Object> requestBody;

    /**
     * Constructs a validated implementation of {@link UpdateRemoteIssueLinkOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(linkId, "linkId is a required parameter!");
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
