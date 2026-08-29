import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2UniversalAvatarViewTypeByTypeV1OperationSpec;

public class Get2UniversalAvatarViewTypeByTypeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.avatarsApi().get2UniversalAvatarViewTypeByTypeV1(new Get2UniversalAvatarViewTypeByTypeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.type(/* String */); // type: required - The icon type of the avatar.
                    // spec.size(/* String */); // size: optional - The size of the avatar image. If not provided the default size is returned.
                    // spec.format(/* String */); // format: optional - The format to return the avatar image in. If not provided the original content format is returned.

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
                case Get2UniversalAvatarViewTypeByTypeV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2UniversalAvatarViewTypeByTypeV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2UniversalAvatarViewTypeByTypeV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2UniversalAvatarViewTypeByTypeV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2UniversalAvatarViewTypeByTypeV1Response.Unknown r -> {
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
