package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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
 * BulkPermissionGrants
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "globalPermissions",
    "projectPermissions"
})
@JsonTypeName("BulkPermissionGrants")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkPermissionGrants {

    /**
     * Constructs a validated implementation of {@link BulkPermissionGrants}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkPermissionGrants(Consumer<BulkPermissionGrants> spec) {
        spec.accept(this);
    }

    /**
     * List of permissions granted to the user.
     */
    @JsonProperty("globalPermissions")
    protected Set<String> globalPermissions = new LinkedHashSet<>();

    /**
     * List of project permissions and the projects and issues those permissions provide access to.
     */
    @JsonProperty("projectPermissions")
    protected Set<BulkProjectPermissionGrants> projectPermissions = new LinkedHashSet<>();


}
