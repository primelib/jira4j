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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowCreate
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
    "startPointLayout",
    "statuses",
    "transitions"
})
@JsonTypeName("WorkflowCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreate {

    /**
     * The description of the workflow to create.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the workflow to create.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("startPointLayout")
    protected WorkflowLayout startPointLayout;

    /**
     * The statuses associated with this workflow.
     */
    @JsonProperty("statuses")
    protected List<StatusLayoutUpdate> statuses;

    /**
     * The transitions of this workflow.
     */
    @JsonProperty("transitions")
    protected List<TransitionUpdateDTO> transitions;

    /**
     * Constructs a validated instance of {@link WorkflowCreate}.
     *
     * @param spec the specification to process
     */
    public WorkflowCreate(Consumer<WorkflowCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCreate(Consumer)} instead.
     * @param description The description of the workflow to create.
     * @param name The name of the workflow to create.
     * @param startPointLayout startPointLayout
     * @param statuses The statuses associated with this workflow.
     * @param transitions The transitions of this workflow.
     */
    @ApiStatus.Internal
    public WorkflowCreate(String description, String name, WorkflowLayout startPointLayout, List<StatusLayoutUpdate> statuses, List<TransitionUpdateDTO> transitions) {
        this.description = description;
        this.name = name;
        this.startPointLayout = startPointLayout;
        this.statuses = statuses;
        this.transitions = transitions;
    }

}
