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
 * PageOfChangelogs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PageOfChangelogs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageOfChangelogs(Consumer<PageOfChangelogs> spec) {
        spec.accept(this);
    }

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


}
