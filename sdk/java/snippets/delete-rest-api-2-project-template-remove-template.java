import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2ProjectTemplateRemoveTemplateV1OperationSpec;

public class Delete2ProjectTemplateRemoveTemplateV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectTemplatesApi().delete2ProjectTemplateRemoveTemplateV1(new Delete2ProjectTemplateRemoveTemplateV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.templateKey(/* String */); // templateKey: required - The \{@link String\} containing the key of the custom template to remove

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
                case Delete2ProjectTemplateRemoveTemplateV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Delete2ProjectTemplateRemoveTemplateV1Response.Unknown r -> {
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
