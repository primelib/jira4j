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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EventNotification
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
    protected FieldDetails field;

    @JsonProperty("group")
    protected GroupName group;

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
     * As a group's name can change, use of {@code recipient} is recommended. The identifier associated with the {@code notificationType} value that defines the receiver of the notification, where the receiver isn't implied by {@code notificationType} value. So, when {@code notificationType} is:
     *  *
     * {@code User} The {@code parameter} is the user account ID.
     * *
     * {@code Group} The {@code parameter} is the group name.
     * *
     * {@code ProjectRole} The {@code parameter} is the project role ID.
     * *
     * {@code UserCustomField} The {@code parameter} is the ID of the custom field.
     * *
     * {@code GroupCustomField} The {@code parameter} is the ID of the custom field.
     */
    @JsonProperty("parameter")
    protected String parameter;

    @JsonProperty("projectRole")
    protected ProjectRole projectRole;

    /**
     * The identifier associated with the {@code notificationType} value that defines the receiver of the notification, where the receiver isn't implied by the {@code notificationType} value. So, when {@code notificationType} is:
     *  *
     * {@code User}, {@code recipient} is the user account ID.
     * *
     * {@code Group}, {@code recipient} is the group ID.
     * *
     * {@code ProjectRole}, {@code recipient} is the project role ID.
     * *
     * {@code UserCustomField}, {@code recipient} is the ID of the custom field.
     * *
     * {@code GroupCustomField}, {@code recipient} is the ID of the custom field.
     */
    @JsonProperty("recipient")
    protected String recipient;

    @JsonProperty("user")
    protected UserDetails user;

    /**
     * Constructs a validated instance of {@link EventNotification}.
     *
     * @param spec the specification to process
     */
    public EventNotification(Consumer<EventNotification> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventNotification}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventNotification(Consumer)} instead.
     * @param emailAddress The email address.
     * @param expand Expand options that include additional event notification details in the response.
     * @param field field
     * @param group group
     * @param id The ID of the notification.
     * @param notificationType Identifies the recipients of the notification.
     * @param parameter As a group's name can change, use of {@code recipient} is recommended. The identifier associated with the {@code notificationType} value that defines the receiver of the notification, where the receiver isn't implied by {@code notificationType} value. So, when {@code notificationType} is:   *  {@code User} The {@code parameter} is the user account ID.  *  {@code Group} The {@code parameter} is the group name.  *  {@code ProjectRole} The {@code parameter} is the project role ID.  *  {@code UserCustomField} The {@code parameter} is the ID of the custom field.  *  {@code GroupCustomField} The {@code parameter} is the ID of the custom field.
     * @param projectRole projectRole
     * @param recipient The identifier associated with the {@code notificationType} value that defines the receiver of the notification, where the receiver isn't implied by the {@code notificationType} value. So, when {@code notificationType} is:   *  {@code User}, {@code recipient} is the user account ID.  *  {@code Group}, {@code recipient} is the group ID.  *  {@code ProjectRole}, {@code recipient} is the project role ID.  *  {@code UserCustomField}, {@code recipient} is the ID of the custom field.  *  {@code GroupCustomField}, {@code recipient} is the ID of the custom field.
     * @param user user
     */
    @ApiStatus.Internal
    public EventNotification(String emailAddress, String expand, FieldDetails field, GroupName group, Long id, NotificationTypeEnum notificationType, String parameter, ProjectRole projectRole, String recipient, UserDetails user) {
        this.emailAddress = emailAddress;
        this.expand = expand;
        this.field = field;
        this.group = group;
        this.id = id;
        this.notificationType = notificationType;
        this.parameter = parameter;
        this.projectRole = projectRole;
        this.recipient = recipient;
        this.user = user;
    }

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

        private static final NotificationTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static NotificationTypeEnum of(String input) {
            if (input != null) {
                for (NotificationTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
