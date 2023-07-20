package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.DeleteAndReplaceVersionBean;
import io.github.primelib.jira4j.restv2.model.Version;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteAndReplaceVersionSpec
 * <p>
 * Specification for the DeleteAndReplaceVersion operation.
 * <p>
 * Delete and replace version
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAndReplaceVersionOperationSpec {
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
     */
    @NotNull 
    private DeleteAndReplaceVersionBean deleteAndReplaceVersionBean;

    /**
     * Constructs a validated implementation of {@link DeleteAndReplaceVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAndReplaceVersionOperationSpec(Consumer<DeleteAndReplaceVersionOperationSpec> spec) {
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
        Objects.requireNonNull(deleteAndReplaceVersionBean, "deleteAndReplaceVersionBean is a required parameter!");
    }

}
