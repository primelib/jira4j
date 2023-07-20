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
 * NotificationTo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "assignee",
    "groupIds",
    "groups",
    "reporter",
    "users",
    "voters",
    "watchers"
})
@JsonTypeName("Notification_to")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationTo {

    /**
     * Constructs a validated implementation of {@link NotificationTo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationTo(Consumer<NotificationTo> spec) {
        spec.accept(this);
    }

    /**
     * Whether the notification should be sent to the issue's assignees.
     */
    @JsonProperty("assignee")
    protected Boolean assignee;

    /**
     * List of groupIds to receive the notification.
     */
    @JsonProperty("groupIds")
    protected List<String> groupIds;

    /**
     * List of groups to receive the notification.
     */
    @JsonProperty("groups")
    protected List<GroupName> groups;

    /**
     * Whether the notification should be sent to the issue's reporter.
     */
    @JsonProperty("reporter")
    protected Boolean reporter;

    /**
     * List of users to receive the notification.
     */
    @JsonProperty("users")
    protected List<UserDetails> users;

    /**
     * Whether the notification should be sent to the issue's voters.
     */
    @JsonProperty("voters")
    protected Boolean voters;

    /**
     * Whether the notification should be sent to the issue's watchers.
     */
    @JsonProperty("watchers")
    protected Boolean watchers;


}
