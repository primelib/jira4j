import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WorkflowschemeByIdIssuetypeByIssueTypeV1OperationSpec;

public class Get2WorkflowschemeByIdIssuetypeByIssueTypeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemesApi().get2WorkflowschemeByIdIssuetypeByIssueTypeV1(new Get2WorkflowschemeByIdIssuetypeByIssueTypeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the workflow scheme.
                    // spec.issueType(/* String */); // issueType: required - The ID of the issue type.
                    // spec.returnDraftIfExists(/* Boolean */); // returnDraftIfExists: optional - Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.

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
                case Get2WorkflowschemeByIdIssuetypeByIssueTypeV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WorkflowschemeByIdIssuetypeByIssueTypeV1Response.Unknown r -> {
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
