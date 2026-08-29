import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2UniversalAvatarTypeByTypeOwnerByEntityIdV1OperationSpec;

public class Post2UniversalAvatarTypeByTypeOwnerByEntityIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.avatarsApi().post2UniversalAvatarTypeByTypeOwnerByEntityIdV1(new Post2UniversalAvatarTypeByTypeOwnerByEntityIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.type(/* String */); // type: required - The avatar type.
                    // spec.entityId(/* String */); // entityId: required - The ID of the item the avatar is associated with.
                    // spec.x(/* Integer */); // x: optional - The X coordinate of the top-left corner of the crop region.
                    // spec.y(/* Integer */); // y: optional - The Y coordinate of the top-left corner of the crop region.
                    // spec.size(/* Integer */); // size: required - The length of each side of the crop region.
                    // spec.payload(/* Object */); // payload: required

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
                case Post2UniversalAvatarTypeByTypeOwnerByEntityIdV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Post2UniversalAvatarTypeByTypeOwnerByEntityIdV1Response.Unknown r -> {
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
