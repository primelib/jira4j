package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationRecipientsRestrictions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupIds",
    "groups",
    "permissions"
})
@JsonTypeName("NotificationRecipientsRestrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationRecipientsRestrictions {

    /**
     * Constructs a validated implementation of {@link NotificationRecipientsRestrictions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationRecipientsRestrictions(Consumer<NotificationRecipientsRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * List of groupId memberships required to receive the notification.
     */
    @JsonProperty("groupIds")
    protected List<String> groupIds;

    /**
     * List of group memberships required to receive the notification.
     */
    @JsonProperty("groups")
    protected List<GroupName> groups;

    /**
     * List of permissions required to receive the notification.
     */
    @JsonProperty("permissions")
    protected List<RestrictedPermission> permissions;


}
