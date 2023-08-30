package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
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
 * GetFavouriteFiltersSpec
 * <p>
 * Specification for the GetFavouriteFilters operation.
 * <p>
 * Get favorite filters
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFavouriteFiltersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.
     * *
     * {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetFavouriteFiltersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetFavouriteFiltersOperationSpec(Consumer<GetFavouriteFiltersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetFavouriteFiltersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}.
     */
    @ApiStatus.Internal
    public GetFavouriteFiltersOperationSpec(String expand) {
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
