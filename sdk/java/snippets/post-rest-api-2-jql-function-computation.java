import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2JqlFunctionComputationV1OperationSpec;

public class Post2JqlFunctionComputationV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.jqlFunctionsAppsApi().post2JqlFunctionComputationV1(new Post2JqlFunctionComputationV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.skipNotFoundPrecomputations(/* Boolean */); // skipNotFoundPrecomputations: optional
                    // spec.payload(/* JqlFunctionPrecomputationUpdateRequestBean */); // payload: required

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
                case Post2JqlFunctionComputationV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Post2JqlFunctionComputationV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Post2JqlFunctionComputationV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2JqlFunctionComputationV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2JqlFunctionComputationV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Post2JqlFunctionComputationV1Response.Unknown r -> {
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
