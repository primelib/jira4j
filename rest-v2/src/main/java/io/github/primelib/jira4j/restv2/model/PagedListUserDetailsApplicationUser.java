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
 * PagedListUserDetailsApplicationUser
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "end-index",
    "items",
    "max-results",
    "size",
    "start-index"
})
@JsonTypeName("PagedListUserDetailsApplicationUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PagedListUserDetailsApplicationUser {

    /**
     * Constructs a validated implementation of {@link PagedListUserDetailsApplicationUser}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PagedListUserDetailsApplicationUser(Consumer<PagedListUserDetailsApplicationUser> spec) {
        spec.accept(this);
    }

    /**
     * The index of the last item returned on the page.
     */
    @JsonProperty("end-index")
    protected Integer endIndex;

    /**
     * The list of items.
     */
    @JsonProperty("items")
    protected List<UserDetails> items;

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


}
