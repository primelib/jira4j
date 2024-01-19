package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeUpdateDetails;
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
 * UpdateIssueTypeSchemeSpec
 * <p>
 * Specification for the UpdateIssueTypeScheme operation.
 * <p>
 * Update issue type scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueTypeSchemeOperationSpec {
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
    private IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails;

    /**
     * Constructs a validated instance of {@link UpdateIssueTypeSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueTypeSchemeOperationSpec(Consumer<UpdateIssueTypeSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueTypeSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeSchemeId    The ID of the issue type scheme.
     * @param issueTypeSchemeUpdateDetails 
     */
    @ApiStatus.Internal
    public UpdateIssueTypeSchemeOperationSpec(Long issueTypeSchemeId, IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails) {
        this.issueTypeSchemeId = issueTypeSchemeId;
        this.issueTypeSchemeUpdateDetails = issueTypeSchemeUpdateDetails;

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
        Objects.requireNonNull(issueTypeSchemeUpdateDetails, "issueTypeSchemeUpdateDetails is a required parameter!");
    }
}
