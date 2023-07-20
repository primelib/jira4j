package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRulesUpdateErrorDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ruleUpdateErrors",
    "updateErrors",
    "workflowId"
})
@JsonTypeName("WorkflowTransitionRulesUpdateErrorDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesUpdateErrorDetails {

    /**
     * Constructs a validated implementation of {@link WorkflowTransitionRulesUpdateErrorDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesUpdateErrorDetails(Consumer<WorkflowTransitionRulesUpdateErrorDetails> spec) {
        spec.accept(this);
    }

    /**
     * A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.
     */
    @JsonProperty("ruleUpdateErrors")
    protected Map<String, Set<String>> ruleUpdateErrors = new HashMap<>();

    /**
     * The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
     */
    @JsonProperty("updateErrors")
    protected Set<String> updateErrors = new LinkedHashSet<>();

    @JsonProperty("workflowId")
    protected WorkflowId workflowId;


}
