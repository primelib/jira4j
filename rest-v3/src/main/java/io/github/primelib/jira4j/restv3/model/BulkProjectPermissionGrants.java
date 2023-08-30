package io.github.primelib.jira4j.restv3.model;

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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkProjectPermissionGrants
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
    "issues",
    "permission",
    "projects"
})
@JsonTypeName("BulkProjectPermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkProjectPermissionGrants {

    /**
     * IDs of the issues the user has the permission for.
     */
    @JsonProperty("issues")
    protected Set<Long> issues;

    /**
     * A project permission,
     */
    @JsonProperty("permission")
    protected String permission;

    /**
     * IDs of the projects the user has the permission for.
     */
    @JsonProperty("projects")
    protected Set<Long> projects;

    /**
     * Constructs a validated instance of {@link BulkProjectPermissionGrants}.
     *
     * @param spec the specification to process
     */
    public BulkProjectPermissionGrants(Consumer<BulkProjectPermissionGrants> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkProjectPermissionGrants}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkProjectPermissionGrants(Consumer)} instead.
     * @param issues IDs of the issues the user has the permission for.
     * @param permission A project permission,
     * @param projects IDs of the projects the user has the permission for.
     */
    @ApiStatus.Internal
    public BulkProjectPermissionGrants(Set<Long> issues, String permission, Set<Long> projects) {
        this.issues = issues;
        this.permission = permission;
        this.projects = projects;
    }

}
