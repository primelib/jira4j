package io.github.primelib.jira4j.restv3.model;

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
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowTrigger
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
    "id",
    "parameters",
    "ruleKey"
})
@JsonTypeName("WorkflowTrigger")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTrigger {

    /**
     * The ID of the trigger.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The parameters of the trigger.
     */
    @JsonProperty("parameters")
    protected Map<String, String> parameters;

    /**
     * The rule key of the trigger.
     */
    @JsonProperty("ruleKey")
    protected String ruleKey;

    /**
     * Constructs a validated instance of {@link WorkflowTrigger}.
     *
     * @param spec the specification to process
     */
    public WorkflowTrigger(Consumer<WorkflowTrigger> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTrigger}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTrigger(Consumer)} instead.
     * @param id The ID of the trigger.
     * @param parameters The parameters of the trigger.
     * @param ruleKey The rule key of the trigger.
     */
    @ApiStatus.Internal
    public WorkflowTrigger(String id, Map<String, String> parameters, String ruleKey) {
        this.id = id;
        this.parameters = parameters;
        this.ruleKey = ruleKey;
    }

}
