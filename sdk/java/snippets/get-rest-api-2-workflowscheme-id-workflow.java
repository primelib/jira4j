import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WorkflowschemeByIdWorkflowV1OperationSpec;

public class Get2WorkflowschemeByIdWorkflowV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemesApi().get2WorkflowschemeByIdWorkflowV1(new Get2WorkflowschemeByIdWorkflowV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the workflow scheme.
                    // spec.workflowName(/* String */); // workflowName: optional - The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
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
                case Get2WorkflowschemeByIdWorkflowV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WorkflowschemeByIdWorkflowV1Response.Unknown r -> {
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
