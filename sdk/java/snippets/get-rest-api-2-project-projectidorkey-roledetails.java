import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ProjectByProjectIdOrKeyRoledetailsV1OperationSpec;

public class Get2ProjectByProjectIdOrKeyRoledetailsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectRolesApi().get2ProjectByProjectIdOrKeyRoledetailsV1(new Get2ProjectByProjectIdOrKeyRoledetailsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdOrKey(/* String */); // projectIdOrKey: required - The project ID or project key (case sensitive).
                    // spec.currentMember(/* Boolean */); // currentMember: optional - Whether the roles should be filtered to include only those the user is assigned to.
                    // spec.excludeConnectAddons(/* Boolean */); // excludeConnectAddons: optional
                    // spec.excludeOtherServiceRoles(/* Boolean */); // excludeOtherServiceRoles: optional - Do not return the default JSM company-managed space from CSM spaces, or the default CSM roles from JSM spaces.

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
                case Get2ProjectByProjectIdOrKeyRoledetailsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ProjectByProjectIdOrKeyRoledetailsV1Response.Unknown r -> {
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
