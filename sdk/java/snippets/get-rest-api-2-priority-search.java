import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PrioritySearchV1OperationSpec;

public class Get2PrioritySearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuePrioritiesApi().get2PrioritySearchV1(new Get2PrioritySearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.id(/* List<String> */); // id: optional - The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=2&id=3`.
                    // spec.projectId(/* List<String> */); // projectId: optional - The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, `projectId=10010&projectId=10111`.
                    // spec.priorityName(/* String */); // priorityName: optional - The name of priority to search for.
                    // spec.onlyDefault(/* Boolean */); // onlyDefault: optional - Whether only the default priority is returned.
                    // spec.expand(/* String */); // expand: optional - Use `schemes` to return the associated priority schemes for each priority. Limited to returning first 15 priority schemes per priority.

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
                case Get2PrioritySearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PrioritySearchV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2PrioritySearchV1Response.Unknown r -> {
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
