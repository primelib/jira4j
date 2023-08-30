package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkCustomFieldOptionCreateRequest;
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
 * CreateCustomFieldOptionSpec
 * <p>
 * Specification for the CreateCustomFieldOption operation.
 * <p>
 * Create custom field options (context)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldOptionOperationSpec {
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
    private BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest;

    /**
     * Constructs a validated instance of {@link CreateCustomFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomFieldOptionOperationSpec(Consumer<CreateCustomFieldOptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateCustomFieldOptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param contextId            The ID of the context.
     * @param bulkCustomFieldOptionCreateRequest 
     */
    @ApiStatus.Internal
    public CreateCustomFieldOptionOperationSpec(String fieldId, Long contextId, BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest) {
        this.fieldId = fieldId;
        this.contextId = contextId;
        this.bulkCustomFieldOptionCreateRequest = bulkCustomFieldOptionCreateRequest;

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
        Objects.requireNonNull(bulkCustomFieldOptionCreateRequest, "bulkCustomFieldOptionCreateRequest is a required parameter!");
    }
}
