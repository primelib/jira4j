package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Comment;
import io.github.primelib.jira4j.restv3.model.IssueCommentListRequestBean;
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
 * GetCommentsByIdsSpec
 * <p>
 * Specification for the GetCommentsByIds operation.
 * <p>
 * Get comments by IDs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCommentsByIdsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The list of comment IDs.
     */
    @NotNull 
    private IssueCommentListRequestBean issueCommentListRequestBean;

    /**
     * Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code renderedBody} Returns the comment body rendered in HTML.
     * *
     * {@code properties} Returns the comment's properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetCommentsByIdsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCommentsByIdsOperationSpec(Consumer<GetCommentsByIdsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCommentsByIdsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueCommentListRequestBean The list of comment IDs.
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code renderedBody} Returns the comment body rendered in HTML.  *  {@code properties} Returns the comment's properties.
     */
    @ApiStatus.Internal
    public GetCommentsByIdsOperationSpec(IssueCommentListRequestBean issueCommentListRequestBean, String expand) {
        this.issueCommentListRequestBean = issueCommentListRequestBean;
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
        Objects.requireNonNull(issueCommentListRequestBean, "issueCommentListRequestBean is a required parameter!");
    }
}
