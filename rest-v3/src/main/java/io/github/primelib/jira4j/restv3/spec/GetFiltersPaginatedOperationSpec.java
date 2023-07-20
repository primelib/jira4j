package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Filter;
import io.github.primelib.jira4j.restv3.model.Group;
import io.github.primelib.jira4j.restv3.model.Permissions;
import io.github.primelib.jira4j.restv3.model.Project;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.SharePermission;
import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetFiltersPaginatedSpec
 * <p>
 * Specification for the GetFiltersPaginated operation.
 * <p>
 * Search for filters
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFiltersPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * String used to perform a case-insensitive partial match with `name`.
     */
    @Nullable 
    private String filterName;

    /**
     * User account ID used to return filters with the matching `owner.accountId`. This parameter cannot be used with `owner`.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return filters with the matching `owner.name`. This parameter cannot be used with `accountId`.
     */
    @Nullable 
    private String owner;

    /**
     * As a group's name can change, use of `groupId` is recommended to identify a group. Group name used to returns filters that are shared with a group that matches `sharePermissions.group.groupname`. This parameter cannot be used with the `groupId` parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * Group ID used to returns filters that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Project ID used to returns filters that are shared with a project that matches `sharePermissions.project.id`.
     */
    @Nullable 
    private Long projectId;

    /**
     * The list of filter IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`. Do not exceed 200 filter IDs.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `description` Sorts by filter description. Note that this sorting works independently of whether the expand to display the description field is in use.
     * *
     * `favourite_count` Sorts by the count of how many users have this filter as a favorite.
     * *
     * `is_favourite` Sorts by whether the filter is marked as a favorite.
     * *
     * `id` Sorts by filter ID.
     * *
     * `name` Sorts by filter name.
     * *
     * `owner` Sorts by the ID of the filter owner.
     * *
     * `is_shared` Sorts by whether the filter is shared.
     */
    @Nullable 
    private String orderBy = "name";

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
     * Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `description` Returns the description of the filter.
     * *
     * `favourite` Returns an indicator of whether the user has set the filter as a favorite.
     * *
     * `favouritedCount` Returns a count of how many users have set this filter as a favorite.
     * *
     * `jql` Returns the JQL query that the filter uses.
     * *
     * `owner` Returns the owner of the filter.
     * *
     * `searchUrl` Returns a URL to perform the filter's JQL query.
     * *
     * `sharePermissions` Returns the share permissions defined for the filter.
     * *
     * `editPermissions` Returns the edit permissions defined for the filter.
     * *
     * `isWritable` Returns whether the current user has permission to edit the filter.
     * *
     * `subscriptions` Returns the users that are subscribed to the filter.
     * *
     * `viewUrl` Returns a URL to view the filter.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Nullable 
    private Boolean overrideSharePermissions = false;

    /**
     * Constructs a validated implementation of {@link GetFiltersPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetFiltersPaginatedOperationSpec(Consumer<GetFiltersPaginatedOperationSpec> spec) {
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
