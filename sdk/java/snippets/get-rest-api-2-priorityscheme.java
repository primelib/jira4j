import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PriorityschemeV1OperationSpec;

public class Get2PriorityschemeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.prioritySchemesApi().get2PriorityschemeV1(new Get2PriorityschemeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.priorityId(/* List<Long> */); // priorityId: optional - A set of priority IDs to filter by. To include multiple IDs, provide an ampersand-separated list. For example, `priorityId=10000&priorityId=10001`.
                    // spec.schemeId(/* List<Long> */); // schemeId: optional - A set of priority scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `schemeId=10000&schemeId=10001`.
                    // spec.schemeName(/* String */); // schemeName: optional - The name of scheme to search for.
                    // spec.onlyDefault(/* Boolean */); // onlyDefault: optional - Whether only the default priority is returned.
                    // spec.orderBy(/* String */); // orderBy: optional - The ordering to return the priority schemes by.
                    // spec.expand(/* String */); // expand: optional - A comma separated list of additional information to return. "priorities" will return priorities associated with the priority scheme. "projects" will return projects associated with the priority scheme. `expand=priorities,projects`.

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
                case Get2PriorityschemeV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PriorityschemeV1Response.Unknown r -> {
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
