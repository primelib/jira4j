package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.PermissionScheme;
import io.github.primelib.jira4j.restv3.model.PermissionSchemes;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllPermissionSchemesSpec
 * <p>
 * Specification for the GetAllPermissionSchemes operation.
 * <p>
 * Get all permission schemes
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllPermissionSchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:
     *  *
     * `all` Returns all expandable information.
     * *
     * `field` Returns information about the custom field granted the permission.
     * *
     * `group` Returns information about the group that is granted the permission.
     * *
     * `permissions` Returns all permission grants for each permission scheme.
     * *
     * `projectRole` Returns information about the project role granted the permission.
     * *
     * `user` Returns information about the user who is granted the permission.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetAllPermissionSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllPermissionSchemesOperationSpec(Consumer<GetAllPermissionSchemesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
