import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2MypermissionsV1OperationSpec;

public class Get2MypermissionsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.permissionsApi().get2MypermissionsV1(new Get2MypermissionsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectKey(/* String */); // projectKey: optional - The key of project. Ignored if `projectId` is provided.
                    // spec.projectId(/* String */); // projectId: optional - The ID of project.
                    // spec.issueKey(/* String */); // issueKey: optional - The key of the issue. Ignored if `issueId` is provided.
                    // spec.issueId(/* String */); // issueId: optional - The ID of the issue.
                    // spec.permissions(/* String */); // permissions: optional - A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-2-permissions-get).
                    // spec.projectUuid(/* String */); // projectUuid: optional
                    // spec.projectConfigurationUuid(/* String */); // projectConfigurationUuid: optional
                    // spec.commentId(/* String */); // commentId: optional - The ID of the comment.

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
                case Get2MypermissionsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2MypermissionsV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2MypermissionsV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2MypermissionsV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2MypermissionsV1Response.Unknown r -> {
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
