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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueMatchesForJQL
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
    "errors",
    "matchedIssues"
})
@JsonTypeName("IssueMatchesForJQL")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueMatchesForJQL {

    /**
     * A list of errors.
     */
    @JsonProperty("errors")
    protected Set<String> errors;

    /**
     * A list of issue IDs.
     */
    @JsonProperty("matchedIssues")
    protected Set<Long> matchedIssues;

    /**
     * Constructs a validated instance of {@link IssueMatchesForJQL}.
     *
     * @param spec the specification to process
     */
    public IssueMatchesForJQL(Consumer<IssueMatchesForJQL> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueMatchesForJQL}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueMatchesForJQL(Consumer)} instead.
     * @param errors A list of errors.
     * @param matchedIssues A list of issue IDs.
     */
    @ApiStatus.Internal
    public IssueMatchesForJQL(Set<String> errors, Set<Long> matchedIssues) {
        this.errors = errors;
        this.matchedIssues = matchedIssues;
    }

}
