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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPermission
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
public class UserPermission {

    /**
     * Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the {@code permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.}
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
     * The ID of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
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
     * Constructs a validated instance of {@link UserPermission}.
     *
     * @param spec the specification to process
     */
    public UserPermission(Consumer<UserPermission> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserPermission}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserPermission(Consumer)} instead.
     * @param deprecatedKey Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the {@code permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.}
     * @param description The description of the permission.
     * @param havePermission Whether the permission is available to the user in the queried context.
     * @param id The ID of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     * @param key The key of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     * @param name The name of the permission.
     * @param type The type of the permission.
     */
    @ApiStatus.Internal
    public UserPermission(Boolean deprecatedKey, String description, Boolean havePermission, String id, String key, String name, TypeEnum type) {
        this.deprecatedKey = deprecatedKey;
        this.description = description;
        this.havePermission = havePermission;
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
    }

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
