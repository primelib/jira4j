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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageOfStatuses
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

    /**
     * Constructs a validated instance of {@link PageOfStatuses}.
     *
     * @param spec the specification to process
     */
    public PageOfStatuses(Consumer<PageOfStatuses> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfStatuses}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfStatuses(Consumer)} instead.
     * @param isLast Whether this is the last page.
     * @param maxResults The maximum number of items that could be returned.
     * @param nextPage The URL of the next page of results, if any.
     * @param self The URL of this page.
     * @param startAt The index of the first item returned on the page.
     * @param total Number of items that satisfy the search.
     * @param values The list of items.
     */
    @ApiStatus.Internal
    public PageOfStatuses(Boolean isLast, Integer maxResults, String nextPage, String self, Long startAt, Long total, List<JiraStatus> values) {
        this.isLast = isLast;
        this.maxResults = maxResults;
        this.nextPage = nextPage;
        this.self = self;
        this.startAt = startAt;
        this.total = total;
        this.values = values;
    }

}
