package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertedJQLQueries
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queriesWithUnknownUsers",
    "queryStrings"
})
@JsonTypeName("ConvertedJQLQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertedJQLQueries {

    /**
     * Constructs a validated implementation of {@link ConvertedJQLQueries}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConvertedJQLQueries(Consumer<ConvertedJQLQueries> spec) {
        spec.accept(this);
    }

    /**
     * List of queries containing user information that could not be mapped to an existing user
     */
    @JsonProperty("queriesWithUnknownUsers")
    protected List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers;

    /**
     * The list of converted query strings with account IDs in place of user identifiers.
     */
    @JsonProperty("queryStrings")
    protected List<String> queryStrings;


}
