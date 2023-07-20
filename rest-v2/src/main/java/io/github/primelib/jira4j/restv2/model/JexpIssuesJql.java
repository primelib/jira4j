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
 * JexpIssuesJql
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JexpIssuesJql}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JexpIssuesJql(Consumer<JexpIssuesJql> spec) {
        spec.accept(this);
    }

    /**
     * The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.
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
    protected ValidationEnum validation = ValidationEnum.STRICT;


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
