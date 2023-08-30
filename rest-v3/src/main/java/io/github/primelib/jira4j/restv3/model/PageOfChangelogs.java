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
 * PageOfChangelogs
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
    "histories",
    "maxResults",
    "startAt",
    "total"
})
@JsonTypeName("PageOfChangelogs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfChangelogs {

    /**
     * The list of changelogs.
     */
    @JsonProperty("histories")
    protected List<Changelog> histories;

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
     * Constructs a validated instance of {@link PageOfChangelogs}.
     *
     * @param spec the specification to process
     */
    public PageOfChangelogs(Consumer<PageOfChangelogs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfChangelogs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfChangelogs(Consumer)} instead.
     * @param histories The list of changelogs.
     * @param maxResults The maximum number of results that could be on the page.
     * @param startAt The index of the first item returned on the page.
     * @param total The number of results on the page.
     */
    @ApiStatus.Internal
    public PageOfChangelogs(List<Changelog> histories, Integer maxResults, Integer startAt, Integer total) {
        this.histories = histories;
        this.maxResults = maxResults;
        this.startAt = startAt;
        this.total = total;
    }

}
