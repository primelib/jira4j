package io.github.primelib.jira4j.restv3.model;

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
 * PageOfStatuses
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "isLast",
    "maxResults",
    "nextPage",
    "self",
    "startAt",
    "total",
    "values"
})
@JsonTypeName("PageOfStatuses")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfStatuses {

    /**
     * Constructs a validated implementation of {@link PageOfStatuses}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageOfStatuses(Consumer<PageOfStatuses> spec) {
        spec.accept(this);
    }

    /**
     * Whether this is the last page.
     */
    @JsonProperty("isLast")
    protected Boolean isLast;

    /**
     * The maximum number of items that could be returned.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The URL of the next page of results, if any.
     */
    @JsonProperty("nextPage")
    protected String nextPage;

    /**
     * The URL of this page.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The index of the first item returned on the page.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * Number of items that satisfy the search.
     */
    @JsonProperty("total")
    protected Long total;

    /**
     * The list of items.
     */
    @JsonProperty("values")
    protected List<JiraStatus> values;


}
