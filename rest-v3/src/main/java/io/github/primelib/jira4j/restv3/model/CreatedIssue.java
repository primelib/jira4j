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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatedIssue
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
    "id",
    "key",
    "self",
    "transition",
    "watchers"
})
@JsonTypeName("CreatedIssue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssue {

    /**
     * The ID of the created issue or subtask.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the created issue or subtask.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The URL of the created issue or subtask.
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("transition")
    protected CreatedIssueTransition transition;

    @JsonProperty("watchers")
    protected CreatedIssueWatchers watchers;

    /**
     * Constructs a validated instance of {@link CreatedIssue}.
     *
     * @param spec the specification to process
     */
    public CreatedIssue(Consumer<CreatedIssue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatedIssue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatedIssue(Consumer)} instead.
     * @param id The ID of the created issue or subtask.
     * @param key The key of the created issue or subtask.
     * @param self The URL of the created issue or subtask.
     * @param transition var.name
     * @param watchers var.name
     */
    @ApiStatus.Internal
    public CreatedIssue(String id, String key, String self, CreatedIssueTransition transition, CreatedIssueWatchers watchers) {
        this.id = id;
        this.key = key;
        this.self = self;
        this.transition = transition;
        this.watchers = watchers;
    }

}
