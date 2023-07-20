package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIssueTypeScreenSchemesSpec
 * <p>
 * Specification for the GetIssueTypeScreenSchemes operation.
 * <p>
 * Get issue type screen schemes
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypeScreenSchemesOperationSpec {
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
     * The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * String used to perform a case-insensitive partial match with issue type screen scheme name.
     */
    @Nullable 
    private String queryString;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `name` Sorts by issue type screen scheme name.
     * *
     * `id` Sorts by issue type screen scheme ID.
     */
    @Nullable 
    private String orderBy = "id";

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts `projects` that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetIssueTypeScreenSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypeScreenSchemesOperationSpec(Consumer<GetIssueTypeScreenSchemesOperationSpec> spec) {
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
