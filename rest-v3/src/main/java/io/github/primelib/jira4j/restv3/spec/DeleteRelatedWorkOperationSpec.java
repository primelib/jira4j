package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * DeleteRelatedWorkSpec
 * <p>
 * Specification for the DeleteRelatedWork operation.
 * <p>
 * Delete related work
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteRelatedWorkOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the version that the target related work belongs to.
     */
    @NotNull 
    private String versionId;

    /**
     * The ID of the related work to delete.
     */
    @NotNull 
    private String relatedWorkId;

    /**
     * Constructs a validated instance of {@link DeleteRelatedWorkOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteRelatedWorkOperationSpec(Consumer<DeleteRelatedWorkOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteRelatedWorkOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param versionId            The ID of the version that the target related work belongs to.
     * @param relatedWorkId        The ID of the related work to delete.
     */
    @ApiStatus.Internal
    public DeleteRelatedWorkOperationSpec(String versionId, String relatedWorkId) {
        this.versionId = versionId;
        this.relatedWorkId = relatedWorkId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(versionId, "versionId is a required parameter!");
        Objects.requireNonNull(relatedWorkId, "relatedWorkId is a required parameter!");
    }
}
