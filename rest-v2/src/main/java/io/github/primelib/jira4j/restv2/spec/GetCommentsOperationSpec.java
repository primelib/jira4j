package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Comment;
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
 * GetCommentsSpec
 * <p>
 * Specification for the GetComments operation.
 * <p>
 * Get comments
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCommentsOperationSpec {
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
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date.
     */
    @Nullable 
    private String orderBy;

    /**
     * Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetCommentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCommentsOperationSpec(Consumer<GetCommentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCommentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param orderBy              [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date.
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML.
     */
    @ApiStatus.Internal
    public GetCommentsOperationSpec(String issueIdOrKey, Long startAt, Integer maxResults, String orderBy, String expand) {
        this.issueIdOrKey = issueIdOrKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
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
    }
}
