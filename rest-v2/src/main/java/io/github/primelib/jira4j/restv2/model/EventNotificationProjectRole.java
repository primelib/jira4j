package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventNotificationProjectRole
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "actors",
    "admin",
    "currentUserRole",
    "default",
    "description",
    "id",
    "name",
    "roleConfigurable",
    "scope",
    "self",
    "translatedName"
})
@JsonTypeName("EventNotification_projectRole")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventNotificationProjectRole {

    /**
     * Constructs a validated implementation of {@link EventNotificationProjectRole}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventNotificationProjectRole(Consumer<EventNotificationProjectRole> spec) {
        spec.accept(this);
    }

    /**
     * The list of users who act in this role.
     */
    @JsonProperty("actors")
    protected List<RoleActor> actors;

    /**
     * Whether this role is the admin role for the project.
     */
    @JsonProperty("admin")
    protected Boolean admin;

    /**
     * Whether the calling user is part of this role.
     */
    @JsonProperty("currentUserRole")
    protected Boolean currentUserRole;

    /**
     * Whether this role is the default role for the project
     */
    @JsonProperty("default")
    protected Boolean _default;

    /**
     * The description of the project role.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the project role.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the project role.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Whether the roles are configurable for this project.
     */
    @JsonProperty("roleConfigurable")
    protected Boolean roleConfigurable;

    @JsonProperty("scope")
    protected ProjectRoleScope scope;

    /**
     * The URL the project role details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The translated name of the project role.
     */
    @JsonProperty("translatedName")
    protected String translatedName;


}
