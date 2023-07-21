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
 * AddonPropertiesResourceGetAddonPropertiesGetSpec
 * <p>
 * Specification for the AddonPropertiesResourceGetAddonPropertiesGet operation.
 * <p>
 * Get app properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddonPropertiesResourceGetAddonPropertiesGetOperationSpec {
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
     * Constructs a validated instance of {@link AddonPropertiesResourceGetAddonPropertiesGetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddonPropertiesResourceGetAddonPropertiesGetOperationSpec(Consumer<AddonPropertiesResourceGetAddonPropertiesGetOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddonPropertiesResourceGetAddonPropertiesGetOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param addonKey             The key of the app, as defined in its descriptor.
     */
    @ApiStatus.Internal
    public AddonPropertiesResourceGetAddonPropertiesGetOperationSpec(String addonKey) {
        this.addonKey = addonKey;

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
    }
}
