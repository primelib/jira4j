import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssuePropertiesV1OperationSpec;

public class Post2IssuePropertiesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuePropertiesApi().post2IssuePropertiesV1(new Post2IssuePropertiesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* IssueEntityProperties */); // payload: required - Issue properties to be set or updated with values.

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
                case Post2IssuePropertiesV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2IssuePropertiesV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Post2IssuePropertiesV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Post2IssuePropertiesV1Response.Unknown r -> {
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
