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
 * UserGroups
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link UserGroups}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserGroups(Consumer<UserGroups> spec) {
        spec.accept(this);
    }

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


}
