package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * RemoveIssueTypeFromIssueTypeSchemeSpec
 * <p>
 * Specification for the RemoveIssueTypeFromIssueTypeScheme operation.
 * <p>
 * Remove issue type from issue type scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveIssueTypeFromIssueTypeSchemeOperationSpec {
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
     * The ID of the issue type.
     */
    @NotNull 
    private Long issueTypeId;

    /**
     * Constructs a validated instance of {@link RemoveIssueTypeFromIssueTypeSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveIssueTypeFromIssueTypeSchemeOperationSpec(Consumer<RemoveIssueTypeFromIssueTypeSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveIssueTypeFromIssueTypeSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeSchemeId    The ID of the issue type scheme.
     * @param issueTypeId          The ID of the issue type.
     */
    @ApiStatus.Internal
    public RemoveIssueTypeFromIssueTypeSchemeOperationSpec(Long issueTypeSchemeId, Long issueTypeId) {
        this.issueTypeSchemeId = issueTypeSchemeId;
        this.issueTypeId = issueTypeId;

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
        Objects.requireNonNull(issueTypeId, "issueTypeId is a required parameter!");
    }
}
