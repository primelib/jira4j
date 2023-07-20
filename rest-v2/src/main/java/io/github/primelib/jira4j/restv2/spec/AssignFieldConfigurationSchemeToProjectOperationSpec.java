package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.Project;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * Constructs a validated implementation of {@link AssignFieldConfigurationSchemeToProjectOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(fieldConfigurationSchemeProjectAssociation, "fieldConfigurationSchemeProjectAssociation is a required parameter!");
    }

}
