import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2StatusByStatusIdWorkflowUsagesV1OperationSpec;

public class Get2StatusByStatusIdWorkflowUsagesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.statusApi().get2StatusByStatusIdWorkflowUsagesV1(new Get2StatusByStatusIdWorkflowUsagesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.statusId(/* String */); // statusId: required - The statusId to fetch workflow usages for
                    // spec.nextPageToken(/* String */); // nextPageToken: optional - The cursor for pagination
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of results to return. Must be an integer between 1 and 200.

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
                case Get2StatusByStatusIdWorkflowUsagesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2StatusByStatusIdWorkflowUsagesV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2StatusByStatusIdWorkflowUsagesV1Response.Unknown r -> {
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
