package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AddonPropertiesResourceGetAddonPropertyGetSpec
 * <p>
 * Specification for the AddonPropertiesResourceGetAddonPropertyGet operation.
 * <p>
 * Get app property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddonPropertiesResourceGetAddonPropertyGetOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the app, as defined in its descriptor.
     */
    @NotNull 
    private String addonKey;

    /**
     * The key of the property.
     */
    @NotNull 
    private String propertyKey;

    /**
     * Constructs a validated implementation of {@link AddonPropertiesResourceGetAddonPropertyGetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddonPropertiesResourceGetAddonPropertyGetOperationSpec(Consumer<AddonPropertiesResourceGetAddonPropertyGetOperationSpec> spec) {
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
        Objects.requireNonNull(addonKey, "addonKey is a required parameter!");
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
    }

}
