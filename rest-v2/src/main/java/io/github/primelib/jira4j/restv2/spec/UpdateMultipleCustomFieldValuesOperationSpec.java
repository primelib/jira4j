package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.MultipleCustomFieldValuesUpdateDetails;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateMultipleCustomFieldValuesSpec
 * <p>
 * Specification for the UpdateMultipleCustomFieldValues operation.
 * <p>
 * Update custom fields
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateMultipleCustomFieldValuesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails;

    /**
     * Whether to generate a changelog for this update.
     */
    @Nullable 
    private Boolean generateChangelog = true;

    /**
     * Constructs a validated implementation of {@link UpdateMultipleCustomFieldValuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateMultipleCustomFieldValuesOperationSpec(Consumer<UpdateMultipleCustomFieldValuesOperationSpec> spec) {
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
        Objects.requireNonNull(multipleCustomFieldValuesUpdateDetails, "multipleCustomFieldValuesUpdateDetails is a required parameter!");
    }

}
