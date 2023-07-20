package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldConfigurations;
import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateCustomFieldConfigurationSpec
 * <p>
 * Specification for the UpdateCustomFieldConfiguration operation.
 * <p>
 * Update custom field configurations
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the custom field, for example `customfield_10000`.
     */
    @NotNull 
    private String fieldIdOrKey;

    /**
     */
    @NotNull 
    private CustomFieldConfigurations customFieldConfigurations;

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldConfigurationOperationSpec(Consumer<UpdateCustomFieldConfigurationOperationSpec> spec) {
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
        Objects.requireNonNull(fieldIdOrKey, "fieldIdOrKey is a required parameter!");
        Objects.requireNonNull(customFieldConfigurations, "customFieldConfigurations is a required parameter!");
    }

}
