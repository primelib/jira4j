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
 * WorkflowStatus
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
    "id",
    "name",
    "properties"
})
@JsonTypeName("WorkflowStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatus {

    /**
     * The ID of the issue status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the status in the workflow.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Additional properties that modify the behavior of issues in this status. Supports the properties {@code jira.issue.editable} and {@code issueEditable} (deprecated) that indicate whether issues are editable.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties;

    /**
     * Constructs a validated instance of {@link WorkflowStatus}.
     *
     * @param spec the specification to process
     */
    public WorkflowStatus(Consumer<WorkflowStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowStatus(Consumer)} instead.
     * @param id The ID of the issue status.
     * @param name The name of the status in the workflow.
     * @param properties Additional properties that modify the behavior of issues in this status. Supports the properties {@code jira.issue.editable} and {@code issueEditable} (deprecated) that indicate whether issues are editable.
     */
    @ApiStatus.Internal
    public WorkflowStatus(String id, String name, Map<String, Object> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

}
