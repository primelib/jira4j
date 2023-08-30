package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Configuration;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.Project;
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
 * AssignFieldConfigurationSchemeToProjectSpec
 * <p>
 * Specification for the AssignFieldConfigurationSchemeToProject operation.
 * <p>
 * Assign field configuration scheme to project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignFieldConfigurationSchemeToProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation;

    /**
     * Constructs a validated instance of {@link AssignFieldConfigurationSchemeToProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssignFieldConfigurationSchemeToProjectOperationSpec(Consumer<AssignFieldConfigurationSchemeToProjectOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AssignFieldConfigurationSchemeToProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldConfigurationSchemeProjectAssociation 
     */
    @ApiStatus.Internal
    public AssignFieldConfigurationSchemeToProjectOperationSpec(FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation) {
        this.fieldConfigurationSchemeProjectAssociation = fieldConfigurationSchemeProjectAssociation;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(fieldConfigurationSchemeProjectAssociation, "fieldConfigurationSchemeProjectAssociation is a required parameter!");
    }
}
