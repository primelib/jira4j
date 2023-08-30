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
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPickerUser
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
    "avatarUrl",
    "displayName",
    "html",
    "key",
    "name"
})
@JsonTypeName("UserPickerUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserPickerUser {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The avatar URL of the user.
     */
    @JsonProperty("avatarUrl")
    protected URI avatarUrl;

    /**
     * The display name of the user. Depending on the user’s privacy setting, this may be returned as null.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag.
     */
    @JsonProperty("html")
    protected String html;

    /**
     * This property is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This property is no longer available . See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link UserPickerUser}.
     *
     * @param spec the specification to process
     */
    public UserPickerUser(Consumer<UserPickerUser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserPickerUser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserPickerUser(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param avatarUrl The avatar URL of the user.
     * @param displayName The display name of the user. Depending on the user’s privacy setting, this may be returned as null.
     * @param html The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag.
     * @param key This property is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param name This property is no longer available . See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public UserPickerUser(String accountId, URI avatarUrl, String displayName, String html, String key, String name) {
        this.accountId = accountId;
        this.avatarUrl = avatarUrl;
        this.displayName = displayName;
        this.html = html;
        this.key = key;
        this.name = name;
    }

}
