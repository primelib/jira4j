package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "scope",
    "statusCategory",
    "usages",
    "workflowUsages"
})
@JsonTypeName("JiraStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraStatus {

    /**
     * Constructs a validated implementation of {@link JiraStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraStatus(Consumer<JiraStatus> spec) {
        spec.accept(this);
    }

    /**
     * The description of the status.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the status.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected StatusScope scope;

    /**
     * The category of the status.
     */
    @JsonProperty("statusCategory")
    protected StatusCategoryEnum statusCategory;

    /**
     * Projects and issue types where the status is used. Only available if the `usages` expand is requested.
     */
    @JsonProperty("usages")
    protected Set<ProjectIssueTypes> usages;

    /**
     * The workflows that use this status. Only available if the `workflowUsages` expand is requested.
     */
    @JsonProperty("workflowUsages")
    protected Set<WorkflowUsages> workflowUsages;


    /**
     * The category of the status.
     */
    @AllArgsConstructor
    public enum StatusCategoryEnum {
        TODO("TODO"),
        IN_PROGRESS("IN_PROGRESS"),
        DONE("DONE");

        private final String value;
    }

}
