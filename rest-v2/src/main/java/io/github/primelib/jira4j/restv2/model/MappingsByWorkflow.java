package io.github.primelib.jira4j.restv2.model;

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
 * MappingsByWorkflow
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
    "newWorkflowId",
    "oldWorkflowId",
    "statusMappings"
})
@JsonTypeName("MappingsByWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MappingsByWorkflow {

    /**
     * The ID of the new workflow.
     */
    @JsonProperty("newWorkflowId")
    protected String newWorkflowId;

    /**
     * The ID of the old workflow.
     */
    @JsonProperty("oldWorkflowId")
    protected String oldWorkflowId;

    /**
     * The list of status mappings.
     */
    @JsonProperty("statusMappings")
    protected List<WorkflowAssociationStatusMapping> statusMappings;

    /**
     * Constructs a validated instance of {@link MappingsByWorkflow}.
     *
     * @param spec the specification to process
     */
    public MappingsByWorkflow(Consumer<MappingsByWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MappingsByWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MappingsByWorkflow(Consumer)} instead.
     * @param newWorkflowId The ID of the new workflow.
     * @param oldWorkflowId The ID of the old workflow.
     * @param statusMappings The list of status mappings.
     */
    @ApiStatus.Internal
    public MappingsByWorkflow(String newWorkflowId, String oldWorkflowId, List<WorkflowAssociationStatusMapping> statusMappings) {
        this.newWorkflowId = newWorkflowId;
        this.oldWorkflowId = oldWorkflowId;
        this.statusMappings = statusMappings;
    }

}
