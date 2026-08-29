import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.PostAtlassianConnect1AppModuleDynamicV1OperationSpec;

public class PostAtlassianConnect1AppModuleDynamicV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dynamicModulesApi().postAtlassianConnect1AppModuleDynamicV1(new PostAtlassianConnect1AppModuleDynamicV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* ConnectModules */); // payload: required

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
                case PostAtlassianConnect1AppModuleDynamicV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case PostAtlassianConnect1AppModuleDynamicV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case PostAtlassianConnect1AppModuleDynamicV1Response.Unknown r -> {
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
