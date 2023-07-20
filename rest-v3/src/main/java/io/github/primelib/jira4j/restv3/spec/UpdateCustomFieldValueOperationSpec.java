package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldValueUpdateDetails;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateCustomFieldValueSpec
 * <p>
 * Specification for the UpdateCustomFieldValue operation.
 * <p>
 * Update custom field value
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldValueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the custom field. For example, `customfield_10010`.
     */
    @NotNull 
    private String fieldIdOrKey;

    /**
     */
    @NotNull 
    private CustomFieldValueUpdateDetails customFieldValueUpdateDetails;

    /**
     * Whether to generate a changelog for this update.
     */
    @Nullable 
    private Boolean generateChangelog = true;

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldValueOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldValueOperationSpec(Consumer<UpdateCustomFieldValueOperationSpec> spec) {
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
        Objects.requireNonNull(customFieldValueUpdateDetails, "customFieldValueUpdateDetails is a required parameter!");
    }

}
