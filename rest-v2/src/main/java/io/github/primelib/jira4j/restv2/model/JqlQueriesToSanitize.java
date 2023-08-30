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
 * JqlQueriesToSanitize
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
@JsonTypeName("JqlQueriesToSanitize")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueriesToSanitize {

    /**
     * The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.
     */
    @JsonProperty("queries")
    protected List<JqlQueryToSanitize> queries;

    /**
     * Constructs a validated instance of {@link JqlQueriesToSanitize}.
     *
     * @param spec the specification to process
     */
    public JqlQueriesToSanitize(Consumer<JqlQueriesToSanitize> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueriesToSanitize}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueriesToSanitize(Consumer)} instead.
     * @param queries The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.
     */
    @ApiStatus.Internal
    public JqlQueriesToSanitize(List<JqlQueryToSanitize> queries) {
        this.queries = queries;
    }

}
