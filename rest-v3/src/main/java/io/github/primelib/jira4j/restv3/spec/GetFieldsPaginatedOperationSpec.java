package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetFieldsPaginatedSpec
 * <p>
 * Specification for the GetFieldsPaginated operation.
 * <p>
 * Get fields paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The type of fields to search.
     */
    @Nullable 
    private List<String> type;

    /**
     * The IDs of the custom fields to return or, where {@code query} is specified, filter.
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
     * {@code contextsCount} sorts by the number of contexts related to a field
     * *
     * {@code lastUsed} sorts by the date when the value of the field last changed
     * *
     * {@code name} sorts by the field name
     * *
     * {@code screensCount} sorts by the number of screens related to a field
     */
    @Nullable 
    private String orderBy;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code key} returns the key for each field
     * *
     * {@code lastUsed} returns the date when the value of the field last changed
     * *
     * {@code screensCount} returns the number of screens related to a field
     * *
     * {@code contextsCount} returns the number of contexts related to a field
     * *
     * {@code isLocked} returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og)
     * *
     * {@code searcherKey} returns the searcher key for each custom field
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetFieldsPaginatedOperationSpec}.
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
     * Constructs a validated instance of {@link GetFieldsPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param type                 The type of fields to search.
     * @param id                   The IDs of the custom fields to return or, where {@code query} is specified, filter.
     * @param query                String used to perform a case-insensitive partial match with field names or descriptions.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code contextsCount} sorts by the number of contexts related to a field  *  {@code lastUsed} sorts by the date when the value of the field last changed  *  {@code name} sorts by the field name  *  {@code screensCount} sorts by the number of screens related to a field
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code key} returns the key for each field  *  {@code lastUsed} returns the date when the value of the field last changed  *  {@code screensCount} returns the number of screens related to a field  *  {@code contextsCount} returns the number of contexts related to a field  *  {@code isLocked} returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og)  *  {@code searcherKey} returns the searcher key for each custom field
     */
    @ApiStatus.Internal
    public GetFieldsPaginatedOperationSpec(Long startAt, Integer maxResults, List<String> type, Set<String> id, String query, String orderBy, String expand) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.type = type;
        this.id = id;
        this.query = query;
        this.orderBy = orderBy;
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
    }
}
