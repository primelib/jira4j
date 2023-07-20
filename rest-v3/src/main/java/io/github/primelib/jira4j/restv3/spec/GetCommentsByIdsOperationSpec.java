package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Comment;
import io.github.primelib.jira4j.restv3.model.IssueCommentListRequestBean;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * `renderedBody` Returns the comment body rendered in HTML.
     * *
     * `properties` Returns the comment's properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetCommentsByIdsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueCommentListRequestBean, "issueCommentListRequestBean is a required parameter!");
    }

}
