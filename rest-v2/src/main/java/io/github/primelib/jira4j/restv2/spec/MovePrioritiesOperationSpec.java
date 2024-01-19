package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ReorderIssuePriorities;
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
 * MovePrioritiesSpec
 * <p>
 * Specification for the MovePriorities operation.
 * <p>
 * Move priorities
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MovePrioritiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ReorderIssuePriorities reorderIssuePriorities;

    /**
     * Constructs a validated instance of {@link MovePrioritiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MovePrioritiesOperationSpec(Consumer<MovePrioritiesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MovePrioritiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param reorderIssuePriorities 
     */
    @ApiStatus.Internal
    public MovePrioritiesOperationSpec(ReorderIssuePriorities reorderIssuePriorities) {
        this.reorderIssuePriorities = reorderIssuePriorities;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(reorderIssuePriorities, "reorderIssuePriorities is a required parameter!");
    }
}
