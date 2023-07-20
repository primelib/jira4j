package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * IssueTypeToContextMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextId",
    "isAnyIssueType",
    "issueTypeId"
})
@JsonTypeName("IssueTypeToContextMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeToContextMapping {

    /**
     * Constructs a validated implementation of {@link IssueTypeToContextMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeToContextMapping(Consumer<IssueTypeToContextMapping> spec) {
        spec.accept(this);
    }

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


}
