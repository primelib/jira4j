package io.github.primelib.jira4j.restv2.model;

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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowRulesSearchDetails
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
    "invalidRules",
    "validRules",
    "workflowEntityId"
})
@JsonTypeName("WorkflowRulesSearchDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowRulesSearchDetails {

    /**
     * List of workflow rule IDs that do not belong to the workflow or can not be found.
     */
    @JsonProperty("invalidRules")
    protected List<UUID> invalidRules;

    /**
     * List of valid workflow transition rules.
     */
    @JsonProperty("validRules")
    protected List<WorkflowTransitionRules> validRules;

    /**
     * The workflow ID.
     */
    @JsonProperty("workflowEntityId")
    protected UUID workflowEntityId;

    /**
     * Constructs a validated instance of {@link WorkflowRulesSearchDetails}.
     *
     * @param spec the specification to process
     */
    public WorkflowRulesSearchDetails(Consumer<WorkflowRulesSearchDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowRulesSearchDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowRulesSearchDetails(Consumer)} instead.
     * @param invalidRules List of workflow rule IDs that do not belong to the workflow or can not be found.
     * @param validRules List of valid workflow transition rules.
     * @param workflowEntityId The workflow ID.
     */
    @ApiStatus.Internal
    public WorkflowRulesSearchDetails(List<UUID> invalidRules, List<WorkflowTransitionRules> validRules, UUID workflowEntityId) {
        this.invalidRules = invalidRules;
        this.validRules = validRules;
        this.workflowEntityId = workflowEntityId;
    }

}
