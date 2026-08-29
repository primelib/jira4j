import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssueUnarchiveV1OperationSpec;

public class Put2IssueUnarchiveV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().put2IssueUnarchiveV1(new Put2IssueUnarchiveV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* IssueArchivalSyncRequest */); // payload: required - Contains a list of issue keys or IDs to be unarchived.

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
                case Put2IssueUnarchiveV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2IssueUnarchiveV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Put2IssueUnarchiveV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Put2IssueUnarchiveV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Put2IssueUnarchiveV1Response.Status412Response r -> {
                    // handle 412, r.data() contains typed payload
                }
                case Put2IssueUnarchiveV1Response.Unknown r -> {
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
