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
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SharePermissionRole
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
@JsonTypeName("SharePermission_role")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SharePermissionRole {

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

    /**
     * Constructs a validated instance of {@link SharePermissionRole}.
     *
     * @param spec the specification to process
     */
    public SharePermissionRole(Consumer<SharePermissionRole> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SharePermissionRole}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SharePermissionRole(Consumer)} instead.
     * @param actors The list of users who act in this role.
     * @param admin Whether this role is the admin role for the project.
     * @param currentUserRole Whether the calling user is part of this role.
     * @param _default Whether this role is the default role for the project
     * @param description The description of the project role.
     * @param id The ID of the project role.
     * @param name The name of the project role.
     * @param roleConfigurable Whether the roles are configurable for this project.
     * @param scope var.name
     * @param self The URL the project role details.
     * @param translatedName The translated name of the project role.
     */
    @ApiStatus.Internal
    public SharePermissionRole(List<RoleActor> actors, Boolean admin, Boolean currentUserRole, Boolean _default, String description, Long id, String name, Boolean roleConfigurable, ProjectRoleScope scope, URI self, String translatedName) {
        this.actors = actors;
        this.admin = admin;
        this.currentUserRole = currentUserRole;
        this._default = _default;
        this.description = description;
        this.id = id;
        this.name = name;
        this.roleConfigurable = roleConfigurable;
        this.scope = scope;
        this.self = self;
        this.translatedName = translatedName;
    }

}
