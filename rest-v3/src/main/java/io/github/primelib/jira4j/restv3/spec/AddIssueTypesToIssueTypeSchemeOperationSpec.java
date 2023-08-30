package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueTypeIds;
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
 * AddIssueTypesToIssueTypeSchemeSpec
 * <p>
 * Specification for the AddIssueTypesToIssueTypeScheme operation.
 * <p>
 * Add issue types to issue type scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link AddIssueTypesToIssueTypeSchemeOperationSpec}.
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
     * Constructs a validated instance of {@link AddIssueTypesToIssueTypeSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeSchemeId    The ID of the issue type scheme.
     * @param issueTypeIds         
     */
    @ApiStatus.Internal
    public AddIssueTypesToIssueTypeSchemeOperationSpec(Long issueTypeSchemeId, IssueTypeIds issueTypeIds) {
        this.issueTypeSchemeId = issueTypeSchemeId;
        this.issueTypeIds = issueTypeIds;

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
