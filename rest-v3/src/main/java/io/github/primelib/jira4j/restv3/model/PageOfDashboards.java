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
 * PageOfDashboards
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
    "dashboards",
    "maxResults",
    "next",
    "prev",
    "startAt",
    "total"
})
@JsonTypeName("PageOfDashboards")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfDashboards {

    /**
     * List of dashboards.
     */
    @JsonProperty("dashboards")
    protected List<Dashboard> dashboards;

    /**
     * The maximum number of results that could be on the page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The URL of the next page of results, if any.
     */
    @JsonProperty("next")
    protected String next;

    /**
     * The URL of the previous page of results, if any.
     */
    @JsonProperty("prev")
    protected String prev;

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
     * Constructs a validated instance of {@link PageOfDashboards}.
     *
     * @param spec the specification to process
     */
    public PageOfDashboards(Consumer<PageOfDashboards> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfDashboards}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfDashboards(Consumer)} instead.
     * @param dashboards List of dashboards.
     * @param maxResults The maximum number of results that could be on the page.
     * @param next The URL of the next page of results, if any.
     * @param prev The URL of the previous page of results, if any.
     * @param startAt The index of the first item returned on the page.
     * @param total The number of results on the page.
     */
    @ApiStatus.Internal
    public PageOfDashboards(List<Dashboard> dashboards, Integer maxResults, String next, String prev, Integer startAt, Integer total) {
        this.dashboards = dashboards;
        this.maxResults = maxResults;
        this.next = next;
        this.prev = prev;
        this.startAt = startAt;
        this.total = total;
    }

}
