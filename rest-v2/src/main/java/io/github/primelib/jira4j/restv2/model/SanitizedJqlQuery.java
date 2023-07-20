package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SanitizedJqlQuery
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "errors",
    "initialQuery",
    "sanitizedQuery"
})
@JsonTypeName("SanitizedJqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitizedJqlQuery {

    /**
     * Constructs a validated implementation of {@link SanitizedJqlQuery}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SanitizedJqlQuery(Consumer<SanitizedJqlQuery> spec) {
        spec.accept(this);
    }

    /**
     * The account ID of the user for whom sanitization was performed.
     */
    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("errors")
    protected SanitizedJqlQueryErrors errors;

    /**
     * The initial query.
     */
    @JsonProperty("initialQuery")
    protected String initialQuery;

    /**
     * The sanitized query, if there were no errors.
     */
    @JsonProperty("sanitizedQuery")
    protected String sanitizedQuery;


}
