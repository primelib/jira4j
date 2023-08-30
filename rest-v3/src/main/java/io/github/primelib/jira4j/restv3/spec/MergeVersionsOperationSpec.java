package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Version;
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
 * MergeVersionsSpec
 * <p>
 * Specification for the MergeVersions operation.
 * <p>
 * Merge versions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MergeVersionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the version to delete.
     */
    @NotNull 
    private String id;

    /**
     * The ID of the version to merge into.
     */
    @NotNull 
    private String moveIssuesTo;

    /**
     * Constructs a validated instance of {@link MergeVersionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MergeVersionsOperationSpec(Consumer<MergeVersionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MergeVersionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the version to delete.
     * @param moveIssuesTo         The ID of the version to merge into.
     */
    @ApiStatus.Internal
    public MergeVersionsOperationSpec(String id, String moveIssuesTo) {
        this.id = id;
        this.moveIssuesTo = moveIssuesTo;

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
        Objects.requireNonNull(moveIssuesTo, "moveIssuesTo is a required parameter!");
    }
}
