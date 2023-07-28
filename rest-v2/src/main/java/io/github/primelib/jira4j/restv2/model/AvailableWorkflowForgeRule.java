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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AvailableWorkflowForgeRule
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
    "id",
    "name",
    "ruleKey",
    "ruleType"
})
@JsonTypeName("AvailableWorkflowForgeRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowForgeRule {

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
     * Constructs a validated instance of {@link AvailableWorkflowForgeRule}.
     *
     * @param spec the specification to process
     */
    public AvailableWorkflowForgeRule(Consumer<AvailableWorkflowForgeRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableWorkflowForgeRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableWorkflowForgeRule(Consumer)} instead.
     * @param description The rule description.
     * @param id The unique ARI of the forge rule type.
     * @param name The rule name.
     * @param ruleKey The rule key.
     * @param ruleType The rule type.
     */
    @ApiStatus.Internal
    public AvailableWorkflowForgeRule(String description, String id, String name, String ruleKey, RuleTypeEnum ruleType) {
        this.description = description;
        this.id = id;
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
