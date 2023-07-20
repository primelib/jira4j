package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import io.github.primelib.jira4j.restv3.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv3.model.UpdateFieldConfigurationSchemeDetails;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateFieldConfigurationSchemeSpec
 * <p>
 * Specification for the CreateFieldConfigurationScheme operation.
 * <p>
 * Create field configuration scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateFieldConfigurationSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The details of the field configuration scheme.
     */
    @NotNull 
    private UpdateFieldConfigurationSchemeDetails updateFieldConfigurationSchemeDetails;

    /**
     * Constructs a validated implementation of {@link CreateFieldConfigurationSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateFieldConfigurationSchemeOperationSpec(Consumer<CreateFieldConfigurationSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(updateFieldConfigurationSchemeDetails, "updateFieldConfigurationSchemeDetails is a required parameter!");
    }

}
