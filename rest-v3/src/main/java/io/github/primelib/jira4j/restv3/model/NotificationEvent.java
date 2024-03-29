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
 * NotificationEvent
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
    "description",
    "id",
    "name",
    "templateEvent"
})
@JsonTypeName("NotificationEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationEvent {

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
    protected NotificationEvent templateEvent;

    /**
     * Constructs a validated instance of {@link NotificationEvent}.
     *
     * @param spec the specification to process
     */
    public NotificationEvent(Consumer<NotificationEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationEvent(Consumer)} instead.
     * @param description The description of the event.
     * @param id The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
     * @param name The name of the event.
     * @param templateEvent templateEvent
     */
    @ApiStatus.Internal
    public NotificationEvent(String description, Long id, String name, NotificationEvent templateEvent) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.templateEvent = templateEvent;
    }

}
