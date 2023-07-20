package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueTypeIds;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AddIssueTypesToIssueTypeSchemeSpec
 * <p>
 * Specification for the AddIssueTypesToIssueTypeScheme operation.
 * <p>
 * Add issue types to issue type scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddIssueTypesToIssueTypeSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue type scheme.
     */
    @NotNull 
    private Long issueTypeSchemeId;

    /**
     */
    @NotNull 
    private IssueTypeIds issueTypeIds;

    /**
     * Constructs a validated implementation of {@link AddIssueTypesToIssueTypeSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddIssueTypesToIssueTypeSchemeOperationSpec(Consumer<AddIssueTypesToIssueTypeSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(issueTypeSchemeId, "issueTypeSchemeId is a required parameter!");
        Objects.requireNonNull(issueTypeIds, "issueTypeIds is a required parameter!");
    }

}
