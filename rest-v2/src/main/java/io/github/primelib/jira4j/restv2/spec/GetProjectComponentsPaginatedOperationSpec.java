package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectComponent;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `description` Sorts by the component description.
     * *
     * `issueCount` Sorts by the count of issues associated with the component.
     * *
     * `lead` Sorts by the user key of the component's project lead.
     * *
     * `name` Sorts by component name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * Constructs a validated implementation of {@link GetProjectComponentsPaginatedOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
    }

}
