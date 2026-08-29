import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2UserPermissionSearchV1OperationSpec;

public class Get2UserPermissionSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.userSearchApi().get2UserPermissionSearchV1(new Get2UserPermissionSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.query(/* String */); // query: optional - A query string that is matched against user attributes, such as `displayName` and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` is specified.
                    // spec.username(/* String */); // username: optional - This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
                    // spec.accountId(/* String */); // accountId: optional - A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
                    // spec.permissions(/* String */); // permissions: required - A comma separated list of permissions. Permissions can be specified as any:   *  permission returned by [Get all permissions](#api-rest-api-2-permissions-get).  *  custom project permission added by Connect apps.  *  (deprecated) one of the following:           *  ASSIGNABLE\_USER      *  ASSIGN\_ISSUE      *  ATTACHMENT\_DELETE\_ALL      *  ATTACHMENT\_DELETE\_OWN      *  BROWSE      *  CLOSE\_ISSUE      *  COMMENT\_DELETE\_ALL      *  COMMENT\_DELETE\_OWN      *  COMMENT\_EDIT\_ALL      *  COMMENT\_EDIT\_OWN      *  COMMENT\_ISSUE      *  CREATE\_ATTACHMENT      *  CREATE\_ISSUE      *  DELETE\_ISSUE      *  EDIT\_ISSUE      *  LINK\_ISSUE      *  MANAGE\_WATCHER\_LIST      *  MODIFY\_REPORTER      *  MOVE\_ISSUE      *  PROJECT\_ADMIN      *  RESOLVE\_ISSUE      *  SCHEDULE\_ISSUE      *  SET\_ISSUE\_SECURITY      *  TRANSITION\_ISSUE      *  VIEW\_VERSION\_CONTROL      *  VIEW\_VOTERS\_AND\_WATCHERS      *  VIEW\_WORKFLOW\_READONLY      *  WORKLOG\_DELETE\_ALL      *  WORKLOG\_DELETE\_OWN      *  WORKLOG\_EDIT\_ALL      *  WORKLOG\_EDIT\_OWN      *  WORK\_ISSUE
                    // spec.issueKey(/* String */); // issueKey: optional - The issue key for the issue.
                    // spec.projectKey(/* String */); // projectKey: optional - The project key for the project (case sensitive).
                    // spec.startAt(/* Integer */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.

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
                case Get2UserPermissionSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2UserPermissionSearchV1Response.Unknown r -> {
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
