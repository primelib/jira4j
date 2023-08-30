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
 * SanitizedJqlQueries
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
    "queries"
})
@JsonTypeName("SanitizedJqlQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitizedJqlQueries {

    /**
     * The list of sanitized JQL queries.
     */
    @JsonProperty("queries")
    protected List<SanitizedJqlQuery> queries;

    /**
     * Constructs a validated instance of {@link SanitizedJqlQueries}.
     *
     * @param spec the specification to process
     */
    public SanitizedJqlQueries(Consumer<SanitizedJqlQueries> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SanitizedJqlQueries}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SanitizedJqlQueries(Consumer)} instead.
     * @param queries The list of sanitized JQL queries.
     */
    @ApiStatus.Internal
    public SanitizedJqlQueries(List<SanitizedJqlQuery> queries) {
        this.queries = queries;
    }

}
