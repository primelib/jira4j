package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * IssueTypeToContextMapping
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
    "contextId",
    "isAnyIssueType",
    "issueTypeId"
})
@JsonTypeName("IssueTypeToContextMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeToContextMapping {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * Whether the context is mapped to any issue type.
     */
    @JsonProperty("isAnyIssueType")
    protected Boolean isAnyIssueType;

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * Constructs a validated instance of {@link IssueTypeToContextMapping}.
     *
     * @param spec the specification to process
     */
    public IssueTypeToContextMapping(Consumer<IssueTypeToContextMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeToContextMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeToContextMapping(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param isAnyIssueType Whether the context is mapped to any issue type.
     * @param issueTypeId The ID of the issue type.
     */
    @ApiStatus.Internal
    public IssueTypeToContextMapping(String contextId, Boolean isAnyIssueType, String issueTypeId) {
        this.contextId = contextId;
        this.isAnyIssueType = isAnyIssueType;
        this.issueTypeId = issueTypeId;
    }

}
