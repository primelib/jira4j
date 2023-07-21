package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueTypeScreenSchemeProjectAssociation;
import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.Screen;
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
 * AssignIssueTypeScreenSchemeToProjectSpec
 * <p>
 * Specification for the AssignIssueTypeScreenSchemeToProject operation.
 * <p>
 * Assign issue type screen scheme to project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignIssueTypeScreenSchemeToProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation;

    /**
     * Constructs a validated instance of {@link AssignIssueTypeScreenSchemeToProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssignIssueTypeScreenSchemeToProjectOperationSpec(Consumer<AssignIssueTypeScreenSchemeToProjectOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AssignIssueTypeScreenSchemeToProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeScreenSchemeProjectAssociation 
     */
    @ApiStatus.Internal
    public AssignIssueTypeScreenSchemeToProjectOperationSpec(IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation) {
        this.issueTypeScreenSchemeProjectAssociation = issueTypeScreenSchemeProjectAssociation;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueTypeScreenSchemeProjectAssociation, "issueTypeScreenSchemeProjectAssociation is a required parameter!");
    }
}
