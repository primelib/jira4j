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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypesWorkflowMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultMapping",
    "issueTypes",
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("IssueTypesWorkflowMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypesWorkflowMapping {

    /**
     * Constructs a validated implementation of {@link IssueTypesWorkflowMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypesWorkflowMapping(Consumer<IssueTypesWorkflowMapping> spec) {
        spec.accept(this);
    }

    /**
     * Whether the workflow is the default workflow for the workflow scheme.
     */
    @JsonProperty("defaultMapping")
    protected Boolean defaultMapping;

    /**
     * The list of issue type IDs.
     */
    @JsonProperty("issueTypes")
    protected List<String> issueTypes;

    /**
     * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow. Optional if updating the workflow-issue types mapping.
     */
    @JsonProperty("workflow")
    protected String workflow;


}
