package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitionRulesUpdateErrors
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "updateResults"
})
@JsonTypeName("WorkflowTransitionRulesUpdateErrors")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionRulesUpdateErrors {

    /**
     * Constructs a validated implementation of {@link WorkflowTransitionRulesUpdateErrors}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitionRulesUpdateErrors(Consumer<WorkflowTransitionRulesUpdateErrors> spec) {
        spec.accept(this);
    }

    /**
     * A list of workflows.
     */
    @JsonProperty("updateResults")
    protected List<WorkflowTransitionRulesUpdateErrorDetails> updateResults = new ArrayList<>();


}
