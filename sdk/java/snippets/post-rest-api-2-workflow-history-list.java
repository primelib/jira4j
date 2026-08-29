import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2WorkflowHistoryListV1OperationSpec;

public class Post2WorkflowHistoryListV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowsApi().post2WorkflowHistoryListV1(new Post2WorkflowHistoryListV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `includeIntermediateWorkflows` Includes intermediate workflow versions that are sometimes created during workflow updates or migrations. By default, these are omitted from the response.
                    // spec.payload(/* WorkflowHistoryListRequest */); // payload: required

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
                case Post2WorkflowHistoryListV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Post2WorkflowHistoryListV1Response.Unknown r -> {
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
