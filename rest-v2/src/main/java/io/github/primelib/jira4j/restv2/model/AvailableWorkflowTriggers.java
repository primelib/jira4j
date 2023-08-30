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
 * AvailableWorkflowTriggers
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
    "availableTypes",
    "ruleKey"
})
@JsonTypeName("AvailableWorkflowTriggers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowTriggers {

    /**
     * The list of available trigger types.
     */
    @JsonProperty("availableTypes")
    protected List<AvailableWorkflowTriggerTypes> availableTypes;

    /**
     * The rule key of the rule.
     */
    @JsonProperty("ruleKey")
    protected String ruleKey;

    /**
     * Constructs a validated instance of {@link AvailableWorkflowTriggers}.
     *
     * @param spec the specification to process
     */
    public AvailableWorkflowTriggers(Consumer<AvailableWorkflowTriggers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableWorkflowTriggers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableWorkflowTriggers(Consumer)} instead.
     * @param availableTypes The list of available trigger types.
     * @param ruleKey The rule key of the rule.
     */
    @ApiStatus.Internal
    public AvailableWorkflowTriggers(List<AvailableWorkflowTriggerTypes> availableTypes, String ruleKey) {
        this.availableTypes = availableTypes;
        this.ruleKey = ruleKey;
    }

}
