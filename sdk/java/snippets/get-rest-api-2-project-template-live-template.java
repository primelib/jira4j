import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ProjectTemplateLiveTemplateV1OperationSpec;

public class Get2ProjectTemplateLiveTemplateV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectTemplatesApi().get2ProjectTemplateLiveTemplateV1(new Get2ProjectTemplateLiveTemplateV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectId(/* String */); // projectId: optional - optional - The \{@link String\} containing the project key linked to the custom template to retrieve
                    // spec.templateKey(/* String */); // templateKey: optional - optional - The \{@link String\} containing the key of the custom template to retrieve

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
                case Get2ProjectTemplateLiveTemplateV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ProjectTemplateLiveTemplateV1Response.Unknown r -> {
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
