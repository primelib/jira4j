package io.github.primelib.jira4j.restv2.model;

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
 * NotificationEvent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "templateEvent"
})
@JsonTypeName("NotificationEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationEvent {

    /**
     * Constructs a validated implementation of {@link NotificationEvent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationEvent(Consumer<NotificationEvent> spec) {
        spec.accept(this);
    }

    /**
     * The description of the event.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the event.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("templateEvent")
    protected NotificationEventTemplateEvent templateEvent;


}
