package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ParsedJqlQuery
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errors",
    "query",
    "structure"
})
@JsonTypeName("ParsedJqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParsedJqlQuery {

    /**
     * Constructs a validated implementation of {@link ParsedJqlQuery}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ParsedJqlQuery(Consumer<ParsedJqlQuery> spec) {
        spec.accept(this);
    }

    /**
     * The list of syntax or validation errors.
     */
    @JsonProperty("errors")
    protected Set<String> errors;

    /**
     * The JQL query that was parsed and validated.
     */
    @JsonProperty("query")
    protected String query;

    @JsonProperty("structure")
    protected ParsedJqlQueryStructure structure;


}
