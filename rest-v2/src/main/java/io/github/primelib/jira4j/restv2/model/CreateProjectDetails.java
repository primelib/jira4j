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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateProjectDetails
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
    "assigneeType",
    "avatarId",
    "categoryId",
    "description",
    "fieldConfigurationScheme",
    "issueSecurityScheme",
    "issueTypeScheme",
    "issueTypeScreenScheme",
    "key",
    "lead",
    "leadAccountId",
    "name",
    "notificationScheme",
    "permissionScheme",
    "projectTemplateKey",
    "projectTypeKey",
    "url",
    "workflowScheme"
})
@JsonTypeName("CreateProjectDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateProjectDetails {

    /**
     * The default assignee when creating issues for this project.
     */
    @JsonProperty("assigneeType")
    protected AssigneeTypeEnum assigneeType;

    /**
     * An integer value for the project's avatar.
     */
    @JsonProperty("avatarId")
    protected Long avatarId;

    /**
     * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.
     */
    @JsonProperty("categoryId")
    protected Long categoryId;

    /**
     * A brief description of the project.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-2-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
     */
    @JsonProperty("fieldConfigurationScheme")
    protected Long fieldConfigurationScheme;

    /**
     * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) resource to get all issue security scheme IDs.
     */
    @JsonProperty("issueSecurityScheme")
    protected Long issueSecurityScheme;

    /**
     * The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-2-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
     */
    @JsonProperty("issueTypeScheme")
    protected Long issueTypeScheme;

    /**
     * The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-2-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
     */
    @JsonProperty("issueTypeScreenScheme")
    protected Long issueTypeScreenScheme;

    /**
     * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This parameter is deprecated because of privacy changes. Use {@code leadAccountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either {@code lead} or {@code leadAccountId} must be set when creating a project. Cannot be provided with {@code leadAccountId}.
     */
    @JsonProperty("lead")
    protected String lead;

    /**
     * The account ID of the project lead. Either {@code lead} or {@code leadAccountId} must be set when creating a project. Cannot be provided with {@code lead}.
     */
    @JsonProperty("leadAccountId")
    protected String leadAccountId;

    /**
     * The name of the project.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-2-notificationscheme-get) resource to get a list of notification scheme IDs.
     */
    @JsonProperty("notificationScheme")
    protected Long notificationScheme;

    /**
     * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-2-permissionscheme-get) resource to see a list of all permission scheme IDs.
     */
    @JsonProperty("permissionScheme")
    protected Long permissionScheme;

    /**
     * A predefined configuration for a project. The type of the {@code projectTemplateKey} must match with the type of the {@code projectTypeKey}.
     */
    @JsonProperty("projectTemplateKey")
    protected ProjectTemplateKeyEnum projectTemplateKey;

    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
     */
    @JsonProperty("projectTypeKey")
    protected ProjectTypeKeyEnum projectTypeKey;

    /**
     * A link to information about this project, such as project documentation
     */
    @JsonProperty("url")
    protected String url;

    /**
     * The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-2-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
     */
    @JsonProperty("workflowScheme")
    protected Long workflowScheme;

    /**
     * Constructs a validated instance of {@link CreateProjectDetails}.
     *
     * @param spec the specification to process
     */
    public CreateProjectDetails(Consumer<CreateProjectDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateProjectDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateProjectDetails(Consumer)} instead.
     * @param assigneeType The default assignee when creating issues for this project.
     * @param avatarId An integer value for the project's avatar.
     * @param categoryId The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.
     * @param description A brief description of the project.
     * @param fieldConfigurationScheme The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-2-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
     * @param issueSecurityScheme The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) resource to get all issue security scheme IDs.
     * @param issueTypeScheme The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-2-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
     * @param issueTypeScreenScheme The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-2-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
     * @param key Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
     * @param lead This parameter is deprecated because of privacy changes. Use {@code leadAccountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either {@code lead} or {@code leadAccountId} must be set when creating a project. Cannot be provided with {@code leadAccountId}.
     * @param leadAccountId The account ID of the project lead. Either {@code lead} or {@code leadAccountId} must be set when creating a project. Cannot be provided with {@code lead}.
     * @param name The name of the project.
     * @param notificationScheme The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-2-notificationscheme-get) resource to get a list of notification scheme IDs.
     * @param permissionScheme The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-2-permissionscheme-get) resource to see a list of all permission scheme IDs.
     * @param projectTemplateKey A predefined configuration for a project. The type of the {@code projectTemplateKey} must match with the type of the {@code projectTypeKey}.
     * @param projectTypeKey The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
     * @param url A link to information about this project, such as project documentation
     * @param workflowScheme The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-2-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
     */
    @ApiStatus.Internal
    public CreateProjectDetails(AssigneeTypeEnum assigneeType, Long avatarId, Long categoryId, String description, Long fieldConfigurationScheme, Long issueSecurityScheme, Long issueTypeScheme, Long issueTypeScreenScheme, String key, String lead, String leadAccountId, String name, Long notificationScheme, Long permissionScheme, ProjectTemplateKeyEnum projectTemplateKey, ProjectTypeKeyEnum projectTypeKey, String url, Long workflowScheme) {
        this.assigneeType = assigneeType;
        this.avatarId = avatarId;
        this.categoryId = categoryId;
        this.description = description;
        this.fieldConfigurationScheme = fieldConfigurationScheme;
        this.issueSecurityScheme = issueSecurityScheme;
        this.issueTypeScheme = issueTypeScheme;
        this.issueTypeScreenScheme = issueTypeScreenScheme;
        this.key = key;
        this.lead = lead;
        this.leadAccountId = leadAccountId;
        this.name = name;
        this.notificationScheme = notificationScheme;
        this.permissionScheme = permissionScheme;
        this.projectTemplateKey = projectTemplateKey;
        this.projectTypeKey = projectTypeKey;
        this.url = url;
        this.workflowScheme = workflowScheme;
    }

    /**
     * The default assignee when creating issues for this project.
     */
    @AllArgsConstructor
    public enum AssigneeTypeEnum {
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
     * A predefined configuration for a project. The type of the {@code projectTemplateKey} must match with the type of the {@code projectTypeKey}.
     */
    @AllArgsConstructor
    public enum ProjectTemplateKeyEnum {
        PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"),
        PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum"),
        PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC("com.pyxis.greenhopper.jira:gh-simplified-basic"),
        PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic"),
        PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic"),
        PYXIS_GREENHOPPER_JIRA_GH_CROSS_TEAM_TEMPLATE("com.pyxis.greenhopper.jira:gh-cross-team-template"),
        PYXIS_GREENHOPPER_JIRA_GH_CROSS_TEAM_PLANNING_TEMPLATE("com.pyxis.greenhopper.jira:gh-cross-team-planning-template"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_MANAGEMENT("com.atlassian.servicedesk:simplified-it-service-management"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-general-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_IT("com.atlassian.servicedesk:simplified-general-service-desk-it"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_BUSINESS("com.atlassian.servicedesk:simplified-general-service-desk-business"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-internal-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-external-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK("com.atlassian.servicedesk:simplified-hr-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:simplified-facilities-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-legal-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_MARKETING_SERVICE_DESK("com.atlassian.servicedesk:simplified-marketing-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_FINANCE_SERVICE_DESK("com.atlassian.servicedesk:simplified-finance-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_ANALYTICS_SERVICE_DESK("com.atlassian.servicedesk:simplified-analytics-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_DESIGN_SERVICE_DESK("com.atlassian.servicedesk:simplified-design-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_SALES_SERVICE_DESK("com.atlassian.servicedesk:simplified-sales-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_HALP_SERVICE_DESK("com.atlassian.servicedesk:simplified-halp-service-desk"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_BLANK_PROJECT_IT("com.atlassian.servicedesk:simplified-blank-project-it"),
        ATLASSIAN_SERVICEDESK_SIMPLIFIED_BLANK_PROJECT_BUSINESS("com.atlassian.servicedesk:simplified-blank-project-business"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_IT_SERVICE_DESK("com.atlassian.servicedesk:next-gen-it-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_HR_SERVICE_DESK("com.atlassian.servicedesk:next-gen-hr-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:next-gen-legal-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_MARKETING_SERVICE_DESK("com.atlassian.servicedesk:next-gen-marketing-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:next-gen-facilities-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_IT_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-it-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_BUSINESS_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-business-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_ANALYTICS_SERVICE_DESK("com.atlassian.servicedesk:next-gen-analytics-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_FINANCE_SERVICE_DESK("com.atlassian.servicedesk:next-gen-finance-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_DESIGN_SERVICE_DESK("com.atlassian.servicedesk:next-gen-design-service-desk"),
        ATLASSIAN_SERVICEDESK_NEXT_GEN_SALES_SERVICE_DESK("com.atlassian.servicedesk:next-gen-sales-service-desk"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment"),
        ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_("com.atlassian.jira-core-project-templates:jira-core-simplified-task-");

        private static final ProjectTemplateKeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ProjectTemplateKeyEnum of(String input) {
            if (input != null) {
                for (ProjectTemplateKeyEnum v : VALUES) {
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
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
     */
    @AllArgsConstructor
    public enum ProjectTypeKeyEnum {
        SOFTWARE("software"),
        SERVICE_DESK("service_desk"),
        BUSINESS("business");

        private static final ProjectTypeKeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ProjectTypeKeyEnum of(String input) {
            if (input != null) {
                for (ProjectTypeKeyEnum v : VALUES) {
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
