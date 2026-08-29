import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2PriorityschemePrioritiesAvailableV1OperationSpec;

public class Get2PriorityschemePrioritiesAvailableV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.prioritySchemesApi().get2PriorityschemePrioritiesAvailableV1(new Get2PriorityschemePrioritiesAvailableV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.query(/* String */); // query: optional - The string to query priorities on by name.
                    // spec.schemeId(/* String */); // schemeId: required - The priority scheme ID.
                    // spec.exclude(/* List<String> */); // exclude: optional - A list of priority IDs to exclude from the results.

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
                case Get2PriorityschemePrioritiesAvailableV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2PriorityschemePrioritiesAvailableV1Response.Unknown r -> {
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
