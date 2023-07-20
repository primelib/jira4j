package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
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
 * GetFieldsPaginatedSpec
 * <p>
 * Specification for the GetFieldsPaginated operation.
 * <p>
 * Get fields paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFieldsPaginatedOperationSpec {
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
     * The type of fields to search.
     */
    @Nullable 
    private List<String> type;

    /**
     * The IDs of the custom fields to return or, where `query` is specified, filter.
     */
    @Nullable 
    private Set<String> id;

    /**
     * String used to perform a case-insensitive partial match with field names or descriptions.
     */
    @Nullable 
    private String query;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `contextsCount` sorts by the number of contexts related to a field
     * *
     * `lastUsed` sorts by the date when the value of the field last changed
     * *
     * `name` sorts by the field name
     * *
     * `screensCount` sorts by the number of screens related to a field
     */
    @Nullable 
    private String orderBy;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `key` returns the key for each field
     * *
     * `lastUsed` returns the date when the value of the field last changed
     * *
     * `screensCount` returns the number of screens related to a field
     * *
     * `contextsCount` returns the number of contexts related to a field
     * *
     * `isLocked` returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og)
     * *
     * `searcherKey` returns the searcher key for each custom field
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetFieldsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetFieldsPaginatedOperationSpec(Consumer<GetFieldsPaginatedOperationSpec> spec) {
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
