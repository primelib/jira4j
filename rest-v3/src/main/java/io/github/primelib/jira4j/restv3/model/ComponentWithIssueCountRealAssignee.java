package io.github.primelib.jira4j.restv3.model;

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
 * ComponentWithIssueCountRealAssignee
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "accountType",
    "active",
    "applicationRoles",
    "avatarUrls",
    "displayName",
    "emailAddress",
    "expand",
    "groups",
    "key",
    "locale",
    "name",
    "self",
    "timeZone"
})
@JsonTypeName("ComponentWithIssueCount_realAssignee")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComponentWithIssueCountRealAssignee {

    /**
     * Constructs a validated implementation of {@link ComponentWithIssueCountRealAssignee}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComponentWithIssueCountRealAssignee(Consumer<ComponentWithIssueCountRealAssignee> spec) {
        spec.accept(this);
    }

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The user account type. Can take the following values:
     *  *
     * `atlassian` regular Atlassian user account
     * *
     * `app` system account used for Connect applications and OAuth to represent external systems
     * *
     * `customer` Jira Service Desk account representing an external service desk
     */
    @JsonProperty("accountType")
    protected AccountTypeEnum accountType;

    /**
     * Whether the user is active.
     */
    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("applicationRoles")
    protected UserApplicationRoles applicationRoles;

    @JsonProperty("avatarUrls")
    protected UserAvatarUrls avatarUrls;

    /**
     * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
     */
    @JsonProperty("emailAddress")
    protected String emailAddress;

    /**
     * Expand options that include additional user details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    @JsonProperty("groups")
    protected UserGroups groups;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
     */
    @JsonProperty("locale")
    protected String locale;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the user.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
     */
    @JsonProperty("timeZone")
    protected String timeZone;


    /**
     * The user account type. Can take the following values:
     *  *
     * `atlassian` regular Atlassian user account
     * *
     * `app` system account used for Connect applications and OAuth to represent external systems
     * *
     * `customer` Jira Service Desk account representing an external service desk
     */
    @AllArgsConstructor
    public enum AccountTypeEnum {
        ATLASSIAN("atlassian"),
        APP("app"),
        CUSTOMER("customer"),
        UNKNOWN("unknown");

        private final String value;
    }

}
