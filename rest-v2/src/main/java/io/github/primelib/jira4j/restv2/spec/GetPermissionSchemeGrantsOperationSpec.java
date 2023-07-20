package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetPermissionSchemeGrantsSpec
 * <p>
 * Specification for the GetPermissionSchemeGrants operation.
 * <p>
 * Get permission scheme grants
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPermissionSchemeGrantsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the permission scheme.
     */
    @NotNull 
    private Long schemeId;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:
     *  *
     * `permissions` Returns all permission grants for each permission scheme.
     * *
     * `user` Returns information about the user who is granted the permission.
     * *
     * `group` Returns information about the group that is granted the permission.
     * *
     * `projectRole` Returns information about the project role granted the permission.
     * *
     * `field` Returns information about the custom field granted the permission.
     * *
     * `all` Returns all expandable information.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetPermissionSchemeGrantsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPermissionSchemeGrantsOperationSpec(Consumer<GetPermissionSchemeGrantsOperationSpec> spec) {
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
        Objects.requireNonNull(schemeId, "schemeId is a required parameter!");
    }

}
