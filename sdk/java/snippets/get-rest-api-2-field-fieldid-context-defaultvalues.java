import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FieldByFieldIdContextDefaultValuesV1OperationSpec;

public class Get2FieldByFieldIdContextDefaultValuesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldContextsApi().get2FieldByFieldIdContextDefaultValuesV1(new Get2FieldByFieldIdContextDefaultValuesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.fieldId(/* String */); // fieldId: required - The ID of the custom field, for example `customfield\_10000`.
                    // spec.contextId(/* List<Long> */); // contextId: optional - The IDs of the contexts to return default values for. If omitted, default values for every context the custom field has are returned.
                    // spec.issueTypeId(/* List<String> */); // issueTypeId: optional - The IDs of the issue types to restrict the returned per-issue-type default values to. If omitted, default values for every issue type are returned. This filter never removes the catch-all `isAnyIssueType` entry of a context.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.

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
                case Get2FieldByFieldIdContextDefaultValuesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextDefaultValuesV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextDefaultValuesV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextDefaultValuesV1Response.Unknown r -> {
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
