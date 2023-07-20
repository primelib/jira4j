package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueMatchesForJQL
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errors",
    "matchedIssues"
})
@JsonTypeName("IssueMatchesForJQL")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueMatchesForJQL {

    /**
     * Constructs a validated implementation of {@link IssueMatchesForJQL}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueMatchesForJQL(Consumer<IssueMatchesForJQL> spec) {
        spec.accept(this);
    }

    /**
     * A list of errors.
     */
    @JsonProperty("errors")
    protected Set<String> errors = new LinkedHashSet<>();

    /**
     * A list of issue IDs.
     */
    @JsonProperty("matchedIssues")
    protected Set<Long> matchedIssues = new LinkedHashSet<>();


}
