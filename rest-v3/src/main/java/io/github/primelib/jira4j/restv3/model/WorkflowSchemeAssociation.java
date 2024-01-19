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
 * WorkflowSchemeAssociation
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
    "issueTypeIds",
    "workflowId"
})
@JsonTypeName("WorkflowSchemeAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeAssociation {

    /**
     * The issue types assigned to the workflow.
     */
    @JsonProperty("issueTypeIds")
    protected Set<String> issueTypeIds;

    /**
     * The ID of the workflow.
     */
    @JsonProperty("workflowId")
    protected String workflowId;

    /**
     * Constructs a validated instance of {@link WorkflowSchemeAssociation}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeAssociation(Consumer<WorkflowSchemeAssociation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeAssociation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeAssociation(Consumer)} instead.
     * @param issueTypeIds The issue types assigned to the workflow.
     * @param workflowId The ID of the workflow.
     */
    @ApiStatus.Internal
    public WorkflowSchemeAssociation(Set<String> issueTypeIds, String workflowId) {
        this.issueTypeIds = issueTypeIds;
        this.workflowId = workflowId;
    }

}
