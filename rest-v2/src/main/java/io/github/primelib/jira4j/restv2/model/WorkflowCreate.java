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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowCreate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WorkflowCreate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCreate(Consumer<WorkflowCreate> spec) {
        spec.accept(this);
    }

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
    protected List<StatusLayoutUpdate> statuses = new ArrayList<>();

    /**
     * The transitions of this workflow.
     */
    @JsonProperty("transitions")
    protected List<TransitionUpdateDTO> transitions = new ArrayList<>();


}
