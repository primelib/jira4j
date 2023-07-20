package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateProjectDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "assigneeType",
    "avatarId",
    "categoryId",
    "description",
    "issueSecurityScheme",
    "key",
    "lead",
    "leadAccountId",
    "name",
    "notificationScheme",
    "permissionScheme",
    "url"
})
@JsonTypeName("UpdateProjectDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateProjectDetails {

    /**
     * Constructs a validated implementation of {@link UpdateProjectDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateProjectDetails(Consumer<UpdateProjectDetails> spec) {
        spec.accept(this);
    }

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
     * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`
     */
    @JsonProperty("categoryId")
    protected Long categoryId;

    /**
     * A brief description of the project.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) resource to get all issue security scheme IDs.
     */
    @JsonProperty("issueSecurityScheme")
    protected Long issueSecurityScheme;

    /**
     * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.
     */
    @JsonProperty("lead")
    protected String lead;

    /**
     * The account ID of the project lead. Cannot be provided with `lead`.
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
     * A link to information about this project, such as project documentation
     */
    @JsonProperty("url")
    protected String url;


    /**
     * The default assignee when creating issues for this project.
     */
    @AllArgsConstructor
    public enum AssigneeTypeEnum {
        PROJECT_LEAD("PROJECT_LEAD"),
        UNASSIGNED("UNASSIGNED");

        private final String value;
    }

}
