package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * WorkflowUpdate
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
    "defaultStatusMappings",
    "description",
    "id",
    "startPointLayout",
    "statusMappings",
    "statuses",
    "transitions",
    "version"
})
@JsonTypeName("WorkflowUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdate {

    /**
     * The mapping of old to new status ID.
     */
    @JsonProperty("defaultStatusMappings")
    protected List<StatusMigration> defaultStatusMappings;

    /**
     * The new description for this workflow.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of this workflow.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("startPointLayout")
    protected WorkflowLayout startPointLayout;

    /**
     * The mapping of old to new status ID for a specific project and issue type.
     */
    @JsonProperty("statusMappings")
    protected List<StatusMappingDTO> statusMappings;

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

    @JsonProperty("version")
    protected DocumentVersion version;

    /**
     * Constructs a validated instance of {@link WorkflowUpdate}.
     *
     * @param spec the specification to process
     */
    public WorkflowUpdate(Consumer<WorkflowUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowUpdate(Consumer)} instead.
     * @param defaultStatusMappings The mapping of old to new status ID.
     * @param description The new description for this workflow.
     * @param id The ID of this workflow.
     * @param startPointLayout startPointLayout
     * @param statusMappings The mapping of old to new status ID for a specific project and issue type.
     * @param statuses The statuses associated with this workflow.
     * @param transitions The transitions of this workflow.
     * @param version version
     */
    @ApiStatus.Internal
    public WorkflowUpdate(List<StatusMigration> defaultStatusMappings, String description, String id, WorkflowLayout startPointLayout, List<StatusMappingDTO> statusMappings, List<StatusLayoutUpdate> statuses, List<TransitionUpdateDTO> transitions, DocumentVersion version) {
        this.defaultStatusMappings = defaultStatusMappings;
        this.description = description;
        this.id = id;
        this.startPointLayout = startPointLayout;
        this.statusMappings = statusMappings;
        this.statuses = statuses;
        this.transitions = transitions;
        this.version = version;
    }

}
