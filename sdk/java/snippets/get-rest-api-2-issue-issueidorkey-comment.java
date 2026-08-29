import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssueByIssueIdOrKeyCommentV1OperationSpec;

public class Get2IssueByIssueIdOrKeyCommentV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCommentsApi().get2IssueByIssueIdOrKeyCommentV1(new Get2IssueByIssueIdOrKeyCommentV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.

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
                case Get2IssueByIssueIdOrKeyCommentV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssueByIssueIdOrKeyCommentV1Response.Unknown r -> {
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
