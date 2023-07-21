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
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFiltersPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * String used to perform a case-insensitive partial match with {@code name}.
     */
    @Nullable 
    private String filterName;

    /**
     * User account ID used to return filters with the matching {@code owner.accountId}. This parameter cannot be used with {@code owner}.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return filters with the matching {@code owner.name}. This parameter cannot be used with {@code accountId}.
     */
    @Nullable 
    private String owner;

    /**
     * As a group's name can change, use of {@code groupId} is recommended to identify a group. Group name used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupname}. This parameter cannot be used with the {@code groupId} parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * Group ID used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Project ID used to returns filters that are shared with a project that matches {@code sharePermissions.project.id}.
     */
    @Nullable 
    private Long projectId;

    /**
     * The list of filter IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Do not exceed 200 filter IDs.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * {@code description} Sorts by filter description. Note that this sorting works independently of whether the expand to display the description field is in use.
     * *
     * {@code favourite_count} Sorts by the count of how many users have this filter as a favorite.
     * *
     * {@code is_favourite} Sorts by whether the filter is marked as a favorite.
     * *
     * {@code id} Sorts by filter ID.
     * *
     * {@code name} Sorts by filter name.
     * *
     * {@code owner} Sorts by the ID of the filter owner.
     * *
     * {@code is_shared} Sorts by whether the filter is shared.
     */
    @Nullable 
    private String orderBy;

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
     * Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code description} Returns the description of the filter.
     * *
     * {@code favourite} Returns an indicator of whether the user has set the filter as a favorite.
     * *
     * {@code favouritedCount} Returns a count of how many users have set this filter as a favorite.
     * *
     * {@code jql} Returns the JQL query that the filter uses.
     * *
     * {@code owner} Returns the owner of the filter.
     * *
     * {@code searchUrl} Returns a URL to perform the filter's JQL query.
     * *
     * {@code sharePermissions} Returns the share permissions defined for the filter.
     * *
     * {@code editPermissions} Returns the edit permissions defined for the filter.
     * *
     * {@code isWritable} Returns whether the current user has permission to edit the filter.
     * *
     * {@code subscriptions} Returns the users that are subscribed to the filter.
     * *
     * {@code viewUrl} Returns a URL to view the filter.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Nullable 
    private Boolean overrideSharePermissions;

    /**
     * Constructs a validated instance of {@link GetFiltersPaginatedOperationSpec}.
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
     * Constructs a validated instance of {@link GetFiltersPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param filterName           String used to perform a case-insensitive partial match with {@code name}.
     * @param accountId            User account ID used to return filters with the matching {@code owner.accountId}. This parameter cannot be used with {@code owner}.
     * @param owner                This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return filters with the matching {@code owner.name}. This parameter cannot be used with {@code accountId}.
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group. Group name used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupname}. This parameter cannot be used with the {@code groupId} parameter.
     * @param groupId              Group ID used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter.
     * @param projectId            Project ID used to returns filters that are shared with a project that matches {@code sharePermissions.project.id}.
     * @param id                   The list of filter IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Do not exceed 200 filter IDs.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by filter description. Note that this sorting works independently of whether the expand to display the description field is in use.  *  {@code favourite_count} Sorts by the count of how many users have this filter as a favorite.  *  {@code is_favourite} Sorts by whether the filter is marked as a favorite.  *  {@code id} Sorts by filter ID.  *  {@code name} Sorts by filter name.  *  {@code owner} Sorts by the ID of the filter owner.  *  {@code is_shared} Sorts by whether the filter is shared.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code description} Returns the description of the filter.  *  {@code favourite} Returns an indicator of whether the user has set the filter as a favorite.  *  {@code favouritedCount} Returns a count of how many users have set this filter as a favorite.  *  {@code jql} Returns the JQL query that the filter uses.  *  {@code owner} Returns the owner of the filter.  *  {@code searchUrl} Returns a URL to perform the filter's JQL query.  *  {@code sharePermissions} Returns the share permissions defined for the filter.  *  {@code editPermissions} Returns the edit permissions defined for the filter.  *  {@code isWritable} Returns whether the current user has permission to edit the filter.  *  {@code subscriptions} Returns the users that are subscribed to the filter.  *  {@code viewUrl} Returns a URL to view the filter.
     * @param overrideSharePermissions EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @ApiStatus.Internal
    public GetFiltersPaginatedOperationSpec(String filterName, String accountId, String owner, String groupname, String groupId, Long projectId, Set<Long> id, String orderBy, Long startAt, Integer maxResults, String expand, Boolean overrideSharePermissions) {
        this.filterName = filterName;
        this.accountId = accountId;
        this.owner = owner;
        this.groupname = groupname;
        this.groupId = groupId;
        this.projectId = projectId;
        this.id = id;
        this.orderBy = orderBy;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.expand = expand;
        this.overrideSharePermissions = overrideSharePermissions;

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
