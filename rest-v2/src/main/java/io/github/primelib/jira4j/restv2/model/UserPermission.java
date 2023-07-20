package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPermission
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "deprecatedKey",
    "description",
    "havePermission",
    "id",
    "key",
    "name",
    "type"
})
@JsonTypeName("UserPermission")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserPermission extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link UserPermission}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserPermission(Consumer<UserPermission> spec) {
        spec.accept(this);
    }

    /**
     * Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the `permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.`
     */
    @JsonProperty("deprecatedKey")
    protected Boolean deprecatedKey;

    /**
     * The description of the permission.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Whether the permission is available to the user in the queried context.
     */
    @JsonProperty("havePermission")
    protected Boolean havePermission;

    /**
     * The ID of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the permission.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The type of the permission.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of the permission.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("GLOBAL"),
        PROJECT("PROJECT");

        private final String value;
    }

}
