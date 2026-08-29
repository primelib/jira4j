import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssuesecurityschemesSearchV1OperationSpec;

public class Get2IssuesecurityschemesSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSecuritySchemesApi().get2IssuesecurityschemesSearchV1(new Get2IssuesecurityschemesSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.id(/* List<String> */); // id: optional - The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: `id=10000&id=10001`.
                    // spec.projectId(/* List<String> */); // projectId: optional - The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: `projectId=10000&projectId=10001`.

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
                case Get2IssuesecurityschemesSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesSearchV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesSearchV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesSearchV1Response.Unknown r -> {
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
