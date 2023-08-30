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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowsWithTransitionRulesDetails
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
    "workflows"
})
@JsonTypeName("WorkflowsWithTransitionRulesDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowsWithTransitionRulesDetails {

    /**
     * The list of workflows with transition rules to delete.
     */
    @JsonProperty("workflows")
    protected List<WorkflowTransitionRulesDetails> workflows;

    /**
     * Constructs a validated instance of {@link WorkflowsWithTransitionRulesDetails}.
     *
     * @param spec the specification to process
     */
    public WorkflowsWithTransitionRulesDetails(Consumer<WorkflowsWithTransitionRulesDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowsWithTransitionRulesDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowsWithTransitionRulesDetails(Consumer)} instead.
     * @param workflows The list of workflows with transition rules to delete.
     */
    @ApiStatus.Internal
    public WorkflowsWithTransitionRulesDetails(List<WorkflowTransitionRulesDetails> workflows) {
        this.workflows = workflows;
    }

}
