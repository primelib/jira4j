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
 * IssueTypeWorkflowMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueType",
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("IssueTypeWorkflowMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeWorkflowMapping {

    /**
     * Constructs a validated implementation of {@link IssueTypeWorkflowMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeWorkflowMapping(Consumer<IssueTypeWorkflowMapping> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type. Not required if updating the issue type-workflow mapping.
     */
    @JsonProperty("issueType")
    protected String issueType;

    /**
     * Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow.
     */
    @JsonProperty("workflow")
    protected String workflow;


}
