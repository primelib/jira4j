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
 * PageOfComments
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
    "comments",
    "maxResults",
    "startAt",
    "total"
})
@JsonTypeName("PageOfComments")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfComments {

    /**
     * The list of comments.
     */
    @JsonProperty("comments")
    protected List<Comment> comments;

    /**
     * The maximum number of items that could be returned.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

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
     * Constructs a validated instance of {@link PageOfComments}.
     *
     * @param spec the specification to process
     */
    public PageOfComments(Consumer<PageOfComments> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfComments}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfComments(Consumer)} instead.
     * @param comments The list of comments.
     * @param maxResults The maximum number of items that could be returned.
     * @param startAt The index of the first item returned.
     * @param total The number of items returned.
     */
    @ApiStatus.Internal
    public PageOfComments(List<Comment> comments, Integer maxResults, Long startAt, Long total) {
        this.comments = comments;
        this.maxResults = maxResults;
        this.startAt = startAt;
        this.total = total;
    }

}
