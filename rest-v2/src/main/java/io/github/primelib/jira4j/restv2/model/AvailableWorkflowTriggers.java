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
 * AvailableWorkflowTriggers
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "availableTypes",
    "ruleKey"
})
@JsonTypeName("AvailableWorkflowTriggers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowTriggers {

    /**
     * Constructs a validated implementation of {@link AvailableWorkflowTriggers}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AvailableWorkflowTriggers(Consumer<AvailableWorkflowTriggers> spec) {
        spec.accept(this);
    }

    /**
     * The list of available trigger types.
     */
    @JsonProperty("availableTypes")
    protected List<AvailableWorkflowTriggerTypes> availableTypes = new ArrayList<>();

    /**
     * The rule key of the rule.
     */
    @JsonProperty("ruleKey")
    protected String ruleKey;


}
