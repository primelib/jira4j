package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdatePermissionSchemeSpec
 * <p>
 * Specification for the UpdatePermissionScheme operation.
 * <p>
 * Update permission scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePermissionSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the permission scheme to update.
     */
    @NotNull 
    private Long schemeId;

    /**
     */
    @NotNull 
    private PermissionScheme permissionScheme;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:
     *  *
     * {@code all} Returns all expandable information.
     * *
     * {@code field} Returns information about the custom field granted the permission.
     * *
     * {@code group} Returns information about the group that is granted the permission.
     * *
     * {@code permissions} Returns all permission grants for each permission scheme.
     * *
     * {@code projectRole} Returns information about the project role granted the permission.
     * *
     * {@code user} Returns information about the user who is granted the permission.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link UpdatePermissionSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatePermissionSchemeOperationSpec(Consumer<UpdatePermissionSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdatePermissionSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the permission scheme to update.
     * @param permissionScheme     
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission.
     */
    @ApiStatus.Internal
    public UpdatePermissionSchemeOperationSpec(Long schemeId, PermissionScheme permissionScheme, String expand) {
        this.schemeId = schemeId;
        this.permissionScheme = permissionScheme;
        this.expand = expand;

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
        Objects.requireNonNull(permissionScheme, "permissionScheme is a required parameter!");
    }
}
