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

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionScheme
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
    "permissions",
    "scope",
    "self"
})
@JsonTypeName("PermissionScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionScheme {

    /**
     * A description for the permission scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The expand options available for the permission scheme.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The ID of the permission scheme.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the permission scheme. Must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
     */
    @JsonProperty("permissions")
    protected List<PermissionGrant> permissions;

    @JsonProperty("scope")
    protected Scope scope;

    /**
     * The URL of the permission scheme.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link PermissionScheme}.
     *
     * @param spec the specification to process
     */
    public PermissionScheme(Consumer<PermissionScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionScheme(Consumer)} instead.
     * @param description A description for the permission scheme.
     * @param expand The expand options available for the permission scheme.
     * @param id The ID of the permission scheme.
     * @param name The name of the permission scheme. Must be unique.
     * @param permissions The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
     * @param scope scope
     * @param self The URL of the permission scheme.
     */
    @ApiStatus.Internal
    public PermissionScheme(String description, String expand, Long id, String name, List<PermissionGrant> permissions, Scope scope, URI self) {
        this.description = description;
        this.expand = expand;
        this.id = id;
        this.name = name;
        this.permissions = permissions;
        this.scope = scope;
        this.self = self;
    }

}
