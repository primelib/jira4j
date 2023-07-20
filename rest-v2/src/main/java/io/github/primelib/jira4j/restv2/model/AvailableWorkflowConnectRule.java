package io.github.primelib.jira4j.restv2.model;

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
 * AvailableWorkflowConnectRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "addonKey",
    "createUrl",
    "description",
    "editUrl",
    "moduleKey",
    "name",
    "ruleKey",
    "ruleType",
    "viewUrl"
})
@JsonTypeName("AvailableWorkflowConnectRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowConnectRule {

    /**
     * Constructs a validated implementation of {@link AvailableWorkflowConnectRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AvailableWorkflowConnectRule(Consumer<AvailableWorkflowConnectRule> spec) {
        spec.accept(this);
    }

    /**
     * The add-on providing the rule.
     */
    @JsonProperty("addonKey")
    protected String addonKey;

    /**
     * The URL creation path segment defined in the Connect module.
     */
    @JsonProperty("createUrl")
    protected String createUrl;

    /**
     * The rule description.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The URL edit path segment defined in the Connect module.
     */
    @JsonProperty("editUrl")
    protected String editUrl;

    /**
     * The module providing the rule.
     */
    @JsonProperty("moduleKey")
    protected String moduleKey;

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
     * The URL view path segment defined in the Connect module.
     */
    @JsonProperty("viewUrl")
    protected String viewUrl;


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
