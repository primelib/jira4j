package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkCustomFieldOptionUpdateRequest;
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
 * UpdateCustomFieldOptionSpec
 * <p>
 * Specification for the UpdateCustomFieldOption operation.
 * <p>
 * Update custom field options (context)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldOptionOperationSpec {
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
    private BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldOptionOperationSpec(Consumer<UpdateCustomFieldOptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldOptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param contextId            The ID of the context.
     * @param bulkCustomFieldOptionUpdateRequest 
     */
    @ApiStatus.Internal
    public UpdateCustomFieldOptionOperationSpec(String fieldId, Long contextId, BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest) {
        this.fieldId = fieldId;
        this.contextId = contextId;
        this.bulkCustomFieldOptionUpdateRequest = bulkCustomFieldOptionUpdateRequest;

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
        Objects.requireNonNull(bulkCustomFieldOptionUpdateRequest, "bulkCustomFieldOptionUpdateRequest is a required parameter!");
    }
}
