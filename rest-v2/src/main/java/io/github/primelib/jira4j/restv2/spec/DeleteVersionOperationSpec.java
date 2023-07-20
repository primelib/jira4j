package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Version;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteVersionSpec
 * <p>
 * Specification for the DeleteVersion operation.
 * <p>
 * Delete version
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteVersionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the version.
     */
    @NotNull 
    private String id;

    /**
     * The ID of the version to update `fixVersion` to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     */
    @Nullable 
    private String moveFixIssuesTo;

    /**
     * The ID of the version to update `affectedVersion` to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     */
    @Nullable 
    private String moveAffectedIssuesTo;

    /**
     * Constructs a validated implementation of {@link DeleteVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteVersionOperationSpec(Consumer<DeleteVersionOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
