package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTransitions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WorkflowTransitions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitions(Consumer<WorkflowTransitions> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> properties = new HashMap<>();

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
     * The transition type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INITIAL("INITIAL"),
        GLOBAL("GLOBAL"),
        DIRECTED("DIRECTED");

        private final String value;
    }

}
