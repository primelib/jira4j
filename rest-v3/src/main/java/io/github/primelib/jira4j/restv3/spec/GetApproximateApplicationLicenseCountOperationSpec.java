package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.License;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetApproximateApplicationLicenseCountSpec
 * <p>
 * Specification for the GetApproximateApplicationLicenseCount operation.
 * <p>
 * Get approximate application license count
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetApproximateApplicationLicenseCountOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the application, represents a specific version of Jira.
     */
    @NotNull 
    private String applicationKey;

    /**
     * Constructs a validated implementation of {@link GetApproximateApplicationLicenseCountOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetApproximateApplicationLicenseCountOperationSpec(Consumer<GetApproximateApplicationLicenseCountOperationSpec> spec) {
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
        Objects.requireNonNull(applicationKey, "applicationKey is a required parameter!");
    }

}
