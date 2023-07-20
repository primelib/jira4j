package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SanitizedJqlQueries
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queries"
})
@JsonTypeName("SanitizedJqlQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitizedJqlQueries {

    /**
     * Constructs a validated implementation of {@link SanitizedJqlQueries}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SanitizedJqlQueries(Consumer<SanitizedJqlQueries> spec) {
        spec.accept(this);
    }

    /**
     * The list of sanitized JQL queries.
     */
    @JsonProperty("queries")
    protected List<SanitizedJqlQuery> queries;


}
