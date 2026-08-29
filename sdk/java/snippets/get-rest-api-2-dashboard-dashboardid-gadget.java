import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2DashboardByDashboardIdGadgetV1OperationSpec;

public class Get2DashboardByDashboardIdGadgetV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.dashboardsApi().get2DashboardByDashboardIdGadgetV1(new Get2DashboardByDashboardIdGadgetV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.dashboardId(/* Long */); // dashboardId: required - The ID of the dashboard.
                    // spec.moduleKey(/* List<String> */); // moduleKey: optional - The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: `moduleKey=key:one&moduleKey=key:two`.
                    // spec.uri(/* List<String> */); // uri: optional - The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: `uri=/rest/example/uri/1&uri=/rest/example/uri/2`.
                    // spec.gadgetId(/* List<Long> */); // gadgetId: optional - The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: `gadgetId=10000&gadgetId=10001`.

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
                case Get2DashboardByDashboardIdGadgetV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2DashboardByDashboardIdGadgetV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2DashboardByDashboardIdGadgetV1Response.Unknown r -> {
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
