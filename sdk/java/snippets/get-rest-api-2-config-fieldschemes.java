import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ConfigFieldschemesV1OperationSpec;

public class Get2ConfigFieldschemesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.fieldSchemesApi().get2ConfigFieldschemesV1(new Get2ConfigFieldschemesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectId(/* List<Long> */); // projectId: optional - (optional) List of project IDs to filter schemes by. If not provided, schemes from all projects are returned.
                    // spec.query(/* String */); // query: optional - (optional) Text filter for scheme name or description matching (case-insensitive). If not provided, no text filtering is applied.
                    // spec.startAt(/* Long */); // startAt: optional - Zero-based index of the first item to return (default: 0)
                    // spec.maxResults(/* Integer */); // maxResults: optional - Maximum number of items to return per page (default: 50, max: 100)

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
                case Get2ConfigFieldschemesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesV1Response.Unknown r -> {
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
