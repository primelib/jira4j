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
 * PageOfWorklogs
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
    "maxResults",
    "startAt",
    "total",
    "worklogs"
})
@JsonTypeName("PageOfWorklogs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfWorklogs {

    /**
     * The maximum number of results that could be on the page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

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
     * List of worklogs.
     */
    @JsonProperty("worklogs")
    protected List<Worklog> worklogs;

    /**
     * Constructs a validated instance of {@link PageOfWorklogs}.
     *
     * @param spec the specification to process
     */
    public PageOfWorklogs(Consumer<PageOfWorklogs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfWorklogs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfWorklogs(Consumer)} instead.
     * @param maxResults The maximum number of results that could be on the page.
     * @param startAt The index of the first item returned on the page.
     * @param total The number of results on the page.
     * @param worklogs List of worklogs.
     */
    @ApiStatus.Internal
    public PageOfWorklogs(Integer maxResults, Integer startAt, Integer total, List<Worklog> worklogs) {
        this.maxResults = maxResults;
        this.startAt = startAt;
        this.total = total;
        this.worklogs = worklogs;
    }

}
