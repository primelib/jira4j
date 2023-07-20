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
 * PageOfComments
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "comments",
    "maxResults",
    "startAt",
    "total"
})
@JsonTypeName("PageOfComments")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfComments extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link PageOfComments}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PageOfComments(Consumer<PageOfComments> spec) {
        spec.accept(this);
    }

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


}
