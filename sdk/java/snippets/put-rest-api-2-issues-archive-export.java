import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssuesArchiveExportV1OperationSpec;

public class Put2IssuesArchiveExportV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().put2IssuesArchiveExportV1(new Put2IssuesArchiveExportV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* Map<String, Object> */); // payload: required - You can filter the issues in your request by the `projects`, `archivedBy`, `archivedDate`, `issueTypes`, and `reporters` fields. All filters are optional. If you don't provide any filters, you'll get a list of up to one million archived issues.

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
                case Put2IssuesArchiveExportV1Response.Status202Response r -> {
                    // handle 202, r.data() contains typed payload
                }
                case Put2IssuesArchiveExportV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Put2IssuesArchiveExportV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Put2IssuesArchiveExportV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Put2IssuesArchiveExportV1Response.Status412Response r -> {
                    // handle 412, r.data() contains typed payload
                }
                case Put2IssuesArchiveExportV1Response.Unknown r -> {
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
