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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FilterSubscription
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
    "group",
    "id",
    "user"
})
@JsonTypeName("FilterSubscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FilterSubscription {

    @JsonProperty("group")
    protected FilterSubscriptionGroup group;

    /**
     * The ID of the filter subscription.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("user")
    protected FilterSubscriptionUser user;

    /**
     * Constructs a validated instance of {@link FilterSubscription}.
     *
     * @param spec the specification to process
     */
    public FilterSubscription(Consumer<FilterSubscription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FilterSubscription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FilterSubscription(Consumer)} instead.
     * @param group group
     * @param id The ID of the filter subscription.
     * @param user user
     */
    @ApiStatus.Internal
    public FilterSubscription(FilterSubscriptionGroup group, Long id, FilterSubscriptionUser user) {
        this.group = group;
        this.id = id;
        this.user = user;
    }

}
