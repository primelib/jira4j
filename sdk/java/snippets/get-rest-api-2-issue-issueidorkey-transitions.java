import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssueByIssueIdOrKeyTransitionsV1OperationSpec;

public class Get2IssueByIssueIdOrKeyTransitionsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issuesApi().get2IssueByIssueIdOrKeyTransitionsV1(new Get2IssueByIssueIdOrKeyTransitionsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueIdOrKey(/* String */); // issueIdOrKey: required - The ID or key of the issue.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts `transitions.fields`, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the `fields` and `update` fields in [Transition issue](#api-rest-api-2-issue-issueIdOrKey-transitions-post).
                    // spec.transitionId(/* String */); // transitionId: optional - The ID of the transition.
                    // spec.skipRemoteOnlyCondition(/* Boolean */); // skipRemoteOnlyCondition: optional - Whether transitions with the condition *Hide From User Condition* are included in the response. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
                    // spec.includeUnavailableTransitions(/* Boolean */); // includeUnavailableTransitions: optional - Whether details of transitions that fail a condition are included in the response
                    // spec.sortByOpsBarAndStatus(/* Boolean */); // sortByOpsBarAndStatus: optional - Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.

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
                case Get2IssueByIssueIdOrKeyTransitionsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssueByIssueIdOrKeyTransitionsV1Response.Unknown r -> {
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
