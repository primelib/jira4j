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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationTo
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

    /**
     * Constructs a validated instance of {@link NotificationTo}.
     *
     * @param spec the specification to process
     */
    public NotificationTo(Consumer<NotificationTo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationTo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationTo(Consumer)} instead.
     * @param assignee Whether the notification should be sent to the issue's assignees.
     * @param groupIds List of groupIds to receive the notification.
     * @param groups List of groups to receive the notification.
     * @param reporter Whether the notification should be sent to the issue's reporter.
     * @param users List of users to receive the notification.
     * @param voters Whether the notification should be sent to the issue's voters.
     * @param watchers Whether the notification should be sent to the issue's watchers.
     */
    @ApiStatus.Internal
    public NotificationTo(Boolean assignee, List<String> groupIds, List<GroupName> groups, Boolean reporter, List<UserDetails> users, Boolean voters, Boolean watchers) {
        this.assignee = assignee;
        this.groupIds = groupIds;
        this.groups = groups;
        this.reporter = reporter;
        this.users = users;
        this.voters = voters;
        this.watchers = watchers;
    }

}
