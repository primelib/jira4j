package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchResults
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link SearchResults}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchResults(Consumer<SearchResults> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> names = new HashMap<>();

    /**
     * The schema describing the field types in the search results.
     */
    @JsonProperty("schema")
    protected Map<String, JsonTypeBean> schema = new HashMap<>();

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


}
