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
 * JQLQueryWithUnknownUsers
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "convertedQuery",
    "originalQuery"
})
@JsonTypeName("JQLQueryWithUnknownUsers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JQLQueryWithUnknownUsers {

    /**
     * Constructs a validated implementation of {@link JQLQueryWithUnknownUsers}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JQLQueryWithUnknownUsers(Consumer<JQLQueryWithUnknownUsers> spec) {
        spec.accept(this);
    }

    /**
     * The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found
     */
    @JsonProperty("convertedQuery")
    protected String convertedQuery;

    /**
     * The original query, for reference
     */
    @JsonProperty("originalQuery")
    protected String originalQuery;


}
