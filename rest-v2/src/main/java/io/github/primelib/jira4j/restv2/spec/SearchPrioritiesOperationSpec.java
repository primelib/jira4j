package io.github.primelib.jira4j.restv2.spec;

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
 * SearchPrioritiesSpec
 * <p>
 * Specification for the SearchPriorities operation.
 * <p>
 * Search priorities
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

    /**
     * The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=2&amp;id=3}.
     */
    @Nullable 
    private List<String> id;

    /**
     * The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code projectId=10010&amp;projectId=10111}.
     */
    @Nullable 
    private List<String> projectId;

    /**
     * The name of priority to search for.
     */
    @Nullable 
    private String priorityName;

    /**
     * Whether only the default priority is returned.
     */
    @Nullable 
    private Boolean onlyDefault;

    /**
     * Constructs a validated instance of {@link SearchPrioritiesOperationSpec}.
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
     * Constructs a validated instance of {@link SearchPrioritiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=2&amp;id=3}.
     * @param projectId            The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code projectId=10010&amp;projectId=10111}.
     * @param priorityName         The name of priority to search for.
     * @param onlyDefault          Whether only the default priority is returned.
     */
    @ApiStatus.Internal
    public SearchPrioritiesOperationSpec(String startAt, String maxResults, List<String> id, List<String> projectId, String priorityName, Boolean onlyDefault) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.projectId = projectId;
        this.priorityName = priorityName;
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
