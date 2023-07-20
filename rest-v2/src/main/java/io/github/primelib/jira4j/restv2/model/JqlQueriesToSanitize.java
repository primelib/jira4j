package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueriesToSanitize
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queries"
})
@JsonTypeName("JqlQueriesToSanitize")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueriesToSanitize {

    /**
     * Constructs a validated implementation of {@link JqlQueriesToSanitize}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueriesToSanitize(Consumer<JqlQueriesToSanitize> spec) {
        spec.accept(this);
    }

    /**
     * The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.
     */
    @JsonProperty("queries")
    protected List<JqlQueryToSanitize> queries = new ArrayList<>();


}
