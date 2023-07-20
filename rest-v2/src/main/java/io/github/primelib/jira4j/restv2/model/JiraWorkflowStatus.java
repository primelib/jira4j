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
 * JiraWorkflowStatus
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
    "statusReference",
    "usages"
})
@JsonTypeName("JiraWorkflowStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraWorkflowStatus {

    /**
     * Constructs a validated implementation of {@link JiraWorkflowStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraWorkflowStatus(Consumer<JiraWorkflowStatus> spec) {
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
    protected WorkflowScope scope;

    /**
     * The category of the status.
     */
    @JsonProperty("statusCategory")
    protected StatusCategoryEnum statusCategory;

    /**
     * The reference of the status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * The `statuses.usages` expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses.
     */
    @JsonProperty("usages")
    protected Set<ProjectIssueTypes> usages;


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
