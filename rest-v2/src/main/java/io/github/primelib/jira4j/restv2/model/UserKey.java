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
 * UserKey
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
    "key"
})
@JsonTypeName("UserKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserKey {

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Returns *unknown* if the record is deleted and corrupted, for example, as the result of a server import.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Constructs a validated instance of {@link UserKey}.
     *
     * @param spec the specification to process
     */
    public UserKey(Consumer<UserKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserKey(Consumer)} instead.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Returns *unknown* if the record is deleted and corrupted, for example, as the result of a server import.
     * @param key This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public UserKey(String accountId, String key) {
        this.accountId = accountId;
        this.key = key;
    }

}
