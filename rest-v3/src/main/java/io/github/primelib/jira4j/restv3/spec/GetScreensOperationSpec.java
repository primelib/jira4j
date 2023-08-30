package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
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
 * GetScreensSpec
 * <p>
 * Specification for the GetScreens operation.
 * <p>
 * Get screens
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * String used to perform a case-insensitive partial match with screen name.
     */
    @Nullable 
    private String queryString;

    /**
     * The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, {@code scope=GLOBAL&amp;scope=PROJECT}.
     */
    @Nullable 
    private Set<String> scope;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * {@code id} Sorts by screen ID.
     * *
     * {@code name} Sorts by screen name.
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated instance of {@link GetScreensOperationSpec}.
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
     * Constructs a validated instance of {@link GetScreensOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     * @param queryString          String used to perform a case-insensitive partial match with screen name.
     * @param scope                The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, {@code scope=GLOBAL&amp;scope=PROJECT}.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code id} Sorts by screen ID.  *  {@code name} Sorts by screen name.
     */
    @ApiStatus.Internal
    public GetScreensOperationSpec(Long startAt, Integer maxResults, Set<Long> id, String queryString, Set<String> scope, String orderBy) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.queryString = queryString;
        this.scope = scope;
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
