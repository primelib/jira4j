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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AvailableWorkflowSystemRule
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
     * The rule description.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * List of rules that conflict with this one.
     */
    @JsonProperty("incompatibleRuleKeys")
    protected List<String> incompatibleRuleKeys;

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
     * Constructs a validated instance of {@link AvailableWorkflowSystemRule}.
     *
     * @param spec the specification to process
     */
    public AvailableWorkflowSystemRule(Consumer<AvailableWorkflowSystemRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableWorkflowSystemRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableWorkflowSystemRule(Consumer)} instead.
     * @param description The rule description.
     * @param incompatibleRuleKeys List of rules that conflict with this one.
     * @param isAvailableForInitialTransition Whether the rule can be added added to an initial transition.
     * @param isVisible Whether the rule is visible.
     * @param name The rule name.
     * @param ruleKey The rule key.
     * @param ruleType The rule type.
     */
    @ApiStatus.Internal
    public AvailableWorkflowSystemRule(String description, List<String> incompatibleRuleKeys, Boolean isAvailableForInitialTransition, Boolean isVisible, String name, String ruleKey, RuleTypeEnum ruleType) {
        this.description = description;
        this.incompatibleRuleKeys = incompatibleRuleKeys;
        this.isAvailableForInitialTransition = isAvailableForInitialTransition;
        this.isVisible = isVisible;
        this.name = name;
        this.ruleKey = ruleKey;
        this.ruleType = ruleType;
    }

    /**
     * The rule type.
     */
    @AllArgsConstructor
    public enum RuleTypeEnum {
        CONDITION("Condition"),
        VALIDATOR("Validator"),
        FUNCTION("Function"),
        SCREEN("Screen");

        private static final RuleTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RuleTypeEnum of(String input) {
            if (input != null) {
                for (RuleTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
