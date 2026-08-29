import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1OperationSpec;

public class Get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueWorklogPropertiesApi().get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1(new Get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.worklogId(/* String */); // worklogId: required - The ID of the worklog.

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
                case Get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssueByIssueIdOrKeyWorklogByWorklogIdPropertiesV1Response.Unknown r -> {
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
