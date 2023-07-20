package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetScreensSpec
 * <p>
 * Specification for the GetScreens operation.
 * <p>
 * Get screens
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetScreensOperationSpec {
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
    private Integer maxResults = 100;

    /**
     * The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * String used to perform a case-insensitive partial match with screen name.
     */
    @Nullable 
    private String queryString;

    /**
     * The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, `scope=GLOBAL&amp;scope=PROJECT`.
     */
    @Nullable 
    private Set<String> scope;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `id` Sorts by screen ID.
     * *
     * `name` Sorts by screen name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated implementation of {@link GetScreensOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetScreensOperationSpec(Consumer<GetScreensOperationSpec> spec) {
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
