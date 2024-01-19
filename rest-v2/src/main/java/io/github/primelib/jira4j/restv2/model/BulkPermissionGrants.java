package io.github.primelib.jira4j.restv2.model;

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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkPermissionGrants
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
    "globalPermissions",
    "projectPermissions"
})
@JsonTypeName("BulkPermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkPermissionGrants {

    /**
     * List of permissions granted to the user.
     */
    @JsonProperty("globalPermissions")
    protected Set<String> globalPermissions;

    /**
     * List of project permissions and the projects and issues those permissions provide access to.
     */
    @JsonProperty("projectPermissions")
    protected Set<BulkProjectPermissionGrants> projectPermissions;

    /**
     * Constructs a validated instance of {@link BulkPermissionGrants}.
     *
     * @param spec the specification to process
     */
    public BulkPermissionGrants(Consumer<BulkPermissionGrants> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkPermissionGrants}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkPermissionGrants(Consumer)} instead.
     * @param globalPermissions List of permissions granted to the user.
     * @param projectPermissions List of project permissions and the projects and issues those permissions provide access to.
     */
    @ApiStatus.Internal
    public BulkPermissionGrants(Set<String> globalPermissions, Set<BulkProjectPermissionGrants> projectPermissions) {
        this.globalPermissions = globalPermissions;
        this.projectPermissions = projectPermissions;
    }

}
