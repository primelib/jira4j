package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.CustomFieldContextUpdateDetails;
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
 * UpdateCustomFieldContextSpec
 * <p>
 * Specification for the UpdateCustomFieldContext operation.
 * <p>
 * Update custom field context
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link UpdateCustomFieldContextOperationSpec}.
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
     * Constructs a validated instance of {@link UpdateCustomFieldContextOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param contextId            The ID of the context.
     * @param customFieldContextUpdateDetails 
     */
    @ApiStatus.Internal
    public UpdateCustomFieldContextOperationSpec(String fieldId, Long contextId, CustomFieldContextUpdateDetails customFieldContextUpdateDetails) {
        this.fieldId = fieldId;
        this.contextId = contextId;
        this.customFieldContextUpdateDetails = customFieldContextUpdateDetails;

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
