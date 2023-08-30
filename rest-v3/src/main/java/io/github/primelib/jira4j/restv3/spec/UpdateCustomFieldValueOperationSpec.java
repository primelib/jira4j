package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldValueUpdateDetails;
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
 * UpdateCustomFieldValueSpec
 * <p>
 * Specification for the UpdateCustomFieldValue operation.
 * <p>
 * Update custom field value
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldValueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the custom field. For example, {@code customfield_10010}.
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
    private Boolean generateChangelog;

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldValueOperationSpec}.
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
     * Constructs a validated instance of {@link UpdateCustomFieldValueOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldIdOrKey         The ID or key of the custom field. For example, {@code customfield_10010}.
     * @param customFieldValueUpdateDetails 
     * @param generateChangelog    Whether to generate a changelog for this update.
     */
    @ApiStatus.Internal
    public UpdateCustomFieldValueOperationSpec(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog) {
        this.fieldIdOrKey = fieldIdOrKey;
        this.customFieldValueUpdateDetails = customFieldValueUpdateDetails;
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
        Objects.requireNonNull(fieldIdOrKey, "fieldIdOrKey is a required parameter!");
        Objects.requireNonNull(customFieldValueUpdateDetails, "customFieldValueUpdateDetails is a required parameter!");
    }
}
