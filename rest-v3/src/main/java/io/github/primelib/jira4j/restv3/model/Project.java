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

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Project
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
    "archived",
    "archivedBy",
    "archivedDate",
    "assigneeType",
    "avatarUrls",
    "components",
    "deleted",
    "deletedBy",
    "deletedDate",
    "description",
    "email",
    "expand",
    "favourite",
    "id",
    "insight",
    "isPrivate",
    "issueTypeHierarchy",
    "issueTypes",
    "key",
    "landingPageInfo",
    "lead",
    "name",
    "permissions",
    "projectCategory",
    "projectTypeKey",
    "properties",
    "retentionTillDate",
    "roles",
    "self",
    "simplified",
    "style",
    "url",
    "uuid",
    "versions"
})
@JsonTypeName("Project")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Project {

    /**
     * Whether the project is archived.
     */
    @JsonProperty("archived")
    protected Boolean archived;

    @JsonProperty("archivedBy")
    protected ProjectArchivedBy archivedBy;

    /**
     * The date when the project was archived.
     */
    @JsonProperty("archivedDate")
    protected OffsetDateTime archivedDate;

    /**
     * The default assignee when creating issues for this project.
     */
    @JsonProperty("assigneeType")
    protected AssigneeTypeEnum assigneeType;

    @JsonProperty("avatarUrls")
    protected ProjectAvatarUrls avatarUrls;

    /**
     * List of the components contained in the project.
     */
    @JsonProperty("components")
    protected List<ProjectComponent> components;

    /**
     * Whether the project is marked as deleted.
     */
    @JsonProperty("deleted")
    protected Boolean deleted;

    @JsonProperty("deletedBy")
    protected ProjectDeletedBy deletedBy;

    /**
     * The date when the project was marked as deleted.
     */
    @JsonProperty("deletedDate")
    protected OffsetDateTime deletedDate;

    /**
     * A brief description of the project.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * An email address associated with the project.
     */
    @JsonProperty("email")
    protected String email;

    /**
     * Expand options that include additional project details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * Whether the project is selected as a favorite.
     */
    @JsonProperty("favourite")
    protected Boolean favourite;

    /**
     * The ID of the project.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("insight")
    protected ProjectInsight insight;

    /**
     * Whether the project is private from the user's perspective. This means the user can't see the project or any associated issues.
     */
    @JsonProperty("isPrivate")
    protected Boolean isPrivate;

    @JsonProperty("issueTypeHierarchy")
    protected ProjectIssueTypeHierarchy issueTypeHierarchy;

    /**
     * List of the issue types available in the project.
     */
    @JsonProperty("issueTypes")
    protected List<IssueTypeDetails> issueTypes;

    /**
     * The key of the project.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("landingPageInfo")
    protected ProjectLandingPageInfo landingPageInfo;

    @JsonProperty("lead")
    protected ProjectLead lead;

    /**
     * The name of the project.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("permissions")
    protected ProjectPermissions permissions;

    @JsonProperty("projectCategory")
    protected ProjectProjectCategory projectCategory;

    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     */
    @JsonProperty("projectTypeKey")
    protected ProjectTypeKeyEnum projectTypeKey;

    /**
     * Map of project properties
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties;

    /**
     * The date when the project is deleted permanently.
     */
    @JsonProperty("retentionTillDate")
    protected OffsetDateTime retentionTillDate;

    /**
     * The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
     */
    @JsonProperty("roles")
    protected Map<String, URI> roles;

    /**
     * The URL of the project details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Whether the project is simplified.
     */
    @JsonProperty("simplified")
    protected Boolean simplified;

    /**
     * The type of the project.
     */
    @JsonProperty("style")
    protected StyleEnum style;

    /**
     * A link to information about this project, such as project documentation.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Unique ID for next-gen projects.
     */
    @JsonProperty("uuid")
    protected UUID uuid;

    /**
     * The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
     */
    @JsonProperty("versions")
    protected List<Version> versions;

    /**
     * Constructs a validated instance of {@link Project}.
     *
     * @param spec the specification to process
     */
    public Project(Consumer<Project> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Project}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Project(Consumer)} instead.
     * @param archived Whether the project is archived.
     * @param archivedBy archivedBy
     * @param archivedDate The date when the project was archived.
     * @param assigneeType The default assignee when creating issues for this project.
     * @param avatarUrls avatarUrls
     * @param components List of the components contained in the project.
     * @param deleted Whether the project is marked as deleted.
     * @param deletedBy deletedBy
     * @param deletedDate The date when the project was marked as deleted.
     * @param description A brief description of the project.
     * @param email An email address associated with the project.
     * @param expand Expand options that include additional project details in the response.
     * @param favourite Whether the project is selected as a favorite.
     * @param id The ID of the project.
     * @param insight insight
     * @param isPrivate Whether the project is private from the user's perspective. This means the user can't see the project or any associated issues.
     * @param issueTypeHierarchy issueTypeHierarchy
     * @param issueTypes List of the issue types available in the project.
     * @param key The key of the project.
     * @param landingPageInfo landingPageInfo
     * @param lead lead
     * @param name The name of the project.
     * @param permissions permissions
     * @param projectCategory projectCategory
     * @param projectTypeKey The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     * @param properties Map of project properties
     * @param retentionTillDate The date when the project is deleted permanently.
     * @param roles The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
     * @param self The URL of the project details.
     * @param simplified Whether the project is simplified.
     * @param style The type of the project.
     * @param url A link to information about this project, such as project documentation.
     * @param uuid Unique ID for next-gen projects.
     * @param versions The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
     */
    @ApiStatus.Internal
    public Project(Boolean archived, ProjectArchivedBy archivedBy, OffsetDateTime archivedDate, AssigneeTypeEnum assigneeType, ProjectAvatarUrls avatarUrls, List<ProjectComponent> components, Boolean deleted, ProjectDeletedBy deletedBy, OffsetDateTime deletedDate, String description, String email, String expand, Boolean favourite, String id, ProjectInsight insight, Boolean isPrivate, ProjectIssueTypeHierarchy issueTypeHierarchy, List<IssueTypeDetails> issueTypes, String key, ProjectLandingPageInfo landingPageInfo, ProjectLead lead, String name, ProjectPermissions permissions, ProjectProjectCategory projectCategory, ProjectTypeKeyEnum projectTypeKey, Map<String, Object> properties, OffsetDateTime retentionTillDate, Map<String, URI> roles, URI self, Boolean simplified, StyleEnum style, String url, UUID uuid, List<Version> versions) {
        this.archived = archived;
        this.archivedBy = archivedBy;
        this.archivedDate = archivedDate;
        this.assigneeType = assigneeType;
        this.avatarUrls = avatarUrls;
        this.components = components;
        this.deleted = deleted;
        this.deletedBy = deletedBy;
        this.deletedDate = deletedDate;
        this.description = description;
        this.email = email;
        this.expand = expand;
        this.favourite = favourite;
        this.id = id;
        this.insight = insight;
        this.isPrivate = isPrivate;
        this.issueTypeHierarchy = issueTypeHierarchy;
        this.issueTypes = issueTypes;
        this.key = key;
        this.landingPageInfo = landingPageInfo;
        this.lead = lead;
        this.name = name;
        this.permissions = permissions;
        this.projectCategory = projectCategory;
        this.projectTypeKey = projectTypeKey;
        this.properties = properties;
        this.retentionTillDate = retentionTillDate;
        this.roles = roles;
        this.self = self;
        this.simplified = simplified;
        this.style = style;
        this.url = url;
        this.uuid = uuid;
        this.versions = versions;
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
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
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

    /**
     * The type of the project.
     */
    @AllArgsConstructor
    public enum StyleEnum {
        CLASSIC("classic"),
        NEXT_GEN("next-gen");

        private static final StyleEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StyleEnum of(String input) {
            if (input != null) {
                for (StyleEnum v : VALUES) {
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
