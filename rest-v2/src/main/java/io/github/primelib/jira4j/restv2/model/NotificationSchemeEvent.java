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
 * NotificationSchemeEvent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "event",
    "notifications"
})
@JsonTypeName("NotificationSchemeEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeEvent {

    /**
     * Constructs a validated implementation of {@link NotificationSchemeEvent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSchemeEvent(Consumer<NotificationSchemeEvent> spec) {
        spec.accept(this);
    }

    @JsonProperty("event")
    protected NotificationEvent event;

    @JsonProperty("notifications")
    protected List<EventNotification> notifications;


}
