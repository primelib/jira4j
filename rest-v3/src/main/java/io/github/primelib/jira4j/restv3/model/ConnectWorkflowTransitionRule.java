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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectWorkflowTransitionRule
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
    "configuration",
    "id",
    "key",
    "transition"
})
@JsonTypeName("ConnectWorkflowTransitionRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectWorkflowTransitionRule {

    @JsonProperty("configuration")
    protected RuleConfiguration configuration;

    /**
     * The ID of the transition rule.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the rule, as defined in the Connect app descriptor.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("transition")
    protected WorkflowTransition transition;

    /**
     * Constructs a validated instance of {@link ConnectWorkflowTransitionRule}.
     *
     * @param spec the specification to process
     */
    public ConnectWorkflowTransitionRule(Consumer<ConnectWorkflowTransitionRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConnectWorkflowTransitionRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConnectWorkflowTransitionRule(Consumer)} instead.
     * @param configuration configuration
     * @param id The ID of the transition rule.
     * @param key The key of the rule, as defined in the Connect app descriptor.
     * @param transition transition
     */
    @ApiStatus.Internal
    public ConnectWorkflowTransitionRule(RuleConfiguration configuration, String id, String key, WorkflowTransition transition) {
        this.configuration = configuration;
        this.id = id;
        this.key = key;
        this.transition = transition;
    }

}
