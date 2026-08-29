import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PlansPlanV1OperationSpec;

public class Get2PlansPlanV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.plansApi().get2PlansPlanV1(new Get2PlansPlanV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.includeTrashed(/* Boolean */); // includeTrashed: optional - Whether to include trashed plans in the results.
                    // spec.includeArchived(/* Boolean */); // includeArchived: optional - Whether to include archived plans in the results.
                    // spec.cursor(/* String */); // cursor: optional - The cursor to start from. If not provided, the first page will be returned.
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of plans to return per page. The maximum value is 50. The default value is 50.

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
                case Get2PlansPlanV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PlansPlanV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2PlansPlanV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2PlansPlanV1Response.Unknown r -> {
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
