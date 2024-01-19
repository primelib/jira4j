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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowAssociationStatusMapping
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
    "newStatusId",
    "oldStatusId"
})
@JsonTypeName("WorkflowAssociationStatusMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowAssociationStatusMapping {

    /**
     * The ID of the status in the new workflow.
     */
    @JsonProperty("newStatusId")
    protected String newStatusId;

    /**
     * The ID of the status in the old workflow that isn't present in the new workflow.
     */
    @JsonProperty("oldStatusId")
    protected String oldStatusId;

    /**
     * Constructs a validated instance of {@link WorkflowAssociationStatusMapping}.
     *
     * @param spec the specification to process
     */
    public WorkflowAssociationStatusMapping(Consumer<WorkflowAssociationStatusMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowAssociationStatusMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowAssociationStatusMapping(Consumer)} instead.
     * @param newStatusId The ID of the status in the new workflow.
     * @param oldStatusId The ID of the status in the old workflow that isn't present in the new workflow.
     */
    @ApiStatus.Internal
    public WorkflowAssociationStatusMapping(String newStatusId, String oldStatusId) {
        this.newStatusId = newStatusId;
        this.oldStatusId = oldStatusId;
    }

}
