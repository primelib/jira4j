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
 * IssueArchivalSyncResponse
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
    "errors",
    "numberOfIssuesUpdated"
})
@JsonTypeName("IssueArchivalSyncResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueArchivalSyncResponse {

    @JsonProperty("errors")
    protected Errors errors;

    @JsonProperty("numberOfIssuesUpdated")
    protected Long numberOfIssuesUpdated;

    /**
     * Constructs a validated instance of {@link IssueArchivalSyncResponse}.
     *
     * @param spec the specification to process
     */
    public IssueArchivalSyncResponse(Consumer<IssueArchivalSyncResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueArchivalSyncResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueArchivalSyncResponse(Consumer)} instead.
     * @param errors errors
     * @param numberOfIssuesUpdated numberOfIssuesUpdated
     */
    @ApiStatus.Internal
    public IssueArchivalSyncResponse(Errors errors, Long numberOfIssuesUpdated) {
        this.errors = errors;
        this.numberOfIssuesUpdated = numberOfIssuesUpdated;
    }

}
