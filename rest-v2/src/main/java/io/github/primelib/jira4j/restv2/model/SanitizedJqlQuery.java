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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SanitizedJqlQuery
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
    "accountId",
    "errors",
    "initialQuery",
    "sanitizedQuery"
})
@JsonTypeName("SanitizedJqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitizedJqlQuery {

    /**
     * The account ID of the user for whom sanitization was performed.
     */
    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("errors")
    protected ErrorCollection errors;

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

    /**
     * Constructs a validated instance of {@link SanitizedJqlQuery}.
     *
     * @param spec the specification to process
     */
    public SanitizedJqlQuery(Consumer<SanitizedJqlQuery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SanitizedJqlQuery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SanitizedJqlQuery(Consumer)} instead.
     * @param accountId The account ID of the user for whom sanitization was performed.
     * @param errors errors
     * @param initialQuery The initial query.
     * @param sanitizedQuery The sanitized query, if there were no errors.
     */
    @ApiStatus.Internal
    public SanitizedJqlQuery(String accountId, ErrorCollection errors, String initialQuery, String sanitizedQuery) {
        this.accountId = accountId;
        this.errors = errors;
        this.initialQuery = initialQuery;
        this.sanitizedQuery = sanitizedQuery;
    }

}
