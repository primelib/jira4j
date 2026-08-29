import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2UiModificationByUiModificationIdV1OperationSpec;

public class Put2UiModificationByUiModificationIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.uiModificationsAppsApi().put2UiModificationByUiModificationIdV1(new Put2UiModificationByUiModificationIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.uiModificationId(/* String */); // uiModificationId: required - The ID of the UI modification.
                    // spec.payload(/* UpdateUiModificationDetails */); // payload: required - Details of the UI modification.

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
                case Put2UiModificationByUiModificationIdV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Put2UiModificationByUiModificationIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Put2UiModificationByUiModificationIdV1Response.Unknown r -> {
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
