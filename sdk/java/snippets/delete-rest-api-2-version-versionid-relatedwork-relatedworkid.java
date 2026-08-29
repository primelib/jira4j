import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2VersionByVersionIdRelatedworkByRelatedWorkIdV1OperationSpec;

public class Delete2VersionByVersionIdRelatedworkByRelatedWorkIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectVersionsApi().delete2VersionByVersionIdRelatedworkByRelatedWorkIdV1(new Delete2VersionByVersionIdRelatedworkByRelatedWorkIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.versionId(/* String */); // versionId: required - The ID of the version that the target related work belongs to.
                    // spec.relatedWorkId(/* String */); // relatedWorkId: required - The ID of the related work to delete.

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
                case Delete2VersionByVersionIdRelatedworkByRelatedWorkIdV1Response.Unknown r -> {
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
