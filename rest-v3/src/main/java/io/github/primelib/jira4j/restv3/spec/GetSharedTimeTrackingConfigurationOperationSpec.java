package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.TimeTrackingConfiguration;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetSharedTimeTrackingConfigurationSpec
 * <p>
 * Specification for the GetSharedTimeTrackingConfiguration operation.
 * <p>
 * Get time tracking settings
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSharedTimeTrackingConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Constructs a validated implementation of {@link GetSharedTimeTrackingConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSharedTimeTrackingConfigurationOperationSpec(Consumer<GetSharedTimeTrackingConfigurationOperationSpec> spec) {
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
