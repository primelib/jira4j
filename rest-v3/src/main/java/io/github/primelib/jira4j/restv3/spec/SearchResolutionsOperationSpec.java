package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Resolution;
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
 * SearchResolutionsSpec
 * <p>
 * Specification for the SearchResolutions operation.
 * <p>
 * Search resolutions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchResolutionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

    /**
     * The list of resolutions IDs to be filtered out
     */
    @Nullable 
    private List<String> id;

    /**
     * When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false
     */
    @Nullable 
    private Boolean onlyDefault;

    /**
     * Constructs a validated instance of {@link SearchResolutionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchResolutionsOperationSpec(Consumer<SearchResolutionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchResolutionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of resolutions IDs to be filtered out
     * @param onlyDefault          When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false
     */
    @ApiStatus.Internal
    public SearchResolutionsOperationSpec(String startAt, String maxResults, List<String> id, Boolean onlyDefault) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.onlyDefault = onlyDefault;

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
