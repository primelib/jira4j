import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssuePropertiesMultiV1OperationSpec;

public class Post2IssuePropertiesMultiV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuePropertiesApi().post2IssuePropertiesMultiV1(new Post2IssuePropertiesMultiV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* MultiIssueEntityProperties */); // payload: required - Details of the issue properties to be set or updated. Note that if an issue is not found, it is ignored.

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
                case Post2IssuePropertiesMultiV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2IssuePropertiesMultiV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Post2IssuePropertiesMultiV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2IssuePropertiesMultiV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Post2IssuePropertiesMultiV1Response.Unknown r -> {
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
