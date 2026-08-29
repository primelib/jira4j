import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2ScreenByScreenIdV1OperationSpec;

public class Put2ScreenByScreenIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.screensApi().put2ScreenByScreenIdV1(new Put2ScreenByScreenIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.screenId(/* Long */); // screenId: required - The ID of the screen.
                    // spec.payload(/* UpdateScreenDetails */); // payload: required

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
                case Put2ScreenByScreenIdV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2ScreenByScreenIdV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Put2ScreenByScreenIdV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Put2ScreenByScreenIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Put2ScreenByScreenIdV1Response.Unknown r -> {
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
