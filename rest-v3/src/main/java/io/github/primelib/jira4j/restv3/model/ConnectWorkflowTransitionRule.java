package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectWorkflowTransitionRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "id",
    "key",
    "transition"
})
@JsonTypeName("ConnectWorkflowTransitionRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectWorkflowTransitionRule {

    /**
     * Constructs a validated implementation of {@link ConnectWorkflowTransitionRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConnectWorkflowTransitionRule(Consumer<ConnectWorkflowTransitionRule> spec) {
        spec.accept(this);
    }

    @JsonProperty("configuration")
    protected RuleConfiguration _configuration;

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


}
