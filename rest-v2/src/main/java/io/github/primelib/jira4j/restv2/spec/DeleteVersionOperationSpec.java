package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.Version;
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
 * DeleteVersionSpec
 * <p>
 * Specification for the DeleteVersion operation.
 * <p>
 * Delete version
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * The ID of the version to update {@code fixVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     */
    @Nullable 
    private String moveFixIssuesTo;

    /**
     * The ID of the version to update {@code affectedVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     */
    @Nullable 
    private String moveAffectedIssuesTo;

    /**
     * Constructs a validated instance of {@link DeleteVersionOperationSpec}.
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
     * Constructs a validated instance of {@link DeleteVersionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the version.
     * @param moveFixIssuesTo      The ID of the version to update {@code fixVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     * @param moveAffectedIssuesTo The ID of the version to update {@code affectedVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     */
    @ApiStatus.Internal
    public DeleteVersionOperationSpec(String id, String moveFixIssuesTo, String moveAffectedIssuesTo) {
        this.id = id;
        this.moveFixIssuesTo = moveFixIssuesTo;
        this.moveAffectedIssuesTo = moveAffectedIssuesTo;

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
