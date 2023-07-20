package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteIssueTypeScreenSchemeSpec
 * <p>
 * Specification for the DeleteIssueTypeScreenScheme operation.
 * <p>
 * Delete issue type screen scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteIssueTypeScreenSchemeOperationSpec {
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
     * Constructs a validated implementation of {@link DeleteIssueTypeScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteIssueTypeScreenSchemeOperationSpec(Consumer<DeleteIssueTypeScreenSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(issueTypeScreenSchemeId, "issueTypeScreenSchemeId is a required parameter!");
    }

}
