import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2ProjectByProjectIdOrKeyRoleByIdV1OperationSpec;

public class Post2ProjectByProjectIdOrKeyRoleByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectRoleActorsApi().post2ProjectByProjectIdOrKeyRoleByIdV1(new Post2ProjectByProjectIdOrKeyRoleByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdOrKey(/* String */); // projectIdOrKey: required - The project ID or project key (case sensitive).
                    // spec.id(/* Long */); // id: required - The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
                    // spec.payload(/* ActorsMap */); // payload: required - The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended.

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
                case Post2ProjectByProjectIdOrKeyRoleByIdV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Post2ProjectByProjectIdOrKeyRoleByIdV1Response.Unknown r -> {
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
