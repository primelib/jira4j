import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1OperationSpec;

public class Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueTypeSchemesApi().put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1(new Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueTypeSchemeId(/* Long */); // issueTypeSchemeId: required - The ID of the issue type scheme.
                    // spec.payload(/* IssueTypeIds */); // payload: required

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
                case Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Put2IssuetypeschemeByIssueTypeSchemeIdIssuetypeV1Response.Unknown r -> {
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
