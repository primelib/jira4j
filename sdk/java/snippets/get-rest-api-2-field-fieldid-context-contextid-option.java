import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FieldByFieldIdContextByContextIdOptionV1OperationSpec;

public class Get2FieldByFieldIdContextByContextIdOptionV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldOptionsApi().get2FieldByFieldIdContextByContextIdOptionV1(new Get2FieldByFieldIdContextByContextIdOptionV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.fieldId(/* String */); // fieldId: required - The ID of the custom field.
                    // spec.contextId(/* Long */); // contextId: required - The ID of the context.
                    // spec.optionId(/* Long */); // optionId: optional - The ID of the option.
                    // spec.onlyOptions(/* Boolean */); // onlyOptions: optional - Whether only options are returned.
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
                case Get2FieldByFieldIdContextByContextIdOptionV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextByContextIdOptionV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextByContextIdOptionV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextByContextIdOptionV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2FieldByFieldIdContextByContextIdOptionV1Response.Unknown r -> {
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
