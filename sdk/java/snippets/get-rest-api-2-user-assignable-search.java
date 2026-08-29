import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2UserAssignableSearchV1OperationSpec;

public class Get2UserAssignableSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.userSearchApi().get2UserAssignableSearchV1(new Get2UserAssignableSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.query(/* String */); // query: optional - A query string that is matched against user attributes, such as `displayName`, and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `username` or `accountId` is specified.
                    // spec.sessionId(/* String */); // sessionId: optional - The sessionId of this request. SessionId is the same until the assignee is set.
                    // spec.username(/* String */); // username: optional - This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
                    // spec.accountId(/* String */); // accountId: optional - A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
                    // spec.project(/* String */); // project: optional - The project ID or project key (case sensitive). Required, unless `issueKey` or `issueId` is specified.
                    // spec.issueKey(/* String */); // issueKey: optional - The key of the issue. Required, unless `issueId` or `project` is specified.
                    // spec.issueId(/* String */); // issueId: optional - The ID of the issue. Required, unless `issueKey` or `project` is specified.
                    // spec.startAt(/* Integer */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue.
                    // spec.actionDescriptorId(/* Integer */); // actionDescriptorId: optional - The ID of the transition.
                    // spec.recommend(/* Boolean */); // recommend: optional
                    // spec.accountType(/* List<String> */); // accountType: optional
                    // spec.appType(/* List<String> */); // appType: optional

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
                case Get2UserAssignableSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2UserAssignableSearchV1Response.Unknown r -> {
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
