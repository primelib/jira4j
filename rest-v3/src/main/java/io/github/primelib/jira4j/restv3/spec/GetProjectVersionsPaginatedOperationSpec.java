package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Filter;
import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.Version;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetProjectVersionsPaginatedSpec
 * <p>
 * Specification for the GetProjectVersionsPaginated operation.
 * <p>
 * Get project versions paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectVersionsPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID or project key (case sensitive).
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `description` Sorts by version description.
     * *
     * `name` Sorts by version name.
     * *
     * `releaseDate` Sorts by release date, starting with the oldest date. Versions with no release date are listed last.
     * *
     * `sequence` Sorts by the order of appearance in the user interface.
     * *
     * `startDate` Sorts by start date, starting with the oldest date. Versions with no start date are listed last.
     */
    @Nullable 
    private String orderBy;

    /**
     * Filter the results using a literal string. Versions with matching `name` or `description` are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are `released`, `unreleased`, and `archived`.
     */
    @Nullable 
    private String status;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `issuesstatus` Returns the number of issues in each status category for each version.
     * *
     * `operations` Returns actions that can be performed on the specified version.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetProjectVersionsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectVersionsPaginatedOperationSpec(Consumer<GetProjectVersionsPaginatedOperationSpec> spec) {
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
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
    }

}
