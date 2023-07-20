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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "active",
    "avatarUrls",
    "displayName",
    "key",
    "name",
    "self"
})
@JsonTypeName("UserBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserBean {

    /**
     * Constructs a validated implementation of {@link UserBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserBean(Consumer<UserBean> spec) {
        spec.accept(this);
    }

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
     * This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     *  The key of the user.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     *  The username of the user.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the user.
     */
    @JsonProperty("self")
    protected URI self;


}
