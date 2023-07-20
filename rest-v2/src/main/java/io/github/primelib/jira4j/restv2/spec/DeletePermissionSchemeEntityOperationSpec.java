package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeletePermissionSchemeEntitySpec
 * <p>
 * Specification for the DeletePermissionSchemeEntity operation.
 * <p>
 * Delete permission scheme grant
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeletePermissionSchemeEntityOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the permission scheme to delete the permission grant from.
     */
    @NotNull 
    private Long schemeId;

    /**
     * The ID of the permission grant to delete.
     */
    @NotNull 
    private Long permissionId;

    /**
     * Constructs a validated implementation of {@link DeletePermissionSchemeEntityOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeletePermissionSchemeEntityOperationSpec(Consumer<DeletePermissionSchemeEntityOperationSpec> spec) {
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
        Objects.requireNonNull(permissionId, "permissionId is a required parameter!");
    }

}
