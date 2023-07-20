package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.OrderOfIssueTypes;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ReorderIssueTypesInIssueTypeSchemeSpec
 * <p>
 * Specification for the ReorderIssueTypesInIssueTypeScheme operation.
 * <p>
 * Change order of issue types
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReorderIssueTypesInIssueTypeSchemeOperationSpec {
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
    private OrderOfIssueTypes orderOfIssueTypes;

    /**
     * Constructs a validated implementation of {@link ReorderIssueTypesInIssueTypeSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReorderIssueTypesInIssueTypeSchemeOperationSpec(Consumer<ReorderIssueTypesInIssueTypeSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(orderOfIssueTypes, "orderOfIssueTypes is a required parameter!");
    }

}
