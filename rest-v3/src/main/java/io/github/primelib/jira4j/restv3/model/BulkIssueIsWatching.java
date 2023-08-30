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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkIssueIsWatching
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
    "issuesIsWatching"
})
@JsonTypeName("BulkIssueIsWatching")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkIssueIsWatching {

    /**
     * The map of issue ID to boolean watch status.
     */
    @JsonProperty("issuesIsWatching")
    protected Map<String, Boolean> issuesIsWatching;

    /**
     * Constructs a validated instance of {@link BulkIssueIsWatching}.
     *
     * @param spec the specification to process
     */
    public BulkIssueIsWatching(Consumer<BulkIssueIsWatching> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkIssueIsWatching}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkIssueIsWatching(Consumer)} instead.
     * @param issuesIsWatching The map of issue ID to boolean watch status.
     */
    @ApiStatus.Internal
    public BulkIssueIsWatching(Map<String, Boolean> issuesIsWatching) {
        this.issuesIsWatching = issuesIsWatching;
    }

}
