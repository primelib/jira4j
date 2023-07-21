package io.github.primelib.jira4j.restv3.spec;

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
 * GetTrashedFieldsPaginatedSpec
 * <p>
 * Specification for the GetTrashedFieldsPaginated operation.
 * <p>
 * Get fields in trash paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTrashedFieldsPaginatedOperationSpec {
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
     */
    @Nullable 
    private Set<String> id;

    /**
     * String used to perform a case-insensitive partial match with field names or descriptions.
     */
    @Nullable 
    private String query;

    /**
     */
    @Nullable 
    private String expand;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * {@code name} sorts by the field name
     * *
     * {@code trashDate} sorts by the date the field was moved to the trash
     * *
     * {@code plannedDeletionDate} sorts by the planned deletion date
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated instance of {@link GetTrashedFieldsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTrashedFieldsPaginatedOperationSpec(Consumer<GetTrashedFieldsPaginatedOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetTrashedFieldsPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   
     * @param query                String used to perform a case-insensitive partial match with field names or descriptions.
     * @param expand               
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} sorts by the field name  *  {@code trashDate} sorts by the date the field was moved to the trash  *  {@code plannedDeletionDate} sorts by the planned deletion date
     */
    @ApiStatus.Internal
    public GetTrashedFieldsPaginatedOperationSpec(Long startAt, Integer maxResults, Set<String> id, String query, String expand, String orderBy) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.query = query;
        this.expand = expand;
        this.orderBy = orderBy;

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
