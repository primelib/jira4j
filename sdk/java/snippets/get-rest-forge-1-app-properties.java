import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.GetForge1AppPropertiesV1OperationSpec;

public class GetForge1AppPropertiesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.appPropertiesApi().getForge1AppPropertiesV1(new GetForge1AppPropertiesV1OperationSpec(spec -> {
                    // no operation-specific parameters

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
                case GetForge1AppPropertiesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case GetForge1AppPropertiesV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case GetForge1AppPropertiesV1Response.Unknown r -> {
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
