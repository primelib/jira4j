package io.github.primelib.jira4j.restv2.model;

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
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchResults
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
    "issues",
    "maxResults",
    "names",
    "schema",
    "startAt",
    "total",
    "warningMessages"
})
@JsonTypeName("SearchResults")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchResults {

    /**
     * Expand options that include additional search result details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The list of issues found by the search.
     */
    @JsonProperty("issues")
    protected List<IssueBean> issues;

    /**
     * The maximum number of results that could be on the page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The ID and name of each field in the search results.
     */
    @JsonProperty("names")
    protected Map<String, String> names;

    /**
     * The schema describing the field types in the search results.
     */
    @JsonProperty("schema")
    protected Map<String, JsonTypeBean> schema;

    /**
     * The index of the first item returned on the page.
     */
    @JsonProperty("startAt")
    protected Integer startAt;

    /**
     * The number of results on the page.
     */
    @JsonProperty("total")
    protected Integer total;

    /**
     * Any warnings related to the JQL query.
     */
    @JsonProperty("warningMessages")
    protected List<String> warningMessages;

    /**
     * Constructs a validated instance of {@link SearchResults}.
     *
     * @param spec the specification to process
     */
    public SearchResults(Consumer<SearchResults> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchResults}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchResults(Consumer)} instead.
     * @param expand Expand options that include additional search result details in the response.
     * @param issues The list of issues found by the search.
     * @param maxResults The maximum number of results that could be on the page.
     * @param names The ID and name of each field in the search results.
     * @param schema The schema describing the field types in the search results.
     * @param startAt The index of the first item returned on the page.
     * @param total The number of results on the page.
     * @param warningMessages Any warnings related to the JQL query.
     */
    @ApiStatus.Internal
    public SearchResults(String expand, List<IssueBean> issues, Integer maxResults, Map<String, String> names, Map<String, JsonTypeBean> schema, Integer startAt, Integer total, List<String> warningMessages) {
        this.expand = expand;
        this.issues = issues;
        this.maxResults = maxResults;
        this.names = names;
        this.schema = schema;
        this.startAt = startAt;
        this.total = total;
        this.warningMessages = warningMessages;
    }

}
