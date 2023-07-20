package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.AssociateSecuritySchemeWithProjectDetails;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AssociateSchemesToProjectsSpec
 * <p>
 * Specification for the AssociateSchemesToProjects operation.
 * <p>
 * Associate security scheme to project
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateSchemesToProjectsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails;

    /**
     * Constructs a validated implementation of {@link AssociateSchemesToProjectsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociateSchemesToProjectsOperationSpec(Consumer<AssociateSchemesToProjectsOperationSpec> spec) {
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
        Objects.requireNonNull(associateSecuritySchemeWithProjectDetails, "associateSecuritySchemeWithProjectDetails is a required parameter!");
    }

}
