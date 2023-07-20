package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AddonPropertiesResourcePutAppPropertyPutSpec
 * <p>
 * Specification for the AddonPropertiesResourcePutAppPropertyPut operation.
 * <p>
 * Set app property (Forge)
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddonPropertiesResourcePutAppPropertyPutOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the property.
     */
    @NotNull 
    private String propertyKey;

    /**
     */
    @NotNull 
    private Object body;

    /**
     * Constructs a validated implementation of {@link AddonPropertiesResourcePutAppPropertyPutOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddonPropertiesResourcePutAppPropertyPutOperationSpec(Consumer<AddonPropertiesResourcePutAppPropertyPutOperationSpec> spec) {
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
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}
