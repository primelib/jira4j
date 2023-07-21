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
 * JQLQueryWithUnknownUsers
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
    "convertedQuery",
    "originalQuery"
})
@JsonTypeName("JQLQueryWithUnknownUsers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JQLQueryWithUnknownUsers {

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

    /**
     * Constructs a validated instance of {@link JQLQueryWithUnknownUsers}.
     *
     * @param spec the specification to process
     */
    public JQLQueryWithUnknownUsers(Consumer<JQLQueryWithUnknownUsers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JQLQueryWithUnknownUsers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JQLQueryWithUnknownUsers(Consumer)} instead.
     * @param convertedQuery The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found
     * @param originalQuery The original query, for reference
     */
    @ApiStatus.Internal
    public JQLQueryWithUnknownUsers(String convertedQuery, String originalQuery) {
        this.convertedQuery = convertedQuery;
        this.originalQuery = originalQuery;
    }

}
