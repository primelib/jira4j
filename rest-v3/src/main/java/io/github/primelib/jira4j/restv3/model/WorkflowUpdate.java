package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class WorkflowUpdate extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link WorkflowUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowUpdate(Consumer<WorkflowUpdate> spec) {
        spec.accept(this);
    }

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
    protected List<StatusLayoutUpdate> statuses = new ArrayList<>();

    /**
     * The transitions of this workflow.
     */
    @JsonProperty("transitions")
    protected List<TransitionUpdateDTO> transitions = new ArrayList<>();

    @JsonProperty("version")
    protected DocumentVersion version;


}
