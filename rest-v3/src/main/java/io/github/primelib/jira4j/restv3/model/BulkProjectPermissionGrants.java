package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkProjectPermissionGrants
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issues",
    "permission",
    "projects"
})
@JsonTypeName("BulkProjectPermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkProjectPermissionGrants {

    /**
     * Constructs a validated implementation of {@link BulkProjectPermissionGrants}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkProjectPermissionGrants(Consumer<BulkProjectPermissionGrants> spec) {
        spec.accept(this);
    }

    /**
     * IDs of the issues the user has the permission for.
     */
    @JsonProperty("issues")
    protected Set<Long> issues = new LinkedHashSet<>();

    /**
     * A project permission,
     */
    @JsonProperty("permission")
    protected String permission;

    /**
     * IDs of the projects the user has the permission for.
     */
    @JsonProperty("projects")
    protected Set<Long> projects = new LinkedHashSet<>();


}
