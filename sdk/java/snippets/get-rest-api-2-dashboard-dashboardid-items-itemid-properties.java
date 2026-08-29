import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2DashboardByDashboardIdItemByItemIdPropertiesV1OperationSpec;

public class Get2DashboardByDashboardIdItemByItemIdPropertiesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dashboardsApi().get2DashboardByDashboardIdItemByItemIdPropertiesV1(new Get2DashboardByDashboardIdItemByItemIdPropertiesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.dashboardId(/* String */); // dashboardId: required - The ID of the dashboard.
                    // spec.itemId(/* String */); // itemId: required - The ID of the dashboard item.

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
                case Get2DashboardByDashboardIdItemByItemIdPropertiesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2DashboardByDashboardIdItemByItemIdPropertiesV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2DashboardByDashboardIdItemByItemIdPropertiesV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2DashboardByDashboardIdItemByItemIdPropertiesV1Response.Unknown r -> {
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
