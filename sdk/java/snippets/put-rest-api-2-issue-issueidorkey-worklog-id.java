import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssueByIssueIdOrKeyWorklogByIdV1OperationSpec;

public class Put2IssueByIssueIdOrKeyWorklogByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueWorklogsApi().put2IssueByIssueIdOrKeyWorklogByIdV1(new Put2IssueByIssueIdOrKeyWorklogByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key the issue.
                    // spec.id(/* String */); // id: required - The ID of the worklog.
                    // spec.notifyUsers(/* Boolean */); // notifyUsers: optional - Whether users watching the issue are notified by email.
                    // spec.adjustEstimate(/* String */); // adjustEstimate: optional - Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `auto` Updates the estimate by the difference between the original and updated value of `timeSpent` or `timeSpentSeconds`.
                    // spec.newEstimate(/* String */); // newEstimate: optional - The value to set as the issue's remaining time estimate, as days (\#d), hours (\#h), or minutes (\#m or \#). For example, *2d*. Required when `adjustEstimate` is `new`.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties`, which returns worklog properties.
                    // spec.overrideEditableFlag(/* Boolean */); // overrideEditableFlag: optional - Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
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
                case Put2IssueByIssueIdOrKeyWorklogByIdV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2IssueByIssueIdOrKeyWorklogByIdV1Response.Unknown r -> {
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
