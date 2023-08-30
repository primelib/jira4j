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
 * CreatePermissionSchemeSpec
 * <p>
 * Specification for the CreatePermissionScheme operation.
 * <p>
 * Create permission scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePermissionSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The permission scheme to create.
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
     * Constructs a validated instance of {@link CreatePermissionSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatePermissionSchemeOperationSpec(Consumer<CreatePermissionSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreatePermissionSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param permissionScheme     The permission scheme to create.
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission.
     */
    @ApiStatus.Internal
    public CreatePermissionSchemeOperationSpec(PermissionScheme permissionScheme, String expand) {
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
        Objects.requireNonNull(permissionScheme, "permissionScheme is a required parameter!");
    }
}
