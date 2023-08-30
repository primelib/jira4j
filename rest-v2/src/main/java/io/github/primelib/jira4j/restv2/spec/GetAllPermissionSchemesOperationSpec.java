package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import io.github.primelib.jira4j.restv2.model.PermissionSchemes;
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
 * GetAllPermissionSchemesSpec
 * <p>
 * Specification for the GetAllPermissionSchemes operation.
 * <p>
 * Get all permission schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetAllPermissionSchemesOperationSpec}.
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
     * Constructs a validated instance of {@link GetAllPermissionSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission.
     */
    @ApiStatus.Internal
    public GetAllPermissionSchemesOperationSpec(String expand) {
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
    }
}
