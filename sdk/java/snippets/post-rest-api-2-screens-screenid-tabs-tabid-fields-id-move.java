import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1OperationSpec;

public class Post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.screenTabFieldsApi().post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1(new Post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.screenId(/* Long */); // screenId: required - The ID of the screen.
                    // spec.tabId(/* Long */); // tabId: required - The ID of the screen tab.
                    // spec.id(/* String */); // id: required - The ID of the field.
                    // spec.payload(/* MoveFieldBean */); // payload: required

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
                case Post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Post2ScreenByScreenIdTabByTabIdFieldByIdMoveV1Response.Unknown r -> {
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
