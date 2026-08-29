import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2PermissionschemeBySchemeIdPermissionByPermissionIdV1OperationSpec;

public class Delete2PermissionschemeBySchemeIdPermissionByPermissionIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.permissionSchemesApi().delete2PermissionschemeBySchemeIdPermissionByPermissionIdV1(new Delete2PermissionschemeBySchemeIdPermissionByPermissionIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.schemeId(/* Long */); // schemeId: required - The ID of the permission scheme to delete the permission grant from.
                    // spec.permissionId(/* Long */); // permissionId: required - The ID of the permission grant to delete.

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
                case Delete2PermissionschemeBySchemeIdPermissionByPermissionIdV1Response.Unknown r -> {
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
