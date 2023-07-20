package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DynamicModulesResourceRemoveModulesDeleteSpec
 * <p>
 * Specification for the DynamicModulesResourceRemoveModulesDelete operation.
 * <p>
 * Remove modules
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicModulesResourceRemoveModulesDeleteOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, `moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field`. Nonexistent keys are ignored.
     */
    @Nullable 
    private List<String> moduleKey;

    /**
     * Constructs a validated implementation of {@link DynamicModulesResourceRemoveModulesDeleteOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DynamicModulesResourceRemoveModulesDeleteOperationSpec(Consumer<DynamicModulesResourceRemoveModulesDeleteOperationSpec> spec) {
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
    }

}
