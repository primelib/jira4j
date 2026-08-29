import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FilterSearchV1OperationSpec;

public class Get2FilterSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.filtersApi().get2FilterSearchV1(new Get2FilterSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.filterName(/* String */); // filterName: optional - String used to perform a case-insensitive partial match with `name`.
                    // spec.accountId(/* String */); // accountId: optional - User account ID used to return filters with the matching `owner.accountId`. This parameter cannot be used with `owner`.
                    // spec.owner(/* String */); // owner: optional - This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return filters with the matching `owner.name`. This parameter cannot be used with `accountId`.
                    // spec.groupname(/* String */); // groupname: optional - As a group's name can change, use of `groupId` is recommended to identify a group. Group name used to returns filters that are shared with a group that matches `sharePermissions.group.groupname`. This parameter cannot be used with the `groupId` parameter.
                    // spec.groupId(/* String */); // groupId: optional - Group ID used to returns filters that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter.
                    // spec.projectId(/* Long */); // projectId: optional - Project ID used to returns filters that are shared with a project that matches `sharePermissions.project.id`.
                    // spec.id(/* List<Long> */); // id: optional - The list of filter IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. Do not exceed 200 filter IDs.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field:   *  `description` Sorts by filter description. Note that this sorting works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by the count of how many users have this filter as a favorite.  *  `is_favourite` Sorts by whether the filter is marked as a favorite.  *  `id` Sorts by filter ID.  *  `name` Sorts by filter name.  *  `owner` Sorts by the ID of the filter owner.  *  `is_shared` Sorts by whether the filter is shared.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the filter.  *  `favourite` Returns an indicator of whether the user has set the filter as a favorite.  *  `favouritedCount` Returns a count of how many users have set this filter as a favorite.  *  `jql` Returns the JQL query that the filter uses.  *  `owner` Returns the owner of the filter.  *  `searchUrl` Returns a URL to perform the filter's JQL query.  *  `sharePermissions` Returns the share permissions defined for the filter.  *  `editPermissions` Returns the edit permissions defined for the filter.  *  `isWritable` Returns whether the current user has permission to edit the filter.  *  `approximateLastUsed` \[Experimental\] Returns the approximate date and time when the filter was last evaluated.  *  `subscriptions` Returns the users that are subscribed to the filter.  *  `viewUrl` Returns a URL to view the filter.
                    // spec.overrideSharePermissions(/* Boolean */); // overrideSharePermissions: optional - EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
                    // spec.isSubstringMatch(/* Boolean */); // isSubstringMatch: optional - When `true` this will perform a case-insensitive substring match for the provided `filterName`. When `false` the filter name will be searched using [full text search syntax](https://support.atlassian.com/jira-software-cloud/docs/search-for-issues-using-the-text-field/).

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
                case Get2FilterSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FilterSearchV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2FilterSearchV1Response.Unknown r -> {
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
