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
 * GetScreenSchemesSpec
 * <p>
 * Specification for the GetScreenSchemes operation.
 * <p>
 * Get screen schemes
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetScreenSchemesOperationSpec {
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
    private Integer maxResults = 25;

    /**
     * The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * Use [expand](#expansion) include additional information in the response. This parameter accepts `issueTypeScreenSchemes` that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to.
     */
    @Nullable 
    private String expand;

    /**
     * String used to perform a case-insensitive partial match with screen scheme name.
     */
    @Nullable 
    private String queryString;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `id` Sorts by screen scheme ID.
     * *
     * `name` Sorts by screen scheme name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated implementation of {@link GetScreenSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetScreenSchemesOperationSpec(Consumer<GetScreenSchemesOperationSpec> spec) {
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
