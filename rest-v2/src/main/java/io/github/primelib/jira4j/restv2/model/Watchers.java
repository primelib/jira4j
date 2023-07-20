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
 * Watchers
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Watchers}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Watchers(Consumer<Watchers> spec) {
        spec.accept(this);
    }

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


}
