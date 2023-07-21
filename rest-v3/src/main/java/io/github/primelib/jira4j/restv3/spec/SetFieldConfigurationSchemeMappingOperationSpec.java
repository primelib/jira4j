package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.AssociateFieldConfigurationsWithIssueTypesRequest;
import io.github.primelib.jira4j.restv3.model.Configuration;
import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import io.github.primelib.jira4j.restv3.model.FieldConfigurationScheme;
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
 * SetFieldConfigurationSchemeMappingSpec
 * <p>
 * Specification for the SetFieldConfigurationSchemeMapping operation.
 * <p>
 * Assign issue types to field configurations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetFieldConfigurationSchemeMappingOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the field configuration scheme.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest;

    /**
     * Constructs a validated instance of {@link SetFieldConfigurationSchemeMappingOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetFieldConfigurationSchemeMappingOperationSpec(Consumer<SetFieldConfigurationSchemeMappingOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetFieldConfigurationSchemeMappingOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the field configuration scheme.
     * @param associateFieldConfigurationsWithIssueTypesRequest 
     */
    @ApiStatus.Internal
    public SetFieldConfigurationSchemeMappingOperationSpec(Long id, AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest) {
        this.id = id;
        this.associateFieldConfigurationsWithIssueTypesRequest = associateFieldConfigurationsWithIssueTypesRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(associateFieldConfigurationsWithIssueTypesRequest, "associateFieldConfigurationsWithIssueTypesRequest is a required parameter!");
    }
}
