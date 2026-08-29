import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2WorkflowschemeProjectSwitchV1OperationSpec;

public class Post2WorkflowschemeProjectSwitchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemesApi().post2WorkflowschemeProjectSwitchV1(new Post2WorkflowschemeProjectSwitchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* Map<String, Object> */); // payload: required - The request containing project ID, target scheme ID, and any issue type mappings.

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
                case Post2WorkflowschemeProjectSwitchV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Post2WorkflowschemeProjectSwitchV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Post2WorkflowschemeProjectSwitchV1Response.Unknown r -> {
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
