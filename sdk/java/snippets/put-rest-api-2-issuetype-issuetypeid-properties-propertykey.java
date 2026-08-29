import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1OperationSpec;

public class Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueTypePropertiesApi().put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1(new Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueTypeId(/* String */); // issueTypeId: required - The ID of the issue type.
                    // spec.propertyKey(/* String */); // propertyKey: required - The key of the issue type property. The maximum length is 255 characters.
                    // spec.payload(/* Object */); // payload: required - The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes.

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
                case Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Put2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Response.Unknown r -> {
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
