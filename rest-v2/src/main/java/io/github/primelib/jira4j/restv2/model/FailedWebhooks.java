package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FailedWebhooks
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "maxResults",
    "next",
    "values"
})
@JsonTypeName("FailedWebhooks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FailedWebhooks {

    /**
     * Constructs a validated implementation of {@link FailedWebhooks}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FailedWebhooks(Consumer<FailedWebhooks> spec) {
        spec.accept(this);
    }

    /**
     * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
     */
    @JsonProperty("next")
    protected URI next;

    /**
     * The list of webhooks.
     */
    @JsonProperty("values")
    protected List<FailedWebhook> values = new ArrayList<>();


}
