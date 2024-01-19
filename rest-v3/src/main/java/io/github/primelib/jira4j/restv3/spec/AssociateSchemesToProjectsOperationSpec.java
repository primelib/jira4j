package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.AssociateSecuritySchemeWithProjectDetails;
import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.SecurityScheme;
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
 * AssociateSchemesToProjectsSpec
 * <p>
 * Specification for the AssociateSchemesToProjects operation.
 * <p>
 * Associate security scheme to project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link AssociateSchemesToProjectsOperationSpec}.
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
     * Constructs a validated instance of {@link AssociateSchemesToProjectsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param associateSecuritySchemeWithProjectDetails 
     */
    @ApiStatus.Internal
    public AssociateSchemesToProjectsOperationSpec(AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails) {
        this.associateSecuritySchemeWithProjectDetails = associateSecuritySchemeWithProjectDetails;

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
