package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Version;
import io.github.primelib.jira4j.restv2.model.VersionMoveBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MoveVersionSpec
 * <p>
 * Specification for the MoveVersion operation.
 * <p>
 * Move version
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveVersionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the version to be moved.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private VersionMoveBean versionMoveBean;

    /**
     * Constructs a validated implementation of {@link MoveVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MoveVersionOperationSpec(Consumer<MoveVersionOperationSpec> spec) {
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
        Objects.requireNonNull(versionMoveBean, "versionMoveBean is a required parameter!");
    }

}
