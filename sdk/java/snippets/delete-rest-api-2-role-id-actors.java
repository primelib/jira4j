import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2RoleByIdActorsV1OperationSpec;

public class Delete2RoleByIdActorsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectRoleActorsApi().delete2RoleByIdActorsV1(new Delete2RoleByIdActorsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
                    // spec.user(/* String */); // user: optional - The user account ID of the user to remove as a default actor.
                    // spec.groupId(/* String */); // groupId: optional - The group ID of the group to be removed as a default actor. This parameter cannot be used with the `group` parameter.
                    // spec.group(/* String */); // group: optional - The group name of the group to be removed as a default actor.This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.

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
                case Delete2RoleByIdActorsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Delete2RoleByIdActorsV1Response.Unknown r -> {
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
