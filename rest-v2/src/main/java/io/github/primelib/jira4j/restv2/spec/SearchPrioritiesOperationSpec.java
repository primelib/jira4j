package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SearchPrioritiesSpec
 * <p>
 * Specification for the SearchPriorities operation.
 * <p>
 * Search priorities
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchPrioritiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt = "0";

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults = "50";

    /**
     * The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=2&amp;id=3`.
     */
    @Nullable 
    private List<String> id;

    /**
     * Whether only the default priority is returned.
     */
    @Nullable 
    private Boolean onlyDefault = false;

    /**
     * Constructs a validated implementation of {@link SearchPrioritiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchPrioritiesOperationSpec(Consumer<SearchPrioritiesOperationSpec> spec) {
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
