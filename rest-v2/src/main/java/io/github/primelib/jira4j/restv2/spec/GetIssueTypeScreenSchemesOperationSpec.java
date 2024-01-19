package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
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
 * GetIssueTypeScreenSchemesSpec
 * <p>
 * Specification for the GetIssueTypeScreenSchemes operation.
 * <p>
 * Get issue type screen schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
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
     * {@code name} Sorts by issue type screen scheme name.
     * *
     * {@code id} Sorts by issue type screen scheme ID.
     */
    @Nullable 
    private String orderBy;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code projects} that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetIssueTypeScreenSchemesOperationSpec}.
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
     * Constructs a validated instance of {@link GetIssueTypeScreenSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     * @param queryString          String used to perform a case-insensitive partial match with issue type screen scheme name.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} Sorts by issue type screen scheme name.  *  {@code id} Sorts by issue type screen scheme ID.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code projects} that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.
     */
    @ApiStatus.Internal
    public GetIssueTypeScreenSchemesOperationSpec(Long startAt, Integer maxResults, Set<Long> id, String queryString, String orderBy, String expand) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.queryString = queryString;
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
