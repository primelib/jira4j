import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PriorityschemeBySchemeIdProjectsV1OperationSpec;

public class Get2PriorityschemeBySchemeIdProjectsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.prioritySchemesApi().get2PriorityschemeBySchemeIdProjectsV1(new Get2PriorityschemeBySchemeIdProjectsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.projectId(/* List<Long> */); // projectId: optional - The project IDs to filter by. For example, `projectId=10000&projectId=10001`.
                    // spec.schemeId(/* String */); // schemeId: required - The priority scheme ID.
                    // spec.query(/* String */); // query: optional - The string to query projects on by name.

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
                case Get2PriorityschemeBySchemeIdProjectsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PriorityschemeBySchemeIdProjectsV1Response.Unknown r -> {
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
