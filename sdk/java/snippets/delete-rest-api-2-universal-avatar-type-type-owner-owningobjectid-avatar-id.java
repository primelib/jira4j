import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2UniversalAvatarTypeByTypeOwnerByOwningObjectIdAvatarByIdV1OperationSpec;

public class Delete2UniversalAvatarTypeByTypeOwnerByOwningObjectIdAvatarByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.avatarsApi().delete2UniversalAvatarTypeByTypeOwnerByOwningObjectIdAvatarByIdV1(new Delete2UniversalAvatarTypeByTypeOwnerByOwningObjectIdAvatarByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.type(/* String */); // type: required - The avatar type.
                    // spec.owningObjectId(/* String */); // owningObjectId: required - The ID of the item the avatar is associated with.
                    // spec.id(/* Long */); // id: required - The ID of the avatar.

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
                case Delete2UniversalAvatarTypeByTypeOwnerByOwningObjectIdAvatarByIdV1Response.Unknown r -> {
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
