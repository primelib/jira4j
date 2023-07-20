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
 * UserPickerUser
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link UserPickerUser}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserPickerUser(Consumer<UserPickerUser> spec) {
        spec.accept(this);
    }

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


}
