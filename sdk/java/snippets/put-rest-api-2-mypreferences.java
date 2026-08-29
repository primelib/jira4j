import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2MypreferencesV1OperationSpec;

public class Put2MypreferencesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.myselfApi().put2MypreferencesV1(new Put2MypreferencesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.key(/* String */); // key: required - The key of the preference. The maximum length is 255 characters.
                    // spec.payload(/* String */); // payload: required - The value of the preference as a plain text string. The maximum length is 255 characters.

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
                case Put2MypreferencesV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Put2MypreferencesV1Response.Unknown r -> {
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
