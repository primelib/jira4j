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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FilterSubscriptionsList
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
    "end-index",
    "items",
    "max-results",
    "size",
    "start-index"
})
@JsonTypeName("FilterSubscriptionsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FilterSubscriptionsList {

    /**
     * The index of the last item returned on the page.
     */
    @JsonProperty("end-index")
    protected Integer endIndex;

    /**
     * The list of items.
     */
    @JsonProperty("items")
    protected List<FilterSubscription> items;

    /**
     * The maximum number of results that could be on the page.
     */
    @JsonProperty("max-results")
    protected Integer maxResults;

    /**
     * The number of items on the page.
     */
    @JsonProperty("size")
    protected Integer size;

    /**
     * The index of the first item returned on the page.
     */
    @JsonProperty("start-index")
    protected Integer startIndex;

    /**
     * Constructs a validated instance of {@link FilterSubscriptionsList}.
     *
     * @param spec the specification to process
     */
    public FilterSubscriptionsList(Consumer<FilterSubscriptionsList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FilterSubscriptionsList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FilterSubscriptionsList(Consumer)} instead.
     * @param endIndex The index of the last item returned on the page.
     * @param items The list of items.
     * @param maxResults The maximum number of results that could be on the page.
     * @param size The number of items on the page.
     * @param startIndex The index of the first item returned on the page.
     */
    @ApiStatus.Internal
    public FilterSubscriptionsList(Integer endIndex, List<FilterSubscription> items, Integer maxResults, Integer size, Integer startIndex) {
        this.endIndex = endIndex;
        this.items = items;
        this.maxResults = maxResults;
        this.size = size;
        this.startIndex = startIndex;
    }

}
