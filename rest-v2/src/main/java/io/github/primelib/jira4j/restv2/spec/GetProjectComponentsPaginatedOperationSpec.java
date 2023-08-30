package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectComponent;
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
 * GetProjectComponentsPaginatedSpec
 * <p>
 * Specification for the GetProjectComponentsPaginated operation.
 * <p>
 * Get project components paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectComponentsPaginatedOperationSpec {
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
     * {@code description} Sorts by the component description.
     * *
     * {@code issueCount} Sorts by the count of issues associated with the component.
     * *
     * {@code lead} Sorts by the user key of the component's project lead.
     * *
     * {@code name} Sorts by component name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Filter the results using a literal string. Components with a matching {@code name} or {@code description} are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * Constructs a validated instance of {@link GetProjectComponentsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectComponentsPaginatedOperationSpec(Consumer<GetProjectComponentsPaginatedOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetProjectComponentsPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by the component description.  *  {@code issueCount} Sorts by the count of issues associated with the component.  *  {@code lead} Sorts by the user key of the component's project lead.  *  {@code name} Sorts by component name.
     * @param query                Filter the results using a literal string. Components with a matching {@code name} or {@code description} are returned (case insensitive).
     */
    @ApiStatus.Internal
    public GetProjectComponentsPaginatedOperationSpec(String projectIdOrKey, Long startAt, Integer maxResults, String orderBy, String query) {
        this.projectIdOrKey = projectIdOrKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
        this.query = query;

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
