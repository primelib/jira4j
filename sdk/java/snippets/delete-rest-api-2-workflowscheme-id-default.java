import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2WorkflowschemeByIdDefaultV1OperationSpec;

public class Delete2WorkflowschemeByIdDefaultV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemesApi().delete2WorkflowschemeByIdDefaultV1(new Delete2WorkflowschemeByIdDefaultV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the workflow scheme.
                    // spec.updateDraftIfNeeded(/* Boolean */); // updateDraftIfNeeded: optional - Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.

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
                case Delete2WorkflowschemeByIdDefaultV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Delete2WorkflowschemeByIdDefaultV1Response.Unknown r -> {
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
