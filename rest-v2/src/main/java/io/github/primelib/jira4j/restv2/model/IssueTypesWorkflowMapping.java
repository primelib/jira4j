package io.github.primelib.jira4j.restv2.model;

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypesWorkflowMapping
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
    "defaultMapping",
    "issueTypes",
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("IssueTypesWorkflowMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypesWorkflowMapping {

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
     * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to {@code false}.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow. Optional if updating the workflow-issue types mapping.
     */
    @JsonProperty("workflow")
    protected String workflow;

    /**
     * Constructs a validated instance of {@link IssueTypesWorkflowMapping}.
     *
     * @param spec the specification to process
     */
    public IssueTypesWorkflowMapping(Consumer<IssueTypesWorkflowMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypesWorkflowMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypesWorkflowMapping(Consumer)} instead.
     * @param defaultMapping Whether the workflow is the default workflow for the workflow scheme.
     * @param issueTypes The list of issue type IDs.
     * @param updateDraftIfNeeded Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to {@code false}.
     * @param workflow The name of the workflow. Optional if updating the workflow-issue types mapping.
     */
    @ApiStatus.Internal
    public IssueTypesWorkflowMapping(Boolean defaultMapping, List<String> issueTypes, Boolean updateDraftIfNeeded, String workflow) {
        this.defaultMapping = defaultMapping;
        this.issueTypes = issueTypes;
        this.updateDraftIfNeeded = updateDraftIfNeeded;
        this.workflow = workflow;
    }

}
