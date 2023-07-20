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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowRuleConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "parameters",
    "ruleKey"
})
@JsonTypeName("WorkflowRuleConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowRuleConfiguration {

    /**
     * Constructs a validated implementation of {@link WorkflowRuleConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowRuleConfiguration(Consumer<WorkflowRuleConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the rule.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The parameters related to the rule.
     */
    @JsonProperty("parameters")
    protected Map<String, String> parameters = new HashMap<>();

    /**
     * The rule key of the rule.
     */
    @JsonProperty("ruleKey")
    protected String ruleKey;


}
