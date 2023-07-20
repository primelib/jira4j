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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionUnresolvedIssuesCount
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issuesCount",
    "issuesUnresolvedCount",
    "self"
})
@JsonTypeName("VersionUnresolvedIssuesCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionUnresolvedIssuesCount {

    /**
     * Constructs a validated implementation of {@link VersionUnresolvedIssuesCount}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public VersionUnresolvedIssuesCount(Consumer<VersionUnresolvedIssuesCount> spec) {
        spec.accept(this);
    }

    /**
     * Count of issues.
     */
    @JsonProperty("issuesCount")
    protected Long issuesCount;

    /**
     * Count of unresolved issues.
     */
    @JsonProperty("issuesUnresolvedCount")
    protected Long issuesUnresolvedCount;

    /**
     * The URL of these count details.
     */
    @JsonProperty("self")
    protected URI self;


}
