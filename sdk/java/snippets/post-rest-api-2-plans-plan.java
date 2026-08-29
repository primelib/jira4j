import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2PlansPlanV1OperationSpec;

public class Post2PlansPlanV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.plansApi().post2PlansPlanV1(new Post2PlansPlanV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.useGroupId(/* Boolean */); // useGroupId: optional - Whether to accept group IDs instead of group names. Group names are deprecated.
                    // spec.payload(/* CreatePlanRequest */); // payload: required

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
                case Post2PlansPlanV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Post2PlansPlanV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2PlansPlanV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Post2PlansPlanV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2PlansPlanV1Response.Unknown r -> {
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
