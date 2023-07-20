package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRulesDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "workflowId",
    "workflowRuleIds"
})
@JsonTypeName("WorkflowTransitionRulesDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesDetails {

    /**
     * Constructs a validated implementation of {@link WorkflowTransitionRulesDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesDetails(Consumer<WorkflowTransitionRulesDetails> spec) {
        spec.accept(this);
    }

    @JsonProperty("workflowId")
    protected WorkflowId workflowId;

    /**
     * The list of connect workflow rule IDs.
     */
    @JsonProperty("workflowRuleIds")
    protected Set<String> workflowRuleIds = new LinkedHashSet<>();


}
