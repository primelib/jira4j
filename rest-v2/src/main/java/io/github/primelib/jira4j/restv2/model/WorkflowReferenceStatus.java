package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowReferenceStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "deprecated",
    "layout",
    "properties",
    "statusReference"
})
@JsonTypeName("WorkflowReferenceStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowReferenceStatus {

    /**
     * Constructs a validated implementation of {@link WorkflowReferenceStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowReferenceStatus(Consumer<WorkflowReferenceStatus> spec) {
        spec.accept(this);
    }

    /**
     * Indicates if the status is deprecated.
     */
    @JsonProperty("deprecated")
    protected Boolean deprecated;

    @JsonProperty("layout")
    protected WorkflowStatusLayout layout;

    /**
     * The properties associated with the status.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties = new HashMap<>();

    /**
     * The reference of the status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;


}
