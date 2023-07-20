package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeIds;
import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RemoveMappingsFromIssueTypeScreenSchemeSpec
 * <p>
 * Specification for the RemoveMappingsFromIssueTypeScreenScheme operation.
 * <p>
 * Remove mappings from issue type screen scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveMappingsFromIssueTypeScreenSchemeOperationSpec {
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
     */
    @NotNull 
    private IssueTypeIds issueTypeIds;

    /**
     * Constructs a validated implementation of {@link RemoveMappingsFromIssueTypeScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveMappingsFromIssueTypeScreenSchemeOperationSpec(Consumer<RemoveMappingsFromIssueTypeScreenSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(issueTypeIds, "issueTypeIds is a required parameter!");
    }

}
