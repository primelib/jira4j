package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageBeanWorkflowScheme
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
@JsonTypeName("PageBeanWorkflowScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageBeanWorkflowScheme {

    /**
     * Constructs a validated implementation of {@link PageBeanWorkflowScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageBeanWorkflowScheme(Consumer<PageBeanWorkflowScheme> spec) {
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
     * If there is another page of results, the URL of the next page.
     */
    @JsonProperty("nextPage")
    protected URI nextPage;

    /**
     * The URL of the page.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The index of the first item returned.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * The number of items returned.
     */
    @JsonProperty("total")
    protected Long total;

    /**
     * The list of items.
     */
    @JsonProperty("values")
    protected List<WorkflowScheme> values;


}
