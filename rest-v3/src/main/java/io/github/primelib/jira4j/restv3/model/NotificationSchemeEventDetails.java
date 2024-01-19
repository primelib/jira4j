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
 * NotificationSchemeEventDetails
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
    "event",
    "notifications"
})
@JsonTypeName("NotificationSchemeEventDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeEventDetails {

    @JsonProperty("event")
    protected NotificationSchemeEventTypeId event;

    /**
     * The list of notifications mapped to a specified event.
     */
    @JsonProperty("notifications")
    protected List<NotificationSchemeNotificationDetails> notifications;

    /**
     * Constructs a validated instance of {@link NotificationSchemeEventDetails}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeEventDetails(Consumer<NotificationSchemeEventDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeEventDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeEventDetails(Consumer)} instead.
     * @param event event
     * @param notifications The list of notifications mapped to a specified event.
     */
    @ApiStatus.Internal
    public NotificationSchemeEventDetails(NotificationSchemeEventTypeId event, List<NotificationSchemeNotificationDetails> notifications) {
        this.event = event;
        this.notifications = notifications;
    }

}
