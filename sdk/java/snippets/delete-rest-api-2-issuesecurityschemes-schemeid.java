import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2IssuesecurityschemeBySchemeIdV1OperationSpec;

public class Delete2IssuesecurityschemeBySchemeIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSecuritySchemesApi().delete2IssuesecurityschemeBySchemeIdV1(new Delete2IssuesecurityschemeBySchemeIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.schemeId(/* String */); // schemeId: required - The ID of the issue security scheme.

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
                case Delete2IssuesecurityschemeBySchemeIdV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdV1Response.Unknown r -> {
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
