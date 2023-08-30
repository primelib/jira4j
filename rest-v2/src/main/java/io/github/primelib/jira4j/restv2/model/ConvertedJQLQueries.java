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
 * ConvertedJQLQueries
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
    "queriesWithUnknownUsers",
    "queryStrings"
})
@JsonTypeName("ConvertedJQLQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertedJQLQueries {

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

    /**
     * Constructs a validated instance of {@link ConvertedJQLQueries}.
     *
     * @param spec the specification to process
     */
    public ConvertedJQLQueries(Consumer<ConvertedJQLQueries> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertedJQLQueries}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertedJQLQueries(Consumer)} instead.
     * @param queriesWithUnknownUsers List of queries containing user information that could not be mapped to an existing user
     * @param queryStrings The list of converted query strings with account IDs in place of user identifiers.
     */
    @ApiStatus.Internal
    public ConvertedJQLQueries(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers, List<String> queryStrings) {
        this.queriesWithUnknownUsers = queriesWithUnknownUsers;
        this.queryStrings = queryStrings;
    }

}
