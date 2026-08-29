import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WebhookFailedV1OperationSpec;

public class Get2WebhookFailedV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.webhooksApi().get2WebhookFailedV1(new Get2WebhookFailedV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page.
                    // spec.after(/* Long */); // after: optional - The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch.

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
                case Get2WebhookFailedV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WebhookFailedV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2WebhookFailedV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2WebhookFailedV1Response.Unknown r -> {
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
