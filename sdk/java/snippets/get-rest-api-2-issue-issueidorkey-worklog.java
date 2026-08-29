import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssueByIssueIdOrKeyWorklogV1OperationSpec;

public class Get2IssueByIssueIdOrKeyWorklogV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueWorklogsApi().get2IssueByIssueIdOrKeyWorklogV1(new Get2IssueByIssueIdOrKeyWorklogV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.startedAfter(/* Long */); // startedAfter: optional - The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned.
                    // spec.startedBefore(/* Long */); // startedBefore: optional - The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts`properties`, which returns worklog properties.

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
                case Get2IssueByIssueIdOrKeyWorklogV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssueByIssueIdOrKeyWorklogV1Response.Unknown r -> {
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
