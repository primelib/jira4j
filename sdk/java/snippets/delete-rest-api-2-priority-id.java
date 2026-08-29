import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2PriorityByIdV1OperationSpec;

public class Delete2PriorityByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuePrioritiesApi().delete2PriorityByIdV1(new Delete2PriorityByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* String */); // id: required - The ID of the issue priority.

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
                case Delete2PriorityByIdV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Delete2PriorityByIdV1Response.Unknown r -> {
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
