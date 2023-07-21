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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventNotificationUser
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
    "avatarUrls",
    "displayName",
    "emailAddress",
    "key",
    "name",
    "self",
    "timeZone"
})
@JsonTypeName("EventNotification_user")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventNotificationUser {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)
     */
    @JsonProperty("accountType")
    protected String accountType;

    /**
     * Whether the user is active.
     */
    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("avatarUrls")
    protected UserAvatarUrls avatarUrls;

    /**
     * The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
     */
    @JsonProperty("emailAddress")
    protected String emailAddress;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the user.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.
     */
    @JsonProperty("timeZone")
    protected String timeZone;

    /**
     * Constructs a validated instance of {@link EventNotificationUser}.
     *
     * @param spec the specification to process
     */
    public EventNotificationUser(Consumer<EventNotificationUser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventNotificationUser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventNotificationUser(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param accountType The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)
     * @param active Whether the user is active.
     * @param avatarUrls var.name
     * @param displayName The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
     * @param emailAddress The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
     * @param key This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param name This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param self The URL of the user.
     * @param timeZone The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.
     */
    @ApiStatus.Internal
    public EventNotificationUser(String accountId, String accountType, Boolean active, UserAvatarUrls avatarUrls, String displayName, String emailAddress, String key, String name, String self, String timeZone) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.active = active;
        this.avatarUrls = avatarUrls;
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.key = key;
        this.name = name;
        this.self = self;
        this.timeZone = timeZone;
    }

}
