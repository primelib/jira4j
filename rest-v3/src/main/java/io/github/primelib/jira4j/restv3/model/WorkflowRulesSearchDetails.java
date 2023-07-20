package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "invalidRules",
    "validRules",
    "workflowEntityId"
})
@JsonTypeName("WorkflowRulesSearchDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowRulesSearchDetails {

    /**
     * Constructs a validated implementation of {@link WorkflowRulesSearchDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowRulesSearchDetails(Consumer<WorkflowRulesSearchDetails> spec) {
        spec.accept(this);
    }

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


}
