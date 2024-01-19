package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Worklog;
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
 * GetIssueWorklogSpec
 * <p>
 * Specification for the GetIssueWorklog operation.
 * <p>
 * Get issue worklogs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueWorklogOperationSpec {
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
     * The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned.
     */
    @Nullable 
    private Long startedAfter;

    /**
     * The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned.
     */
    @Nullable 
    private Long startedBefore;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts{@code properties}, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetIssueWorklogOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueWorklogOperationSpec(Consumer<GetIssueWorklogOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetIssueWorklogOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param startedAfter         The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned.
     * @param startedBefore        The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned.
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts{@code properties}, which returns worklog properties.
     */
    @ApiStatus.Internal
    public GetIssueWorklogOperationSpec(String issueIdOrKey, Long startAt, Integer maxResults, Long startedAfter, Long startedBefore, String expand) {
        this.issueIdOrKey = issueIdOrKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.startedAfter = startedAfter;
        this.startedBefore = startedBefore;
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
