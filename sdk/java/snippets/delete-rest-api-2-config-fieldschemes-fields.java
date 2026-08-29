import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2ConfigFieldschemesFieldsV1OperationSpec;

public class Delete2ConfigFieldschemesFieldsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.fieldSchemesApi().delete2ConfigFieldschemesFieldsV1(new Delete2ConfigFieldschemesFieldsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* Delete2ConfigFieldschemesFieldsV1B */); // payload: required - The request containing the schemes and fields to be removed.

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
                case Delete2ConfigFieldschemesFieldsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.Status207Response r -> {
                    // handle 207, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2ConfigFieldschemesFieldsV1Response.Unknown r -> {
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
