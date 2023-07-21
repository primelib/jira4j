package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * SearchForIssuesUsingJqlSpec
 * <p>
 * Specification for the SearchForIssuesUsingJql operation.
 * <p>
 * Search for issues using JQL (GET)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code username} and {@code userkey} cannot be used as search terms due to privacy reasons. Use {@code accountId} instead.
     * *
     * If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
     */
    @Nullable 
    private String jql;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt;

    /**
     * The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting {@code id} or {@code key} only.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values are:
     *  *
     * {@code strict} Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).
     * *
     * {@code warn} Returns all errors as warnings.
     * *
     * {@code none} No validation is performed.
     * *
     * {@code true} *Deprecated* A legacy synonym for {@code strict}.
     * *
     * {@code false} *Deprecated* A legacy synonym for {@code warn}.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value.
     */
    @Nullable 
    private String validateQuery;

    /**
     * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code *all} Returns all fields.
     * *
     * {@code *navigable} Returns navigable fields.
     * *
     * Any issue field, prefixed with a minus to exclude.
     * Examples:
     *  *
     * {@code summary,comment} Returns only the summary and comments fields.
     * *
     * {@code -description} Returns all navigable (default) fields except description.
     * *
     * {@code *all,-comment} Returns all fields except comments.
     * This parameter may be specified multiple times. For example, {@code fields=field1,field2&amp;fields=field3}.
     * Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-2-issue-issueIdOrKey-get) where the default is all fields.
     */
    @Nullable 
    private List<String> fields;

    /**
     * Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code renderedFields} Returns field values rendered in HTML format.
     * *
     * {@code names} Returns the display name of each field.
     * *
     * {@code schema} Returns the schema describing a field type.
     * *
     * {@code transitions} Returns all possible transitions for the issue.
     * *
     * {@code operations} Returns all possible operations for the issue.
     * *
     * {@code editmeta} Returns information about how each field can be edited.
     * *
     * {@code changelog} Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
     * *
     * {@code versionedRepresentations} Instead of {@code fields}, returns {@code versionedRepresentations} a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
     */
    @Nullable 
    private String expand;

    /**
     * A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, {@code properties=prop1,prop2&amp;properties=prop3}. A maximum of 5 issue property keys can be specified.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Reference fields by their key (rather than ID).
     */
    @Nullable 
    private Boolean fieldsByKeys;

    /**
     * Constructs a validated instance of {@link SearchForIssuesUsingJqlOperationSpec}.
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
     * Constructs a validated instance of {@link SearchForIssuesUsingJqlOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jql                  The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  {@code username} and {@code userkey} cannot be used as search terms due to privacy reasons. Use {@code accountId} instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting {@code id} or {@code key} only.
     * @param validateQuery        Determines how to validate the JQL query and treat the validation results. Supported values are:   *  {@code strict} Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  {@code warn} Returns all errors as warnings.  *  {@code none} No validation is performed.  *  {@code true} *Deprecated* A legacy synonym for {@code strict}.  *  {@code false} *Deprecated* A legacy synonym for {@code warn}.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value.
     * @param fields               A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  {@code *all} Returns all fields.  *  {@code *navigable} Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  {@code summary,comment} Returns only the summary and comments fields.  *  {@code -description} Returns all navigable (default) fields except description.  *  {@code *all,-comment} Returns all fields except comments.  This parameter may be specified multiple times. For example, {@code fields=field1,field2&amp;fields=field3}.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-2-issue-issueIdOrKey-get) where the default is all fields.
     * @param expand               Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code renderedFields} Returns field values rendered in HTML format.  *  {@code names} Returns the display name of each field.  *  {@code schema} Returns the schema describing a field type.  *  {@code transitions} Returns all possible transitions for the issue.  *  {@code operations} Returns all possible operations for the issue.  *  {@code editmeta} Returns information about how each field can be edited.  *  {@code changelog} Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  {@code versionedRepresentations} Instead of {@code fields}, returns {@code versionedRepresentations} a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
     * @param properties           A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, {@code properties=prop1,prop2&amp;properties=prop3}. A maximum of 5 issue property keys can be specified.
     * @param fieldsByKeys         Reference fields by their key (rather than ID).
     */
    @ApiStatus.Internal
    public SearchForIssuesUsingJqlOperationSpec(String jql, Integer startAt, Integer maxResults, String validateQuery, List<String> fields, String expand, List<String> properties, Boolean fieldsByKeys) {
        this.jql = jql;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.validateQuery = validateQuery;
        this.fields = fields;
        this.expand = expand;
        this.properties = properties;
        this.fieldsByKeys = fieldsByKeys;

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
