import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2ScreenByScreenIdTabByTabIdFieldByIdV1OperationSpec;

public class Delete2ScreenByScreenIdTabByTabIdFieldByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.screenTabFieldsApi().delete2ScreenByScreenIdTabByTabIdFieldByIdV1(new Delete2ScreenByScreenIdTabByTabIdFieldByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.screenId(/* Long */); // screenId: required - The ID of the screen.
                    // spec.tabId(/* Long */); // tabId: required - The ID of the screen tab.
                    // spec.id(/* String */); // id: required - The ID of the field.

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
                case Delete2ScreenByScreenIdTabByTabIdFieldByIdV1Response.Unknown r -> {
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
