import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1OperationSpec;

public class Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSecuritySchemesApi().delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1(new Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.schemeId(/* String */); // schemeId: required - The ID of the issue security scheme.
                    // spec.levelId(/* String */); // levelId: required - The ID of the issue security level to remove.
                    // spec.replaceWith(/* String */); // replaceWith: optional - The ID of the issue security level that will replace the currently selected level.

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
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Delete2IssuesecurityschemeBySchemeIdLevelByLevelIdV1Response.Unknown r -> {
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
