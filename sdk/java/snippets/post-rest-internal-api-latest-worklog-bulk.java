import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.PostInternallatestWorklogBulkV1OperationSpec;

public class PostInternallatestWorklogBulkV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.defaultPropApi().postInternallatestWorklogBulkV1(new PostInternallatestWorklogBulkV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* BulkWorklogKeyRequestBean */); // payload: required - A JSON object containing a list of issue ID and worklog ID pairs.

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
                case PostInternallatestWorklogBulkV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case PostInternallatestWorklogBulkV1Response.Unknown r -> {
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
