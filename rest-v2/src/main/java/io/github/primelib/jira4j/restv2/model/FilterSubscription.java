package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FilterSubscription
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "group",
    "id",
    "user"
})
@JsonTypeName("FilterSubscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FilterSubscription {

    /**
     * Constructs a validated implementation of {@link FilterSubscription}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FilterSubscription(Consumer<FilterSubscription> spec) {
        spec.accept(this);
    }

    @JsonProperty("group")
    protected FilterSubscriptionGroup group;

    /**
     * The ID of the filter subscription.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("user")
    protected FilterSubscriptionUser user;


}
