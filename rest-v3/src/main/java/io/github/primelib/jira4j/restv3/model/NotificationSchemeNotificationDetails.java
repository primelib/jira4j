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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSchemeNotificationDetails
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
    "notificationType",
    "parameter"
})
@JsonTypeName("NotificationSchemeNotificationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeNotificationDetails {

    /**
     * The notification type, e.g {@code CurrentAssignee}, {@code Group}, {@code EmailAddress}.
     */
    @JsonProperty("notificationType")
    protected String notificationType;

    /**
     * The value corresponding to the specified notification type.
     */
    @JsonProperty("parameter")
    protected String parameter;

    /**
     * Constructs a validated instance of {@link NotificationSchemeNotificationDetails}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeNotificationDetails(Consumer<NotificationSchemeNotificationDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeNotificationDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeNotificationDetails(Consumer)} instead.
     * @param notificationType The notification type, e.g {@code CurrentAssignee}, {@code Group}, {@code EmailAddress}.
     * @param parameter The value corresponding to the specified notification type.
     */
    @ApiStatus.Internal
    public NotificationSchemeNotificationDetails(String notificationType, String parameter) {
        this.notificationType = notificationType;
        this.parameter = parameter;
    }

}
