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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JexpJqlIssues
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
@JsonTypeName("JexpJqlIssues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JexpJqlIssues {

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
     * Constructs a validated instance of {@link JexpJqlIssues}.
     *
     * @param spec the specification to process
     */
    public JexpJqlIssues(Consumer<JexpJqlIssues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JexpJqlIssues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JexpJqlIssues(Consumer)} instead.
     * @param maxResults The maximum number of issues to return from the JQL query. Inspect {@code meta.issues.jql.maxResults} in the response to ensure the maximum value has not been exceeded.
     * @param query The JQL query.
     * @param startAt The index of the first issue to return from the JQL query.
     * @param validation Determines how to validate the JQL query and treat the validation results.
     */
    @ApiStatus.Internal
    public JexpJqlIssues(Integer maxResults, String query, Long startAt, ValidationEnum validation) {
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

        private static final ValidationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ValidationEnum of(String input) {
            if (input != null) {
                for (ValidationEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
