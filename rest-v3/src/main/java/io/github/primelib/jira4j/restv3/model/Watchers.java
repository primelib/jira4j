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
 * Watchers
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
    "isWatching",
    "self",
    "watchCount",
    "watchers"
})
@JsonTypeName("Watchers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Watchers {

    /**
     * Whether the calling user is watching this issue.
     */
    @JsonProperty("isWatching")
    protected Boolean isWatching;

    /**
     * The URL of these issue watcher details.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The number of users watching this issue.
     */
    @JsonProperty("watchCount")
    protected Integer watchCount;

    /**
     * Details of the users watching this issue.
     */
    @JsonProperty("watchers")
    protected List<UserDetails> watchers;

    /**
     * Constructs a validated instance of {@link Watchers}.
     *
     * @param spec the specification to process
     */
    public Watchers(Consumer<Watchers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Watchers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Watchers(Consumer)} instead.
     * @param isWatching Whether the calling user is watching this issue.
     * @param self The URL of these issue watcher details.
     * @param watchCount The number of users watching this issue.
     * @param watchers Details of the users watching this issue.
     */
    @ApiStatus.Internal
    public Watchers(Boolean isWatching, String self, Integer watchCount, List<UserDetails> watchers) {
        this.isWatching = isWatching;
        this.self = self;
        this.watchCount = watchCount;
        this.watchers = watchers;
    }

}
