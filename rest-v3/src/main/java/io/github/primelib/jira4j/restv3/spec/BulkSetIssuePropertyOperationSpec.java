package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkIssuePropertyUpdateRequest;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * BulkSetIssuePropertySpec
 * <p>
 * Specification for the BulkSetIssueProperty operation.
 * <p>
 * Bulk set issue property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkSetIssuePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the property. The maximum length is 255 characters.
     */
    @NotNull 
    private String propertyKey;

    /**
     */
    @NotNull 
    private BulkIssuePropertyUpdateRequest bulkIssuePropertyUpdateRequest;

    /**
     * Constructs a validated implementation of {@link BulkSetIssuePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkSetIssuePropertyOperationSpec(Consumer<BulkSetIssuePropertyOperationSpec> spec) {
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
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
        Objects.requireNonNull(bulkIssuePropertyUpdateRequest, "bulkIssuePropertyUpdateRequest is a required parameter!");
    }

}
