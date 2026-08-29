import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PermissionschemeBySchemeIdPermissionV1OperationSpec;

public class Get2PermissionschemeBySchemeIdPermissionV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.permissionSchemesApi().get2PermissionschemeBySchemeIdPermissionV1(new Get2PermissionschemeBySchemeIdPermissionV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.schemeId(/* Long */); // schemeId: required - The ID of the permission scheme.
                    // spec.expand(/* String */); // expand: optional - Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `permissions` Returns all permission grants for each permission scheme.  *  `user` Returns information about the user who is granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `field` Returns information about the custom field granted the permission.  *  `all` Returns all expandable information.

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
                case Get2PermissionschemeBySchemeIdPermissionV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PermissionschemeBySchemeIdPermissionV1Response.Unknown r -> {
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
