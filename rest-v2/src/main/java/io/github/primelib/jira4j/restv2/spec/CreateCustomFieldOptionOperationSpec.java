package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.BulkCustomFieldOptionCreateRequest;
import io.github.primelib.jira4j.restv2.model.CustomFieldOption;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * Constructs a validated implementation of {@link CreateCustomFieldOptionOperationSpec}.
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
