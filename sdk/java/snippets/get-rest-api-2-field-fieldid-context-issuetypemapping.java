import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FieldByFieldIdContextIssuetypemappingV1OperationSpec;

public class Get2FieldByFieldIdContextIssuetypemappingV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldContextsApi().get2FieldByFieldIdContextIssuetypemappingV1(new Get2FieldByFieldIdContextIssuetypemappingV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.fieldId(/* String */); // fieldId: required - The ID of the custom field.
                    // spec.contextId(/* List<Long> */); // contextId: optional - The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, `contextId=10001&contextId=10002`.
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
                case Get2FieldByFieldIdContextIssuetypemappingV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextIssuetypemappingV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextIssuetypemappingV1Response.Unknown r -> {
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
