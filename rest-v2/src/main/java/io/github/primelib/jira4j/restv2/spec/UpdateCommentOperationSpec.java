package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Comment;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
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
 * UpdateCommentSpec
 * <p>
 * Specification for the UpdateComment operation.
 * <p>
 * Update comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCommentOperationSpec {
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
     * The ID of the comment.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private Comment comment;

    /**
     * Whether users are notified when a comment is updated.
     */
    @Nullable 
    private Boolean notifyUsers;

    /**
     * Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Nullable 
    private Boolean overrideEditableFlag;

    /**
     * Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link UpdateCommentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCommentOperationSpec(Consumer<UpdateCommentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateCommentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param id                   The ID of the comment.
     * @param comment              
     * @param notifyUsers          Whether users are notified when a comment is updated.
     * @param overrideEditableFlag Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML.
     */
    @ApiStatus.Internal
    public UpdateCommentOperationSpec(String issueIdOrKey, String id, Comment comment, Boolean notifyUsers, Boolean overrideEditableFlag, String expand) {
        this.issueIdOrKey = issueIdOrKey;
        this.id = id;
        this.comment = comment;
        this.notifyUsers = notifyUsers;
        this.overrideEditableFlag = overrideEditableFlag;
        this.expand = expand;

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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(comment, "comment is a required parameter!");
    }
}
