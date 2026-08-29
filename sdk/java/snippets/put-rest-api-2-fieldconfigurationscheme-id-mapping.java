import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2FieldconfigurationschemeByIdMappingV1OperationSpec;

public class Put2FieldconfigurationschemeByIdMappingV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueFieldConfigurationsApi().put2FieldconfigurationschemeByIdMappingV1(new Put2FieldconfigurationschemeByIdMappingV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* Long */); // id: required - The ID of the field configuration scheme.
                    // spec.payload(/* AssociateFieldConfigurationsWithIssueTypesRequest */); // payload: required

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
                case Put2FieldconfigurationschemeByIdMappingV1Response.NoContentResponse r -> {
                    // handle 204, r.data() contains typed payload
                }
                case Put2FieldconfigurationschemeByIdMappingV1Response.Unknown r -> {
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
