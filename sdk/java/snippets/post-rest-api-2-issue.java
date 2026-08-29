import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssueV1OperationSpec;

public class Post2IssueV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().post2IssueV1(new Post2IssueV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.updateHistory(/* Boolean */); // updateHistory: optional - Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. When provided, the issue type and request type are added to the user's history for a project. These values are then used to provide defaults on the issue create screen.
                    // spec.payload(/* Map<String, Object> */); // payload: required

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
                case Post2IssueV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Post2IssueV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2IssueV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Post2IssueV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2IssueV1Response.Status422Response r -> {
                    // handle 422, r.data() contains typed payload
                }
                case Post2IssueV1Response.Unknown r -> {
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
