package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * DeletePermissionSchemeEntitySpec
 * <p>
 * Specification for the DeletePermissionSchemeEntity operation.
 * <p>
 * Delete permission scheme grant
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link DeletePermissionSchemeEntityOperationSpec}.
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
     * Constructs a validated instance of {@link DeletePermissionSchemeEntityOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the permission scheme to delete the permission grant from.
     * @param permissionId         The ID of the permission grant to delete.
     */
    @ApiStatus.Internal
    public DeletePermissionSchemeEntityOperationSpec(Long schemeId, Long permissionId) {
        this.schemeId = schemeId;
        this.permissionId = permissionId;

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
