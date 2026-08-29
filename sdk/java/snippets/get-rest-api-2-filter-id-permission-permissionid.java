import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FilterByIdPermissionByPermissionIdV1OperationSpec;

public class Get2FilterByIdPermissionByPermissionIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.filterSharingApi().get2FilterByIdPermissionByPermissionIdV1(new Get2FilterByIdPermissionByPermissionIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the filter.
                    // spec.permissionId(/* Long */); // permissionId: required - The ID of the share permission.

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
                case Get2FilterByIdPermissionByPermissionIdV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FilterByIdPermissionByPermissionIdV1Response.Unknown r -> {
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
