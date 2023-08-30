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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionGrants
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
    "expand",
    "permissions"
})
@JsonTypeName("PermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionGrants {

    /**
     * Expand options that include additional permission grant details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * Permission grants list.
     */
    @JsonProperty("permissions")
    protected List<PermissionGrant> permissions;

    /**
     * Constructs a validated instance of {@link PermissionGrants}.
     *
     * @param spec the specification to process
     */
    public PermissionGrants(Consumer<PermissionGrants> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionGrants}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionGrants(Consumer)} instead.
     * @param expand Expand options that include additional permission grant details in the response.
     * @param permissions Permission grants list.
     */
    @ApiStatus.Internal
    public PermissionGrants(String expand, List<PermissionGrant> permissions) {
        this.expand = expand;
        this.permissions = permissions;
    }

}
