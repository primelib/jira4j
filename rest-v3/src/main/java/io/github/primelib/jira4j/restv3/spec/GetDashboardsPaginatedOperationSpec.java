package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Dashboard;
import io.github.primelib.jira4j.restv3.model.Group;
import io.github.primelib.jira4j.restv3.model.Permissions;
import io.github.primelib.jira4j.restv3.model.Project;
import java.util.Set;
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
 * GetDashboardsPaginatedSpec
 * <p>
 * Specification for the GetDashboardsPaginated operation.
 * <p>
 * Search for dashboards
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDashboardsPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * String used to perform a case-insensitive partial match with {@code name}.
     */
    @Nullable 
    private String dashboardName;

    /**
     * User account ID used to return dashboards with the matching {@code owner.accountId}. This parameter cannot be used with the {@code owner} parameter.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching {@code owner.name}. This parameter cannot be used with the {@code accountId} parameter.
     */
    @Nullable 
    private String owner;

    /**
     * As a group's name can change, use of {@code groupId} is recommended. Group name used to return dashboards that are shared with a group that matches {@code sharePermissions.group.name}. This parameter cannot be used with the {@code groupId} parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * Group ID used to return dashboards that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Project ID used to returns dashboards that are shared with a project that matches {@code sharePermissions.project.id}.
     */
    @Nullable 
    private Long projectId;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * {@code description} Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.
     * *
     * {@code favourite_count} Sorts by dashboard popularity.
     * *
     * {@code id} Sorts by dashboard ID.
     * *
     * {@code is_favourite} Sorts by whether the dashboard is marked as a favorite.
     * *
     * {@code name} Sorts by dashboard name.
     * *
     * {@code owner} Sorts by dashboard owner name.
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
     * The status to filter by. It may be active, archived or deleted.
     */
    @Nullable 
    private String status;

    /**
     * Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code description} Returns the description of the dashboard.
     * *
     * {@code owner} Returns the owner of the dashboard.
     * *
     * {@code viewUrl} Returns the URL that is used to view the dashboard.
     * *
     * {@code favourite} Returns {@code isFavourite}, an indicator of whether the user has set the dashboard as a favorite.
     * *
     * {@code favouritedCount} Returns {@code popularity}, a count of how many users have set this dashboard as a favorite.
     * *
     * {@code sharePermissions} Returns details of the share permissions defined for the dashboard.
     * *
     * {@code editPermissions} Returns details of the edit permissions defined for the dashboard.
     * *
     * {@code isWritable} Returns whether the current user has permission to edit the dashboard.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetDashboardsPaginatedOperationSpec}.
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
     * Constructs a validated instance of {@link GetDashboardsPaginatedOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param dashboardName        String used to perform a case-insensitive partial match with {@code name}.
     * @param accountId            User account ID used to return dashboards with the matching {@code owner.accountId}. This parameter cannot be used with the {@code owner} parameter.
     * @param owner                This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching {@code owner.name}. This parameter cannot be used with the {@code accountId} parameter.
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended. Group name used to return dashboards that are shared with a group that matches {@code sharePermissions.group.name}. This parameter cannot be used with the {@code groupId} parameter.
     * @param groupId              Group ID used to return dashboards that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter.
     * @param projectId            Project ID used to returns dashboards that are shared with a project that matches {@code sharePermissions.project.id}.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  {@code favourite_count} Sorts by dashboard popularity.  *  {@code id} Sorts by dashboard ID.  *  {@code is_favourite} Sorts by whether the dashboard is marked as a favorite.  *  {@code name} Sorts by dashboard name.  *  {@code owner} Sorts by dashboard owner name.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param status               The status to filter by. It may be active, archived or deleted.
     * @param expand               Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code description} Returns the description of the dashboard.  *  {@code owner} Returns the owner of the dashboard.  *  {@code viewUrl} Returns the URL that is used to view the dashboard.  *  {@code favourite} Returns {@code isFavourite}, an indicator of whether the user has set the dashboard as a favorite.  *  {@code favouritedCount} Returns {@code popularity}, a count of how many users have set this dashboard as a favorite.  *  {@code sharePermissions} Returns details of the share permissions defined for the dashboard.  *  {@code editPermissions} Returns details of the edit permissions defined for the dashboard.  *  {@code isWritable} Returns whether the current user has permission to edit the dashboard.
     */
    @ApiStatus.Internal
    public GetDashboardsPaginatedOperationSpec(String dashboardName, String accountId, String owner, String groupname, String groupId, Long projectId, String orderBy, Long startAt, Integer maxResults, String status, String expand) {
        this.dashboardName = dashboardName;
        this.accountId = accountId;
        this.owner = owner;
        this.groupname = groupname;
        this.groupId = groupId;
        this.projectId = projectId;
        this.orderBy = orderBy;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.status = status;
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
