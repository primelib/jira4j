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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CreateWorkflowDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowDetails(Consumer<CreateWorkflowDetails> spec) {
        spec.accept(this);
    }

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
    protected Set<CreateWorkflowStatusDetails> statuses = new LinkedHashSet<>();

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
     * All the transition statuses must be included in `statuses`.
     */
    @JsonProperty("transitions")
    protected List<CreateWorkflowTransitionDetails> transitions = new ArrayList<>();


}
