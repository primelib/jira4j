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
 * GetBulkScreenTabsSpec
 * <p>
 * Specification for the GetBulkScreenTabs operation.
 * <p>
 * Get bulk screen tabs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBulkScreenTabsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The list of screen IDs. To include multiple screen IDs, provide an ampersand-separated list. For example, {@code screenId=10000&amp;screenId=10001}.
     */
    @Nullable 
    private Set<Long> screenId;

    /**
     * The list of tab IDs. To include multiple tab IDs, provide an ampersand-separated list. For example, {@code tabId=10000&amp;tabId=10001}.
     */
    @Nullable 
    private Set<Long> tabId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page. The maximum number is 100,
     */
    @Nullable 
    private Integer maxResult;

    /**
     * Constructs a validated instance of {@link GetBulkScreenTabsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBulkScreenTabsOperationSpec(Consumer<GetBulkScreenTabsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBulkScreenTabsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param screenId             The list of screen IDs. To include multiple screen IDs, provide an ampersand-separated list. For example, {@code screenId=10000&amp;screenId=10001}.
     * @param tabId                The list of tab IDs. To include multiple tab IDs, provide an ampersand-separated list. For example, {@code tabId=10000&amp;tabId=10001}.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResult            The maximum number of items to return per page. The maximum number is 100,
     */
    @ApiStatus.Internal
    public GetBulkScreenTabsOperationSpec(Set<Long> screenId, Set<Long> tabId, Long startAt, Integer maxResult) {
        this.screenId = screenId;
        this.tabId = tabId;
        this.startAt = startAt;
        this.maxResult = maxResult;

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
