package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.MultipleCustomFieldValuesUpdateDetails;
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
 * UpdateMultipleCustomFieldValuesSpec
 * <p>
 * Specification for the UpdateMultipleCustomFieldValues operation.
 * <p>
 * Update custom fields
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Boolean generateChangelog;

    /**
     * Constructs a validated instance of {@link UpdateMultipleCustomFieldValuesOperationSpec}.
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
     * Constructs a validated instance of {@link UpdateMultipleCustomFieldValuesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param multipleCustomFieldValuesUpdateDetails 
     * @param generateChangelog    Whether to generate a changelog for this update.
     */
    @ApiStatus.Internal
    public UpdateMultipleCustomFieldValuesOperationSpec(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog) {
        this.multipleCustomFieldValuesUpdateDetails = multipleCustomFieldValuesUpdateDetails;
        this.generateChangelog = generateChangelog;

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
