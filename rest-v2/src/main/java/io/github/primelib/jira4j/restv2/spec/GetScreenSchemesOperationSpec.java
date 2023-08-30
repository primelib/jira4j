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
 * GetScreenSchemesSpec
 * <p>
 * Specification for the GetScreenSchemes operation.
 * <p>
 * Get screen schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * Use [expand](#expansion) include additional information in the response. This parameter accepts {@code issueTypeScreenSchemes} that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to.
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
     * {@code id} Sorts by screen scheme ID.
     * *
     * {@code name} Sorts by screen scheme name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated instance of {@link GetScreenSchemesOperationSpec}.
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
     * Constructs a validated instance of {@link GetScreenSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     * @param expand               Use [expand](#expansion) include additional information in the response. This parameter accepts {@code issueTypeScreenSchemes} that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to.
     * @param queryString          String used to perform a case-insensitive partial match with screen scheme name.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code id} Sorts by screen scheme ID.  *  {@code name} Sorts by screen scheme name.
     */
    @ApiStatus.Internal
    public GetScreenSchemesOperationSpec(Long startAt, Integer maxResults, Set<Long> id, String expand, String queryString, String orderBy) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.expand = expand;
        this.queryString = queryString;
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
