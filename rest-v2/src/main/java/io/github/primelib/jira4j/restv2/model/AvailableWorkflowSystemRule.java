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
 * AvailableWorkflowSystemRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "incompatibleRuleKeys",
    "isAvailableForInitialTransition",
    "isVisible",
    "name",
    "ruleKey",
    "ruleType"
})
@JsonTypeName("AvailableWorkflowSystemRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowSystemRule {

    /**
     * Constructs a validated implementation of {@link AvailableWorkflowSystemRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AvailableWorkflowSystemRule(Consumer<AvailableWorkflowSystemRule> spec) {
        spec.accept(this);
    }

    /**
     * The rule description.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * List of rules that conflict with this one.
     */
    @JsonProperty("incompatibleRuleKeys")
    protected List<String> incompatibleRuleKeys = new ArrayList<>();

    /**
     * Whether the rule can be added added to an initial transition.
     */
    @JsonProperty("isAvailableForInitialTransition")
    protected Boolean isAvailableForInitialTransition;

    /**
     * Whether the rule is visible.
     */
    @JsonProperty("isVisible")
    protected Boolean isVisible;

    /**
     * The rule name.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The rule key.
     */
    @JsonProperty("ruleKey")
    protected String ruleKey;

    /**
     * The rule type.
     */
    @JsonProperty("ruleType")
    protected RuleTypeEnum ruleType;


    /**
     * The rule type.
     */
    @AllArgsConstructor
    public enum RuleTypeEnum {
        CONDITION("Condition"),
        VALIDATOR("Validator"),
        FUNCTION("Function"),
        SCREEN("Screen");

        private final String value;
    }

}
