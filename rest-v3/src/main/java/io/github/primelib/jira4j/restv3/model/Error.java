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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error
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
    "count",
    "issueIdsOrKeys",
    "message"
})
@JsonTypeName("Error")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Error {

    @JsonProperty("count")
    protected Long count;

    @JsonProperty("issueIdsOrKeys")
    protected Set<String> issueIdsOrKeys;

    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link Error}.
     *
     * @param spec the specification to process
     */
    public Error(Consumer<Error> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Error}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Error(Consumer)} instead.
     * @param count count
     * @param issueIdsOrKeys issueIdsOrKeys
     * @param message message
     */
    @ApiStatus.Internal
    public Error(Long count, Set<String> issueIdsOrKeys, String message) {
        this.count = count;
        this.issueIdsOrKeys = issueIdsOrKeys;
        this.message = message;
    }

}
