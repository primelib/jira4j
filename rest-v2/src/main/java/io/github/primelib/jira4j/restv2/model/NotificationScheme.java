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
 * NotificationScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link NotificationScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationScheme(Consumer<NotificationScheme> spec) {
        spec.accept(this);
    }

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


}
