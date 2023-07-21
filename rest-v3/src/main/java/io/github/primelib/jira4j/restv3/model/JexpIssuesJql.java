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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JexpIssuesJql
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
    "query",
    "startAt",
    "validation"
})
@JsonTypeName("JexpIssues_jql")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JexpIssuesJql {

    /**
     * The maximum number of issues to return from the JQL query. Inspect {@code meta.issues.jql.maxResults} in the response to ensure the maximum value has not been exceeded.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The JQL query.
     */
    @JsonProperty("query")
    protected String query;

    /**
     * The index of the first issue to return from the JQL query.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * Determines how to validate the JQL query and treat the validation results.
     */
    @JsonProperty("validation")
    protected ValidationEnum validation;

    /**
     * Constructs a validated instance of {@link JexpIssuesJql}.
     *
     * @param spec the specification to process
     */
    public JexpIssuesJql(Consumer<JexpIssuesJql> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JexpIssuesJql}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JexpIssuesJql(Consumer)} instead.
     * @param maxResults The maximum number of issues to return from the JQL query. Inspect {@code meta.issues.jql.maxResults} in the response to ensure the maximum value has not been exceeded.
     * @param query The JQL query.
     * @param startAt The index of the first issue to return from the JQL query.
     * @param validation Determines how to validate the JQL query and treat the validation results.
     */
    @ApiStatus.Internal
    public JexpIssuesJql(Integer maxResults, String query, Long startAt, ValidationEnum validation) {
        this.maxResults = maxResults;
        this.query = query;
        this.startAt = startAt;
        this.validation = validation;
    }

    /**
     * Determines how to validate the JQL query and treat the validation results.
     */
    @AllArgsConstructor
    public enum ValidationEnum {
        STRICT("strict"),
        WARN("warn"),
        NONE("none");

        private final String value;
    }

}
