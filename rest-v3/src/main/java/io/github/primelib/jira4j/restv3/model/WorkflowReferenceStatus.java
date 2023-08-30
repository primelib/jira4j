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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowReferenceStatus
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
    "deprecated",
    "layout",
    "properties",
    "statusReference"
})
@JsonTypeName("WorkflowReferenceStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowReferenceStatus {

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
    protected Map<String, String> properties;

    /**
     * The reference of the status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * Constructs a validated instance of {@link WorkflowReferenceStatus}.
     *
     * @param spec the specification to process
     */
    public WorkflowReferenceStatus(Consumer<WorkflowReferenceStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowReferenceStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowReferenceStatus(Consumer)} instead.
     * @param deprecated Indicates if the status is deprecated.
     * @param layout layout
     * @param properties The properties associated with the status.
     * @param statusReference The reference of the status.
     */
    @ApiStatus.Internal
    public WorkflowReferenceStatus(Boolean deprecated, WorkflowStatusLayout layout, Map<String, String> properties, String statusReference) {
        this.deprecated = deprecated;
        this.layout = layout;
        this.properties = properties;
        this.statusReference = statusReference;
    }

}
