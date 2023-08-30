package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldOption;
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
 * DeleteCustomFieldOptionSpec
 * <p>
 * Specification for the DeleteCustomFieldOption operation.
 * <p>
 * Delete custom field options (context)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteCustomFieldOptionOperationSpec {
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
     * The ID of the context from which an option should be deleted.
     */
    @NotNull 
    private Long contextId;

    /**
     * The ID of the option to delete.
     */
    @NotNull 
    private Long optionId;

    /**
     * Constructs a validated instance of {@link DeleteCustomFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteCustomFieldOptionOperationSpec(Consumer<DeleteCustomFieldOptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteCustomFieldOptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param contextId            The ID of the context from which an option should be deleted.
     * @param optionId             The ID of the option to delete.
     */
    @ApiStatus.Internal
    public DeleteCustomFieldOptionOperationSpec(String fieldId, Long contextId, Long optionId) {
        this.fieldId = fieldId;
        this.contextId = contextId;
        this.optionId = optionId;

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
        Objects.requireNonNull(optionId, "optionId is a required parameter!");
    }
}