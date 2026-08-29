import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2DashboardSearchV1OperationSpec;

public class Get2DashboardSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dashboardsApi().get2DashboardSearchV1(new Get2DashboardSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.dashboardName(/* String */); // dashboardName: optional - String used to perform a case-insensitive partial match with `name`.
                    // spec.accountId(/* String */); // accountId: optional - User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter.
                    // spec.owner(/* String */); // owner: optional - This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter.
                    // spec.groupname(/* String */); // groupname: optional - As a group's name can change, use of `groupId` is recommended. Group name used to return dashboards that are shared with a group that matches `sharePermissions.group.name`. This parameter cannot be used with the `groupId` parameter.
                    // spec.groupId(/* String */); // groupId: optional - Group ID used to return dashboards that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter.
                    // spec.projectId(/* Long */); // projectId: optional - Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field:   *  `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by dashboard popularity.  *  `id` Sorts by dashboard ID.  *  `is_favourite` Sorts by whether the dashboard is marked as a favorite.  *  `name` Sorts by dashboard name.  *  `owner` Sorts by dashboard owner name.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.status(/* String */); // status: optional - The status to filter by. It may be active, archived or deleted.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the dashboard.  *  `owner` Returns the owner of the dashboard.  *  `viewUrl` Returns the URL that is used to view the dashboard.  *  `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.  *  `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.  *  `sharePermissions` Returns details of the share permissions defined for the dashboard.  *  `editPermissions` Returns details of the edit permissions defined for the dashboard.  *  `isWritable` Returns whether the current user has permission to edit the dashboard.

                    // optional request behavior controls
                    // spec.failOnError(true); // default=true: true => throws ApiResponseException for error status codes (4xx/5xx)
                    // spec.extraHeader("X-Request-Id", "demo-request-id");
                    // spec.extraQueryParam("debug", "true");
                    // spec.overrideAuthMethod(...);
                }));

            // Direct data access (failOnError = true)
            var data = response.data();

            /*
            // Pattern matching (failOnError = false)
            switch (response) {
                case Get2DashboardSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2DashboardSearchV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2DashboardSearchV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2DashboardSearchV1Response.Unknown r -> {
                    // handle unexpected codes
                }
            }
            */
        } catch (ApiResponseException ex) {
            // Triggered when failOnError=true and the API returns an error status.
            // ex.getStatusCode(), ex.getResponseBody()
        }
    }
}
