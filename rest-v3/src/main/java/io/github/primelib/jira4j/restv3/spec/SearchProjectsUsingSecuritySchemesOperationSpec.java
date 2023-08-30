package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.SecurityScheme;
import io.github.primelib.jira4j.restv3.model.SecuritySchemeId;
import io.github.primelib.jira4j.restv3.model.SecuritySchemes;
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
 * SearchProjectsUsingSecuritySchemesSpec
 * <p>
 * Specification for the SearchProjectsUsingSecuritySchemes operation.
 * <p>
 * Get projects using issue security schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchProjectsUsingSecuritySchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

    /**
     * The list of security scheme IDs to be filtered out.
     */
    @Nullable 
    private Set<String> issueSecuritySchemeId;

    /**
     * The list of project IDs to be filtered out.
     */
    @Nullable 
    private Set<String> projectId;

    /**
     * Constructs a validated instance of {@link SearchProjectsUsingSecuritySchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchProjectsUsingSecuritySchemesOperationSpec(Consumer<SearchProjectsUsingSecuritySchemesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchProjectsUsingSecuritySchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param issueSecuritySchemeId The list of security scheme IDs to be filtered out.
     * @param projectId            The list of project IDs to be filtered out.
     */
    @ApiStatus.Internal
    public SearchProjectsUsingSecuritySchemesOperationSpec(String startAt, String maxResults, Set<String> issueSecuritySchemeId, Set<String> projectId) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.issueSecuritySchemeId = issueSecuritySchemeId;
        this.projectId = projectId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
