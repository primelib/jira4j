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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaginatedResponseIssueTypeIssueCreateMetadata
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
    "maxResults",
    "results",
    "startAt",
    "total"
})
@JsonTypeName("PaginatedResponseIssueTypeIssueCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PaginatedResponseIssueTypeIssueCreateMetadata {

    @JsonProperty("maxResults")
    protected Integer maxResults;

    @JsonProperty("results")
    protected List<IssueTypeIssueCreateMetadata> results;

    @JsonProperty("startAt")
    protected Long startAt;

    @JsonProperty("total")
    protected Long total;

    /**
     * Constructs a validated instance of {@link PaginatedResponseIssueTypeIssueCreateMetadata}.
     *
     * @param spec the specification to process
     */
    public PaginatedResponseIssueTypeIssueCreateMetadata(Consumer<PaginatedResponseIssueTypeIssueCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PaginatedResponseIssueTypeIssueCreateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PaginatedResponseIssueTypeIssueCreateMetadata(Consumer)} instead.
     * @param maxResults maxResults
     * @param results results
     * @param startAt startAt
     * @param total total
     */
    @ApiStatus.Internal
    public PaginatedResponseIssueTypeIssueCreateMetadata(Integer maxResults, List<IssueTypeIssueCreateMetadata> results, Long startAt, Long total) {
        this.maxResults = maxResults;
        this.results = results;
        this.startAt = startAt;
        this.total = total;
    }

}
