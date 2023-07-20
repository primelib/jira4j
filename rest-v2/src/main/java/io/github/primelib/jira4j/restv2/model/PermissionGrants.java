package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionGrants
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "permissions"
})
@JsonTypeName("PermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionGrants {

    /**
     * Constructs a validated implementation of {@link PermissionGrants}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PermissionGrants(Consumer<PermissionGrants> spec) {
        spec.accept(this);
    }

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


}
