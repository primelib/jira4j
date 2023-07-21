package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchRequestBean
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Use [expand](em&amp;gt;#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where {@code expand} is specified, {@code expand} is defined as a list of values. The expand options are:
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
    @JsonProperty("expand")
    protected List<String> expand;

    /**
     * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code *all} Returns all fields.
     * *
     * {@code *navigable} Returns navigable fields.
     * *
     * Any issue field, prefixed with a minus to exclude.
     * The default is {@code *navigable}.
     * Examples:
     *  *
     * {@code summary,comment} Returns the summary and comments fields only.
     * *
     * {@code -description} Returns all navigable (default) fields except description.
     * *
     * {@code *all,-comment} Returns all fields except comments.
     * Multiple {@code fields} parameters can be included in a request.
     * Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
     */
    @JsonProperty("fields")
    protected List<String> fields;

    /**
     * Reference fields by their key (rather than ID). The default is {@code false}.
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
    protected Integer maxResults;

    /**
     * A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
     */
    @JsonProperty("properties")
    protected List<String> properties;

    /**
     * The index of the first item to return in the page of results (page offset). The base index is {@code 0}.
     */
    @JsonProperty("startAt")
    protected Integer startAt;

    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values:
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
     * The default is {@code strict}.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value.
     */
    @JsonProperty("validateQuery")
    protected ValidateQueryEnum validateQuery;

    /**
     * Constructs a validated instance of {@link SearchRequestBean}.
     *
     * @param spec the specification to process
     */
    public SearchRequestBean(Consumer<SearchRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchRequestBean(Consumer)} instead.
     * @param expand Use [expand](em&amp;gt;#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where {@code expand} is specified, {@code expand} is defined as a list of values. The expand options are:   *  {@code renderedFields} Returns field values rendered in HTML format.  *  {@code names} Returns the display name of each field.  *  {@code schema} Returns the schema describing a field type.  *  {@code transitions} Returns all possible transitions for the issue.  *  {@code operations} Returns all possible operations for the issue.  *  {@code editmeta} Returns information about how each field can be edited.  *  {@code changelog} Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  {@code versionedRepresentations} Instead of {@code fields}, returns {@code versionedRepresentations} a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
     * @param fields A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  {@code *all} Returns all fields.  *  {@code *navigable} Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is {@code *navigable}.  Examples:   *  {@code summary,comment} Returns the summary and comments fields only.  *  {@code -description} Returns all navigable (default) fields except description.  *  {@code *all,-comment} Returns all fields except comments.  Multiple {@code fields} parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
     * @param fieldsByKeys Reference fields by their key (rather than ID). The default is {@code false}.
     * @param jql A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
     * @param maxResults The maximum number of items to return per page.
     * @param properties A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
     * @param startAt The index of the first item to return in the page of results (page offset). The base index is {@code 0}.
     * @param validateQuery Determines how to validate the JQL query and treat the validation results. Supported values:   *  {@code strict} Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  {@code warn} Returns all errors as warnings.  *  {@code none} No validation is performed.  *  {@code true} *Deprecated* A legacy synonym for {@code strict}.  *  {@code false} *Deprecated* A legacy synonym for {@code warn}.  The default is {@code strict}.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value.
     */
    @ApiStatus.Internal
    public SearchRequestBean(List<String> expand, List<String> fields, Boolean fieldsByKeys, String jql, Integer maxResults, List<String> properties, Integer startAt, ValidateQueryEnum validateQuery) {
        this.expand = expand;
        this.fields = fields;
        this.fieldsByKeys = fieldsByKeys;
        this.jql = jql;
        this.maxResults = maxResults;
        this.properties = properties;
        this.startAt = startAt;
        this.validateQuery = validateQuery;
    }

    /**
     * Determines how to validate the JQL query and treat the validation results. Supported values:
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
     * The default is {@code strict}.
     * Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value.
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
