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
 * GetTrashedFieldsPaginatedSpec
 * <p>
 * Specification for the GetTrashedFieldsPaginated operation.
 * <p>
 * Get fields in trash paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

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
     * `name` sorts by the field name
     * *
     * `trashDate` sorts by the date the field was moved to the trash
     * *
     * `plannedDeletionDate` sorts by the planned deletion date
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated implementation of {@link GetTrashedFieldsPaginatedOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
