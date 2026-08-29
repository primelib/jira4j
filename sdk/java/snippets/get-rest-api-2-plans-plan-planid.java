import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PlansPlanByPlanIdV1OperationSpec;

public class Get2PlansPlanByPlanIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.plansApi().get2PlansPlanByPlanIdV1(new Get2PlansPlanByPlanIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.planId(/* Long */); // planId: required - The ID of the plan.
                    // spec.useGroupId(/* Boolean */); // useGroupId: optional - Whether to return group IDs instead of group names. Group names are deprecated.

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
                case Get2PlansPlanByPlanIdV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PlansPlanByPlanIdV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2PlansPlanByPlanIdV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2PlansPlanByPlanIdV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2PlansPlanByPlanIdV1Response.Unknown r -> {
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
