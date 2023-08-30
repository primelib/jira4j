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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionUnresolvedIssuesCount
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
    "issuesCount",
    "issuesUnresolvedCount",
    "self"
})
@JsonTypeName("VersionUnresolvedIssuesCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionUnresolvedIssuesCount {

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

    /**
     * Constructs a validated instance of {@link VersionUnresolvedIssuesCount}.
     *
     * @param spec the specification to process
     */
    public VersionUnresolvedIssuesCount(Consumer<VersionUnresolvedIssuesCount> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionUnresolvedIssuesCount}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionUnresolvedIssuesCount(Consumer)} instead.
     * @param issuesCount Count of issues.
     * @param issuesUnresolvedCount Count of unresolved issues.
     * @param self The URL of these count details.
     */
    @ApiStatus.Internal
    public VersionUnresolvedIssuesCount(Long issuesCount, Long issuesUnresolvedCount, URI self) {
        this.issuesCount = issuesCount;
        this.issuesUnresolvedCount = issuesUnresolvedCount;
        this.self = self;
    }

}
