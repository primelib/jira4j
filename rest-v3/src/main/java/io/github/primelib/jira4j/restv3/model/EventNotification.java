package io.github.primelib.jira4j.restv3.model;

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
 * EventNotification
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "emailAddress",
    "expand",
    "field",
    "group",
    "id",
    "notificationType",
    "parameter",
    "projectRole",
    "recipient",
    "user"
})
@JsonTypeName("EventNotification")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventNotification {

    /**
     * Constructs a validated implementation of {@link EventNotification}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventNotification(Consumer<EventNotification> spec) {
        spec.accept(this);
    }

    /**
     * The email address.
     */
    @JsonProperty("emailAddress")
    protected String emailAddress;

    /**
     * Expand options that include additional event notification details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    @JsonProperty("field")
    protected EventNotificationField field;

    @JsonProperty("group")
    protected EventNotificationGroup group;

    /**
     * The ID of the notification.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * Identifies the recipients of the notification.
     */
    @JsonProperty("notificationType")
    protected NotificationTypeEnum notificationType;

    /**
     * As a group's name can change, use of `recipient` is recommended. The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by `notificationType` value. So, when `notificationType` is:
     *  *
     * `User` The `parameter` is the user account ID.
     * *
     * `Group` The `parameter` is the group name.
     * *
     * `ProjectRole` The `parameter` is the project role ID.
     * *
     * `UserCustomField` The `parameter` is the ID of the custom field.
     * *
     * `GroupCustomField` The `parameter` is the ID of the custom field.
     */
    @JsonProperty("parameter")
    protected String parameter;

    @JsonProperty("projectRole")
    protected EventNotificationProjectRole projectRole;

    /**
     * The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by the `notificationType` value. So, when `notificationType` is:
     *  *
     * `User`, `recipient` is the user account ID.
     * *
     * `Group`, `recipient` is the group ID.
     * *
     * `ProjectRole`, `recipient` is the project role ID.
     * *
     * `UserCustomField`, `recipient` is the ID of the custom field.
     * *
     * `GroupCustomField`, `recipient` is the ID of the custom field.
     */
    @JsonProperty("recipient")
    protected String recipient;

    @JsonProperty("user")
    protected EventNotificationUser user;


    /**
     * Identifies the recipients of the notification.
     */
    @AllArgsConstructor
    public enum NotificationTypeEnum {
        CURRENTASSIGNEE("CurrentAssignee"),
        REPORTER("Reporter"),
        CURRENTUSER("CurrentUser"),
        PROJECTLEAD("ProjectLead"),
        COMPONENTLEAD("ComponentLead"),
        USER("User"),
        GROUP("Group"),
        PROJECTROLE("ProjectRole"),
        EMAILADDRESS("EmailAddress"),
        ALLWATCHERS("AllWatchers"),
        USERCUSTOMFIELD("UserCustomField"),
        GROUPCUSTOMFIELD("GroupCustomField");

        private final String value;
    }

}
