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
 * DashboardOwner
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
    "active",
    "avatarUrls",
    "displayName",
    "key",
    "name",
    "self"
})
@JsonTypeName("Dashboard_owner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardOwner {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Whether the user is active.
     */
    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("avatarUrls")
    protected UserBeanAvatarUrls avatarUrls;

    /**
     * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * This property is deprecated in favor of {@code accountId} because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     *  The key of the user.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This property is deprecated in favor of {@code accountId} because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     *  The username of the user.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the user.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link DashboardOwner}.
     *
     * @param spec the specification to process
     */
    public DashboardOwner(Consumer<DashboardOwner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardOwner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardOwner(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param active Whether the user is active.
     * @param avatarUrls avatarUrls
     * @param displayName The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
     * @param key This property is deprecated in favor of {@code accountId} because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
     * @param name This property is deprecated in favor of {@code accountId} because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
     * @param self The URL of the user.
     */
    @ApiStatus.Internal
    public DashboardOwner(String accountId, Boolean active, UserBeanAvatarUrls avatarUrls, String displayName, String key, String name, URI self) {
        this.accountId = accountId;
        this.active = active;
        this.avatarUrls = avatarUrls;
        this.displayName = displayName;
        this.key = key;
        this.name = name;
        this.self = self;
    }

}
