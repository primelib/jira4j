package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.CustomFieldContextDefaultValueUpdate;
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
 * SetDefaultValuesSpec
 * <p>
 * Specification for the SetDefaultValues operation.
 * <p>
 * Set custom field contexts default values
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultValuesOperationSpec {
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
     */
    @NotNull 
    private CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate;

    /**
     * Constructs a validated instance of {@link SetDefaultValuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultValuesOperationSpec(Consumer<SetDefaultValuesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetDefaultValuesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param customFieldContextDefaultValueUpdate 
     */
    @ApiStatus.Internal
    public SetDefaultValuesOperationSpec(String fieldId, CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate) {
        this.fieldId = fieldId;
        this.customFieldContextDefaultValueUpdate = customFieldContextDefaultValueUpdate;

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
        Objects.requireNonNull(customFieldContextDefaultValueUpdate, "customFieldContextDefaultValueUpdate is a required parameter!");
    }
}
