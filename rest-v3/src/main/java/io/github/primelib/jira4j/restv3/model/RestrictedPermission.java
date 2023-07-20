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

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RestrictedPermission
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "id",
    "key"
})
@JsonTypeName("RestrictedPermission")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RestrictedPermission extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link RestrictedPermission}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RestrictedPermission(Consumer<RestrictedPermission> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
     */
    @JsonProperty("key")
    protected String key;


}
