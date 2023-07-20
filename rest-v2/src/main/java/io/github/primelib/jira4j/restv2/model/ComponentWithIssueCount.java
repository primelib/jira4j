package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComponentWithIssueCount
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "assignee",
    "assigneeType",
    "description",
    "id",
    "isAssigneeTypeValid",
    "issueCount",
    "lead",
    "name",
    "project",
    "projectId",
    "realAssignee",
    "realAssigneeType",
    "self"
})
@JsonTypeName("ComponentWithIssueCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComponentWithIssueCount {

    /**
     * Constructs a validated implementation of {@link ComponentWithIssueCount}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComponentWithIssueCount(Consumer<ComponentWithIssueCount> spec) {
        spec.accept(this);
    }

    @JsonProperty("assignee")
    protected ComponentWithIssueCountAssignee assignee;

    /**
     * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:
     *  *
     * `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * `UNASSIGNED` an assignee is not set for issues created with this component.
     * *
     * `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
     */
    @JsonProperty("assigneeType")
    protected AssigneeTypeEnum assigneeType;

    /**
     * The description for the component.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The unique identifier for the component.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
     */
    @JsonProperty("isAssigneeTypeValid")
    protected Boolean isAssigneeTypeValid;

    /**
     * Count of issues for the component.
     */
    @JsonProperty("issueCount")
    protected Long issueCount;

    @JsonProperty("lead")
    protected ComponentWithIssueCountLead lead;

    /**
     * The name for the component.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The key of the project to which the component is assigned.
     */
    @JsonProperty("project")
    protected String project;

    /**
     * Not used.
     */
    @JsonProperty("projectId")
    protected Long projectId;

    @JsonProperty("realAssignee")
    protected ComponentWithIssueCountRealAssignee realAssignee;

    /**
     * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:
     *  *
     * `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.
     * *
     * `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.
     * *
     * `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.
     * *
     * `PROJECT_DEFAULT` when none of the preceding cases are true.
     */
    @JsonProperty("realAssigneeType")
    protected RealAssigneeTypeEnum realAssigneeType;

    /**
     * The URL for this count of the issues contained in the component.
     */
    @JsonProperty("self")
    protected URI self;


    /**
     * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:
     *  *
     * `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * `UNASSIGNED` an assignee is not set for issues created with this component.
     * *
     * `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
     */
    @AllArgsConstructor
    public enum AssigneeTypeEnum {
        PROJECT_DEFAULT("PROJECT_DEFAULT"),
        COMPONENT_LEAD("COMPONENT_LEAD"),
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private final String value;
    }

    /**
     * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:
     *  *
     * `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.
     * *
     * `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.
     * *
     * `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.
     * *
     * `PROJECT_DEFAULT` when none of the preceding cases are true.
     */
    @AllArgsConstructor
    public enum RealAssigneeTypeEnum {
        PROJECT_DEFAULT("PROJECT_DEFAULT"),
        COMPONENT_LEAD("COMPONENT_LEAD"),
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private final String value;
    }

}
