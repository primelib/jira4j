package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import io.github.primelib.jira4j.restv3.model.FieldConfigurationItemsDetails;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateFieldConfigurationItemsSpec
 * <p>
 * Specification for the UpdateFieldConfigurationItems operation.
 * <p>
 * Update field configuration items
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateFieldConfigurationItemsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the field configuration.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private FieldConfigurationItemsDetails fieldConfigurationItemsDetails;

    /**
     * Constructs a validated implementation of {@link UpdateFieldConfigurationItemsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateFieldConfigurationItemsOperationSpec(Consumer<UpdateFieldConfigurationItemsOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(fieldConfigurationItemsDetails, "fieldConfigurationItemsDetails is a required parameter!");
    }

}
