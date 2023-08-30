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

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Votes
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
    "hasVoted",
    "self",
    "voters",
    "votes"
})
@JsonTypeName("Votes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Votes {

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

    /**
     * Constructs a validated instance of {@link Votes}.
     *
     * @param spec the specification to process
     */
    public Votes(Consumer<Votes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Votes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Votes(Consumer)} instead.
     * @param hasVoted Whether the user making this request has voted on the issue.
     * @param self The URL of these issue vote details.
     * @param voters List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.
     * @param votes The number of votes on the issue.
     */
    @ApiStatus.Internal
    public Votes(Boolean hasVoted, URI self, List<User> voters, Long votes) {
        this.hasVoted = hasVoted;
        this.self = self;
        this.voters = voters;
        this.votes = votes;
    }

}
