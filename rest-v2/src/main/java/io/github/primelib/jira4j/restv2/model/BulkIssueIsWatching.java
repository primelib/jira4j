package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkIssueIsWatching
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issuesIsWatching"
})
@JsonTypeName("BulkIssueIsWatching")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkIssueIsWatching {

    /**
     * Constructs a validated implementation of {@link BulkIssueIsWatching}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkIssueIsWatching(Consumer<BulkIssueIsWatching> spec) {
        spec.accept(this);
    }

    /**
     * The map of issue ID to boolean watch status.
     */
    @JsonProperty("issuesIsWatching")
    protected Map<String, Boolean> issuesIsWatching = new HashMap<>();


}
