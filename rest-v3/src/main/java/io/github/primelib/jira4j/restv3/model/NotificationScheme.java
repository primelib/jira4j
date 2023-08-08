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
 * NotificationScheme
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
    "expand",
    "id",
    "name",
    "notificationSchemeEvents",
    "projects",
    "scope",
    "self"
})
@JsonTypeName("NotificationScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationScheme {

    /**
     * The description of the notification scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Expand options that include additional notification scheme details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The ID of the notification scheme.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the notification scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The notification events and associated recipients.
     */
    @JsonProperty("notificationSchemeEvents")
    protected List<NotificationSchemeEvent> notificationSchemeEvents;

    /**
     * The list of project IDs associated with the notification scheme.
     */
    @JsonProperty("projects")
    protected List<Long> projects;

    @JsonProperty("scope")
    protected NotificationSchemeScope scope;

    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link NotificationScheme}.
     *
     * @param spec the specification to process
     */
    public NotificationScheme(Consumer<NotificationScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationScheme(Consumer)} instead.
     * @param description The description of the notification scheme.
     * @param expand Expand options that include additional notification scheme details in the response.
     * @param id The ID of the notification scheme.
     * @param name The name of the notification scheme.
     * @param notificationSchemeEvents The notification events and associated recipients.
     * @param projects The list of project IDs associated with the notification scheme.
     * @param scope scope
     * @param self self
     */
    @ApiStatus.Internal
    public NotificationScheme(String description, String expand, Long id, String name, List<NotificationSchemeEvent> notificationSchemeEvents, List<Long> projects, NotificationSchemeScope scope, String self) {
        this.description = description;
        this.expand = expand;
        this.id = id;
        this.name = name;
        this.notificationSchemeEvents = notificationSchemeEvents;
        this.projects = projects;
        this.scope = scope;
        this.self = self;
    }

}
