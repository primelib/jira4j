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
 * WorkflowStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name",
    "properties"
})
@JsonTypeName("WorkflowStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatus {

    /**
     * Constructs a validated implementation of {@link WorkflowStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowStatus(Consumer<WorkflowStatus> spec) {
        spec.accept(this);
    }

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
     * Additional properties that modify the behavior of issues in this status. Supports the properties `jira.issue.editable` and `issueEditable` (deprecated) that indicate whether issues are editable.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();


}
