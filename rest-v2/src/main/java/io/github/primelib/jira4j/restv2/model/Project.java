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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Project
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Project}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Project(Consumer<Project> spec) {
        spec.accept(this);
    }

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
     * Whether the project is private.
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
    protected Map<String, Object> properties = new HashMap<>();

    /**
     * The date when the project is deleted permanently.
     */
    @JsonProperty("retentionTillDate")
    protected OffsetDateTime retentionTillDate;

    /**
     * The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-2-role-post).
     */
    @JsonProperty("roles")
    protected Map<String, URI> roles = new HashMap<>();

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
     * The versions defined in the project. For more information, see [Create version](#api-rest-api-2-version-post).
     */
    @JsonProperty("versions")
    protected List<Version> versions;


    /**
     * The default assignee when creating issues for this project.
     */
    @AllArgsConstructor
    public enum AssigneeTypeEnum {
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private final String value;
    }

    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     */
    @AllArgsConstructor
    public enum ProjectTypeKeyEnum {
        SOFTWARE("software"),
        SERVICE_DESK("service_desk"),
        BUSINESS("business");

        private final String value;
    }

    /**
     * The type of the project.
     */
    @AllArgsConstructor
    public enum StyleEnum {
        CLASSIC("classic"),
        NEXT_GEN("next-gen");

        private final String value;
    }

}
