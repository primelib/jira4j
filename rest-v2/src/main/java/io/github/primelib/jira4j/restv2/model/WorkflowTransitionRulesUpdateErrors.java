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
 * WorkflowTransitionRulesUpdateErrors
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
    "updateResults"
})
@JsonTypeName("WorkflowTransitionRulesUpdateErrors")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesUpdateErrors {

    /**
     * A list of workflows.
     */
    @JsonProperty("updateResults")
    protected List<WorkflowTransitionRulesUpdateErrorDetails> updateResults;

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesUpdateErrors}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitionRulesUpdateErrors(Consumer<WorkflowTransitionRulesUpdateErrors> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitionRulesUpdateErrors}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitionRulesUpdateErrors(Consumer)} instead.
     * @param updateResults A list of workflows.
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesUpdateErrors(List<WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
        this.updateResults = updateResults;
    }

}
