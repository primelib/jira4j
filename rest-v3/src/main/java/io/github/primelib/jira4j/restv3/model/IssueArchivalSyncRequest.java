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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueArchivalSyncRequest
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
    "issueIdsOrKeys"
})
@JsonTypeName("IssueArchivalSyncRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueArchivalSyncRequest {

    @JsonProperty("issueIdsOrKeys")
    protected List<String> issueIdsOrKeys;

    /**
     * Constructs a validated instance of {@link IssueArchivalSyncRequest}.
     *
     * @param spec the specification to process
     */
    public IssueArchivalSyncRequest(Consumer<IssueArchivalSyncRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueArchivalSyncRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueArchivalSyncRequest(Consumer)} instead.
     * @param issueIdsOrKeys issueIdsOrKeys
     */
    @ApiStatus.Internal
    public IssueArchivalSyncRequest(List<String> issueIdsOrKeys) {
        this.issueIdsOrKeys = issueIdsOrKeys;
    }

}
