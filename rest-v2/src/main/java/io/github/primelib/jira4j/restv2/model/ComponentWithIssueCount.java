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
 * ComponentWithIssueCount
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

    @JsonProperty("assignee")
    protected User assignee;

    /**
     * The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:
     *  *
     * {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * {@code UNASSIGNED} an assignee is not set for issues created with this component.
     * *
     * {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
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
     * Whether a user is associated with {@code assigneeType}. For example, if the {@code assigneeType} is set to {@code COMPONENT_LEAD} but the component lead is not set, then {@code false} is returned.
     */
    @JsonProperty("isAssigneeTypeValid")
    protected Boolean isAssigneeTypeValid;

    /**
     * Count of issues for the component.
     */
    @JsonProperty("issueCount")
    protected Long issueCount;

    @JsonProperty("lead")
    protected User lead;

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
    protected User realAssignee;

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
     * The URL for this count of the issues contained in the component.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link ComponentWithIssueCount}.
     *
     * @param spec the specification to process
     */
    public ComponentWithIssueCount(Consumer<ComponentWithIssueCount> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComponentWithIssueCount}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComponentWithIssueCount(Consumer)} instead.
     * @param assignee assignee
     * @param assigneeType The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.  *  {@code UNASSIGNED} an assignee is not set for issues created with this component.  *  {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
     * @param description The description for the component.
     * @param id The unique identifier for the component.
     * @param isAssigneeTypeValid Whether a user is associated with {@code assigneeType}. For example, if the {@code assigneeType} is set to {@code COMPONENT_LEAD} but the component lead is not set, then {@code false} is returned.
     * @param issueCount Count of issues for the component.
     * @param lead lead
     * @param name The name for the component.
     * @param project The key of the project to which the component is assigned.
     * @param projectId Not used.
     * @param realAssignee realAssignee
     * @param realAssigneeType The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the {@code assigneeType}. For example, {@code assigneeType} is set to {@code COMPONENT_LEAD} but no component lead is set. This property is set to one of the following values:   *  {@code PROJECT_LEAD} when {@code assigneeType} is {@code PROJECT_LEAD} and the project lead has permission to be assigned issues in the project that the component is in.  *  {@code COMPONENT_LEAD} when {@code assignee}Type is {@code COMPONENT_LEAD} and the component lead has permission to be assigned issues in the project that the component is in.  *  {@code UNASSIGNED} when {@code assigneeType} is {@code UNASSIGNED} and Jira is configured to allow unassigned issues.  *  {@code PROJECT_DEFAULT} when none of the preceding cases are true.
     * @param self The URL for this count of the issues contained in the component.
     */
    @ApiStatus.Internal
    public ComponentWithIssueCount(User assignee, AssigneeTypeEnum assigneeType, String description, String id, Boolean isAssigneeTypeValid, Long issueCount, User lead, String name, String project, Long projectId, User realAssignee, RealAssigneeTypeEnum realAssigneeType, URI self) {
        this.assignee = assignee;
        this.assigneeType = assigneeType;
        this.description = description;
        this.id = id;
        this.isAssigneeTypeValid = isAssigneeTypeValid;
        this.issueCount = issueCount;
        this.lead = lead;
        this.name = name;
        this.project = project;
        this.projectId = projectId;
        this.realAssignee = realAssignee;
        this.realAssigneeType = realAssigneeType;
        this.self = self;
    }

    /**
     * The nominal user type used to determine the assignee for issues created with this component. See {@code realAssigneeType} for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:
     *  *
     * {@code PROJECT_LEAD} the assignee to any issues created with this component is nominally the lead for the project the component is in.
     * *
     * {@code COMPONENT_LEAD} the assignee to any issues created with this component is nominally the lead for the component.
     * *
     * {@code UNASSIGNED} an assignee is not set for issues created with this component.
     * *
     * {@code PROJECT_DEFAULT} the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
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
