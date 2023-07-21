package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.ChangeFilterOwner;
import io.github.primelib.jira4j.restv3.model.Filter;
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
 * ChangeFilterOwnerSpec
 * <p>
 * Specification for the ChangeFilterOwner operation.
 * <p>
 * Change filter owner
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeFilterOwnerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the filter to update.
     */
    @NotNull 
    private Long id;

    /**
     * The account ID of the new owner of the filter.
     */
    @NotNull 
    private ChangeFilterOwner changeFilterOwner;

    /**
     * Constructs a validated instance of {@link ChangeFilterOwnerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeFilterOwnerOperationSpec(Consumer<ChangeFilterOwnerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ChangeFilterOwnerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the filter to update.
     * @param changeFilterOwner    The account ID of the new owner of the filter.
     */
    @ApiStatus.Internal
    public ChangeFilterOwnerOperationSpec(Long id, ChangeFilterOwner changeFilterOwner) {
        this.id = id;
        this.changeFilterOwner = changeFilterOwner;

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
        Objects.requireNonNull(changeFilterOwner, "changeFilterOwner is a required parameter!");
    }
}
