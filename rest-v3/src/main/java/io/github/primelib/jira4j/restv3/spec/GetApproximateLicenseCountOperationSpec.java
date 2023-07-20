package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.License;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetApproximateLicenseCountSpec
 * <p>
 * Specification for the GetApproximateLicenseCount operation.
 * <p>
 * Get approximate license count
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetApproximateLicenseCountOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Constructs a validated implementation of {@link GetApproximateLicenseCountOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetApproximateLicenseCountOperationSpec(Consumer<GetApproximateLicenseCountOperationSpec> spec) {
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
