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
 * CommentUpdateAuthor
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
    "avatarUrls",
    "displayName",
    "emailAddress",
    "key",
    "name",
    "self",
    "timeZone"
})
@JsonTypeName("Comment_updateAuthor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentUpdateAuthor {

    /**
     * Constructs a validated implementation of {@link CommentUpdateAuthor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CommentUpdateAuthor(Consumer<CommentUpdateAuthor> spec) {
        spec.accept(this);
    }

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


}
