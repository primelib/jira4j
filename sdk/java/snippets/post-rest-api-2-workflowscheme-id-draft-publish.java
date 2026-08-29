import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2WorkflowschemeByIdDraftPublishV1OperationSpec;

public class Post2WorkflowschemeByIdDraftPublishV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowSchemeDraftsApi().post2WorkflowschemeByIdDraftPublishV1(new Post2WorkflowschemeByIdDraftPublishV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the workflow scheme that the draft belongs to.
                    // spec.validateOnly(/* Boolean */); // validateOnly: optional - Whether the request only performs a validation.
                    // spec.payload(/* PublishDraftWorkflowScheme */); // payload: required - Details of the status mappings.

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
                case Post2WorkflowschemeByIdDraftPublishV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Post2WorkflowschemeByIdDraftPublishV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2WorkflowschemeByIdDraftPublishV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Post2WorkflowschemeByIdDraftPublishV1Response.Unknown r -> {
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
