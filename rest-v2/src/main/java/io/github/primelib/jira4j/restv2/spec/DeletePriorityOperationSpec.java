package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Priority;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeletePrioritySpec
 * <p>
 * Specification for the DeletePriority operation.
 * <p>
 * Delete priority
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeletePriorityOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue priority.
     */
    @NotNull 
    private String id;

    /**
     * The ID of the issue priority that will replace the currently selected resolution.
     */
    @NotNull 
    private String replaceWith;

    /**
     * Constructs a validated implementation of {@link DeletePriorityOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeletePriorityOperationSpec(Consumer<DeletePriorityOperationSpec> spec) {
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
        Objects.requireNonNull(replaceWith, "replaceWith is a required parameter!");
    }

}
