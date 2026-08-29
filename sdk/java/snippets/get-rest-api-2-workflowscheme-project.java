import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WorkflowschemeProjectV1OperationSpec;

public class Get2WorkflowschemeProjectV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemeProjectAssociationsApi().get2WorkflowschemeProjectV1(new Get2WorkflowschemeProjectV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectId(/* List<Long> */); // projectId: required - The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, `projectId=10000&projectId=10001`.

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
                case Get2WorkflowschemeProjectV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WorkflowschemeProjectV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2WorkflowschemeProjectV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2WorkflowschemeProjectV1Response.Unknown r -> {
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
