import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.GetForge1AppPropertyByPropertyKeyV1OperationSpec;

public class GetForge1AppPropertyByPropertyKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.appPropertiesApi().getForge1AppPropertyByPropertyKeyV1(new GetForge1AppPropertyByPropertyKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.propertyKey(/* String */); // propertyKey: required - The key of the property.

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
                case GetForge1AppPropertyByPropertyKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case GetForge1AppPropertyByPropertyKeyV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case GetForge1AppPropertyByPropertyKeyV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case GetForge1AppPropertyByPropertyKeyV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case GetForge1AppPropertyByPropertyKeyV1Response.Unknown r -> {
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
