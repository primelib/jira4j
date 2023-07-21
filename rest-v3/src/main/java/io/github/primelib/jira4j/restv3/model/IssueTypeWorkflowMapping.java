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
 * IssueTypeWorkflowMapping
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
    "issueType",
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("IssueTypeWorkflowMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeWorkflowMapping {

    /**
     * The ID of the issue type. Not required if updating the issue type-workflow mapping.
     */
    @JsonProperty("issueType")
    protected String issueType;

    /**
     * Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to {@code false}. Only applicable when updating the workflow-issue types mapping.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow.
     */
    @JsonProperty("workflow")
    protected String workflow;

    /**
     * Constructs a validated instance of {@link IssueTypeWorkflowMapping}.
     *
     * @param spec the specification to process
     */
    public IssueTypeWorkflowMapping(Consumer<IssueTypeWorkflowMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeWorkflowMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeWorkflowMapping(Consumer)} instead.
     * @param issueType The ID of the issue type. Not required if updating the issue type-workflow mapping.
     * @param updateDraftIfNeeded Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to {@code false}. Only applicable when updating the workflow-issue types mapping.
     * @param workflow The name of the workflow.
     */
    @ApiStatus.Internal
    public IssueTypeWorkflowMapping(String issueType, Boolean updateDraftIfNeeded, String workflow) {
        this.issueType = issueType;
        this.updateDraftIfNeeded = updateDraftIfNeeded;
        this.workflow = workflow;
    }

}
