package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "fields",
    "fieldsByKeys",
    "jql",
    "maxResults",
    "properties",
    "startAt",
    "validateQuery"
})
@JsonTypeName("SearchRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchRequestBean {

    /**
     * Constructs a validated implementation of {@link SearchRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchRequestBean(Consumer<SearchRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Use [expand](em&amp;gt;#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:
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
    @JsonProperty("expand")
    protected List<String> expand;

    /**
     * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `*all` Returns all fields.
     * *
     * `*navigable` Returns navigable fields.
     * *
     * Any issue field, prefixed with a minus to exclude.
     * The default is `*navigable`.
     * Examples:
     *  *
     * `summary,comment` Returns the summary and comments fields only.
     * *
     * `-description` Returns all navigable (default) fields except description.
     * *
     * `*all,-comment` Returns all fields except comments.
     * Multiple `fields` parameters can be included in a request.
     * Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-2-issue-issueIdOrKey-get) where the default is all fields.
     */
    @JsonProperty("fields")
    protected List<String> fields;

    /**
     * Reference fields by their key (rather than ID). The default is `false`.
     */
    @JsonProperty("fieldsByKeys")
    protected Boolean fieldsByKeys;

    /**
     * A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
     */
    @JsonProperty("jql")
    protected String jql;

    /**
     * The maximum number of items to return per page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults = 50;

    /**
     * A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
     */
    @JsonProperty("properties")
    protected List<String> properties;

    /**
     * The index of the first item to return in the page of results (page offset). The base index is `0`.
     */
    @JsonProperty("startAt")
    protected Integer startAt;

    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values:
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
     * The default is `strict`.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
     */
    @JsonProperty("validateQuery")
    protected ValidateQueryEnum validateQuery;


    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values:
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
     * The default is `strict`.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
     */
    @AllArgsConstructor
    public enum ValidateQueryEnum {
        STRICT("strict"),
        WARN("warn"),
        NONE("none"),
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

}
