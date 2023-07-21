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
 * WorkflowElementReference
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
    "propertyKey",
    "ruleId",
    "statusMappingReference",
    "statusReference",
    "transitionId"
})
@JsonTypeName("WorkflowElementReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowElementReference {

    /**
     * A property key.
     */
    @JsonProperty("propertyKey")
    protected String propertyKey;

    /**
     * A rule ID.
     */
    @JsonProperty("ruleId")
    protected String ruleId;

    @JsonProperty("statusMappingReference")
    protected ProjectAndIssueTypePair statusMappingReference;

    /**
     * A status reference.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * A transition ID.
     */
    @JsonProperty("transitionId")
    protected String transitionId;

    /**
     * Constructs a validated instance of {@link WorkflowElementReference}.
     *
     * @param spec the specification to process
     */
    public WorkflowElementReference(Consumer<WorkflowElementReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowElementReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowElementReference(Consumer)} instead.
     * @param propertyKey A property key.
     * @param ruleId A rule ID.
     * @param statusMappingReference var.name
     * @param statusReference A status reference.
     * @param transitionId A transition ID.
     */
    @ApiStatus.Internal
    public WorkflowElementReference(String propertyKey, String ruleId, ProjectAndIssueTypePair statusMappingReference, String statusReference, String transitionId) {
        this.propertyKey = propertyKey;
        this.ruleId = ruleId;
        this.statusMappingReference = statusMappingReference;
        this.statusReference = statusReference;
        this.transitionId = transitionId;
    }

}
