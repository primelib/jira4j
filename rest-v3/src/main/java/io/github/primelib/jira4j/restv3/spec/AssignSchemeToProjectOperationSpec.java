package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
import io.github.primelib.jira4j.restv3.model.WorkflowSchemeProjectAssociation;
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
 * AssignSchemeToProjectSpec
 * <p>
 * Specification for the AssignSchemeToProject operation.
 * <p>
 * Assign workflow scheme to project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignSchemeToProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation;

    /**
     * Constructs a validated instance of {@link AssignSchemeToProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssignSchemeToProjectOperationSpec(Consumer<AssignSchemeToProjectOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AssignSchemeToProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowSchemeProjectAssociation 
     */
    @ApiStatus.Internal
    public AssignSchemeToProjectOperationSpec(WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation) {
        this.workflowSchemeProjectAssociation = workflowSchemeProjectAssociation;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(workflowSchemeProjectAssociation, "workflowSchemeProjectAssociation is a required parameter!");
    }
}
