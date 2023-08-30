package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
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
 * SearchSpec
 * <p>
 * Specification for the Search operation.
 * <p>
 * Search statuses paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code usages} Returns the project and issue types that use the status in their workflow.
     * *
     * {@code workflowUsages} Returns the workflows that use the status.
     */
    @Nullable 
    private String expand;

    /**
     * The project the status is part of or null for global statuses.
     */
    @Nullable 
    private String projectId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Term to match status names against or null to search for all statuses in the search scope.
     */
    @Nullable 
    private String searchString;

    /**
     * Category of the status to filter by. The supported values are: {@code TODO}, {@code IN_PROGRESS}, and {@code DONE}.
     */
    @Nullable 
    private String statusCategory;

    /**
     * Constructs a validated instance of {@link SearchOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchOperationSpec(Consumer<SearchOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code usages} Returns the project and issue types that use the status in their workflow.  *  {@code workflowUsages} Returns the workflows that use the status.
     * @param projectId            The project the status is part of or null for global statuses.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param searchString         Term to match status names against or null to search for all statuses in the search scope.
     * @param statusCategory       Category of the status to filter by. The supported values are: {@code TODO}, {@code IN_PROGRESS}, and {@code DONE}.
     */
    @ApiStatus.Internal
    public SearchOperationSpec(String expand, String projectId, Long startAt, Integer maxResults, String searchString, String statusCategory) {
        this.expand = expand;
        this.projectId = projectId;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.searchString = searchString;
        this.statusCategory = statusCategory;

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
