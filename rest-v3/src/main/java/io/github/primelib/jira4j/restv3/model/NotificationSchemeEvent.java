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
 * NotificationSchemeEvent
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
@JsonTypeName("NotificationSchemeEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeEvent {

    @JsonProperty("event")
    protected NotificationEvent event;

    @JsonProperty("notifications")
    protected List<EventNotification> notifications;

    /**
     * Constructs a validated instance of {@link NotificationSchemeEvent}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeEvent(Consumer<NotificationSchemeEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeEvent(Consumer)} instead.
     * @param event event
     * @param notifications notifications
     */
    @ApiStatus.Internal
    public NotificationSchemeEvent(NotificationEvent event, List<EventNotification> notifications) {
        this.event = event;
        this.notifications = notifications;
    }

}
