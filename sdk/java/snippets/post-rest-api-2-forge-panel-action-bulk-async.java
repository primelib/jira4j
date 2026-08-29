import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2ForgePanelActionBulkAsyncV1OperationSpec;

public class Post2ForgePanelActionBulkAsyncV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuePanelsApi().post2ForgePanelActionBulkAsyncV1(new Post2ForgePanelActionBulkAsyncV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* ForgePanelProjectPinRequest */); // payload: required - Forge module ID and the list of projects with pin or unpin action.

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
                case Post2ForgePanelActionBulkAsyncV1Response.Status202Response r -> {
                    // handle 202, r.data() contains typed payload
                }
                case Post2ForgePanelActionBulkAsyncV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2ForgePanelActionBulkAsyncV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2ForgePanelActionBulkAsyncV1Response.Status500Response r -> {
                    // handle 500, r.data() contains typed payload
                }
                case Post2ForgePanelActionBulkAsyncV1Response.Unknown r -> {
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
