import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1OperationSpec;

public class Put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectFeaturesApi().put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1(new Put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdOrKey(/* String */); // projectIdOrKey: required - The ID or (case-sensitive) key of the project.
                    // spec.featureKey(/* String */); // featureKey: required - The key of the feature.
                    // spec.payload(/* ProjectFeatureState */); // payload: required - Details of the feature state change.

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
                case Put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2ProjectByProjectIdOrKeyFeatureByFeatureKeyV1Response.Unknown r -> {
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
