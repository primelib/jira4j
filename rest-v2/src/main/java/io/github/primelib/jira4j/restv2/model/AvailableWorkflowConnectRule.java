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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailableWorkflowConnectRule
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
     * Constructs a validated instance of {@link AvailableWorkflowConnectRule}.
     *
     * @param spec the specification to process
     */
    public AvailableWorkflowConnectRule(Consumer<AvailableWorkflowConnectRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableWorkflowConnectRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableWorkflowConnectRule(Consumer)} instead.
     * @param addonKey The add-on providing the rule.
     * @param createUrl The URL creation path segment defined in the Connect module.
     * @param description The rule description.
     * @param editUrl The URL edit path segment defined in the Connect module.
     * @param moduleKey The module providing the rule.
     * @param name The rule name.
     * @param ruleKey The rule key.
     * @param ruleType The rule type.
     * @param viewUrl The URL view path segment defined in the Connect module.
     */
    @ApiStatus.Internal
    public AvailableWorkflowConnectRule(String addonKey, String createUrl, String description, String editUrl, String moduleKey, String name, String ruleKey, RuleTypeEnum ruleType, String viewUrl) {
        this.addonKey = addonKey;
        this.createUrl = createUrl;
        this.description = description;
        this.editUrl = editUrl;
        this.moduleKey = moduleKey;
        this.name = name;
        this.ruleKey = ruleKey;
        this.ruleType = ruleType;
        this.viewUrl = viewUrl;
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

        private final String value;
    }

}
