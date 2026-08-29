import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2DashboardByDashboardIdGadgetByGadgetIdV1OperationSpec;

public class Delete2DashboardByDashboardIdGadgetByGadgetIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dashboardsApi().delete2DashboardByDashboardIdGadgetByGadgetIdV1(new Delete2DashboardByDashboardIdGadgetByGadgetIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.dashboardId(/* Long */); // dashboardId: required - The ID of the dashboard.
                    // spec.gadgetId(/* Long */); // gadgetId: required - The ID of the gadget.

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
                case Delete2DashboardByDashboardIdGadgetByGadgetIdV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Delete2DashboardByDashboardIdGadgetByGadgetIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Delete2DashboardByDashboardIdGadgetByGadgetIdV1Response.Unknown r -> {
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
