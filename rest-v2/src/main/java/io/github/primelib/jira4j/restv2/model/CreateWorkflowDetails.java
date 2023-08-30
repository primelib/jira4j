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
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowDetails
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
    "name",
    "statuses",
    "transitions"
})
@JsonTypeName("CreateWorkflowDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowDetails {

    /**
     * The description of the workflow. The maximum length is 1000 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the workflow. The name must be unique. The maximum length is 255 characters. Characters can be separated by a whitespace but the name cannot start or end with a whitespace.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The statuses of the workflow. Any status that does not include a transition is added to the workflow without a transition.
     */
    @JsonProperty("statuses")
    protected Set<CreateWorkflowStatusDetails> statuses;

    /**
     * The transitions of the workflow. For the request to be valid, these transitions must:
     *  *
     * include one *initial* transition.
     * *
     * not use the same name for a *global* and *directed* transition.
     * *
     * have a unique name for each *global* transition.
     * *
     * have a unique 'to' status for each *global* transition.
     * *
     * have unique names for each transition from a status.
     * *
     * not have a 'from' status on *initial* and *global* transitions.
     * *
     * have a 'from' status on *directed* transitions.
     * All the transition statuses must be included in {@code statuses}.
     */
    @JsonProperty("transitions")
    protected List<CreateWorkflowTransitionDetails> transitions;

    /**
     * Constructs a validated instance of {@link CreateWorkflowDetails}.
     *
     * @param spec the specification to process
     */
    public CreateWorkflowDetails(Consumer<CreateWorkflowDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWorkflowDetails(Consumer)} instead.
     * @param description The description of the workflow. The maximum length is 1000 characters.
     * @param name The name of the workflow. The name must be unique. The maximum length is 255 characters. Characters can be separated by a whitespace but the name cannot start or end with a whitespace.
     * @param statuses The statuses of the workflow. Any status that does not include a transition is added to the workflow without a transition.
     * @param transitions The transitions of the workflow. For the request to be valid, these transitions must:   *  include one *initial* transition.  *  not use the same name for a *global* and *directed* transition.  *  have a unique name for each *global* transition.  *  have a unique 'to' status for each *global* transition.  *  have unique names for each transition from a status.  *  not have a 'from' status on *initial* and *global* transitions.  *  have a 'from' status on *directed* transitions.  All the transition statuses must be included in {@code statuses}.
     */
    @ApiStatus.Internal
    public CreateWorkflowDetails(String description, String name, Set<CreateWorkflowStatusDetails> statuses, List<CreateWorkflowTransitionDetails> transitions) {
        this.description = description;
        this.name = name;
        this.statuses = statuses;
        this.transitions = transitions;
    }

}
