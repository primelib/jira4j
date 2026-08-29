import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssuePickerV1OperationSpec;

public class Get2IssuePickerV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSearchApi().get2IssuePickerV1(new Get2IssuePickerV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.query(/* String */); // query: optional - A string to match against text fields in the issue such as title, description, or comments.
                    // spec.currentJql(/* String */); // currentJql: optional - A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead.
                    // spec.currentIssueKey(/* String */); // currentIssueKey: optional - The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
                    // spec.currentProjectId(/* String */); // currentProjectId: optional - The ID of a project that suggested issues must belong to.
                    // spec.showSubTasks(/* Boolean */); // showSubTasks: optional - Indicate whether to include subtasks in the suggestions list.
                    // spec.showSubTaskParent(/* Boolean */); // showSubTaskParent: optional - When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query.

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
                case Get2IssuePickerV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssuePickerV1Response.Unknown r -> {
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
