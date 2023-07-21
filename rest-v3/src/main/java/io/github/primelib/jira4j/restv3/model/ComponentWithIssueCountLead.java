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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComponentWithIssueCountLead
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
@JsonTypeName("ComponentWithIssueCount_lead")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComponentWithIssueCountLead {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The user account type. Can take the following values:
     *  *
     * {@code atlassian} regular Atlassian user account
     * *
     * {@code app} system account used for Connect applications and OAuth to represent external systems
     * *
     * {@code customer} Jira Service Desk account representing an external service desk
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
     * Constructs a validated instance of {@link ComponentWithIssueCountLead}.
     *
     * @param spec the specification to process
     */
    public ComponentWithIssueCountLead(Consumer<ComponentWithIssueCountLead> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComponentWithIssueCountLead}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComponentWithIssueCountLead(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
     * @param accountType The user account type. Can take the following values:   *  {@code atlassian} regular Atlassian user account  *  {@code app} system account used for Connect applications and OAuth to represent external systems  *  {@code customer} Jira Service Desk account representing an external service desk
     * @param active Whether the user is active.
     * @param applicationRoles var.name
     * @param avatarUrls var.name
     * @param displayName The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
     * @param emailAddress The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
     * @param expand Expand options that include additional user details in the response.
     * @param groups var.name
     * @param key This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param locale The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
     * @param name This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param self The URL of the user.
     * @param timeZone The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
     */
    @ApiStatus.Internal
    public ComponentWithIssueCountLead(String accountId, AccountTypeEnum accountType, Boolean active, UserApplicationRoles applicationRoles, UserAvatarUrls avatarUrls, String displayName, String emailAddress, String expand, UserGroups groups, String key, String locale, String name, URI self, String timeZone) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.active = active;
        this.applicationRoles = applicationRoles;
        this.avatarUrls = avatarUrls;
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.expand = expand;
        this.groups = groups;
        this.key = key;
        this.locale = locale;
        this.name = name;
        this.self = self;
        this.timeZone = timeZone;
    }

    /**
     * The user account type. Can take the following values:
     *  *
     * {@code atlassian} regular Atlassian user account
     * *
     * {@code app} system account used for Connect applications and OAuth to represent external systems
     * *
     * {@code customer} Jira Service Desk account representing an external service desk
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
