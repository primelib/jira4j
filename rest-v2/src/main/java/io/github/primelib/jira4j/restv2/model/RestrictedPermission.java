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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RestrictedPermission
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
    "id",
    "key"
})
@JsonTypeName("RestrictedPermission")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RestrictedPermission {

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
     * Constructs a validated instance of {@link RestrictedPermission}.
     *
     * @param spec the specification to process
     */
    public RestrictedPermission(Consumer<RestrictedPermission> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RestrictedPermission}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RestrictedPermission(Consumer)} instead.
     * @param id The ID of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     * @param key The key of the permission. Either {@code id} or {@code key} must be specified. Use [Get all permissions](#api-rest-api-2-permissions-get) to get the list of permissions.
     */
    @ApiStatus.Internal
    public RestrictedPermission(String id, String key) {
        this.id = id;
        this.key = key;
    }

}
