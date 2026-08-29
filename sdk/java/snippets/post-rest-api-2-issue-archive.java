import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssueArchiveV1OperationSpec;

public class Post2IssueArchiveV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().post2IssueArchiveV1(new Post2IssueArchiveV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* ArchiveIssueAsyncRequest */); // payload: required - A JQL query specifying the issues to archive. Note that subtasks can only be archived through their parent issues.

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
                case Post2IssueArchiveV1Response.Status202Response r -> {
                    // handle 202, r.data() contains typed payload
                }
                case Post2IssueArchiveV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2IssueArchiveV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Post2IssueArchiveV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2IssueArchiveV1Response.Status412Response r -> {
                    // handle 412, r.data() contains typed payload
                }
                case Post2IssueArchiveV1Response.Unknown r -> {
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
