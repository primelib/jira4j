package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.PermissionScheme;
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
 * GetPermissionSchemeGrantsSpec
 * <p>
 * Specification for the GetPermissionSchemeGrants operation.
 * <p>
 * Get permission scheme grants
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code permissions} Returns all permission grants for each permission scheme.
     * *
     * {@code user} Returns information about the user who is granted the permission.
     * *
     * {@code group} Returns information about the group that is granted the permission.
     * *
     * {@code projectRole} Returns information about the project role granted the permission.
     * *
     * {@code field} Returns information about the custom field granted the permission.
     * *
     * {@code all} Returns all expandable information.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetPermissionSchemeGrantsOperationSpec}.
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
     * Constructs a validated instance of {@link GetPermissionSchemeGrantsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the permission scheme.
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code user} Returns information about the user who is granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code all} Returns all expandable information.
     */
    @ApiStatus.Internal
    public GetPermissionSchemeGrantsOperationSpec(Long schemeId, String expand) {
        this.schemeId = schemeId;
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
    }
}
