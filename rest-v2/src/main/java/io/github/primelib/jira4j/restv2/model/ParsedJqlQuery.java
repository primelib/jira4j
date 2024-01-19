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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ParsedJqlQuery
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
    "errors",
    "query",
    "structure"
})
@JsonTypeName("ParsedJqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParsedJqlQuery {

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
    protected JqlQuery structure;

    /**
     * Constructs a validated instance of {@link ParsedJqlQuery}.
     *
     * @param spec the specification to process
     */
    public ParsedJqlQuery(Consumer<ParsedJqlQuery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ParsedJqlQuery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ParsedJqlQuery(Consumer)} instead.
     * @param errors The list of syntax or validation errors.
     * @param query The JQL query that was parsed and validated.
     * @param structure structure
     */
    @ApiStatus.Internal
    public ParsedJqlQuery(Set<String> errors, String query, JqlQuery structure) {
        this.errors = errors;
        this.query = query;
        this.structure = structure;
    }

}
