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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaginatedResponseFieldCreateMetadata
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
@JsonTypeName("PaginatedResponseFieldCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PaginatedResponseFieldCreateMetadata {

    @JsonProperty("maxResults")
    protected Integer maxResults;

    @JsonProperty("results")
    protected List<FieldCreateMetadata> results;

    @JsonProperty("startAt")
    protected Long startAt;

    @JsonProperty("total")
    protected Long total;

    /**
     * Constructs a validated instance of {@link PaginatedResponseFieldCreateMetadata}.
     *
     * @param spec the specification to process
     */
    public PaginatedResponseFieldCreateMetadata(Consumer<PaginatedResponseFieldCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PaginatedResponseFieldCreateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PaginatedResponseFieldCreateMetadata(Consumer)} instead.
     * @param maxResults maxResults
     * @param results results
     * @param startAt startAt
     * @param total total
     */
    @ApiStatus.Internal
    public PaginatedResponseFieldCreateMetadata(Integer maxResults, List<FieldCreateMetadata> results, Long startAt, Long total) {
        this.maxResults = maxResults;
        this.results = results;
        this.startAt = startAt;
        this.total = total;
    }

}
