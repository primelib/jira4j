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
 * AvailableWorkflowForgeRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "ruleKey",
    "ruleType"
})
@JsonTypeName("AvailableWorkflowForgeRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowForgeRule {

    /**
     * Constructs a validated implementation of {@link AvailableWorkflowForgeRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AvailableWorkflowForgeRule(Consumer<AvailableWorkflowForgeRule> spec) {
        spec.accept(this);
    }

    /**
     * The rule description.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The unique ARI of the forge rule type.
     */
    @JsonProperty("id")
    protected String id;

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
