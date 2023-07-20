package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionGrant
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "holder",
    "id",
    "permission",
    "self"
})
@JsonTypeName("PermissionGrant")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionGrant {

    /**
     * Constructs a validated implementation of {@link PermissionGrant}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PermissionGrant(Consumer<PermissionGrant> spec) {
        spec.accept(this);
    }

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


}
