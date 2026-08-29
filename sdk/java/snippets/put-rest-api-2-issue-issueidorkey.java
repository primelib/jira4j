import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssueByIssueIdOrKeyV1OperationSpec;

public class Put2IssueByIssueIdOrKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().put2IssueByIssueIdOrKeyV1(new Put2IssueByIssueIdOrKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.notifyUsers(/* Boolean */); // notifyUsers: optional - Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored.
                    // spec.overrideScreenSecurity(/* Boolean */); // overrideScreenSecurity: optional - Whether screen security is overridden to enable hidden fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
                    // spec.overrideEditableFlag(/* Boolean */); // overrideEditableFlag: optional - Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
                    // spec.returnIssue(/* Boolean */); // returnIssue: optional - Whether the response should contain the issue with fields edited in this request. The returned issue will have the same format as in the [Get issue API](#api-rest-api-3-issue-issueidorkey-get).
                    // spec.expand(/* String */); // expand: optional - The Get issue API expand parameter to use in the response if the `returnIssue` parameter is `true`.
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
                case Put2IssueByIssueIdOrKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2IssueByIssueIdOrKeyV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Put2IssueByIssueIdOrKeyV1Response.Unknown r -> {
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
