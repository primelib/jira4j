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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateProjectDetails
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
     * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to {@code -1.}
     */
    @JsonProperty("categoryId")
    protected Long categoryId;

    /**
     * A brief description of the project.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
     */
    @JsonProperty("issueSecurityScheme")
    protected Long issueSecurityScheme;

    /**
     * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This parameter is deprecated because of privacy changes. Use {@code leadAccountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with {@code leadAccountId}.
     */
    @JsonProperty("lead")
    protected String lead;

    /**
     * The account ID of the project lead. Cannot be provided with {@code lead}.
     */
    @JsonProperty("leadAccountId")
    protected String leadAccountId;

    /**
     * The name of the project.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
     */
    @JsonProperty("notificationScheme")
    protected Long notificationScheme;

    /**
     * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
     */
    @JsonProperty("permissionScheme")
    protected Long permissionScheme;

    /**
     * A link to information about this project, such as project documentation
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link UpdateProjectDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateProjectDetails(Consumer<UpdateProjectDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateProjectDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateProjectDetails(Consumer)} instead.
     * @param assigneeType The default assignee when creating issues for this project.
     * @param avatarId An integer value for the project's avatar.
     * @param categoryId The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to {@code -1.}
     * @param description A brief description of the project.
     * @param issueSecurityScheme The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
     * @param key Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
     * @param lead This parameter is deprecated because of privacy changes. Use {@code leadAccountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with {@code leadAccountId}.
     * @param leadAccountId The account ID of the project lead. Cannot be provided with {@code lead}.
     * @param name The name of the project.
     * @param notificationScheme The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
     * @param permissionScheme The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
     * @param url A link to information about this project, such as project documentation
     */
    @ApiStatus.Internal
    public UpdateProjectDetails(AssigneeTypeEnum assigneeType, Long avatarId, Long categoryId, String description, Long issueSecurityScheme, String key, String lead, String leadAccountId, String name, Long notificationScheme, Long permissionScheme, String url) {
        this.assigneeType = assigneeType;
        this.avatarId = avatarId;
        this.categoryId = categoryId;
        this.description = description;
        this.issueSecurityScheme = issueSecurityScheme;
        this.key = key;
        this.lead = lead;
        this.leadAccountId = leadAccountId;
        this.name = name;
        this.notificationScheme = notificationScheme;
        this.permissionScheme = permissionScheme;
        this.url = url;
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

}
