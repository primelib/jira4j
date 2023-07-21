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
 * UserGroups
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
@JsonTypeName("User_groups")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserGroups {

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
     * Constructs a validated instance of {@link UserGroups}.
     *
     * @param spec the specification to process
     */
    public UserGroups(Consumer<UserGroups> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserGroups}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserGroups(Consumer)} instead.
     * @param callback var.name
     * @param items var.name
     * @param maxResults var.name
     * @param pagingCallback var.name
     * @param size var.name
     */
    @ApiStatus.Internal
    public UserGroups(Object callback, List<GroupName> items, Integer maxResults, Object pagingCallback, Integer size) {
        this.callback = callback;
        this.items = items;
        this.maxResults = maxResults;
        this.pagingCallback = pagingCallback;
        this.size = size;
    }

}
