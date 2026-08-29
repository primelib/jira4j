import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1OperationSpec;

public class Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldOptionsApi().delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1(new Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.replaceWith(/* Long */); // replaceWith: optional - The ID of the option that will replace the currently selected option.
                    // spec.jql(/* String */); // jql: optional - A JQL query that specifies the issues to be updated. For example, *project=10000*.
                    // spec.fieldId(/* String */); // fieldId: required - The ID of the custom field.
                    // spec.optionId(/* Long */); // optionId: required - The ID of the option to be deselected.
                    // spec.contextId(/* Long */); // contextId: required - The ID of the context.

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
                case Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2FieldByFieldIdContextByContextIdOptionByOptionIdIssueV1Response.Unknown r -> {
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
