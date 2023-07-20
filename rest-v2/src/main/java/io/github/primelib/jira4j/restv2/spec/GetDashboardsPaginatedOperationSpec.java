package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Dashboard;
import io.github.primelib.jira4j.restv2.model.Group;
import io.github.primelib.jira4j.restv2.model.Permissions;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetDashboardsPaginatedSpec
 * <p>
 * Specification for the GetDashboardsPaginated operation.
 * <p>
 * Search for dashboards
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDashboardsPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * String used to perform a case-insensitive partial match with `name`.
     */
    @Nullable 
    private String dashboardName;

    /**
     * User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter.
     */
    @Nullable 
    private String owner;

    /**
     * As a group's name can change, use of `groupId` is recommended. Group name used to return dashboards that are shared with a group that matches `sharePermissions.group.name`. This parameter cannot be used with the `groupId` parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * Group ID used to return dashboards that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`.
     */
    @Nullable 
    private Long projectId;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.
     * *
     * `favourite_count` Sorts by dashboard popularity.
     * *
     * `id` Sorts by dashboard ID.
     * *
     * `is_favourite` Sorts by whether the dashboard is marked as a favorite.
     * *
     * `name` Sorts by dashboard name.
     * *
     * `owner` Sorts by dashboard owner name.
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
     * The status to filter by. It may be active, archived or deleted.
     */
    @Nullable 
    private String status = "active";

    /**
     * Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `description` Returns the description of the dashboard.
     * *
     * `owner` Returns the owner of the dashboard.
     * *
     * `viewUrl` Returns the URL that is used to view the dashboard.
     * *
     * `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.
     * *
     * `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.
     * *
     * `sharePermissions` Returns details of the share permissions defined for the dashboard.
     * *
     * `editPermissions` Returns details of the edit permissions defined for the dashboard.
     * *
     * `isWritable` Returns whether the current user has permission to edit the dashboard.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetDashboardsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetDashboardsPaginatedOperationSpec(Consumer<GetDashboardsPaginatedOperationSpec> spec) {
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
