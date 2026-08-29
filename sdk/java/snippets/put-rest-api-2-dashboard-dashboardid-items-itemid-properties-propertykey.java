import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1OperationSpec;

public class Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dashboardsApi().put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1(new Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.dashboardId(/* String */); // dashboardId: required - The ID of the dashboard.
                    // spec.itemId(/* String */); // itemId: required - The ID of the dashboard item.
                    // spec.propertyKey(/* String */); // propertyKey: required - The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to "config", the request body's JSON must be an object with all keys and values as strings.
                    // spec.payload(/* Object */); // payload: required - The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes.

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
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Put2DashboardByDashboardIdItemByItemIdPropertyByPropertyKeyV1Response.Unknown r -> {
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
