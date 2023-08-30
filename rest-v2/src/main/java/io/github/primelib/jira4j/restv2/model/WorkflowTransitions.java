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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowTransitions
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
    "actions",
    "conditions",
    "customIssueEventId",
    "description",
    "from",
    "id",
    "name",
    "properties",
    "to",
    "transitionScreen",
    "triggers",
    "type",
    "validators"
})
@JsonTypeName("WorkflowTransitions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitions {

    /**
     * The post-functions of the transition.
     */
    @JsonProperty("actions")
    protected List<WorkflowRuleConfiguration> actions;

    @JsonProperty("conditions")
    protected ConditionGroupConfiguration conditions;

    /**
     * The custom event ID of the transition.
     */
    @JsonProperty("customIssueEventId")
    protected String customIssueEventId;

    /**
     * The description of the transition.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The statuses the transition can start from.
     */
    @JsonProperty("from")
    protected List<WorkflowStatusAndPort> from;

    /**
     * The ID of the transition.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the transition.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The properties of the transition.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties;

    @JsonProperty("to")
    protected WorkflowStatusAndPort to;

    @JsonProperty("transitionScreen")
    protected WorkflowRuleConfiguration transitionScreen;

    /**
     * The triggers of the transition.
     */
    @JsonProperty("triggers")
    protected List<WorkflowTrigger> triggers;

    /**
     * The transition type.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The validators of the transition.
     */
    @JsonProperty("validators")
    protected List<WorkflowRuleConfiguration> validators;

    /**
     * Constructs a validated instance of {@link WorkflowTransitions}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitions(Consumer<WorkflowTransitions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitions(Consumer)} instead.
     * @param actions The post-functions of the transition.
     * @param conditions conditions
     * @param customIssueEventId The custom event ID of the transition.
     * @param description The description of the transition.
     * @param from The statuses the transition can start from.
     * @param id The ID of the transition.
     * @param name The name of the transition.
     * @param properties The properties of the transition.
     * @param to to
     * @param transitionScreen transitionScreen
     * @param triggers The triggers of the transition.
     * @param type The transition type.
     * @param validators The validators of the transition.
     */
    @ApiStatus.Internal
    public WorkflowTransitions(List<WorkflowRuleConfiguration> actions, ConditionGroupConfiguration conditions, String customIssueEventId, String description, List<WorkflowStatusAndPort> from, String id, String name, Map<String, String> properties, WorkflowStatusAndPort to, WorkflowRuleConfiguration transitionScreen, List<WorkflowTrigger> triggers, TypeEnum type, List<WorkflowRuleConfiguration> validators) {
        this.actions = actions;
        this.conditions = conditions;
        this.customIssueEventId = customIssueEventId;
        this.description = description;
        this.from = from;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.to = to;
        this.transitionScreen = transitionScreen;
        this.triggers = triggers;
        this.type = type;
        this.validators = validators;
    }

    /**
     * The transition type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INITIAL("INITIAL"),
        GLOBAL("GLOBAL"),
        DIRECTED("DIRECTED");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
