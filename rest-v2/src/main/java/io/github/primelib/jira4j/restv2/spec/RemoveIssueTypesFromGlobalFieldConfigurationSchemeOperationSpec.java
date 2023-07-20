package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.IssueTypeIds;
import io.github.primelib.jira4j.restv2.model.IssueTypeIdsToRemove;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RemoveIssueTypesFromGlobalFieldConfigurationSchemeSpec
 * <p>
 * Specification for the RemoveIssueTypesFromGlobalFieldConfigurationScheme operation.
 * <p>
 * Remove issue types from field configuration scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the field configuration scheme.
     */
    @NotNull 
    private Long id;

    /**
     * The issue type IDs to remove.
     */
    @NotNull 
    private IssueTypeIdsToRemove issueTypeIdsToRemove;

    /**
     * Constructs a validated implementation of {@link RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec(Consumer<RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(issueTypeIdsToRemove, "issueTypeIdsToRemove is a required parameter!");
    }

}
