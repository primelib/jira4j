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
 * ParsedJqlQueries
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
@JsonTypeName("ParsedJqlQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParsedJqlQueries {

    /**
     * A list of parsed JQL queries.
     */
    @JsonProperty("queries")
    protected List<ParsedJqlQuery> queries;

    /**
     * Constructs a validated instance of {@link ParsedJqlQueries}.
     *
     * @param spec the specification to process
     */
    public ParsedJqlQueries(Consumer<ParsedJqlQueries> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ParsedJqlQueries}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ParsedJqlQueries(Consumer)} instead.
     * @param queries A list of parsed JQL queries.
     */
    @ApiStatus.Internal
    public ParsedJqlQueries(List<ParsedJqlQuery> queries) {
        this.queries = queries;
    }

}
