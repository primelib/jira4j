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
 * SimpleListWrapperGroupName
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
    "callback",
    "items",
    "max-results",
    "pagingCallback",
    "size"
})
@JsonTypeName("SimpleListWrapperGroupName")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleListWrapperGroupName {

    @JsonProperty("callback")
    protected Object callback;

    @JsonProperty("items")
    protected List<GroupName> items;

    @JsonProperty("max-results")
    protected Integer maxResults;

    @JsonProperty("pagingCallback")
    protected Object pagingCallback;

    @JsonProperty("size")
    protected Integer size;

    /**
     * Constructs a validated instance of {@link SimpleListWrapperGroupName}.
     *
     * @param spec the specification to process
     */
    public SimpleListWrapperGroupName(Consumer<SimpleListWrapperGroupName> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleListWrapperGroupName}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleListWrapperGroupName(Consumer)} instead.
     * @param callback callback
     * @param items items
     * @param maxResults maxResults
     * @param pagingCallback pagingCallback
     * @param size size
     */
    @ApiStatus.Internal
    public SimpleListWrapperGroupName(Object callback, List<GroupName> items, Integer maxResults, Object pagingCallback, Integer size) {
        this.callback = callback;
        this.items = items;
        this.maxResults = maxResults;
        this.pagingCallback = pagingCallback;
        this.size = size;
    }

}
