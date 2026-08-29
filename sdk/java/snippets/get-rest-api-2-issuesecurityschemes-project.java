import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssuesecurityschemesProjectV1OperationSpec;

public class Get2IssuesecurityschemesProjectV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSecuritySchemesApi().get2IssuesecurityschemesProjectV1(new Get2IssuesecurityschemesProjectV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.issueSecuritySchemeId(/* List<String> */); // issueSecuritySchemeId: optional - The list of security scheme IDs to be filtered out.
                    // spec.projectId(/* List<String> */); // projectId: optional - The list of project IDs to be filtered out.

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
                case Get2IssuesecurityschemesProjectV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesProjectV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesProjectV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesProjectV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesProjectV1Response.Unknown r -> {
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
