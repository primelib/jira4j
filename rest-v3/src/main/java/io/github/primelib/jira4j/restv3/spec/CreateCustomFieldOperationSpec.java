package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CustomFieldDefinitionJsonBean;
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
 * CreateCustomFieldSpec
 * <p>
 * Specification for the CreateCustomField operation.
 * <p>
 * Create custom field
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Definition of the custom field to be created
     */
    @NotNull 
    private CustomFieldDefinitionJsonBean customFieldDefinitionJsonBean;

    /**
     * Constructs a validated instance of {@link CreateCustomFieldOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomFieldOperationSpec(Consumer<CreateCustomFieldOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateCustomFieldOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customFieldDefinitionJsonBean Definition of the custom field to be created
     */
    @ApiStatus.Internal
    public CreateCustomFieldOperationSpec(CustomFieldDefinitionJsonBean customFieldDefinitionJsonBean) {
        this.customFieldDefinitionJsonBean = customFieldDefinitionJsonBean;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(customFieldDefinitionJsonBean, "customFieldDefinitionJsonBean is a required parameter!");
    }
}
