import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssueLimitAdfReportV1OperationSpec;

public class Get2IssueLimitAdfReportV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().get2IssueLimitAdfReportV1(new Get2IssueLimitAdfReportV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.isReturningKeys(/* Boolean */); // isReturningKeys: optional - Return issue keys instead of issue ids in the response.  Usage: Add `?isReturningKeys=true` to the end of the path to request issue keys.
                    // spec.fieldType(/* List<String> */); // fieldType: optional - Restrict the report to the given ADF field types. Defaults to every ADF field type.  For sites with a high issue volume, consider requesting field types individually to avoid timeouts.  Usage: Add `?fieldType=comment_adf&fieldType=worklog_adf` to the end of the path to report on comments and worklogs only.

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
                case Get2IssueLimitAdfReportV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssueLimitAdfReportV1Response.Unknown r -> {
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
