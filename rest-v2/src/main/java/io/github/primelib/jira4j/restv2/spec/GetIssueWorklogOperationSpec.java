package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Worklog;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 5000;

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
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts`properties`, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetIssueWorklogOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
    }

}
