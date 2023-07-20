package io.github.primelib.jira4j.restv2.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
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
 * Permissions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "permissions"
})
@JsonTypeName("Permissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Permissions {

    /**
     * Constructs a validated implementation of {@link Permissions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Permissions(Consumer<Permissions> spec) {
        spec.accept(this);
    }

    /**
     * List of permissions.
     */
    @JsonProperty("permissions")
    protected Map<String, UserPermission> permissions = new HashMap<>();


}
