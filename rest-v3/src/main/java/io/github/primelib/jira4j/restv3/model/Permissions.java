package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Permissions
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
    "permissions"
})
@JsonTypeName("Permissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Permissions {

    /**
     * List of permissions.
     */
    @JsonProperty("permissions")
    protected Map<String, UserPermission> permissions;

    /**
     * Constructs a validated instance of {@link Permissions}.
     *
     * @param spec the specification to process
     */
    public Permissions(Consumer<Permissions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Permissions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Permissions(Consumer)} instead.
     * @param permissions List of permissions.
     */
    @ApiStatus.Internal
    public Permissions(Map<String, UserPermission> permissions) {
        this.permissions = permissions;
    }

}
