package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * PageOfWorklogs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "maxResults",
    "startAt",
    "total",
    "worklogs"
})
@JsonTypeName("PageOfWorklogs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfWorklogs extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link PageOfWorklogs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageOfWorklogs(Consumer<PageOfWorklogs> spec) {
        spec.accept(this);
    }

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


}
