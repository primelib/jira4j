import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2ProjectByProjectIdOrKeyRoleByIdV1OperationSpec;

public class Delete2ProjectByProjectIdOrKeyRoleByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectRoleActorsApi().delete2ProjectByProjectIdOrKeyRoleByIdV1(new Delete2ProjectByProjectIdOrKeyRoleByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdOrKey(/* String */); // projectIdOrKey: required - The project ID or project key (case sensitive).
                    // spec.id(/* Long */); // id: required - The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
                    // spec.user(/* String */); // user: optional - The user account ID of the user to remove from the project role.
                    // spec.group(/* String */); // group: optional - The name of the group to remove from the project role. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
                    // spec.groupId(/* String */); // groupId: optional - The ID of the group to remove from the project role. This parameter cannot be used with the `group` parameter.

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
                case Delete2ProjectByProjectIdOrKeyRoleByIdV1Response.Unknown r -> {
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
