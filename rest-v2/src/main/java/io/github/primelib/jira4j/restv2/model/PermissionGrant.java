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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionGrant
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
    "holder",
    "id",
    "permission",
    "self"
})
@JsonTypeName("PermissionGrant")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionGrant {

    @JsonProperty("holder")
    protected PermissionGrantHolder holder;

    /**
     * The ID of the permission granted details.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](../api-group-permission-schemes/#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions.
     */
    @JsonProperty("permission")
    protected String permission;

    /**
     * The URL of the permission granted details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link PermissionGrant}.
     *
     * @param spec the specification to process
     */
    public PermissionGrant(Consumer<PermissionGrant> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionGrant}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionGrant(Consumer)} instead.
     * @param holder holder
     * @param id The ID of the permission granted details.
     * @param permission The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](../api-group-permission-schemes/#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions.
     * @param self The URL of the permission granted details.
     */
    @ApiStatus.Internal
    public PermissionGrant(PermissionGrantHolder holder, Long id, String permission, URI self) {
        this.holder = holder;
        this.id = id;
        this.permission = permission;
        this.self = self;
    }

}
