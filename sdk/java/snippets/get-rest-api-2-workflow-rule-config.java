import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WorkflowRuleConfigV1OperationSpec;

public class Get2WorkflowRuleConfigV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowTransitionRulesApi().get2WorkflowRuleConfigV1(new Get2WorkflowRuleConfigV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.types(/* List<String> */); // types: required - The types of the transition rules to return.
                    // spec.keys(/* List<String> */); // keys: optional - The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return.
                    // spec.workflowNames(/* List<String> */); // workflowNames: optional - The list of workflow names to filter by.
                    // spec.withTags(/* List<String> */); // withTags: optional - The list of `tags` to filter by.
                    // spec.draft(/* Boolean */); // draft: optional - **Deprecated:** Whether draft or published workflows are returned. If not provided, both workflow types are returned. The 'draft' parameter will be removed from this API on [November 2, 2026](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-3147).
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to.

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
                case Get2WorkflowRuleConfigV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WorkflowRuleConfigV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2WorkflowRuleConfigV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2WorkflowRuleConfigV1Response.Unknown r -> {
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
