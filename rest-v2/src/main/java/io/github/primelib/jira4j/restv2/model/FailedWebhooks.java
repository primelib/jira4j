package io.github.primelib.jira4j.restv2.model;

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

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FailedWebhooks
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
    "next",
    "values"
})
@JsonTypeName("FailedWebhooks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FailedWebhooks {

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
    protected List<FailedWebhook> values;

    /**
     * Constructs a validated instance of {@link FailedWebhooks}.
     *
     * @param spec the specification to process
     */
    public FailedWebhooks(Consumer<FailedWebhooks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FailedWebhooks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FailedWebhooks(Consumer)} instead.
     * @param maxResults The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
     * @param next The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
     * @param values The list of webhooks.
     */
    @ApiStatus.Internal
    public FailedWebhooks(Integer maxResults, URI next, List<FailedWebhook> values) {
        this.maxResults = maxResults;
        this.next = next;
        this.values = values;
    }

}
