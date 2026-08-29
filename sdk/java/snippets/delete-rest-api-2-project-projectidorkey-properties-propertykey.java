import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2ProjectByProjectIdOrKeyPropertyByPropertyKeyV1OperationSpec;

public class Delete2ProjectByProjectIdOrKeyPropertyByPropertyKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectPropertiesApi().delete2ProjectByProjectIdOrKeyPropertyByPropertyKeyV1(new Delete2ProjectByProjectIdOrKeyPropertyByPropertyKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.projectIdOrKey(/* String */); // projectIdOrKey: required - The project ID or project key (case sensitive).
                    // spec.propertyKey(/* String */); // propertyKey: required - The project property key. Use [Get project property keys](#api-rest-api-2-project-projectIdOrKey-properties-get) to get a list of all project property keys.

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
                case Delete2ProjectByProjectIdOrKeyPropertyByPropertyKeyV1Response.Unknown r -> {
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
