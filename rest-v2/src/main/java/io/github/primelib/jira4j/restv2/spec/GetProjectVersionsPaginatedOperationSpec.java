package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.Project;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.Version;
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
 * GetProjectVersionsPaginatedSpec
 * <p>
 * Specification for the GetProjectVersionsPaginated operation.
 * <p>
 * Get project versions paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * {@code description} Sorts by version description.
     * *
     * {@code name} Sorts by version name.
     * *
     * {@code releaseDate} Sorts by release date, starting with the oldest date. Versions with no release date are listed last.
     * *
     * {@code sequence} Sorts by the order of appearance in the user interface.
     * *
     * {@code startDate} Sorts by start date, starting with the oldest date. Versions with no start date are listed last.
     */
    @Nullable 
    private String orderBy;

    /**
     * Filter the results using a literal string. Versions with matching {@code name} or {@code description} are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are {@code released}, {@code unreleased}, and {@code archived}.
     */
    @Nullable 
    private String status;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code issuesstatus} Returns the number of issues in each status category for each version.
     * *
     * {@code operations} Returns actions that can be performed on the specified version.
     * *
     * {@code driver} Returns the Atlassian account ID of the version driver.
     * *
     * {@code approvers} Returns a list containing the approvers for this version.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetProjectVersionsPaginatedOperationSpec}.
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
     * Constructs a validated instance of {@link GetProjectVersionsPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by version description.  *  {@code name} Sorts by version name.  *  {@code releaseDate} Sorts by release date, starting with the oldest date. Versions with no release date are listed last.  *  {@code sequence} Sorts by the order of appearance in the user interface.  *  {@code startDate} Sorts by start date, starting with the oldest date. Versions with no start date are listed last.
     * @param query                Filter the results using a literal string. Versions with matching {@code name} or {@code description} are returned (case insensitive).
     * @param status               A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are {@code released}, {@code unreleased}, and {@code archived}.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code issuesstatus} Returns the number of issues in each status category for each version.  *  {@code operations} Returns actions that can be performed on the specified version.  *  {@code driver} Returns the Atlassian account ID of the version driver.  *  {@code approvers} Returns a list containing the approvers for this version.
     */
    @ApiStatus.Internal
    public GetProjectVersionsPaginatedOperationSpec(String projectIdOrKey, Long startAt, Integer maxResults, String orderBy, String query, String status, String expand) {
        this.projectIdOrKey = projectIdOrKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
        this.query = query;
        this.status = status;
        this.expand = expand;

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
