package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowElementReference
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WorkflowElementReference}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowElementReference(Consumer<WorkflowElementReference> spec) {
        spec.accept(this);
    }

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


}
