import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2ChangelogBulkfetchV1OperationSpec;

public class Post2ChangelogBulkfetchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().post2ChangelogBulkfetchV1(new Post2ChangelogBulkfetchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* BulkChangelogRequestBean */); // payload: required - A JSON object containing the bulk fetch changelog request filters such as issue IDs and field IDs.

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
                case Post2ChangelogBulkfetchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Post2ChangelogBulkfetchV1Response.Unknown r -> {
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
