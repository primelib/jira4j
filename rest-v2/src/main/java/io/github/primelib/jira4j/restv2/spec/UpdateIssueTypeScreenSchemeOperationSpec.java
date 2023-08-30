package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeUpdateDetails;
import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
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
 * UpdateIssueTypeScreenSchemeSpec
 * <p>
 * Specification for the UpdateIssueTypeScreenScheme operation.
 * <p>
 * Update issue type screen scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueTypeScreenSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue type screen scheme.
     */
    @NotNull 
    private String issueTypeScreenSchemeId;

    /**
     * The issue type screen scheme update details.
     */
    @NotNull 
    private IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails;

    /**
     * Constructs a validated instance of {@link UpdateIssueTypeScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueTypeScreenSchemeOperationSpec(Consumer<UpdateIssueTypeScreenSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueTypeScreenSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param issueTypeScreenSchemeUpdateDetails The issue type screen scheme update details.
     */
    @ApiStatus.Internal
    public UpdateIssueTypeScreenSchemeOperationSpec(String issueTypeScreenSchemeId, IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails) {
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
        this.issueTypeScreenSchemeUpdateDetails = issueTypeScreenSchemeUpdateDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueTypeScreenSchemeId, "issueTypeScreenSchemeId is a required parameter!");
        Objects.requireNonNull(issueTypeScreenSchemeUpdateDetails, "issueTypeScreenSchemeUpdateDetails is a required parameter!");
    }
}
