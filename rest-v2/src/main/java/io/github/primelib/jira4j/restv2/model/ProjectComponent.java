package io.github.primelib.jira4j.restv2.model;

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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ProjectComponent
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
    "assignee",
    "assigneeType",
    "description",
    "id",
    "isAssigneeTypeValid",
    "lead",
    "leadAccountId",
    "leadUserName",
    "name",
    "project",
    "projectId",
    "realAssignee",
    "realAssigneeType",
    "self"
})
@JsonTypeName("ProjectComponent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectComponent {

    @JsonProperty("assignee")
    protected ProjectComponentAssignee assignee;

    /**
     * The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:
     *  *
     * {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * {@code UNASSIGNED} an assignee is not set for issues created with this component.
     * *
     * {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
     * Default value: {@code PROJECT_DEFAULT}.
     *  Optional when creating or updating a component.
     */
    @JsonProperty("assigneeType")
    protected AssigneeTypeEnum assigneeType;

    /**
     * The description for the component. Optional when creating or updating a component.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The unique identifier for the component.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether a user is associated with {@code assigneeType}. For example, if the {@code assigneeType} is set to {@code COMPONENT_LEAD} but the component lead is not set, then {@code false} is returned.
     */
    @JsonProperty("isAssigneeTypeValid")
    protected Boolean isAssigneeTypeValid;

    @JsonProperty("lead")
    protected ProjectComponentLead lead;

    /**
     * The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @JsonProperty("leadAccountId")
    protected String leadAccountId;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("leadUserName")
    protected String leadUserName;

    /**
     * The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The key of the project the component is assigned to. Required when creating a component. Can't be updated.
     */
    @JsonProperty("project")
    protected String project;

    /**
     * The ID of the project the component is assigned to.
     */
    @JsonProperty("projectId")
    protected Long projectId;

    @JsonProperty("realAssignee")
    protected ProjectComponentRealAssignee realAssignee;

    /**
     * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the {@code assigneeType}. For example, {@code assigneeType} is set to {@code COMPONENT_LEAD} but no component lead is set. This property is set to one of the following values:
     *  *
     * {@code PROJECT_LEAD} when {@code assigneeType} is {@code PROJECT_LEAD} and the project lead has permission to be assigned issues in the project that the component is in.
     * *
     * {@code COMPONENT_LEAD} when {@code assignee}Type is {@code COMPONENT_LEAD} and the component lead has permission to be assigned issues in the project that the component is in.
     * *
     * {@code UNASSIGNED} when {@code assigneeType} is {@code UNASSIGNED} and Jira is configured to allow unassigned issues.
     * *
     * {@code PROJECT_DEFAULT} when none of the preceding cases are true.
     */
    @JsonProperty("realAssigneeType")
    protected RealAssigneeTypeEnum realAssigneeType;

    /**
     * The URL of the component.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link ProjectComponent}.
     *
     * @param spec the specification to process
     */
    public ProjectComponent(Consumer<ProjectComponent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectComponent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectComponent(Consumer)} instead.
     * @param assignee assignee
     * @param assigneeType The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.  *  {@code UNASSIGNED} an assignee is not set for issues created with this component.  *  {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: {@code PROJECT_DEFAULT}.   Optional when creating or updating a component.
     * @param description The description for the component. Optional when creating or updating a component.
     * @param id The unique identifier for the component.
     * @param isAssigneeTypeValid Whether a user is associated with {@code assigneeType}. For example, if the {@code assigneeType} is set to {@code COMPONENT_LEAD} but the component lead is not set, then {@code false} is returned.
     * @param lead lead
     * @param leadAccountId The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param leadUserName This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param name The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
     * @param project The key of the project the component is assigned to. Required when creating a component. Can't be updated.
     * @param projectId The ID of the project the component is assigned to.
     * @param realAssignee realAssignee
     * @param realAssigneeType The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the {@code assigneeType}. For example, {@code assigneeType} is set to {@code COMPONENT_LEAD} but no component lead is set. This property is set to one of the following values:   *  {@code PROJECT_LEAD} when {@code assigneeType} is {@code PROJECT_LEAD} and the project lead has permission to be assigned issues in the project that the component is in.  *  {@code COMPONENT_LEAD} when {@code assignee}Type is {@code COMPONENT_LEAD} and the component lead has permission to be assigned issues in the project that the component is in.  *  {@code UNASSIGNED} when {@code assigneeType} is {@code UNASSIGNED} and Jira is configured to allow unassigned issues.  *  {@code PROJECT_DEFAULT} when none of the preceding cases are true.
     * @param self The URL of the component.
     */
    @ApiStatus.Internal
    public ProjectComponent(ProjectComponentAssignee assignee, AssigneeTypeEnum assigneeType, String description, String id, Boolean isAssigneeTypeValid, ProjectComponentLead lead, String leadAccountId, String leadUserName, String name, String project, Long projectId, ProjectComponentRealAssignee realAssignee, RealAssigneeTypeEnum realAssigneeType, URI self) {
        this.assignee = assignee;
        this.assigneeType = assigneeType;
        this.description = description;
        this.id = id;
        this.isAssigneeTypeValid = isAssigneeTypeValid;
        this.lead = lead;
        this.leadAccountId = leadAccountId;
        this.leadUserName = leadUserName;
        this.name = name;
        this.project = project;
        this.projectId = projectId;
        this.realAssignee = realAssignee;
        this.realAssigneeType = realAssigneeType;
        this.self = self;
    }

    /**
     * The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:
     *  *
     * {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * {@code UNASSIGNED} an assignee is not set for issues created with this component.
     * *
     * {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
     * Default value: {@code PROJECT_DEFAULT}.
     *  Optional when creating or updating a component.
     */
    @AllArgsConstructor
    public enum AssigneeTypeEnum {
        PROJECT_DEFAULT("PROJECT_DEFAULT"),
        COMPONENT_LEAD("COMPONENT_LEAD"),
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private static final AssigneeTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AssigneeTypeEnum of(String input) {
            if (input != null) {
                for (AssigneeTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the {@code assigneeType}. For example, {@code assigneeType} is set to {@code COMPONENT_LEAD} but no component lead is set. This property is set to one of the following values:
     *  *
     * {@code PROJECT_LEAD} when {@code assigneeType} is {@code PROJECT_LEAD} and the project lead has permission to be assigned issues in the project that the component is in.
     * *
     * {@code COMPONENT_LEAD} when {@code assignee}Type is {@code COMPONENT_LEAD} and the component lead has permission to be assigned issues in the project that the component is in.
     * *
     * {@code UNASSIGNED} when {@code assigneeType} is {@code UNASSIGNED} and Jira is configured to allow unassigned issues.
     * *
     * {@code PROJECT_DEFAULT} when none of the preceding cases are true.
     */
    @AllArgsConstructor
    public enum RealAssigneeTypeEnum {
        PROJECT_DEFAULT("PROJECT_DEFAULT"),
        COMPONENT_LEAD("COMPONENT_LEAD"),
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private static final RealAssigneeTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RealAssigneeTypeEnum of(String input) {
            if (input != null) {
                for (RealAssigneeTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
