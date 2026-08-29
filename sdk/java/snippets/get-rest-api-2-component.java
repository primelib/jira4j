import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ComponentV1OperationSpec;

public class Get2ComponentV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectComponentsApi().get2ComponentV1(new Get2ComponentV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdsOrKeys(/* List<String> */); // projectIdsOrKeys: optional - The project IDs and/or project keys (case sensitive).
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field:   *  `description` Sorts by the component description.  *  `name` Sorts by component name.
                    // spec.query(/* String */); // query: optional - Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).

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
                case Get2ComponentV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ComponentV1Response.Unknown r -> {
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
