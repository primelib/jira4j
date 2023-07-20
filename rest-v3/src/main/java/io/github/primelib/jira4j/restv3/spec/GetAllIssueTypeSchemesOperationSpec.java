package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllIssueTypeSchemesSpec
 * <p>
 * Specification for the GetAllIssueTypeSchemes operation.
 * <p>
 * Get all issue type schemes
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllIssueTypeSchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `name` Sorts by issue type scheme name.
     * *
     * `id` Sorts by issue type scheme ID.
     */
    @Nullable 
    private String orderBy = "id";

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `projects` For each issue type schemes, returns information about the projects the issue type scheme is assigned to.
     * *
     * `issueTypes` For each issue type schemes, returns information about the issueTypes the issue type scheme have.
     */
    @Nullable 
    private String expand;

    /**
     * String used to perform a case-insensitive partial match with issue type scheme name.
     */
    @Nullable 
    private String queryString;

    /**
     * Constructs a validated implementation of {@link GetAllIssueTypeSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllIssueTypeSchemesOperationSpec(Consumer<GetAllIssueTypeSchemesOperationSpec> spec) {
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
