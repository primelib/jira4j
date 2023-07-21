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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraStatus
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
     * Projects and issue types where the status is used. Only available if the {@code usages} expand is requested.
     */
    @JsonProperty("usages")
    protected Set<ProjectIssueTypes> usages;

    /**
     * The workflows that use this status. Only available if the {@code workflowUsages} expand is requested.
     */
    @JsonProperty("workflowUsages")
    protected Set<WorkflowUsages> workflowUsages;

    /**
     * Constructs a validated instance of {@link JiraStatus}.
     *
     * @param spec the specification to process
     */
    public JiraStatus(Consumer<JiraStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraStatus(Consumer)} instead.
     * @param description The description of the status.
     * @param id The ID of the status.
     * @param name The name of the status.
     * @param scope var.name
     * @param statusCategory The category of the status.
     * @param usages Projects and issue types where the status is used. Only available if the {@code usages} expand is requested.
     * @param workflowUsages The workflows that use this status. Only available if the {@code workflowUsages} expand is requested.
     */
    @ApiStatus.Internal
    public JiraStatus(String description, String id, String name, StatusScope scope, StatusCategoryEnum statusCategory, Set<ProjectIssueTypes> usages, Set<WorkflowUsages> workflowUsages) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.statusCategory = statusCategory;
        this.usages = usages;
        this.workflowUsages = workflowUsages;
    }

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
