package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SearchForIssuesUsingJqlSpec
 * <p>
 * Specification for the SearchForIssuesUsingJql operation.
 * <p>
 * Search for issues using JQL (GET)
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchForIssuesUsingJqlOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:
     *  *
     * If no JQL expression is provided, all issues are returned.
     * *
     * `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.
     * *
     * If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
     */
    @Nullable 
    private String jql;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt = 0;

    /**
     * The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values are:
     *  *
     * `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).
     * *
     * `warn` Returns all errors as warnings.
     * *
     * `none` No validation is performed.
     * *
     * `true` *Deprecated* A legacy synonym for `strict`.
     * *
     * `false` *Deprecated* A legacy synonym for `warn`.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
     */
    @Nullable 
    private String validateQuery = "strict";

    /**
     * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `*all` Returns all fields.
     * *
     * `*navigable` Returns navigable fields.
     * *
     * Any issue field, prefixed with a minus to exclude.
     * Examples:
     *  *
     * `summary,comment` Returns only the summary and comments fields.
     * *
     * `-description` Returns all navigable (default) fields except description.
     * *
     * `*all,-comment` Returns all fields except comments.
     * This parameter may be specified multiple times. For example, `fields=field1,field2&amp;fields=field3`.
     * Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
     */
    @Nullable 
    private List<String> fields;

    /**
     * Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `renderedFields` Returns field values rendered in HTML format.
     * *
     * `names` Returns the display name of each field.
     * *
     * `schema` Returns the schema describing a field type.
     * *
     * `transitions` Returns all possible transitions for the issue.
     * *
     * `operations` Returns all possible operations for the issue.
     * *
     * `editmeta` Returns information about how each field can be edited.
     * *
     * `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
     * *
     * `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
     */
    @Nullable 
    private String expand;

    /**
     * A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&amp;properties=prop3`. A maximum of 5 issue property keys can be specified.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Reference fields by their key (rather than ID).
     */
    @Nullable 
    private Boolean fieldsByKeys = false;

    /**
     * Constructs a validated implementation of {@link SearchForIssuesUsingJqlOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchForIssuesUsingJqlOperationSpec(Consumer<SearchForIssuesUsingJqlOperationSpec> spec) {
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
    }

}
