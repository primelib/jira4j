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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationRestrict
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
    "groupIds",
    "groups",
    "permissions"
})
@JsonTypeName("Notification_restrict")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationRestrict {

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

    /**
     * Constructs a validated instance of {@link NotificationRestrict}.
     *
     * @param spec the specification to process
     */
    public NotificationRestrict(Consumer<NotificationRestrict> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationRestrict}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationRestrict(Consumer)} instead.
     * @param groupIds List of groupId memberships required to receive the notification.
     * @param groups List of group memberships required to receive the notification.
     * @param permissions List of permissions required to receive the notification.
     */
    @ApiStatus.Internal
    public NotificationRestrict(List<String> groupIds, List<GroupName> groups, List<RestrictedPermission> permissions) {
        this.groupIds = groupIds;
        this.groups = groups;
        this.permissions = permissions;
    }

}
