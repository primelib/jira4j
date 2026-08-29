import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssueByIssueIdOrKeyCommentV1OperationSpec;

public class Post2IssueByIssueIdOrKeyCommentV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCommentsApi().post2IssueByIssueIdOrKeyCommentV1(new Post2IssueByIssueIdOrKeyCommentV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
                    // spec.payload(/* Map<String, Object> */); // payload: required

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
                case Post2IssueByIssueIdOrKeyCommentV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Post2IssueByIssueIdOrKeyCommentV1Response.Unknown r -> {
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
