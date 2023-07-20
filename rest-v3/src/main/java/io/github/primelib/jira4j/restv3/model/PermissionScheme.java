package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class PermissionScheme extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link PermissionScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PermissionScheme(Consumer<PermissionScheme> spec) {
        spec.accept(this);
    }

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
    protected PermissionSchemeScope scope;

    /**
     * The URL of the permission scheme.
     */
    @JsonProperty("self")
    protected URI self;


}
