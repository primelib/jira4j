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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueryToSanitize
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
    "query"
})
@JsonTypeName("JqlQueryToSanitize")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryToSanitize {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The query to sanitize.
     */
    @JsonProperty("query")
    protected String query;

    /**
     * Constructs a validated instance of {@link JqlQueryToSanitize}.
     *
     * @param spec the specification to process
     */
    public JqlQueryToSanitize(Consumer<JqlQueryToSanitize> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryToSanitize}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryToSanitize(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param query The query to sanitize.
     */
    @ApiStatus.Internal
    public JqlQueryToSanitize(String accountId, String query) {
        this.accountId = accountId;
        this.query = query;
    }

}
