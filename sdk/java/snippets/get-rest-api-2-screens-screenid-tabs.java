import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ScreenByScreenIdTabsV1OperationSpec;

public class Get2ScreenByScreenIdTabsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.screenTabsApi().get2ScreenByScreenIdTabsV1(new Get2ScreenByScreenIdTabsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.screenId(/* Long */); // screenId: required - The ID of the screen.
                    // spec.projectKey(/* String */); // projectKey: optional - The key of the project.

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
                case Get2ScreenByScreenIdTabsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ScreenByScreenIdTabsV1Response.Unknown r -> {
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
