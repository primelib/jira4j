package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Votes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hasVoted",
    "self",
    "voters",
    "votes"
})
@JsonTypeName("Votes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Votes {

    /**
     * Constructs a validated implementation of {@link Votes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Votes(Consumer<Votes> spec) {
        spec.accept(this);
    }

    /**
     * Whether the user making this request has voted on the issue.
     */
    @JsonProperty("hasVoted")
    protected Boolean hasVoted;

    /**
     * The URL of these issue vote details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.
     */
    @JsonProperty("voters")
    protected List<User> voters;

    /**
     * The number of votes on the issue.
     */
    @JsonProperty("votes")
    protected Long votes;


}
