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
 * PageOfDashboards
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PageOfDashboards}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageOfDashboards(Consumer<PageOfDashboards> spec) {
        spec.accept(this);
    }

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


}
