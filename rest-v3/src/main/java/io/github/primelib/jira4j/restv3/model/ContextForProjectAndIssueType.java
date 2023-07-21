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
 * ContextForProjectAndIssueType
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
    "issueTypeId",
    "projectId"
})
@JsonTypeName("ContextForProjectAndIssueType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContextForProjectAndIssueType {

    /**
     * The ID of the custom field context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link ContextForProjectAndIssueType}.
     *
     * @param spec the specification to process
     */
    public ContextForProjectAndIssueType(Consumer<ContextForProjectAndIssueType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContextForProjectAndIssueType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContextForProjectAndIssueType(Consumer)} instead.
     * @param contextId The ID of the custom field context.
     * @param issueTypeId The ID of the issue type.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public ContextForProjectAndIssueType(String contextId, String issueTypeId, String projectId) {
        this.contextId = contextId;
        this.issueTypeId = issueTypeId;
        this.projectId = projectId;
    }

}
