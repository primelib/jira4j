import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssueByIssueIdOrKeyWorklogMoveV1OperationSpec;

public class Post2IssueByIssueIdOrKeyWorklogMoveV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueWorklogsApi().post2IssueByIssueIdOrKeyWorklogMoveV1(new Post2IssueByIssueIdOrKeyWorklogMoveV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required
                    // spec.adjustEstimate(/* String */); // adjustEstimate: optional - Defines how to update the issues' time estimate, the options are:   *  `leave` Leaves the estimate unchanged.  *  `auto` Reduces the estimate by the aggregate value of `timeSpent` across all worklogs being moved in the source issue, and increases it in the destination issue.
                    // spec.overrideEditableFlag(/* Boolean */); // overrideEditableFlag: optional - Whether the work log entry should be moved to and from the issues even if the issues are not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag.
                    // spec.payload(/* WorklogsMoveRequestBean */); // payload: required - A JSON object containing a list of worklog IDs and the ID or key of the destination issue.

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
                case Post2IssueByIssueIdOrKeyWorklogMoveV1Response.Unknown r -> {
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
