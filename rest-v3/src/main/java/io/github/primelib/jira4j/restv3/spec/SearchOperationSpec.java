package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * `usages` Returns the project and issue types that use the status in their workflow.
     * *
     * `workflowUsages` Returns the workflows that use the status.
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 200;

    /**
     * Term to match status names against or null to search for all statuses in the search scope.
     */
    @Nullable 
    private String searchString;

    /**
     * Category of the status to filter by. The supported values are: `TODO`, `IN_PROGRESS`, and `DONE`.
     */
    @Nullable 
    private String statusCategory;

    /**
     * Constructs a validated implementation of {@link SearchOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
