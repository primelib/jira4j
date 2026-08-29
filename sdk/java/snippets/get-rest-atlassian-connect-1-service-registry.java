import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.GetAtlassianConnect1ServiceRegistryV1OperationSpec;

public class GetAtlassianConnect1ServiceRegistryV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.serviceRegistryApi().getAtlassianConnect1ServiceRegistryV1(new GetAtlassianConnect1ServiceRegistryV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.serviceIds(/* List<String> */); // serviceIds: required - The ID of the services (the strings starting with "b:" need to be decoded in Base64).

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
                case GetAtlassianConnect1ServiceRegistryV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case GetAtlassianConnect1ServiceRegistryV1Response.Unknown r -> {
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
