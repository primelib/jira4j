package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Configuration;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateFieldConfigurationSchemeDetails;
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
 * CreateFieldConfigurationSchemeSpec
 * <p>
 * Specification for the CreateFieldConfigurationScheme operation.
 * <p>
 * Create field configuration scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link CreateFieldConfigurationSchemeOperationSpec}.
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
     * Constructs a validated instance of {@link CreateFieldConfigurationSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param updateFieldConfigurationSchemeDetails The details of the field configuration scheme.
     */
    @ApiStatus.Internal
    public CreateFieldConfigurationSchemeOperationSpec(UpdateFieldConfigurationSchemeDetails updateFieldConfigurationSchemeDetails) {
        this.updateFieldConfigurationSchemeDetails = updateFieldConfigurationSchemeDetails;

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
