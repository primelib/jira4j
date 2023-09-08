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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequiredMappingByWorkflows
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
    "sourceWorkflowId",
    "statusIds",
    "targetWorkflowId"
})
@JsonTypeName("RequiredMappingByWorkflows")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RequiredMappingByWorkflows {

    /**
     * The ID of the source workflow.
     */
    @JsonProperty("sourceWorkflowId")
    protected String sourceWorkflowId;

    /**
     * The status IDs requiring mapping.
     */
    @JsonProperty("statusIds")
    protected Set<String> statusIds;

    /**
     * The ID of the target workflow.
     */
    @JsonProperty("targetWorkflowId")
    protected String targetWorkflowId;

    /**
     * Constructs a validated instance of {@link RequiredMappingByWorkflows}.
     *
     * @param spec the specification to process
     */
    public RequiredMappingByWorkflows(Consumer<RequiredMappingByWorkflows> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RequiredMappingByWorkflows}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RequiredMappingByWorkflows(Consumer)} instead.
     * @param sourceWorkflowId The ID of the source workflow.
     * @param statusIds The status IDs requiring mapping.
     * @param targetWorkflowId The ID of the target workflow.
     */
    @ApiStatus.Internal
    public RequiredMappingByWorkflows(String sourceWorkflowId, Set<String> statusIds, String targetWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        this.statusIds = statusIds;
        this.targetWorkflowId = targetWorkflowId;
    }

}
