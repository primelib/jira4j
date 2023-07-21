package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldOption;
import io.github.primelib.jira4j.restv3.model.OrderOfCustomFieldOptions;
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
 * ReorderCustomFieldOptionsSpec
 * <p>
 * Specification for the ReorderCustomFieldOptions operation.
 * <p>
 * Reorder custom field options (context)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReorderCustomFieldOptionsOperationSpec {
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
    private OrderOfCustomFieldOptions orderOfCustomFieldOptions;

    /**
     * Constructs a validated instance of {@link ReorderCustomFieldOptionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReorderCustomFieldOptionsOperationSpec(Consumer<ReorderCustomFieldOptionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReorderCustomFieldOptionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param contextId            The ID of the context.
     * @param orderOfCustomFieldOptions 
     */
    @ApiStatus.Internal
    public ReorderCustomFieldOptionsOperationSpec(String fieldId, Long contextId, OrderOfCustomFieldOptions orderOfCustomFieldOptions) {
        this.fieldId = fieldId;
        this.contextId = contextId;
        this.orderOfCustomFieldOptions = orderOfCustomFieldOptions;

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
        Objects.requireNonNull(orderOfCustomFieldOptions, "orderOfCustomFieldOptions is a required parameter!");
    }
}
