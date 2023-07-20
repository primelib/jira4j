package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.CustomFieldContextUpdateDetails;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateCustomFieldContextSpec
 * <p>
 * Specification for the UpdateCustomFieldContext operation.
 * <p>
 * Update custom field context
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldContextOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom field.
     */
    @NotNull 
    private String fieldId;

    /**
     * The ID of the context.
     */
    @NotNull 
    private Long contextId;

    /**
     */
    @NotNull 
    private CustomFieldContextUpdateDetails customFieldContextUpdateDetails;

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldContextOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldContextOperationSpec(Consumer<UpdateCustomFieldContextOperationSpec> spec) {
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
        Objects.requireNonNull(fieldId, "fieldId is a required parameter!");
        Objects.requireNonNull(contextId, "contextId is a required parameter!");
        Objects.requireNonNull(customFieldContextUpdateDetails, "customFieldContextUpdateDetails is a required parameter!");
    }

}
